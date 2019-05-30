package Conecta;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;

public class BaseConeccion {
	private static Connection cn;
	
	public Connection getConexion() {
		
		try	{
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			cn=java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=javabase2","sa", "123456");
			
		}catch(Exception e){
			cn=null;
		}
		return cn;
	}
	
	

}
