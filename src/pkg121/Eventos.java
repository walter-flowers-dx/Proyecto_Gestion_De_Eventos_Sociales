package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Eventos implements Serializable{
	Mp_ColaCircularEspacios mp_ColaCircularEspacios ;
	LD_NormalSeguridad ld_NormalSeguridad;
	ColaSimplePersonas colaSimplePersonas;
	Reserva reserva;
	private String nombre;
	private String tipoEvento;
	private int cantidadEspacios;
	private double presupuestoGeneral;
	private String fecha;
	private String tipoSolicitud;
	
	public Eventos(Mp_ColaCircularEspacios mp_ColaCircularEspacios, LD_NormalSeguridad ld_NormalSeguridad,
			ColaSimplePersonas colaSimplePersonas, Reserva reserva, String nombre, String tipoEvento,
			int cantidadEspacios, double presupuestoGeneral, String fecha, String tipoSolicitud) {
		super();
		this.mp_ColaCircularEspacios = mp_ColaCircularEspacios;
		this.ld_NormalSeguridad = ld_NormalSeguridad;
		this.colaSimplePersonas = colaSimplePersonas;
		this.reserva = reserva;
		this.nombre = nombre;
		this.tipoEvento = tipoEvento;
		this.cantidadEspacios = cantidadEspacios;
		this.presupuestoGeneral = presupuestoGeneral;
		this.fecha = fecha;
		this.tipoSolicitud = tipoSolicitud;
	}

	public Mp_ColaCircularEspacios getMp_ColaCircularEspacios() {
		return mp_ColaCircularEspacios;
	}

	public void setMp_ColaCircularEspacios(Mp_ColaCircularEspacios mp_ColaCircularEspacios) {
		this.mp_ColaCircularEspacios = mp_ColaCircularEspacios;
	}

	public LD_NormalSeguridad getLd_NormalSeguridad() {
		return ld_NormalSeguridad;
	}

	public void setLd_NormalSeguridad(LD_NormalSeguridad ld_NormalSeguridad) {
		this.ld_NormalSeguridad = ld_NormalSeguridad;
	}

	public ColaSimplePersonas getColaSimplePersonas() {
		return colaSimplePersonas;
	}

	public void setColaSimplePersonas(ColaSimplePersonas colaSimplePersonas) {
		this.colaSimplePersonas = colaSimplePersonas;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getCantidadEspacios() {
		return cantidadEspacios;
	}

	public void setCantidadEspacios(int cantidadEspacios) {
		this.cantidadEspacios = cantidadEspacios;
	}

	public double getPresupuestoGeneral() {
		return presupuestoGeneral;
	}

	public void setPresupuestoGeneral(double presupuestoGeneral) {
		this.presupuestoGeneral = presupuestoGeneral;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: mp_ColaCircularEspacios, ld_NormalSeguridad,\r\n"
				+ "			colaSimplePersonas, reserva, nombre, tipoEvento,\r\n"
				+ "			cantidadEspacios, presupuestoGeneral, fecha, tipoSolicitud");
		mp_ColaCircularEspacios.llenar(3);
		ld_NormalSeguridad.leer1(3);
		colaSimplePersonas.llenar(3);
		reserva.leer();
		nombre = lee.next();
		fecha = lee.next();
		tipoSolicitud = lee.next();
	}
	
	public void mostrarDatosSoloDelEvento() {
		System.out.println("\n***********Datos del Evento***********");
		System.out.println("Nombre: " + nombre);
		System.out.println("Tipo de Evento: " + tipoEvento);
		System.out.println("Cantidad de Espacios: " + cantidadEspacios);
		System.out.println("Presupuesto General: " + presupuestoGeneral);
		System.out.println("Fecha: "+ fecha);
		System.out.println("Tipo de solicitud: " + tipoSolicitud);
	}
	
	public void mostrar() {
		System.out.println("\n***********Datos del Evento***********");
		System.out.println("Nombre: " + nombre);
		System.out.println("Tipo de Evento: " + tipoEvento);
		System.out.println("Cantidad de Espacios: " + cantidadEspacios);
		System.out.println("Presupuesto General: " + presupuestoGeneral);
		System.out.println("Fecha: "+ fecha);
		System.out.println("Tipo de solicitud: " + tipoSolicitud);
		System.out.println("***********Espacios***********");
	    if (this.mp_ColaCircularEspacios != null) {
	        this.mp_ColaCircularEspacios.mostrar();
	    } else {
	        System.out.println("No hay espacios asignados para este evento.");
	    }
		System.out.println("***********Seguridad***********");
		ld_NormalSeguridad.mostrar();
		System.out.println("***********Personas***********");
		colaSimplePersonas.mostrar();
		System.out.println("***********Reservas***********");
		reserva.mostrar();
	}
}
