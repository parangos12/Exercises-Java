package interfazGUI;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;

public class Encuesta extends JFrame {

	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta frame = new Encuesta();
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
	public Encuesta() {
		setTitle("MiniEncuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 410);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(59, 11, 171, 14);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(27, 41, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(27, 67, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(27, 93, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton_2);
		grupo.add(rdbtnNewRadioButton);

		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 123, 264, 2);
		panel.add(separator);
		
		JLabel lblElijeTuEspecialidad = new JLabel("Elije tu especialidad");
		lblElijeTuEspecialidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblElijeTuEspecialidad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblElijeTuEspecialidad.setBounds(59, 136, 171, 14);
		panel.add(lblElijeTuEspecialidad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(27, 157, 125, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(27, 183, 125, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(27, 209, 125, 23);
		panel.add(chckbxNewCheckBox_2);
		
		final JLabel etiquetaHoras = new JLabel("1");
		etiquetaHoras.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		etiquetaHoras.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaHoras.setBounds(0, 294, 46, 36);
		panel.add(etiquetaHoras);
		
		final JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setValue(5);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiquetaHoras.setText(String.valueOf(slider.getValue()));
			}
		});
		slider.setMaximum(10);
		slider.setBounds(48, 304, 200, 26);
		panel.add(slider);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 239, 264, 2);
		panel.add(separator_1);
		
		JLabel lblHorasQueDedicas = new JLabel("Horas que dedicas en el ordenador");
		lblHorasQueDedicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorasQueDedicas.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblHorasQueDedicas.setBounds(27, 252, 215, 14);
		panel.add(lblHorasQueDedicas);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.setBounds(102, 337, 89, 23);
		panel.add(btnNewButton);
		

	}
}
