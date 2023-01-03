package codigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame{
	
	private JPanel panel;
	private JLabel etiqueta;
	private JButton BotonRojo,BotonVerde,BotonAzul;
	private int contadorRojo=0,contadorVerde=0,contadorAzul=0;
	private ChangeListener ruedaRatonRojo,ruedaRatonVerde;
	MouseWheelListener ruedaRatonRojo1,ruedaRatonverde1,ruedaRatonAzul;
	
	public Ventana() {
		setSize(700, 400);
		setTitle("Ejercicio 3");
		setLocationRelativeTo(null);
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void iniciarComponentes() {
		colocarPanel();
		colocarEtiqueta();
		colocarBotonRojo();
		colocarBotonVerde();
		colocarBotonAzul();
	}
	
	private void colocarPanel() {
		panel= new JPanel();
		panel.setLayout(null);
		//eventoRuedaDelRaton();
		panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul)); 
		this.add(panel);
	}
	
	private void colocarEtiqueta() {
		etiqueta=new JLabel("Color "+"(Rojo="+contadorRojo+" ,Verde="+contadorVerde+" ,Azul="+contadorAzul+")");
		etiqueta.setBounds(200, 10, 300, 40);
		etiqueta.setFont(new Font("arial",0,18));
		panel.add(etiqueta);
	}
	
	private void colocarBotonRojo() {
		BotonRojo=new JButton("Rojo");
		BotonRojo.setBounds(30, 250, 100, 50);
		BotonRojo.setForeground(Color.RED);
		BotonRojo.setFont(new Font("arial",Font.ITALIC,14));
		panel.add(BotonRojo);
		eventoOyenteDeAccionRojo();
	}
	
	private void colocarBotonVerde() {

		BotonVerde=new JButton("Verder");
		BotonVerde.setBounds(250, 250, 100, 50);
		BotonVerde.setForeground(Color.GREEN);
		BotonVerde.setFont(new Font("arial",Font.ITALIC,14));
		panel.add(BotonVerde);
		eventoOyenteDeAccionVerde();

	}
	
	private void colocarBotonAzul() {

		BotonAzul=new JButton("Azul");
		BotonAzul.setBounds(450, 250, 100, 50);
		BotonAzul.setForeground(Color.BLUE);
		BotonAzul.setFont(new Font("arial",Font.ITALIC,14));
		panel.add(BotonAzul);
		eventoOyenteDeAccionAzul();
	}
	
	
	private void eventoOyenteDeAccionRojo() {
		MouseListener oyenteDeRatonRojo=new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				eventoRuedaDelRatonRojo();
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
		
		BotonRojo.addMouseListener(oyenteDeRatonRojo);
		
	};
		
	
	private void eventoRuedaDelRatonRojo() {
		ruedaRatonRojo1=new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) { 
				if(e.getPreciseWheelRotation()==-1) {
					if(contadorRojo<250 &&contadorRojo>=0) {
					contadorRojo+=10;
					panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul)); 
					etiqueta.setText("Color (Rojo="+contadorRojo +" Verde=" +contadorVerde+" Azul= "+contadorAzul+")");}
				} else if(e.getPreciseWheelRotation()==1){
					if(contadorRojo<250 &&contadorRojo>0) {
					contadorRojo-=10;
					panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul)); 
					etiqueta.setText("Color (Rojo="+contadorRojo +" Verde=" +contadorVerde+" Azul= "+contadorAzul+")");}
				}}
		
		};
		
		panel.removeMouseWheelListener(ruedaRatonverde1);
		panel.removeMouseWheelListener(ruedaRatonAzul);
		panel.addMouseWheelListener(ruedaRatonRojo1);
	}
	
	private void eventoOyenteDeAccionVerde() {
		System.out.println(getMouseWheelListeners());
		MouseListener oyenteDeRatonVerde=new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				eventoRuedaDelRatonVerde();
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
		
		BotonVerde.addMouseListener(oyenteDeRatonVerde);
	};
		
	
	private void eventoRuedaDelRatonVerde() {
		
		ruedaRatonverde1=new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) { 
				if(contadorVerde>=0 &&contadorVerde<=255) {
				if(e.getPreciseWheelRotation()==-1) {
					contadorVerde+=10;
					panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul)); 
					etiqueta.setText("Color (Rojo="+contadorRojo +" Verde=" +contadorVerde+" Azul= "+contadorAzul+")");
				} else if(e.getPreciseWheelRotation()==1){
					contadorVerde-=10;
					panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul)); 
					etiqueta.setText("Color (Rojo="+contadorRojo +" Verde=" +contadorVerde+" Azul= "+contadorAzul+")");
				}
				}
			}
		};
		panel.removeMouseWheelListener(ruedaRatonRojo1);
		panel.removeMouseWheelListener(ruedaRatonAzul);
		panel.addMouseWheelListener(ruedaRatonverde1);
	}
	
	private void eventoOyenteDeAccionAzul() {
		MouseListener oyenteDeRatonAzul=new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				eventoRuedaDelRatonAzul();
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
		
		BotonAzul.addMouseListener(oyenteDeRatonAzul);
	};
		
	
	private void eventoRuedaDelRatonAzul() {
		
		ruedaRatonAzul=new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) { 
				if(contadorAzul>=0 && contadorAzul<=255) {
				if(e.getPreciseWheelRotation()==-1) {
					contadorAzul+=10;
					panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul)); 
					etiqueta.setText("Color (Rojo="+contadorRojo +" Verde=" +contadorVerde+" Azul= "+contadorAzul+")");
				} else if(e.getPreciseWheelRotation()==1){
					contadorAzul-=10;
					panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul)); 
					etiqueta.setText("Color (Rojo="+contadorRojo +" Verde=" +contadorVerde+" Azul= "+contadorAzul+")");
				}
			}}
		};
		panel.removeMouseWheelListener(ruedaRatonRojo1);
		panel.removeMouseWheelListener(ruedaRatonverde1);
		panel.addMouseWheelListener(ruedaRatonAzul);
	}
	

	
	
	
	
	
	
	
}
