package pkg121;


import java.io.Serializable;


public class NodoRecursos implements Serializable{
	private Recursos q;  //define el dato objeto Recursos
	private NodoRecursos sig; //definiendo el campo enlace sig
	
	public NodoRecursos() {  //constructor
		sig = null;
	}

	public Recursos getQ() {
		return q;
	}

	public void setQ(Recursos q) {
		this.q = q;
	}

	public NodoRecursos getSig() {
		return sig;
	}

	public void setSig(NodoRecursos sig) {
		this.sig = sig;
	}
	
}
