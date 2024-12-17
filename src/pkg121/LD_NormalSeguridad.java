package pkg121;


import java.io.Serializable;


public class LD_NormalSeguridad extends ListaDobleSeguridad implements Serializable{
	public LD_NormalSeguridad() {
		super();
	}
	public boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoSeguridad R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Seguridad z){
		NodoSeguridad nuevo = new NodoSeguridad();
		nuevo.setSeg(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoSeguridad R = P;
		while(R != null) {
			R.getSeg().mostrar();
			R = R.getSig();
		}
	}
	public void adiFinal(Seguridad z) {
		NodoSeguridad nuevo =  new NodoSeguridad();
		nuevo.setSeg(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoSeguridad R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoSeguridad eliPrimero() {
		NodoSeguridad x = new NodoSeguridad();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoSeguridad eliFinal() {
		NodoSeguridad x = new NodoSeguridad();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoSeguridad R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoSeguridad aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Seguridad z = new Seguridad("",0,"");
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Seguridad z = new Seguridad("",0,"");
			z.leer();
			adiFinal(z);
		}
	}
}
