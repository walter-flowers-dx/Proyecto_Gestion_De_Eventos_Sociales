package pkg121;


import java.io.Serializable;



public class VectorEspacios implements Serializable {
	protected int MAX = 100;
	protected Espacios[] v = new Espacios[MAX];
	public int getMAX() {
		return MAX;
	}
	public void setMAX(int mAX) {
		MAX = mAX;
	}
	public Espacios[] getV() {
		return v;
	}
	public void setV(Espacios[] v) {
		this.v = v;
	}
	
}
