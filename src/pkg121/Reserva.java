package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Reserva implements Serializable {
	private String tipoReserva;
	private String fecha;
	ColaSimplePersonas colaSimplePersonas;
	
	public Reserva(String tipoReserva, String fecha, ColaSimplePersonas colaSimplePersonas) {
		super();
		this.tipoReserva = tipoReserva;
		this.fecha = fecha;
		this.colaSimplePersonas = colaSimplePersonas;
	}

	public String getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ColaSimplePersonas getColaSimplePersonas() {
		return colaSimplePersonas;
	}

	public void setColaSimplePersonas(ColaSimplePersonas colaSimplePersonas) {
		this.colaSimplePersonas = colaSimplePersonas;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. DATOS: tipoReserva, fecha, colaSimplePersonas");
		tipoReserva = lee.next();
		fecha = lee.next();
		colaSimplePersonas.llenar(3);
	}
	
	public void mostrar() {
		System.out.println("***********Datos de la reserva***********");
		System.out.println("Tipo de Reserva: " + tipoReserva);
		System.out.println("Fecha: " +  fecha);
		System.out.println("***********Datos de las Personas***********");
		colaSimplePersonas.mostrar();
	}
}
