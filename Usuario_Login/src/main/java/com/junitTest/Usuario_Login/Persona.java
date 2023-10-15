package com.junitTest.Usuario_Login;
import java.util.ArrayList;
import java.util.List;

public class Persona {
	private List<Persona> personas;
	private int rut;
	private String nombre;
	private String apellido;
	private int telefono;
	private int fechaIngreso;
	



public Persona(int rut, String nombre, String apellido, int teléfono, int fecaIngreso)
{
	if(rut<=0){
		throw new IllegalArgumentException("Rut vacio");
	}
	if(nombre.trim().equals("") || nombre == null) {
		throw new IllegalArgumentException("Falta el Nombre");
	}
	if(apellido.trim().equals("") || apellido == null) {
		throw new IllegalArgumentException("Falta el Apellido");
	}
	if(telefono<=0){
		throw new IllegalArgumentException("Falta el Teléfono");
	}
	if(fechaIngreso<=0){
		throw new IllegalArgumentException("Falta la fecha ingreso");
	}
	this.rut = rut;
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefono = telefono;
	this.fechaIngreso = fechaIngreso;
	this.personas = new ArrayList<Persona>();
			
}

public List<Persona> getPersonas() {
	return personas;
}
public int getrut() {
	return rut;
}
public String getnombre() {
	return nombre;
}
public String getapellido() {
	return apellido;
}
public int gettelefono() {
	return telefono;
}
public int getfechaIngreso() {
	return fechaIngreso;
}

}

