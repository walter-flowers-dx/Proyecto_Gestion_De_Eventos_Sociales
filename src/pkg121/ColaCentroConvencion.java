package pkg121;


import java.io.Serializable;



public class ColaCentroConvencion extends VectorCentroConvencion implements Serializable{
	protected int fr;
	protected int fi;
	
	public ColaCentroConvencion() {
		this.fr = 0;
		this.fi = 0;
	}
}
