package ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {
	private Timer tiempo;
	private int centesimaSegundos=0,segundos=0,minutos=0,horas=0;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;

	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		
		
		setResizable(false);
		setTitle("Cronometro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 200);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		setLocationRelativeTo(null);
		
		final JButton botonDetener = new JButton("Detener");
		botonDetener.setBackground(Color.MAGENTA);
		botonDetener.setBounds(401, 115, 89, 23);
		panel.add(botonDetener);
		
		final JButton botonPausar = new JButton("Pausar");
		botonPausar.setBackground(Color.RED);
		botonPausar.setBounds(284, 115, 89, 23);
		panel.add(botonPausar);
		
		final JButton botonIniciar = new JButton("Iniciar");
		botonIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiempo.start();
				botonIniciar.setEnabled(false);//para q no vuelva a dar click
				botonIniciar.setText("Reanudar");
				botonPausar.setEnabled(true);
				botonDetener.setEnabled(true);
			}
		});
		
		botonIniciar.setBackground(Color.YELLOW);
		botonIniciar.setBounds(170, 115, 89, 23);
		panel.add(botonIniciar);
		
		JLabel etiquetaTiempo = new JLabel("00:00:00:00");
		etiquetaTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTiempo.setFont(new Font("Tahoma", Font.BOLD, 29));
		etiquetaTiempo.setForeground(Color.WHITE);
		etiquetaTiempo.setBounds(203, 42, 205, 49);
		panel.add(etiquetaTiempo);
		
		JLabel etiquetaCronometro = new JLabel("Cronómetro");
		etiquetaCronometro.setForeground(Color.RED);
		etiquetaCronometro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		etiquetaCronometro.setBounds(223, 0, 205, 31);
		panel.add(etiquetaCronometro);
		
		JLabel imagenCronometro = new JLabel("");
		imagenCronometro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		imagenCronometro.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/cronometro.png")));
		imagenCronometro.setBounds(0, 0, 150, 150);
		panel.add(imagenCronometro);
		
		JLabel etiquetaFondo = new JLabel("");
		etiquetaFondo.setForeground(Color.RED);
		etiquetaFondo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		etiquetaFondo.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/fondo (1).jpg")));
		etiquetaFondo.setBounds(0, 0, 514, 161);
		panel.add(etiquetaFondo);
		
		final ActionListener acciones= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				centesimaSegundos++;
				if(centesimaSegundos==100) {
					segundos++;
					centesimaSegundos=0;
				}
				if(segundos==60) {
					minutos++;
					segundos=0;
				}
				if(minutos==60) {
					horas++;
					minutos=0;
				}

				
			}};
		tiempo=new Timer(10,acciones);
		String texto=(horas<=9?"0":"")+horas+(minutos<=9?"0":"")+minutos+(segundos<=9?"0":"")+segundos+(centesimaSegundos<=9?"0":"")+centesimaSegundos;
		etiquetaTiempo.setText(texto);

	}
	

	
	}
	
	

