package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Espacios implements Serializable{
	LS_NormalRecursos ls_NormalRecursos;
	private String nombre;
	private double tamañoEspacio;
	
	public Espacios(LS_NormalRecursos ls_NormalRecursos, String nombre, double tamañoEspacio) {
		super();
		this.ls_NormalRecursos = ls_NormalRecursos;
		this.nombre = nombre;
		this.tamañoEspacio = tamañoEspacio;
	}

	public LS_NormalRecursos getLs_NormalRecursos() {
		return ls_NormalRecursos;
	}

	public void setLs_NormalRecursos(LS_NormalRecursos ls_NormalRecursos) {
		this.ls_NormalRecursos = ls_NormalRecursos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTamañoEspacio() {
		return tamañoEspacio;
	}

	public void setTamañoEspacio(double tamañoEspacio) {
		this.tamañoEspacio = tamañoEspacio;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: ls_NormalRecursos, nombre, tamEspacio");
		ls_NormalRecursos.leer2(5);
		nombre = lee.next();
		tamañoEspacio = lee.nextDouble();
	}
	
	@Override
	public String toString() {
		return "Espacios [ls_NormalRecursos=" + ls_NormalRecursos + ", nombre=" + nombre + ", tamañoEspacio="
				+ tamañoEspacio + "]";
	}

	public void mostrar() {
		System.out.println("\n***********Recursos***********");
		ls_NormalRecursos.mostrar();
		System.out.println("***********Datos de los Espacios***********");
		System.out.println("Nombre: " + nombre);
		System.out.println("TamañoEspacio: " + tamañoEspacio);
	}
}
