package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ventana1 extends JFrame {
	
	//Creación de modelos para tablas y combosBox.
	private DefaultComboBoxModel<Persona> modelo=new DefaultComboBoxModel<Persona>();
	private DefaultTableModel modeloTabla=new DefaultTableModel();

	private JPanel panel;
	private JTable tabla;
	private JTextField cajaNombre;
	private JTextField cajaApellidos;
	private JTextField cajaEmail;
	private JTextField cajaCelular;
	private JTextField cajaDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
				
		llenarModeloComboBox();
		aregarModeloTabla();
		
		//Esto que sigue abajo es más parecido a iniciar componentes:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 477);
		setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel etiquetaPersona = new JLabel("Persona");
		etiquetaPersona.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		etiquetaPersona.setBounds(10, 24, 172, 32);
		panel.add(etiquetaPersona);
		
		
		final JComboBox<Persona> comboPersonas = new JComboBox<Persona>();
		comboPersonas.setModel(modelo);
		comboPersonas.setBounds(10, 78, 210, 22);
		panel.add(comboPersonas);
		
		JButton botonInsertar = new JButton("Insertar Persona");
		botonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona p=(Persona) comboPersonas.getSelectedItem();//Esto es un objeto persona, q he seleccionado.
				
				String nombres=p.getNombres();
				String apellidos=p.getApellidos();
				String email=p.getCelular();
				String celular=p.getCelular();
				String direccion=p.getDireccion();
				
				String [] persona= {nombres,apellidos,email,celular,direccion};
				modeloTabla.addRow(persona);// Los datos se añaden al modelo de la tabla.
			}
		});
		botonInsertar.setBounds(250, 78, 146, 22);
		panel.add(botonInsertar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 129, 400, 89);
		panel.add(scrollPane);
		
		tabla = new JTable();
		tabla.setModel(modeloTabla);
		ListSelectionListener oyenteSeleccion=new ListSelectionListener() {   //Añadimos un escuchador de selección de la tabla.

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting()) {
					int filaSeleccionada=tabla.getSelectedRow();
					
					//obtenemos datos ya q sabemos q fila hemos seleccionado. (LOS DATOS ESTAN EN EL MODELO DE LA TABLA)
					String nombres=(String) modeloTabla.getValueAt(filaSeleccionada, 0);
					String apellidos=(String) modeloTabla.getValueAt(filaSeleccionada, 1);
					String email=(String) modeloTabla.getValueAt(filaSeleccionada, 2);
					String celular=(String) modeloTabla.getValueAt(filaSeleccionada, 3);
					String direccion=(String) modeloTabla.getValueAt(filaSeleccionada, 4);
					
					cajaNombre.setText(nombres);
					cajaApellidos.setText(apellidos);
					cajaEmail.setText(email);
					cajaCelular.setText(celular);
					cajaDireccion.setText(direccion);

				}
			}
		};
		tabla.getSelectionModel().addListSelectionListener(oyenteSeleccion);//Acá estamos agg un oyente de seleccion a la tabla
		
		scrollPane.setViewportView(tabla);
		
		JSeparator separador = new JSeparator();
		separador.setBounds(10, 229, 400, 10);
		panel.add(separador);
		
		JLabel etiquetaDatos = new JLabel("Datos de la Persona");
		etiquetaDatos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiquetaDatos.setBounds(10, 229, 146, 32);
		panel.add(etiquetaDatos);
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiquetaNombre.setBounds(10, 272, 76, 22);
		panel.add(etiquetaNombre);
		
		cajaNombre = new JTextField();
		cajaNombre.setBounds(10, 294, 172, 20);
		panel.add(cajaNombre);
		cajaNombre.setColumns(10);
		
		JLabel etiquetaApellidos = new JLabel("Apellidos");
		etiquetaApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiquetaApellidos.setBounds(245, 272, 95, 20);
		panel.add(etiquetaApellidos);
		
		cajaApellidos = new JTextField();
		cajaApellidos.setBounds(247, 294, 163, 20);
		panel.add(cajaApellidos);
		cajaApellidos.setColumns(10);
		
		JLabel etiquetaEmail = new JLabel("Email");
		etiquetaEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiquetaEmail.setBounds(10, 323, 86, 14);
		panel.add(etiquetaEmail);
		
		cajaEmail = new JTextField();
		cajaEmail.setBounds(10, 351, 188, 20);
		panel.add(cajaEmail);
		cajaEmail.setColumns(10);
		
		JLabel etiquetaCelular = new JLabel("Celular");
		etiquetaCelular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiquetaCelular.setBounds(250, 325, 76, 14);
		panel.add(etiquetaCelular);
		
		cajaCelular = new JTextField();
		cajaCelular.setBounds(250, 351, 160, 20);
		panel.add(cajaCelular);
		cajaCelular.setColumns(10);
		
		JLabel etiquetaDireccion = new JLabel("Dirección");
		etiquetaDireccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiquetaDireccion.setBounds(10, 382, 86, 14);
		panel.add(etiquetaDireccion);
		
		cajaDireccion = new JTextField();
		cajaDireccion.setBounds(10, 407, 369, 20);
		panel.add(cajaDireccion);
		cajaDireccion.setColumns(10);

	}
	//2. Configuramos el MODELO de la tabla
	private void aregarModeloTabla() {
		modeloTabla.addColumn("Nombres");
		modeloTabla.addColumn("Apellidos");
		modeloTabla.addColumn("Email");
		modeloTabla.addColumn("Celular");
		modeloTabla.addColumn("Dirección");

	}
	//2. Configuramos el MODELO del ComboBox.
	private void llenarModeloComboBox() {
		modelo.addElement(new Persona("Pedro","Arango Sanchez","parangos@eafit.edu.co","3127098433","Cr50#60-39"));
		modelo.addElement(new Persona("Jose Alberto","Arango Sanchez","josearangos@eafit.edu.co","3217258514","Cr50#60-39"));
		modelo.addElement(new Persona("Jesus","Arango Perez","aarangoalberto@gmail.com","3507891480","Cr52b#52"));
		modelo.addElement(new Persona("Maria Elena","Agudelo Sanchez","mariaelena09@hotmail.es","3217027364","Cr52b#52"));
		modelo.addElement(new Persona("Socorro David","Castañeda","No presenta","3137426564","Ver. Buenos aires"));

	}
}
