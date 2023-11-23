package es.iescanaveral.dam2.aadd.LVR.dao;

import es.iescanaveral.dam2.aadd.LVR.vo.Continente;

import java.sql.SQLException;

public interface IContinenteDao  
{  
	 public int eliminarContinente(String codContinente) throws SQLException, ClassNotFoundException;
	 public int agregarContinente(Continente continente) throws SQLException, ClassNotFoundException;
}
