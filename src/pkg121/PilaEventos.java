package pkg121;



import java.io.Serializable;
import java.util.Scanner;

public class PilaEventos extends VectorEventos implements Serializable{
	private int tope;
	public PilaEventos() {
		this.tope = -1;
	}
	public boolean esVacia() {
		if(this.tope == -1) {
			return true; //pila vacia
		}
		else {
			return false; //pila no es vacia
		}
	}
	
	public boolean esLlena() {
		if(this.tope == max) {
			return true; //pila llena
		}
		else {
			return false;  //pila no es llena
		}
	}
	
	public void adi (Eventos elem) {
		if(!esLlena()) { 
			this.tope++;    
			this.v[this.tope] = elem;
		}
		else {
			System.out.println("Pila llena!!!");
		}
	}
	
	public Eventos eli() {
		Eventos elem= new Eventos(null,null,null,null,"","",0,0,"","");
		if(!esVacia()) { //si la pila no esta vacia
			elem = this.v[this.tope];
			this.tope--;  //decrementa en una unidad
		}
		else {
			System.out.println("Pila es vacia!!!");
			
		}
		return elem;
	}
	
	public void mostrar() {
		PilaEventos aux = new PilaEventos();
		System.out.println("Datos de la pila:");
		while(!esVacia()) {
			Eventos elem= new Eventos(null,null,null,null,"","",0,0,"","");
			elem = eli();
			System.out.println(elem);
			aux.adi(elem);
			elem.mostrar();    
		}
		vaciar(aux);
	}
	
	public void mostrarSoloDatosDelEvento() {
		PilaEventos aux = new PilaEventos();
		System.out.println("Datos de la pila:");
		while(!esVacia()) {
			Eventos elem= new Eventos(null,null,null,null,"","",0,0,"","");
			elem = eli();
			System.out.println(elem);
			aux.adi(elem);
			elem.mostrarDatosSoloDelEvento();  
		}
		vaciar(aux);
	}
	
	public void vaciar(PilaEventos p) {
		while(!p.esVacia()) { //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca datos: ");
		for(int i = 1;i<=n;i++) {
			Eventos elem= new Eventos(null,null,null,null,"","",0,0,"","");
			elem.leer();
			this.adi(elem);
		}
	}
	
	public int nroElem() {
		return tope + 1;
	}
}
