package es.iescanaveral.dam2.aadd.LVR;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import es.iescanaveral.dam2.aadd.LVR.dao.IContinenteDao;
import es.iescanaveral.dam2.aadd.LVR.dao.IPaisDao;
import es.iescanaveral.dam2.aadd.LVR.dao.impl.ContinenteDAOImpl;
import es.iescanaveral.dam2.aadd.LVR.dao.impl.PaisDAOImpl;
import es.iescanaveral.dam2.aadd.LVR.uttilidades.Conexiones;
import es.iescanaveral.dam2.aadd.LVR.vo.Continente;
import es.iescanaveral.dam2.aadd.LVR.vo.Pais;

public class AppMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Conexiones conexion = new Conexiones();
		Scanner sc = new Scanner(System.in);
		// Conexiones conexiones = new Conexiones();
		
		/**
		 * este es un comentario de prueba desde eclipse.... 

   			este mensaje es desde github			
		 */

		// imprrimir por pantalla la opcion deseada
		System.out.println("Introduzca la operación a realizar la base de datos:\n"
				+ "1- Lista de paises americano que inician por <Sa> \n" + "2- Añadir nuevo continente <Antartida>\n"
				+ "3- Actualizar nombre del pais con codigo <107> y cambiar el  nombre <capital> a <city>\n"
				+ "4- Eliminar continente con codigo <06>\n"
				+ "5- opcion 5");
		int numeroEntreda = sc.nextInt();

		switch (numeroEntreda) {
		case 1:
			System.out.println("1- Lista de paises americano que inician por <Sa>\n"
					+ "---------------------------------------------------------");
			opcion1();
			break;

		case 2:
			System.out.println(" 2- Añadir nuevo continente <Antartida>\\n\"\n"
					+ "-------------------------------------------------");
			opcion2();
			break;

		case 3:
			System.out
					.println("3- Actualizar nombre del pais con codigo <107> y cambiar el  nombre <capital> a <city>\n"
							+ "-------------------------------------------------");

			opcion3();
			break;

		case 4:
			System.out.println(
					"4- Eliminar continente con codigo <02>\n" + "-------------------------------------------------");
			opcion4();
			break;
		case 5:
			System.out.println("Opcion 5 ");
			opcion5();
			break;

		default:
			throw new IllegalArgumentException("Valor inesperado: " + numeroEntreda);
		}

	}

	private static void opcion1() throws SQLException, ClassNotFoundException 
	{
		IPaisDao iPais = new PaisDAOImpl();
		Continente continente = new Continente();
		List<Pais> listaPaises = iPais.ListaPaisesAConsultar("02", "Sa");
		// Imprimir la lista de países
		for (Pais pais : listaPaises) 
		{
		  System.out.println(pais.getCapital()+"capital de "+pais.getNombre()+pais.getCodigopais()+"pertenece al contienente"+continente.getNombre()+" "+continente.getCodigo()+"\n");
		}
	}

	private static void opcion2() throws SQLException, ClassNotFoundException {
		IContinenteDao iContinente = new ContinenteDAOImpl();
		Continente continente = new Continente();
		continente.setCodigo("06"); 
		continente.setNombre("Antartida");
		iContinente.agregarContinente(continente);
		System.out.println("hecho ");
		
	}

	private static void opcion3() throws SQLException, ClassNotFoundException {
		IPaisDao iPais = new PaisDAOImpl();
		String capital="Capital city";
		int codigoPais=107;
		int result = iPais.actulizarNombrePais(capital, codigoPais);

		System.out.println("hecho ");
	}

	private static void opcion4() throws SQLException, ClassNotFoundException {
		IContinenteDao iContinente = new ContinenteDAOImpl();
		iContinente.eliminarContinente("03");
		
		System.out.println("hecho ");
	}
	
	// La misma consulta pero esta  ves usamos callableStatement
	private static void opcion5() throws ClassNotFoundException, SQLException
	{
		IPaisDao iPais = new PaisDAOImpl();
		Continente continente = new Continente();
		List<Pais> listaPaises = iPais.ListaPaisesAConsultar("02", "Sa");
		
		// Imprimir la lista de países
		for (Pais pais : listaPaises) 
		{
			System.out.println(pais.toString());
			
		}
	}

}
