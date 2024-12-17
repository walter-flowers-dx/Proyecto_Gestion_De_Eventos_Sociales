package pkg121;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ColaCircularCentroConvencion extends ColaCentroConvencion {
    public ColaCircularCentroConvencion() {
        super();
    }

    public int nroElem() {
        return (fi - fr + MAX) % MAX;
    }

    public boolean esVacia() {
        return nroElem() == 0;
    }

    public boolean esLlena() {
        return nroElem() == MAX - 1;
    }

    public void adi(CentroConvencion elem) {
        if (!esLlena()) {
            fi = (fi + 1) % MAX;
            v[fi] = elem;
        } else {
            System.out.println("Cola circular llena!!!");
        }
    }

    public CentroConvencion eli() {
        CentroConvencion elem = null;
        if (!esVacia()) {
            fr = (fr + 1) % MAX;
            elem = v[fr];
        } else {
            System.out.println("Cola circular vacía!!");
        }
        return elem;
    }

    public void vaciar(ColaCircularCentroConvencion z) {
        while (!z.esVacia()) {
            adi(z.eli());
        }
    }

    public void llenar(int n) {
        Scanner lee = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.println("Introduce un CentroConvencion (como objeto):");
            CentroConvencion elem = new CentroConvencion(null,"","",0);  
            elem.leer(); 
            adi(elem);
        }
    }

    public void mostrar() {
        ColaCircularCentroConvencion aux = new ColaCircularCentroConvencion();
        while (!esVacia()) {
            CentroConvencion elem = eli();
            elem.mostrar(); // Llama al método mostrar() de CentroConvencion
            aux.adi(elem);
        }
        vaciar(aux);
    }
    
    public void mostrarSoloDatosDeLosEventos() {
        ColaCircularCentroConvencion aux = new ColaCircularCentroConvencion();
        while (!esVacia()) {
            CentroConvencion elem = eli();
            elem.mostrarSoloEventos(); // Llama al método mostrar() de CentroConvencion
            aux.adi(elem);
        }
        vaciar(aux);
    }
public static void guardarDatos(ColaCircularCentroConvencion cccc, String rutaArchivo) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
        oos.writeObject(cccc);
        System.out.println("Datos guardados correctamente en: " + rutaArchivo);
    } catch (IOException e) {
        System.err.println("Error al guardar los datos: " + e.getMessage());
    }
}


    public static ColaCircularCentroConvencion cargarDatos(String archivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            System.out.println("Datos cargados desde el archivo: " + archivo);
            return (ColaCircularCentroConvencion) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        return new ColaCircularCentroConvencion();
    }
}

