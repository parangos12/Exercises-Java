package Taller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventana extends JFrame{
	public ventana() {
		this.setSize(500, 500);
		this.setTitle("Mini Encuesta");
		this.setLocationRelativeTo(null);
		iniciarComponentes();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	private void iniciarComponentes() {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Elige un sistema operativo ");
		etiqueta.setBounds(200, 50, 200, 100); //Para etiqueta tiene q existir donde UBICARLA!!!
		panel.add(etiqueta);
	}
}
