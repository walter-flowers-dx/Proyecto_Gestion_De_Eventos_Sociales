package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Personas implements Serializable{
	private int cantidadPersonas;
	private String tipoEntrada;
	private String fecha;
	private double pagos;
	
	public Personas(int cantidadPersonas, String tipoEntrada, String fecha, double pagos) {
		super();
		this.cantidadPersonas = cantidadPersonas;
		this.tipoEntrada = tipoEntrada;
		this.fecha = fecha;
		this.pagos = pagos;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPagos() {
		return pagos;
	}

	public void setPagos(double pagos) {
		this.pagos = pagos;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: cantPersonas, tipoEntrada, fecha, pagos");
		cantidadPersonas = lee.nextInt();
		tipoEntrada = lee.next();
		fecha = lee.next();
		pagos = lee.nextDouble();
	}

	@Override
	public String toString() {
		return "Personas [cantidadPersonas=" + cantidadPersonas + ", tipoEntrada=" + tipoEntrada + ", fecha=" + fecha
				+ ", pagos=" + pagos + "]";
	}
	
	public void mostrar() {
		System.out.println("***********Datos del Grupo de Personas***********");
		System.out.println("Cantidad de Personas: " + cantidadPersonas);
		System.out.println("Tipo de Entrada: " +  tipoEntrada);
		System.out.println("Fecha: " + fecha);
		System.out.println("Pagos: " + pagos);
	}
}
