package es.iescanaveral.dam2.aadd.LVR.dao.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import es.iescanaveral.dam2.aadd.LVR.dao.IContinenteDao;
import es.iescanaveral.dam2.aadd.LVR.uttilidades.Conexiones;
import es.iescanaveral.dam2.aadd.LVR.uttilidades.GestorProperties;
import es.iescanaveral.dam2.aadd.LVR.vo.Continente;

public class ContinenteDAOImpl implements IContinenteDao

{   
	
	public int eliminarContinente(String codContinente) throws SQLException, ClassNotFoundException 
	{
	
    
		int resultado = 0;
    
		Connection conexion = Conexiones.Conexiones();
		String deletePaisesSQL = "DELETE FROM T_PAIS WHERE cod_continente = ?";
		PreparedStatement   preStatepais  = conexion.prepareStatement(deletePaisesSQL);
		preStatepais.setString(1,codContinente);
		resultado = preStatepais.executeUpdate(deletePaisesSQL);

		String deleteContinenteSQL =  "DELETE FROM T_CONTINENTE WHERE cod_continente = ?";
		PreparedStatement   preStateContinente  = conexion.prepareStatement(deleteContinenteSQL);
		preStateContinente.setString(1,codContinente);	
		resultado =  preStateContinente.executeUpdate(deleteContinenteSQL);
	     
		preStatepais.close();
		preStateContinente.close();
	     conexion.close();
    
	     return resultado;
}


public int agregarContinente(Continente continente) throws SQLException, ClassNotFoundException
{
	int resultado;
	Connection conexion = Conexiones.Conexiones();
    String sql = "INSERT INTO T_CONTINENTE (cod_continente, nombre_continente) VALUES (?,?)";

     PreparedStatement preStateConti = conexion.prepareStatement(sql);
     	
     preStateConti.setString(1,continente.getCodigo());
     preStateConti.setString(2,	continente.getNombre());
     resultado= preStateConti.executeUpdate(sql);
    
    preStateConti.close();
    conexion.close();
    
    return resultado;
    
}




}
