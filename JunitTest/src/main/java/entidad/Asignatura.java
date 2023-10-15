package entidad;

import java.awt.List;
import java.util.ArrayList;

public class Asignatura {
	private List notas;
	private String nombre;
	private int credito;
	private ArrayList<Nota> notas1;
	
	public Asignatura(String nombre, int credito) {
		if(nombre.trim().equals("") || nombre == null) {
			throw new IllegalArgumentException("Nombre vacío");
		}
		if(credito<=0) {
			throw new IllegalArgumentException("Credito debe ser mayor a 0");
		}
		this.nombre = nombre;
		this.credito = credito;
		this.notas1 = new ArrayList<Nota>();
	}
	
	public List getNotas(){
		return notas;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCredito() {
		return credito;
	}
	
	public double promedio() {
		double suma = 0;
		double ponderacionAcum = 0;
		for (Nota nota : notas) {
			suma = suma + ((Nota) nota).getValor()*nota.getPonderacion();
			ponderacionAcum = ponderacionAcum + nota.getPonderacion();
		}
		return suma/ponderacionAcum;
	}
	
	public double avance() {
		double ponderacionAcum = 0;
		for (Nota nota : notas) {
			ponderacionAcum+=nota.getPonderacion();			
		}
		return ponderacionAcum;
	}

}
