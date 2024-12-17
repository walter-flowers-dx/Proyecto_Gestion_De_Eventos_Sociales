package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Mp_PilaEventos implements Serializable {
	private int n;
    private PilaEventos[] c = new PilaEventos[100];

    public Mp_PilaEventos(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            c[i] = new PilaEventos();
        }
    }
    public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public PilaEventos[] getC() {
		return c;
	}

	public void setC(PilaEventos[] c) {
		this.c = c;
	}

	public int nroElem(int i) {
        return c[i].nroElem();
    }

    public boolean esVacia(int i) {
        return c[i].esVacia();
    }

    public boolean esLlena(int i) {
        return c[i].esLlena();
    }
    
    public PilaEventos[] getPilas() {
        return c;
    }
    
    public void adicionarPila(int i, PilaEventos pila) {
        c[i] = pila;
    }

    public void adicionar(int i, Eventos est) {
        c[i].adi(est);
    }
    
    
    public Eventos eliminarPila(int i) {
        return c[i].eli();
    }
    
    public void vaciar(int i, PilaEventos z) {
        c[i].vaciar(z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }


    public void mostrar() {
        System.out.println("Datos de la MultiPila:");
        for (int i = 0; i < this.n; i++) {
            c[i].mostrar();
        }
    }
    
    public void mostrarSoloDatosDeEventos() {
        System.out.println("Datos de la MultiPila:");
        for (int i = 0; i < this.n; i++) {
            c[i].mostrarSoloDatosDelEvento();
        }
    }
}
