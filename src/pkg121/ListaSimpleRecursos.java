package pkg121;


import java.io.Serializable;


public class ListaSimpleRecursos implements Serializable {
	protected NodoRecursos P;  //raiz de la lista
	
	public ListaSimpleRecursos() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoRecursos getP() {
		return P;
	}

	public void setP(NodoRecursos p) {
		P = p;
	}
	
}
