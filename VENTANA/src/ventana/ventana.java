package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class ventana extends JFrame{
	public JPanel panel;
	
	public ventana() { //creamos el constructor ventana
		this.setSize(500, 500); //Establecemos el tamaño de la ventana
		setTitle("Pedro eres un super cerebro"); // Establecemos el titulode la ventana
		//setLocation(200, 200); //Establecemos pos inicial de la ventana
		//setBounds(200, 200, 500, 500);//Establecemos la posición inicial y tamaño de la ventana
		setLocationRelativeTo(null);//si pones null, te aparece en el centro de la pantalla!
		
		//setResizable(false);// Establecemos si la ventana puede cambiar de tamaño o no
		setMinimumSize(new Dimension(200,200)); // Establecemos tamaño minimo
		//this.getContentPane().setBackground(Color.CYAN); //COLOR-->Estabmos el contenido de la ventana(cont ventana es lo q cambia
		
		iniciarComponentes(); // Hay que mandar a llamar el panel.
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //metodo de Jframe. ver API Java para ver que parametros ingresas-
	}
	
	private void iniciarComponentes() { //Para crear un panel que va sobre la ventana-
		colocarPaneles();
		//colocarEtiquetas();
		//colocarBotones();
		//colocarRadioBotones();
		//colocarBotonesDeActivacion();
		 //colocarCajasDeTexto();
		//colocarAreasDeTexto();
		//colocarCasillasDeVerificacion();
		//colocarListaDesplegables();
		//colocarContraseña();
		//colocarTablas();
		//colocarListas();
	}
	
	private void colocarBotones() {
		//BOTON 1--BOTON DE TEXTO
		JButton boton1=new JButton("Click");
		boton1.setText("Click"); //Establecemos un texto al botón.
		boton1.setBounds(100, 100, 100, 50);
		boton1.setEnabled(true);// Tenemos iteracción con el botón(habilitar o desabilitar las funciones del botón)
		boton1.setMnemonic('a'); //Establecemos alt+letra es igual a un click
		boton1.setForeground(Color.blue); //Establecemos color de la letra del boton
		boton1.setFont(new Font("cooper black",Font.ITALIC,14));//cambiar fuente de letra en el boton
		panel.add(boton1);//añadir al panel el boton-->siempre va al final!
		
		//BOTON 2--BOTON DE IMAGEN
		JButton boton2=new JButton();
		boton2.setBounds(100,200,100,40);
		//boton2.setBackground(Color.BLUE);//Establecemos el color de fondo del boton
		ImageIcon clicAqui= new ImageIcon("boton.png");
		boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));//AGG IMAGEN Y REDIMENSIONADO AL TAMAÑO DE MI BOTON al mismo tamaño de la eitqueta
		panel.add(boton2);
		
		//Boton 3--> boton de bordes redondeados o no, y con color.
		JButton boton3= new JButton();
		boton3.setBounds(100, 300, 110, 50);
		boton3.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));//Como setBorder es un interface, nos toca crear el borde.
		panel.add(boton3);
		
		//
	}
	
	private void colocarPaneles() {
		panel= new JPanel();
		//panel.setBackground(Color.green); //Establecemos el color del panel
		panel.setLayout(null);//Desactivando el diseño.
		this.getContentPane().add(panel); //Agregamos el panel a la ventana---> ahora si agg botones, etiquetas, grafico, imagenes,etc. 
	}
	
	private void colocarEtiquetas() {
		//ETIQUETA TIPO TEXTO
		JLabel etiqueta=new JLabel("Hola",SwingConstants.CENTER); //creacion etiqueta de texto y su ubicación de acuerdo.
		//etiqueta.setText("Hola"); //Es exactamente lo mismo que arriba solo que con constructores!
		etiqueta.setBounds(200, 50, 70, 70);
		etiqueta.setForeground(Color.blue); //Color del componente o etiqueta
		etiqueta.setBackground(Color.ORANGE);//Cambiamos el color de fondo de la etiqueta
		etiqueta.setOpaque(true);//Desactivamos el Layout que tiene por defecto y que no permite cambiar el fondo por otro color.
		etiqueta.setFont(new Font("arial",Font.BOLD,20));//Establecemos la fuente del texto
		panel.add(etiqueta); // Agg la etiqueta al panel. (sobre el panel escribimos la equiteta)
		
		//ETIQUETA TIPO IMAGEN.
		ImageIcon imagen= new ImageIcon("balonmundial.jpg");
		JLabel etiqueta2=new JLabel(imagen);
		//Ó TAMBIEN PODRIAS HABER HECHO LO SIGUIENTE:
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		etiqueta2.setBounds(10,80,300,300); // ya que le quitamos por defecto(en el layout) la ubicación en el panel
		panel.add(etiqueta2);
		//CONCLUSION-->Le podes meter imagenes tanto a ETIQUETAS(LABELS) ó BOTONES(BUTTONS)
	}
	
	private void colocarRadioBotones() {

		JRadioButton radioBoton1= new JRadioButton("Opcion 1",true);
		radioBoton1.setBounds(50, 100, 50, 50);
		radioBoton1.setEnabled(true);//para ver si esta habilitado o no.
		radioBoton1.setText("Programación");
		radioBoton1.setFont(new Font("arial",0,20));
		panel.add(radioBoton1);
		
		JRadioButton radioBoton2= new JRadioButton("Opcion 2",false);
		radioBoton2.setBounds(50, 150, 100, 50);
		panel.add(radioBoton2);
		
		JRadioButton radioBoton3= new JRadioButton("Opcion 3",false);
		radioBoton3.setBounds(50, 200, 100, 50);
		panel.add(radioBoton3);
		
		ButtonGroup grupoRadioBotones=new ButtonGroup(); //PARA QUE SOLO SE MARQUE 1 RADIO BOTON Y los demas se desactiven
		grupoRadioBotones.add(radioBoton1);
		grupoRadioBotones.add(radioBoton2);
		grupoRadioBotones.add(radioBoton3);
	}
	
	private void colocarBotonesDeActivacion() {
		JToggleButton botonActivacion1= new JToggleButton("Opcion 1",true);
		botonActivacion1.setBounds(50, 100, 100, 40);
		panel.add(botonActivacion1);
		
		JToggleButton botonActivacion2= new JToggleButton("Opcion 2",false);
		botonActivacion2.setBounds(50, 150, 100, 40);
		panel.add(botonActivacion2);
		
		JToggleButton botonActivacion3= new JToggleButton("Opcion 3",false);
		botonActivacion3.setBounds(50, 200, 100, 40);
		panel.add(botonActivacion3);
		
		ButtonGroup grupoBotonesActivados=new ButtonGroup();
		grupoBotonesActivados.add(botonActivacion1);
		grupoBotonesActivados.add(botonActivacion2);
		grupoBotonesActivados.add(botonActivacion3);
		
	}
	
	private void colocarCajasDeTexto() {
		JTextField cajaTexto= new JTextField("Hello",50); 
		cajaTexto.setBounds(50, 50, 100, 30);
		cajaTexto.setText("HELLO");
		System.out.println("Texto en la caja "+cajaTexto.getText());
		
		panel.add(cajaTexto);
	}
	
	private void colocarAreasDeTexto() {
		JTextArea areaTexto=new JTextArea();//Ver constructores, pasandole documentos, pasando filas y columnas, pasandole un string
		areaTexto.setBounds(20, 20, 300, 200); //A difrencia, tienes un area de texto no una caja, copias mucha más información
		areaTexto.setText("Escriba el texto aqui...");
		areaTexto.append("Añade más texto aqui");//este metodo añade mas texto al area
		areaTexto.setEditable(true);//permisos para modificar o no el texto que tenga por defecto creado anteriormente.
		System.out.println(areaTexto.getText());
		panel.add(areaTexto);
		
		//Barras de desplazamiento
		JScrollPane barraDesplazamiento=new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//ver constructores del JScrollPane.
		barraDesplazamiento.setBounds(20, 20, 300, 200);
		barraDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED 
);
		barraDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );
		panel.add(barraDesplazamiento);
		
	}

	private void colocarCasillasDeVerificacion() {
		JCheckBox casillaVerificacion1=new JCheckBox("Leche",true);
		casillaVerificacion1.setEnabled(false);
		casillaVerificacion1.setBounds(20, 20, 100, 40);
		panel.add(casillaVerificacion1);
		
		JCheckBox casillaVerificacion2=new JCheckBox("Galletas");
		casillaVerificacion2.setBounds(20, 50, 100, 40);
		panel.add(casillaVerificacion2);
		
		JCheckBox casillaVerificacion3=new JCheckBox(" Helado");
		casillaVerificacion3.setBounds(20, 80, 100, 40);
		panel.add(casillaVerificacion3);
		
		
	}

	private void colocarListaDesplegables() {
		
		//POCO PRACTICO!
		
		/*String [] paises= {"Colombia","Argentina","Brasil","Ecuador"};
		
		JComboBox listaDesplegable1=new JComboBox(paises);
		listaDesplegable1.setBounds(20, 20, 100, 30);
		listaDesplegable1.addItem("Uruguay");//Añadir obts a tu lista desplegable.
		listaDesplegable1.setSelectedItem("Brasil");//Seleccionar el primer objeto visto
		panel.add(listaDesplegable1);*/
		
		//MODELOS EN LISTAS DESPLEGABLES. AGG OBJETOS,PERSONAS, CLIENTES, al COMBO BOX
		
		//La diferencia con arriba,e s q este seleciona todos los atributos y metodos los objetos seleccionados.
		Persona personal=new Persona("Pedro Arango",22,"Colombiano");
		Persona personal1=new Persona("Jose Arango",25,"Colombiano");
		
		DefaultComboBoxModel modelo= new DefaultComboBoxModel();
		JComboBox listaDesplegables =new JComboBox(modelo);
		modelo.addElement(personal);
		modelo.addElement(personal1);

		listaDesplegables.setBounds(20, 20, 200, 30);
		panel.add(listaDesplegables);
	}

	private void colocarContraseña() {
		JPasswordField campoContraseña= new JPasswordField();
		campoContraseña.setBounds(20, 20, 150, 30);
		campoContraseña.setText("Hola");
		panel.add(campoContraseña);
		
		String contraseña="";
		for (int i = 0; i < campoContraseña.getPassword().length; i++) {
			contraseña+=campoContraseña.getPassword()[i];
		}
		
		System.out.println("Contraseña: "+contraseña);
	}

	private void colocarTablas() {
		DefaultTableModel modelo= new DefaultTableModel();
		
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Nacionalidad");
		Persona persona11=new Persona("PEDRO",22,"COLOMBIANO");

		String [] persona1= {persona11.getNombre(),String.valueOf(persona11.getEdad()),persona11.getNacionalidad()};
		String [] persona2= {"jose","25","Colombiano"};

		persona11.getNacionalidad();
		modelo.addRow(persona1);
		modelo.addRow(persona2);

		JTable tabla = new JTable(modelo);
		
		tabla.setBounds(20, 20, 300, 200);
		panel.add(tabla);
		
		JScrollPane scroll= new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(20, 20, 300, 200);
		panel.add(scroll);

		
	}

	private void colocarListas() {
		DefaultListModel modelo= new DefaultListModel();
		
		modelo.addElement(new Persona("Pedro Arango",22,"Colombiano"));//No solo estoy seleccionando un STRING sino un objeto y sus atributos internos!
		modelo.addElement(new Persona("Jose Arango",25,"Colombiano"));
		modelo.addElement(new Persona("Jesus Arango",25,"Colombiano"));
		modelo.addElement(new Persona("Maria Sanchez",25,"Colombiano"));

		
		
		JList lista= new JList(modelo);
		lista.setBounds(20, 20, 200, 300);
		panel.add(lista);
		
		JScrollPane scroll=new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(20, 20, 200, 300);
		panel.add(scroll);
		
		}
	}


