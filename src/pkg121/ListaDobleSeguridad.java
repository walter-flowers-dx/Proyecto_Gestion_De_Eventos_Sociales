package pkg121;


import java.io.Serializable;


public class ListaDobleSeguridad implements Serializable{
	protected NodoSeguridad P;
	
	ListaDobleSeguridad(){
		this.P = null;
	}

	public NodoSeguridad getP() {
		return P;
	}

	public void setP(NodoSeguridad p) {
		P = p;
	}
	
}
