package es.iescanaveral.dam2.aadd.LVR.vo;

import java.sql.SQLException;
import java.util.List;



public class Pais 
{
	
	//Atributos 
	Continente continente;
	private int  codigopais;
	private String  nombre;
	private String capital;
	
	
	//Getter y Setter
	public Continente getContinente() {
		return continente;
	}
	public void setContinente(Continente continente) {
		this.continente = continente;
	}
	public int getCodigopais() {
		return codigopais;
	}
	public void setCodigopais(int codigopais) {
		this.codigopais = codigopais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	
	}

	@Override
	public String toString() {
		return getCapital()+"  es capital de "+getNombre()+"  ("+getCodigopais()+")  pertenece al contienente "+ continente.getNombre()+"  "+continente.getCodigo();	

	}
}