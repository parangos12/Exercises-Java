package Ejercicios1;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventana1 extends JFrame{
	
	private JPanel panel;
	private JButton boton;
	private JLabel etiqueta;
	private int contador=0;
	
	public ventana1() {
		setSize(400, 400);//Tamaño de la ventana
		setTitle("Ejercicio 1");//titulo de la ventana
		setMinimumSize(new Dimension(500,500));
		setLocationRelativeTo(null);//ventana al centro
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);//cuando cierre ventana finalize programa.
	}
	
	private void iniciarComponentes() {
		colocarPanel();
		colocarEtiqueta();
		colocarBoton();
	}
	
	private void colocarPanel() {
		panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
	
	private void colocarEtiqueta() {
		etiqueta=new JLabel("Botón pulsado "+contador+" veces");
		etiqueta.setFont(new Font("arial",Font.BOLD,20));
		etiqueta.setBounds(150, 50, 250, 30);
		panel.add(etiqueta);
	}
	
	private void colocarBoton() {
		boton=new JButton("Pulsa Aquí");
		boton.setBounds(150, 350, 200, 70);
		boton.setFont(new Font("arial",Font.BOLD,20));
		panel.add(boton);
		
		oyenteDeRaton();
	}
	
	private void oyenteDeRaton() {
		
		MouseListener oyenteDeRaton=new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				contador+=1;
				etiqueta.setText("Boton pulsado "+contador+" veces");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		boton.addMouseListener(oyenteDeRaton);
	}
	
	
	
}
