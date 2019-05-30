package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class LoginUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUsuario frame = new LoginUsuario();
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
	public LoginUsuario() {
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 416);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User:");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel.setBounds(372, 59, 91, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblPassword.setBounds(372, 143, 91, 31);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(372, 101, 278, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxRemenberMeAs = new JCheckBox("Remember me as user");
		chckbxRemenberMeAs.setBounds(373, 234, 202, 23);
		contentPane.add(chckbxRemenberMeAs);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(372, 185, 278, 31);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(241,57,83));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mantenimiento c1=new Mantenimiento();
				c1.setUndecorated(true);
				c1.show();
				//LoginUsuario.this.hide();
				
				
				//frmLoguin c1=new frmLoguin();
				//c1.show();
			}
		});
		btnNewButton.setBounds(443, 282, 132, 40);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 307, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		
		label.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
				
			}
		});
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x=arg0.getXOnScreen();
				int y=arg0.getYOnScreen();
				LoginUsuario.this.setLocation(x-xx,y-xy);
				
			}
			
		});
		label.setBounds(10, 49, 283, 318);
		label.setIcon(new ImageIcon("C:\\Users\\Aspire 5\\Desktop\\ImagenesCuenta\\TrilceMatricula\\p.txt.jfif"));
		panel.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula Trilce");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 24));
		lblNewLabel_1.setBounds(59, 363, 181, 36);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(650, 143, -277, 2);
		contentPane.add(separator);
		
		JLabel lblClose = new JLabel("X");
		lblClose.setBackground(Color.BLUE);
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			System.exit(1);
			}
		});
		lblClose.setForeground(new Color(241,57,83));
		lblClose.setBounds(651, 0, 34, 31);
		contentPane.add(lblClose);
	}
}
