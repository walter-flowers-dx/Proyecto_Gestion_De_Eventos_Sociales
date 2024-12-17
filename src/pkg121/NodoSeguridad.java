package pkg121;


import java.io.Serializable;


public class NodoSeguridad implements Serializable{
	private Seguridad seg;
	private NodoSeguridad ant;
	private NodoSeguridad sig;
	
	NodoSeguridad(){
		this.sig = null;
		this.ant = null;
	}

	public Seguridad getSeg() {
		return seg;
	}

	public void setSeg(Seguridad seg) {
		this.seg = seg;
	}

	public NodoSeguridad getAnt() {
		return ant;
	}

	public void setAnt(NodoSeguridad ant) {
		this.ant = ant;
	}

	public NodoSeguridad getSig() {
		return sig;
	}

	public void setSig(NodoSeguridad sig) {
		this.sig = sig;
	}
	
	
}
