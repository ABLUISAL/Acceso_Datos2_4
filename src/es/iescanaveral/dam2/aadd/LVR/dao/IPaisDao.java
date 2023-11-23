package es.iescanaveral.dam2.aadd.LVR.dao;

import java.sql.SQLException;
import java.util.List;

import es.iescanaveral.dam2.aadd.LVR.uttilidades.Conexiones;
import es.iescanaveral.dam2.aadd.LVR.vo.Pais;

public interface IPaisDao 
{
	public int actulizarNombrePais (String capital, int codPais) throws SQLException, ClassNotFoundException;
	public  List<Pais> ListaPaisesAConsultar(String codContinente, String consulta) throws SQLException, ClassNotFoundException; 
	

}
