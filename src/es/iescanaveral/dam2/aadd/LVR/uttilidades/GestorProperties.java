package es.iescanaveral.dam2.aadd.LVR.uttilidades;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class GestorProperties 

{
	private static Properties propiedades=null;
	public static String getInfoConfiguracion(String clave) {
		String valor = null;
		// Se carga la información del fichero de configuración (una vez)- Utilización del patrón Singleton 
		if(propiedades == null) {
			InputStream inputStream=null;
			propiedades = new Properties();
			try {
				inputStream = new FileInputStream("config/actividad2_3.properties");
				propiedades.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				  e.printStackTrace();
			}
		}
		// Se devuelve un valor.
		valor=propiedades.getProperty(clave);
		
		return valor;
	}
}

