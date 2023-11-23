package es.iescanaveral.dam2.aadd.LVR.uttilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones 
{	
	
	
	 
	
	
	//Creamos una connetion
	public  static Connection  Conexiones  () throws SQLException, ClassNotFoundException
	 {	String URL = GestorProperties.getInfoConfiguracion("MySQL_URL");
	 	String USUARIO =  GestorProperties.getInfoConfiguracion("MYSQL_USER"); 		
	 	String CONTRASEÑA = GestorProperties.getInfoConfiguracion("MYSQL_PASSWORD");
	 	String DRIVER_MYSQL = GestorProperties.getInfoConfiguracion("Drive_MySQL");
	 	  Connection conexion = null;
	 	
		Class.forName(DRIVER_MYSQL);	
		 conexion =  DriverManager.getConnection(URL,USUARIO, CONTRASEÑA);
		 return conexion;
	 }
	

}
