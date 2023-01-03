package codigo;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
	
	private JPanel panel; //Esto es porq lo vamos a usar en otros metodos.
	private JLabel etiqueta,imagen;
	private JRadioButton rb1,rb2,rb3,rb4;

	
		public Ventana() {
			setSize(700, 400);
			setTitle("Ejercicio 2");
			setLocationRelativeTo(null);
			iniciarComponentes();
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		private void iniciarComponentes() {
			colocarPanel();
			colocarEtiqueta();
			colocarRadioBotones();
		}
		
		private void colocarPanel() {
			panel= new JPanel();
			panel.setLayout(null);
			this.add(panel);
		}
		
		private void colocarEtiqueta() {
			etiqueta=new JLabel("Escoga su deporte favorito");
			etiqueta.setBounds(20, 10, 250, 40);
			etiqueta.setFont(new Font("arial",0,18));
			panel.add(etiqueta);
		}
		
		private void colocarRadioBotones() {
			rb1=new JRadioButton("Futból");
			rb1.setBounds(20, 80, 100, 40);
			rb1.setFont(new Font("arial rounded mt bold",0,18));
			panel.add(rb1);
			
			rb2=new JRadioButton("Baloncesto");
			rb2.setBounds(20, 140, 150, 40);
			rb2.setFont(new Font("arial rounded mt bold",0,18));
			panel.add(rb2);
			
			rb3=new JRadioButton("Tennis");
			rb3.setBounds(20, 200, 150, 40);
			rb3.setFont(new Font("arial rounded mt bold",0,18));
			panel.add(rb3);
			
			rb4=new JRadioButton("Natación");
			rb4.setBounds(20, 260, 150, 40);
			rb4.setFont(new Font("arial rounded mt bold",0,18));
			panel.add(rb4);
			
			ButtonGroup grupo= new ButtonGroup();
			grupo.add(rb1);
			grupo.add(rb2);
			grupo.add(rb3);
			grupo.add(rb4);

			eventoDeAccion();
		}
		
		private void eventoDeAccion() {//YO ESTO LO VEO COMO UN SUBMIT.
			imagen=new JLabel();
			imagen.setBounds(200, 80, 300, 200);
			panel.add(imagen);
			
			ImageIcon imagenBaloncesto=new ImageIcon(getClass().getResource("/Imageness/baloncesto.jpg"));//para q salga el ejecutacle, ver direccion
			ImageIcon imagenFutbol=new ImageIcon(getClass().getResource("/Imageness/futbol.jpg"));//para q salga el ejecutacle, ver direccion
			ImageIcon imagenNatacion=new ImageIcon(getClass().getResource("/Imageness/natacion.jpg"));//para q salga el ejecutacle, ver direccion
			ImageIcon imagenTennis=new ImageIcon(getClass().getResource("/Imageness/tennis.jpg"));//para q salga el ejecutacle, ver direccion

			ActionListener eventoAccion1= new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				if(	rb1.isSelected()==true) {
					imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
				}else if(rb2.isSelected()==true){
					imagen.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
					//Conclusión-->Le podes meter imagenes tanto a ETIQUETAS(LABELS) ó BOTONES(BUTTONS)
				}
				else if(rb3.isSelected()==true){
					imagen.setIcon(new ImageIcon(imagenTennis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
				}				
			else if(rb4.isSelected()==true){
				imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
			}				
				}
			};			
			rb1.addActionListener(eventoAccion1);
			rb2.addActionListener(eventoAccion1);
			rb3.addActionListener(eventoAccion1);
			rb4.addActionListener(eventoAccion1);
		}
}
