package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Recursos implements Serializable{
	private int cantidadSillas;
	private int cantidadProyectores;
	private int cantidadMobiliario;
	
	public Recursos(int cantidadSillas, int cantidadProyectores, int cantidadMobiliario) {
		super();
		this.cantidadSillas = cantidadSillas;
		this.cantidadProyectores = cantidadProyectores;
		this.cantidadMobiliario = cantidadMobiliario;
	}

	public int getCantidadSillas() {
		return cantidadSillas;
	}

	public void setCantidadSillas(int cantidadSillas) {
		this.cantidadSillas = cantidadSillas;
	}

	public int getCantidadProyectores() {
		return cantidadProyectores;
	}

	public void setCantidadProyectores(int cantidadProyectores) {
		this.cantidadProyectores = cantidadProyectores;
	}

	public int getCantidadMobiliario() {
		return cantidadMobiliario;
	}

	public void setCantidadMobiliario(int cantidadMobiliario) {
		this.cantidadMobiliario = cantidadMobiliario;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr datos: cantSillas, cantProyectores, cantMobiliarios");
		cantidadSillas = lee.nextInt();
		cantidadProyectores = lee.nextInt();
		cantidadMobiliario = lee.nextInt();
	}
	
	public void mostrar() {
		System.out.println("***********Datos de los Recursos***********");
		System.out.println("Cantidad de Sillas: " + cantidadSillas);
		System.out.println("Cantidad de Proyectores: " + cantidadProyectores);
		System.out.println("Cantidad de Mobiliario: " + cantidadMobiliario);
	}
}
