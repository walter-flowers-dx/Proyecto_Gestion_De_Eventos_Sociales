package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Seguridad implements Serializable{
	private String nomEmpresa;
	private int cantidadSeguridad;
	private String tipoSeguridad;
	
	public Seguridad(String nomEmpresa, int cantidadSeguridad, String tipoSeguridad) {
		super();
		this.nomEmpresa = nomEmpresa;
		this.cantidadSeguridad = cantidadSeguridad;
		this.tipoSeguridad = tipoSeguridad;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

	public int getCantidadSeguridad() {
		return cantidadSeguridad;
	}

	public void setCantidadSeguridad(int cantidadSeguridad) {
		this.cantidadSeguridad = cantidadSeguridad;
	}

	public String getTipoSeguridad() {
		return tipoSeguridad;
	}

	public void setTipoSeguridad(String tipoSeguridad) {
		this.tipoSeguridad = tipoSeguridad;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nomEmpresa, cantSeguridad, tipoSeguridad");
		nomEmpresa = lee.next();
		cantidadSeguridad = lee.nextInt();
		tipoSeguridad = lee.next();
	}

	@Override
	public String toString() {
		return "Seguridad [nomEmpresa=" + nomEmpresa + ", cantidadSeguridad=" + cantidadSeguridad + ", tipoSeguridad="
				+ tipoSeguridad + "]";
	}
	
	public void mostrar() {
		System.out.println("***********Datos de la Seguridad***********");
		System.out.println("Nombre De Empresa: " + nomEmpresa);
		System.out.println("Cantidad de Seguridad: " + cantidadSeguridad);
		System.out.println("Tipo de Seguridad: " + tipoSeguridad);
	}
}
