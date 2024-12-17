package pkg121;


import java.io.Serializable;
import java.util.Scanner;

public class ColaSimpleEspacios extends ColaEspacios implements Serializable{

	public ColaSimpleEspacios() {
		super();
	}
	
	public boolean esVacia() {
		if(fr == fi) 
			return true;
		return false;
	}
	
	public boolean esLlena() {
		if(fi == MAX-1)
			return true;
		return false;
	}
	
	public void adi(Espacios elem) {
		if(esLlena()) {
			System.out.println("Cola Simple Llena!!!");
		}else {
			fi++;
			v[fi] = elem;
		}
	}
	
	public Espacios eli() {
		Espacios elem = new Espacios(null, "", 0);
		if(esVacia()) {
			System.out.println("Cola Simple Vacia!!!");
		}else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	
	public int nroElem() {
		return (fi - fr);
	}
	
	public void vaciar(ColaSimpleEspacios z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for(int i = 1; i<= n; i++) {
			System.out.println("Intr, ls_NormalRecursos,nombre,tamEspacio");
			LS_NormalRecursos lsnr = new LS_NormalRecursos();
			lsnr.leer2(5);
			String nombre = lee.next();
			double tamañoEspacio = lee.nextDouble();
			Espacios x = new Espacios(lsnr, nombre, tamañoEspacio);
			adi(x);
		}
	}
	
	public void mostrar() {
		ColaSimpleEspacios aux = new ColaSimpleEspacios();
		Espacios x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
	
}
