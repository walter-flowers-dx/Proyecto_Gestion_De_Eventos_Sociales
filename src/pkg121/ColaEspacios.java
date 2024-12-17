package pkg121;


import java.io.Serializable;



public class ColaEspacios extends VectorEspacios implements Serializable{
	protected int fr;
	protected int fi;
	
	public ColaEspacios() {
		this.fr = -1;
		this.fi = -1;
	}
}
