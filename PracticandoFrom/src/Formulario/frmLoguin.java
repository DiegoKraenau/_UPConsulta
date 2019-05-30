package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conecta.BaseConeccion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;

public class frmLoguin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLoguin frame = new frmLoguin();
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
	public frmLoguin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 385);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x=e.getXOnScreen();
				int y=e.getYOnScreen();
				frmLoguin.this.setLocation(x-xx,y-xy);
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alumno:");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(28, 61, 61, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo:");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(284, 64, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(28, 105, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(284, 105, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Seccion:");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(28, 155, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(80, 61, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 102, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(360, 102, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(80, 152, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBackground(new Color(241,57,83));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresar();
			}
		});
		btnNewButton.setBounds(193, 239, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(360, 61, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(new Color(241,57,83));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmLoguin.this.hide();
			}
		});
		lblX.setBackground(new Color(241,57,83));
		lblX.setBounds(426, 11, 46, 21);
		contentPane.add(lblX);
	}

	protected void ingresar() {
		BaseConeccion diegoConexion = new BaseConeccion();
		Connection pruebaCn=diegoConexion.getConexion();
		
        Statement s;
		
		int rs;
		String sql="Insert into alumno  values('"+ textField_4.getText()+"','"+textField.getText()+"',"+textField_1.getText()+",'"+textField_2.getText()+"','"+textField_3.getText()+"')";
		try {
			s = (Statement) pruebaCn.createStatement();
			//rs = ((java.sql.Statement) s).executeQuery ("INSERT INTO alumno values(nicol)");
			
            //rs=s.executeUpdate(sql, 1);
            rs=s.executeUpdate(sql);
            
          
		   
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "Alumno Registrado");
		
	}
}
