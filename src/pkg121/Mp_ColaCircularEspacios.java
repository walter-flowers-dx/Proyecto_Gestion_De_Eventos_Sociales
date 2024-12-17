package pkg121;

import java.io.Serializable;
import java.util.Scanner;

public class Mp_ColaCircularEspacios implements Serializable{
	ColaSimpleEspacios colaSimpleEspacios;
    private int n;
    private ColaSimpleEspacios c[] = new ColaSimpleEspacios[100];

    public Mp_ColaCircularEspacios(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            c[i] = new ColaSimpleEspacios();
        }
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

    public void adicionar(int i, ColaSimpleEspacios cola) {
        c[i] = cola;
    }

    public Espacios eliminar(int i) {
        return c[i].eli();
    }

    public void llenar(int i, int n) {
        c[i].llenar(n);
    }

    public void llenar(int n) {
        this.n = n;
        Scanner lee = new Scanner(System.in);
        for (int i = 0; i < this.n; i++) {
            c[i] = new ColaSimpleEspacios();
            System.out.println("Número de Espacioss en la cola:");
            int nroEst = lee.nextInt();
            c[i].llenar(nroEst);
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.n; i++) {
            //System.out.println("Mostrando ColaSimpleEspacios en el índice " + i + ":");
            if (c[i] != null) {  
                c[i].mostrar();
            } else {
            }
        }
        
        if (colaSimpleEspacios != null) {
            colaSimpleEspacios.mostrar();
        } else {
        }
    }


    public void mostrar(int i) {
    	colaSimpleEspacios.mostrar();
        c[i].mostrar();
    }

    public void vaciar(int i, ColaSimpleEspacios z) {
        c[i].vaciar(z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
