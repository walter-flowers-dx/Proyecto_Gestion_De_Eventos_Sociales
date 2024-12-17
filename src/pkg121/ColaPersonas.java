package pkg121;


import java.io.Serializable;



public class ColaPersonas extends VectorPersonas implements Serializable{
	protected int fr;
	protected int fi;
	
	public ColaPersonas() {
		this.fr = -1;
		this.fi = -1;
	}
}
