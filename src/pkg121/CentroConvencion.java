package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class CentroConvencion implements Serializable {
	Mp_PilaEventos mp_PilaEventos;
	private String nombre;
	private String ubicacion;
	private int capacidadEventos;
	
	public CentroConvencion(Mp_PilaEventos mp_PilaEventos, String nombre, String ubicacion, int capacidadEventos) {
		super();
		this.mp_PilaEventos = mp_PilaEventos;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidadEventos = capacidadEventos;
	}

	public Mp_PilaEventos getMp_PilaEventos() {
		return mp_PilaEventos;
	}

	public void setMp_PilaEventos(Mp_PilaEventos mp_PilaEventos) {
		this.mp_PilaEventos = mp_PilaEventos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEventos() {
		return capacidadEventos;
	}

	public void setCapacidadEventos(int capacidadEventos) {
		this.capacidadEventos = capacidadEventos;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: mp_PilaEventos, nombre, ubicacion, capacidadEventos");
		//mp_PilaEventos.llenar();
		nombre = lee.next();
		ubicacion = lee.next();
		capacidadEventos = lee.nextInt();
	}
	
	public void mostrarSoloEventos() {
		System.out.println("\n***********Eventos***********");
		mp_PilaEventos.mostrarSoloDatosDeEventos();
	}
	
	public void mostrar() {
		System.out.println("\n***********Eventos***********");
		mp_PilaEventos.mostrar();
		System.out.println("***********Datos del Centro de Convencion***********");
		System.out.println("Nombre: " + nombre);
		System.out.println("Ubicacion: " + ubicacion);
		System.out.println("CapacidadEventos: " + capacidadEventos);
	}
}
