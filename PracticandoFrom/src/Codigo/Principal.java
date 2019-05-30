package Codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

import Conecta.BaseConeccion;
import Formulario.LoginUsuario;
import Formulario.Mantenimiento;
import Formulario.frmLoguin;

public class Principal {
	public static void main(String[] args) {
		/*
		BaseConeccion diegoConexion = new BaseConeccion();
		Connection pruebaCn=diegoConexion.getConexion();		
		if(pruebaCn != null) {
			
			System.out.println("CONECTADO A LA BASE DE DATOS");
			System.out.print(pruebaCn);
		}else {
			System.out.print("Desconectado");
		}
		*/
		
		/*
		String nombre;
		int edad;
		int año;
		String colegio;
		
		BaseConeccion diegoConexion = new BaseConeccion();
		Connection pruebaCn=diegoConexion.getConexion();
		
		Alumno num1=new Alumno();
		
		nombre=JOptionPane.showInputDialog("Digite el nombre del Alumno:");
		num1.setNombre(nombre);
		edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del Alumno:"));
		num1.setEdad(edad);
		año=Integer.parseInt(JOptionPane.showInputDialog("Digite el año donde estara el Alumno:"));
		num1.setAño(año);
		colegio=JOptionPane.showInputDialog("Digite el colegio del Alumno:");
		num1.setColegio(colegio);
		
		
		System.out.println(num1.getNombre());
		System.out.println(num1.geteEdad());
		System.out.println(num1.getAño());
		System.out.println(num1.getColegio());
		
		Statement s;
		
		int rs;
		String sql="Insert into alumno  values('"+num1.getNombre()+"')";
		try {
			s = (Statement) pruebaCn.createStatement();
			//rs = ((java.sql.Statement) s).executeQuery ("INSERT INTO alumno values(nicol)");
			
            //rs=s.executeUpdate(sql, 1);
            rs=s.executeUpdate(sql);
            
          
		   
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		*/
		
		LoginUsuario inicio=new LoginUsuario();
		frmLoguin loguin=new frmLoguin();
		Mantenimiento mant=new Mantenimiento();
		mant.setUndecorated(true);
		inicio.setUndecorated(true);
		//mant.show();
		
		loguin.setUndecorated(true);
		inicio.show();
		
		
		
		
		
		
		
	}

}
