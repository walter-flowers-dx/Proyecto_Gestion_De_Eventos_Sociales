package pkg121;


import java.io.Serializable;
import java.util.Scanner;

public class ColaSimplePersonas extends ColaPersonas implements Serializable{

	public ColaSimplePersonas() {
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
	
	public void adi(Personas elem) {
		if(esLlena()) {
			System.out.println("Cola Simple Llena!!!");
		}else {
			fi++;
			v[fi] = elem;
		}
	}
	
	public Personas eli() {
		Personas elem = new Personas(0,"","",0);
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
	
	public void vaciar(ColaSimplePersonas z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for(int i = 1; i<= n; i++) {
			System.out.println("Intr. Datos: cantPersonas, tipoEntrada, fecha, pagos");
			int cantidadPersonas = lee.nextInt();
			String tipoEntrada = lee.next();
			String fecha = lee.next();
			double pagos = lee.nextDouble();
			
			Personas x = new Personas(cantidadPersonas, tipoEntrada, fecha, pagos);
			adi(x);
		}
	}
	
	public void mostrar() {
		ColaSimplePersonas aux = new ColaSimplePersonas();
		Personas x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
	
}
