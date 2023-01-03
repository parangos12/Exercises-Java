package ejercicio1;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class ventanas extends JFrame{
	private JPanel panel;
	private JLabel saludo;
	private JTextField cajaTexto;
	private JButton boton;
	private JTextArea areaTexto; 
	
	public ventanas() {
		this.setSize(500, 500);
		setTitle("Eventos");
		setMinimumSize(new Dimension(500,500)); 
		setLocationRelativeTo(null);
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	private void iniciarComponentes() {
		colocarPanel();
		//colocarEtiqueta();
		colocarCajaDeTexto();
		//colocarBoton();
		colocarAreaTexto();
	}
	
	private void colocarPanel() {
		panel= new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel); //Agregamos el panel a la ventana---> ahora si agg botones, etiquetas, grafico, imagenes,etc. 
		
		//eventoDeMovimientoRaton();
		///eventoRuedaDelRaton();
		
	}
	
	private void colocarEtiqueta() {
		JLabel etiqueta=new JLabel("Ingrese su nombre por favor: ");
		etiqueta.setBounds(30, 10, 200, 30);
		panel.add(etiqueta);
	}
	
	private void colocarCajaDeTexto() {
		cajaTexto=new JTextField();
		cajaTexto.setBounds(300, 50, 100, 30);
		panel.add(cajaTexto);
		
		eventoDelTeclado();
	}
	
	private void colocarAreaTexto() {
		areaTexto=new JTextArea();
		areaTexto.setBounds(200, 300, 200, 300);
		panel.add(areaTexto);
		
		JScrollPane scroll=new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(20, 20, 200, 300);
		panel.add(scroll);
	}
		
	public void colocarBoton() {
		boton=new JButton("Pulsa aca!");
		boton.setBounds(150, 350, 150, 40);
		boton.setFont(new Font("arial",0,15));
		panel.add(boton);
		
		JLabel saludo=new JLabel();
		saludo.setBounds(50, 200, 300, 40);
		panel.add(saludo);
		
		//eventoOyenteDeAccion(); 
		//eventoOyenteDeRaton();
	}
		
			
	private void eventoOyenteDeAccion() {
		//agg evento de tipo EventLIstener
		ActionListener oyenteDeAccion= new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae) {
				saludo.setText("Holaaaa"+cajaTexto.getText());
			}
		};
		
		boton.addActionListener(oyenteDeAccion);
	};
	
	private void eventoOyenteDeRaton() {
		//Aggndo oyente de ratón
		MouseListener oyenteDeRaton=new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				//MEOTODOS DE LA CLASE MouseEvent
				if(e.isAltDown()) {
					areaTexto.append("Alt\n");
				}else if(e.isControlDown()) {
					areaTexto.append("Control\n");
				}else if(e.isShiftDown()) {
					areaTexto.append("Shift\n");
				}else if(e.isMetaDown()) {
					areaTexto.append("Click derecho\n");
				}else {
					areaTexto.append("Click izquierdo\\n");
				}
				if(e.getClickCount()==2) {
					areaTexto.append("Haz hecho doble click\\n");
				}
				
				
				//areaTexto.append("mouseClicked\n");      //se puede poner acá, ya que anteriormente se habia declarado para la clase general "Ventanas"
			}	//presionar y 	soltar dentro del boton	//sino, habría que llamar a la clase e instanciar el objeto "areaTexto"

			@Override
			public void mousePressed(MouseEvent e) {
				
				//areaTexto.append("mousePressed\n");
			}//solo presionar

			@Override
			public void mouseReleased(MouseEvent e) {
				//areaTexto.append(("mouseReleased\n"));
			}//presionar y soltar donde quieras

			@Override
			public void mouseEntered(MouseEvent e) {
				//areaTexto.append("mouseEntered\n");
			}//solo acercarte al boton

			@Override
			public void mouseExited(MouseEvent e) {
				//areaTexto.append("mouseExited\n");
			}//salir del boton
			
		};

		boton.addMouseListener(oyenteDeRaton);

		};
		
	private void eventoDeMovimientoRaton() {
		MouseMotionListener oyenteMovimientoRaton= new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {//CLICK Y ARRASTRE SIN SOLTA EL CLCIK
				areaTexto.append("mouseDragged\n");
			}

			@Override
			public void mouseMoved(MouseEvent e) {//MOVER EL MOUSE
				areaTexto.append("mouseMoved\n");
			}
			
		};
		
		panel.addMouseMotionListener(oyenteMovimientoRaton);
	}

	private void eventoRuedaDelRaton() {
		
		MouseWheelListener ruedaRaton=new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) { //como mousewheellisterner es una interfez, hay q implementar todos sus metodos abstractos
				if(e.getPreciseWheelRotation()==-1) {
					areaTexto.append("Rueda hacia arriba");
				} else if(e.getPreciseWheelRotation()==1){
					areaTexto.append("Rueda hacia abajo");
				}
			
			}
			
		};
		
		
		
		panel.addMouseWheelListener(ruedaRaton);
	}
	
	private void eventoDelTeclado() {
		
		KeyListener oyenteTeclado=new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {//solo caracterez unicode(letras entre A-Z signos-->NO alt, ctrl,shift)
				areaTexto.append("keyTyped\n");
			}

			@Override
			public void keyPressed(KeyEvent e) {//Solo presionar
				areaTexto.append("keyPressed\n");
			}

			@Override
			public void keyReleased(KeyEvent e) {//presionar y soltar (cualquier boton)
				//areaTexto.append("keyReleased\n");
				if(e.getKeyChar()=='p') {
					areaTexto.append("letra p\n");
				} else if(e.getKeyChar()=='\n') { //Util para llenar un campo, darle ENTER y enviar
					areaTexto.append("ENTER\n");
				}else if(e.getKeyChar()==' ') {
					areaTexto.append("Espacio\n");
				}

			}
			
		};		
		cajaTexto.addKeyListener(oyenteTeclado);
	}
	}
	
	

