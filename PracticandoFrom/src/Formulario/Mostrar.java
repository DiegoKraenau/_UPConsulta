package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conecta.BaseConeccion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Mostrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_1;
	int xx,xy;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mostrar frame = new Mostrar();
					frame.setUndecorated(true);
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
	public Mostrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 479);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x=e.getXOnScreen();
				int y=e.getYOnScreen();
				Mostrar.this.setLocation(x-xx,y-xy);
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbldeseaBuscarPor = new JLabel("-Desea buscar por Nombre?:");
		lbldeseaBuscarPor.setBounds(26, 31, 174, 14);
		contentPane.add(lbldeseaBuscarPor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--", "Si", "No"}));
		comboBox.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox.setBounds(238, 28, 65, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(comboBox.getSelectedItem()=="Si") {
					textField.enable(true);
				}
			}
		});
		btnNewButton.setBounds(332, 27, 65, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(443, 28, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbldeseaBuscarPor_4 = new JLabel("-Desea buscar por Codigo?:");
		lbldeseaBuscarPor_4.setBounds(26, 64, 174, 14);
		contentPane.add(lbldeseaBuscarPor_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--", "Si", "No"}));
		comboBox_1.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_1.setBounds(238, 59, 65, 20);
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem()=="Si") {
					textField_1.enable(true);
				}
				
			}
		});
		button.setBounds(332, 60, 65, 23);
		contentPane.add(button);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(443, 59, 144, 20);
		contentPane.add(textField_1);
		
		JLabel lbldeseaBuscarPor_1 = new JLabel("-Desea buscar por Edad?:");
		lbldeseaBuscarPor_1.setBounds(26, 100, 174, 14);
		contentPane.add(lbldeseaBuscarPor_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"--", "Si", "No"}));
		comboBox_2.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_2.setBounds(238, 97, 65, 20);
		contentPane.add(comboBox_2);
		
		JButton button_1 = new JButton("Ok");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_2.getSelectedItem()=="Si") {
					textField_2.enable(true);
				}
			}
		});
		button_1.setBounds(332, 94, 65, 23);
		contentPane.add(button_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(443, 90, 144, 20);
		contentPane.add(textField_2);
		
		JLabel lbldeseaBuscarPor_2 = new JLabel("-Desea buscar por Direccion?:");
		lbldeseaBuscarPor_2.setBounds(26, 134, 184, 14);
		contentPane.add(lbldeseaBuscarPor_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"--", "Si", "No"}));
		comboBox_3.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_3.setBounds(238, 131, 65, 20);
		contentPane.add(comboBox_3);
		
		JButton button_2 = new JButton("Ok");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_3.getSelectedItem()=="Si") {
					textField_3.enable(true);
				}
			}
		});
		button_2.setBounds(332, 130, 65, 23);
		contentPane.add(button_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(443, 131, 144, 20);
		contentPane.add(textField_3);
		
		JLabel lbldeseaBuscarPor_3 = new JLabel("-Desea buscar por Seccion?:");
		lbldeseaBuscarPor_3.setBounds(26, 163, 184, 14);
		contentPane.add(lbldeseaBuscarPor_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"--", "Si", "No"}));
		comboBox_4.setToolTipText("1\r\n2\r\n3\r\n4\r\n5\r\n");
		comboBox_4.setBounds(238, 160, 65, 20);
		contentPane.add(comboBox_4);
		
		JButton button_3 = new JButton("Ok");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_4.getSelectedItem()=="Si") {
					textField_4.enable(true);
				}
			}
		});
		button_3.setBounds(332, 159, 65, 23);
		contentPane.add(button_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(443, 160, 144, 20);
		contentPane.add(textField_4);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(241,57,83));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SELECT
				BaseConeccion diegoConexion = new BaseConeccion();
				Connection pruebaCn=diegoConexion.getConexion();
				Statement s;
				ResultSet rs;
				
				//MOSTRAR
				DefaultTableModel model=new DefaultTableModel();
				model.addColumn("Codigo");
				model.addColumn("Nombre");
				model.addColumn("Edad");
				model.addColumn("Direccion");
				model.addColumn("Seccion:");
				
				table_1.setModel(model);;
				
				String[] dato=new String[5];
				String requisito=null;
			
				//MOSTRAR
				int i=0;
				int i1=0;
				int i2=0;
				int i3=0;
				int i4=0;
				int i5=0;
				
		
				if(comboBox.getSelectedItem()=="Si" && i5==0) {
					i++;
					i5++;
					requisito="select codigo,nombre,edad,direccion,seccion from alumno where alumno.nombre='"+textField.getText()+"'";
				}
				if(comboBox_1.getSelectedItem()=="Si" && i5==0) {
					i1++;
					i5++;
					requisito="select codigo,nombre,edad,direccion,seccion from alumno where alumno.codigo='"+textField_1.getText()+"'";
				}
				if(comboBox_2.getSelectedItem()=="Si" && i5==0) {
					i2++;
					i5++;
					requisito="select codigo,nombre,edad,direccion,seccion from alumno where alumno.edad="+textField_2.getText()+"";
				}
				if(comboBox_3.getSelectedItem()=="Si" && i5==0) {
					i3++;
					i5++;
					requisito="select codigo,nombre,edad,direccion,seccion from alumno where alumno.direccion='"+textField_3.getText()+"'";
				}
				if(comboBox_4.getSelectedItem()=="Si" && i5==0) {
					i4++;
					i5++;
					requisito="select codigo,nombre,edad,direccion,seccion from alumno where alumno.seccion='"+textField_4.getText()+"'";
				}
				
				
				
			   //////////////////////////////////////////////
				
				if(comboBox.getSelectedItem()=="Si" && i==0) {
					i++;
					requisito=requisito+"and alumno.nombre='"+textField.getText()+"'";
				}
				if(comboBox_1.getSelectedItem()=="Si" && i1==0) {
					i1++;
					requisito=requisito+"and alumno.codigo='"+textField_1.getText()+"'";
				}
				if(comboBox_2.getSelectedItem()=="Si" && i2==0) {
					i2++;
					requisito=requisito+"and alumno.edad="+textField_2.getText()+"";
				}
				if(comboBox_3.getSelectedItem()=="Si" && i3==0) {
					i3++;
					requisito=requisito+"and alumno.direccion='"+textField_3.getText()+"'";
				}
				if(comboBox_4.getSelectedItem()=="Si" && i4==0) {
					i4++;
					requisito=requisito+"and alumno.seccion='"+textField_4.getText()+"'";
				}
				
				
	
		
				
				try {
					s=(Statement)pruebaCn.createStatement();
					rs=s.executeQuery(requisito);
				
					while(rs.next()) {
						dato[0]=rs.getString(1);
						dato[1]=rs.getString(2);
						dato[2]=rs.getString(3);
						dato[3]=rs.getString(4);
						dato[4]=rs.getString(5);
						model.addRow(dato);
					}
				
					
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnBuscar.setBounds(142, 205, 89, 23);
		contentPane.add(btnBuscar);
		
		table = new JTable();
		table.setBounds(53, 391, 490, -140);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"codigo", "nombre", "edad", "direccion", "seccion"
			}
		));
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		table_1.setBounds(90, 262, 462, 124);
		contentPane.add(table_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(526, 262, 17, 118);
		contentPane.add(scrollBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(63, 239, 518, 169);
		contentPane.add(panel);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Mostrar.this.hide();
			}
		});
		lblX.setBackground(new Color(241,57,83));
		lblX.setBounds(651, 0, 46, 25);
		contentPane.add(lblX);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(241,57,83));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//table_1.getRootPane();
			int num1=table_1.getSelectedRow();
			int num2=table_1.getSelectedColumn();
			
		
			
			
			
			BaseConeccion diegoConexion = new BaseConeccion();
			Connection pruebaCn=diegoConexion.getConexion();
			Statement s;
			int rs;
			
			String requisito=null;
			
			requisito="delete alumno where alumno.codigo='"+table_1.getValueAt(num1, num2)+"'";

			try {
				s=(Statement)pruebaCn.createStatement();
				rs=s.executeUpdate(requisito);
				JOptionPane.showMessageDialog(null, "Alumno Eliminado de la Base de Datos");
			
			
			
				
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			
			}
		});
		btnEliminar.setBounds(283, 205, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(241,57,83));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String codigo=JOptionPane.showInputDialog("Digite el nuevo Codigo:");
				String nombre=JOptionPane.showInputDialog("Digite el nuevo Nombre:");
				int edad=Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo Edad:"));
				String direccion=JOptionPane.showInputDialog("Digite el nuevo Direccion:");
				String seccion=JOptionPane.showInputDialog("Digite el nuevo Seccion:");
				
				BaseConeccion diegoConexion = new BaseConeccion();
				Connection pruebaCn=diegoConexion.getConexion();
				Statement s;
				int rs;
				
				String requisito=null;
				int num1=table_1.getSelectedColumn();
				int num2=table_1.getSelectedRow();
				
				requisito="update alumno set nombre='"+nombre+"', edad="+edad+", direccion='"+direccion+"', seccion='"+seccion+"' where codigo='"+table_1.getValueAt(num1, num2)+"'";
			
				try {
					s=(Statement)pruebaCn.createStatement();
					rs=s.executeUpdate(requisito);
					JOptionPane.showMessageDialog(null, "Alumno Modificado de la Base de Datos");
				
				
				
					
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnModificar.setBounds(418, 205, 89, 23);
		contentPane.add(btnModificar);
	}
}
