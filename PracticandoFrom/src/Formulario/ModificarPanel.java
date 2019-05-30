package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ModificarPanel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarPanel frame = new ModificarPanel();
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
	public ModificarPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("-Desea buscar por Nombre?:");
		label.setBounds(27, 45, 174, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("-Desea buscar por Codigo?:");
		label_1.setBounds(27, 80, 174, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("-Desea buscar por Edad?:");
		label_2.setBounds(27, 121, 174, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("-Desea buscar por Direccion?:");
		label_3.setBounds(27, 162, 184, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("-Desea buscar por Seccion?:");
		label_4.setBounds(27, 202, 184, 14);
		contentPane.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox.setBounds(211, 42, 65, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_1.setBounds(211, 77, 65, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_2.setBounds(211, 118, 65, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_3.setBounds(211, 159, 65, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_4.setBounds(211, 199, 65, 20);
		contentPane.add(comboBox_4);
		
		JButton button = new JButton("Ok");
		button.setBounds(310, 41, 65, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Ok");
		button_1.setBounds(310, 76, 65, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Ok");
		button_2.setBounds(310, 117, 65, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Ok");
		button_3.setBounds(310, 158, 65, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Ok");
		button_4.setBounds(310, 198, 65, 23);
		contentPane.add(button_4);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(414, 42, 144, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(414, 77, 144, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(414, 118, 144, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(414, 159, 144, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(414, 196, 144, 20);
		contentPane.add(textField_4);
	}
}
