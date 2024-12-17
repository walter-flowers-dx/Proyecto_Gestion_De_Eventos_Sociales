
package pkg121;
import static pkg121.ColaCircularCentroConvencion.guardarDatos;

public class Principal {

	public static void main(String[] args) {
		// RECURSOS
		LS_NormalRecursos lsnr1 = new LS_NormalRecursos();
		Recursos r1 = new Recursos(100, 50, 75);
		lsnr1.adiFinal(r1);
		//lsnr1.mostrar();
		
		LS_NormalRecursos lsnr2 = new LS_NormalRecursos();
		Recursos r2 = new Recursos(25, 10, 15);
		lsnr2.adiFinal(r2);
		//lsnr2.mostrar();
		
		LS_NormalRecursos lsnr3 = new LS_NormalRecursos();
		Recursos r3 = new Recursos(35, 40, 45);
		lsnr3.adiFinal(r3);
		//lsnr3.mostrar();
		
		// ESPACIOS
		ColaSimpleEspacios cse1 = new ColaSimpleEspacios();
		Espacios e1 = new Espacios(lsnr1, "EspacioA", 250.5);
		Espacios e2 = new Espacios(lsnr2, "EspacioB", 50);
		Espacios e3 = new Espacios(lsnr3, "EspacioC", 100.75);
		cse1.adi(e1);
		cse1.adi(e2);
		cse1.adi(e3);
		//cse1.mostrar();
		//System.out.println();
		
		ColaSimpleEspacios cse2 = new ColaSimpleEspacios();
		Espacios e4 = new Espacios(lsnr1, "EspacioA", 300.5);
		cse2.adi(e4);
		//cse2.mostrar();
		//System.out.println();
		
		ColaSimpleEspacios cse3 = new ColaSimpleEspacios();
		Espacios e5 = new Espacios(lsnr1, "EspacioA", 250);
		Espacios e6 = new Espacios(lsnr2, "EspacioB", 75);
		Espacios e7 = new Espacios(lsnr3, "EspacioC", 45);
		cse3.adi(e5);
		cse3.adi(e6);
		cse3.adi(e7);
		//cse3.mostrar();
		//System.out.println();
		
		// MULTIPLE COL CIRCULAR DE ESPACIOS
		Mp_ColaCircularEspacios mpcce1 = new Mp_ColaCircularEspacios(3);
		mpcce1.adicionar(0, cse1);
		mpcce1.adicionar(1, cse2);
		mpcce1.adicionar(2, cse3);
		//mpcce1.mostrar();
		//System.out.println();
		
		Mp_ColaCircularEspacios mpcce2 = new Mp_ColaCircularEspacios(1);
		mpcce1.adicionar(0, cse2);
		//mpcce1.mostrar();
		//System.out.println();
		
		Mp_ColaCircularEspacios mpcce3 = new Mp_ColaCircularEspacios(2);
		mpcce1.adicionar(0, cse3);
		mpcce1.adicionar(1, cse1);
		//mpcce1.mostrar();
		//System.out.println();
				
		// SEGURIDAD
		LD_NormalSeguridad lsns1 = new LD_NormalSeguridad();
		Seguridad s1 = new Seguridad("Patrullando", 25, "Privada");
		Seguridad s2 = new Seguridad("Call-911", 50, "Publica");
		lsns1.adiFinal(s1);
		lsns1.adiFinal(s2);
		//lsns1.mostrar();
		//System.out.println();
		
		LD_NormalSeguridad lsns2 = new LD_NormalSeguridad();
		Seguridad s3 = new Seguridad("Radio-Pat", 10, "Privada");
		lsns2.adiFinal(s3);
		//lsns2.mostrar();
		//System.out.println();
		
		LD_NormalSeguridad lsns3 = new LD_NormalSeguridad();
		Seguridad s4 = new Seguridad("Radar", 75, "Privada");
		Seguridad s5 = new Seguridad("Guardian-Rojo", 100, "Publica");
		Seguridad s6 = new Seguridad("Halcon-Azul", 25, "Privada");
		lsns3.adiFinal(s4);
		lsns3.adiFinal(s5);
		lsns3.adiFinal(s6);
		//lsns3.mostrar();
		//System.out.println();
			
		// PERSONAS
		ColaSimplePersonas csp1 = new ColaSimplePersonas();
		Personas p1 = new Personas(100, "VIP", "10-10-2024", 5000);
		csp1.adi(p1);
		//csp1.mostrar();
		//System.out.println();
		
		ColaSimplePersonas csp2 = new ColaSimplePersonas();
		Personas p2 = new Personas(200, "General", "10-10-2024", 3000);
		csp2.adi(p2);
		//csp2.mostrar();
		//System.out.println();
		
		ColaSimplePersonas csp3 = new ColaSimplePersonas();
		Personas p3 = new Personas(300, "Preferencial", "03-03-2025", 25500);
		csp3.adi(p3);
		//csp3.mostrar();
		//System.out.println();
		
		ColaSimplePersonas csp4 = new ColaSimplePersonas();
		Personas p4 = new Personas(300, "Preferencial", "01-01-2024", 25500);
		csp4.adi(p4);
		//csp3.mostrar();
		//System.out.println();
		
		ColaSimplePersonas csp5 = new ColaSimplePersonas();
		Personas p5 = new Personas(300, "Preferencial", "20-12-2024", 25500);
		csp5.adi(p5);
		//csp3.mostrar();
		//System.out.println();
		
		ColaSimplePersonas csp6 = new ColaSimplePersonas();
		Personas p6 = new Personas(300, "Preferencial", "20-12-2024", 25500);
		csp6.adi(p6);
		//csp3.mostrar();
		//System.out.println();
		
		ColaSimplePersonas csp7 = new ColaSimplePersonas();
		Personas p7 = new Personas(300, "Preferencial", "20-12-2024", 25500);
		csp7.adi(p7);
		//csp3.mostrar();
		//System.out.println();
		
		// RESERVAS
		Reserva reserva1 = new Reserva("VIP", "10-10-2024", csp1);
		//reserva1.mostrar();
		//System.out.println();
		
		Reserva reserva2 = new Reserva("General", "10-10-2024", csp2);
		//reserva2.mostrar();
		//System.out.println();
		
		Reserva reserva3 = new Reserva("Preferencial", "01-01-2024", csp1);
		//reserva3.mostrar();
		//System.out.println();
		
		Reserva reserva4 = new Reserva("Preferencial", "20-12-2024", csp1);
		//reserva3.mostrar();
		//System.out.println();
		
		Reserva reserva5 = new Reserva("General", "20-12-2024", csp1);
		//reserva3.mostrar();
		//System.out.println();
		
		Reserva reserva6 = new Reserva("VIP", "20-12-2024", csp1);
		//reserva3.mostrar();
		//System.out.println();
		
		// EVENTOS     ===> (Para mostrar el indice revisar el mostrar de colCircularEspacios)
		PilaEventos pe1 = new PilaEventos();
		Eventos eve1 = new Eventos(null, lsns2, csp4, reserva3, "Arte", "Privado", 1, 10000, "01-01-2024", "a");
		pe1.adi(eve1);
		//pe1.mostrar();
		//System.out.println();
		
		PilaEventos pe2 = new PilaEventos();
		Eventos eve2 = new Eventos(mpcce1, lsns1, csp1, reserva1, "Ciencia", "Privado", 3, 10000, "10-10-2024", "a");
		Eventos eve3 = new Eventos(mpcce2, lsns2, csp2, reserva2, "Tecnologia", "Privado", 0, 10000, "10-10-2024", "a");
		pe2.adi(eve2);
		pe2.adi(eve3);
		//pe2.mostrar();
		//System.out.println();
		
		PilaEventos pe3 = new PilaEventos();
		Eventos eve4 = new Eventos(mpcce3, lsns3, csp5, reserva4, "Politica", "Privado", 2, 10000, "20-12-2024", "a");
		
		Eventos eve6 = new Eventos(mpcce1, lsns1, csp7, reserva6, "Ciberseguridad", "Privado", 3, 10000, "20-12-2024", "a");
		pe3.adi(eve4);

		pe3.adi(eve6);
		//pe3.mostrar();
		//System.out.println();
				
		// MULTIPLE PILA DE EVENTOS
		Mp_PilaEventos mppe1 = new Mp_PilaEventos(3);
		mppe1.adicionarPila(0, pe1);
		mppe1.adicionarPila(1, pe2);
		mppe1.adicionarPila(2, pe3);
		//mppe1.mostrar();
		//System.out.println();
		
		Mp_PilaEventos mppe2 = new Mp_PilaEventos(1);
		mppe2.adicionarPila(0, pe2);
		//mppe2.mostrar();
		//System.out.println();
		
		Mp_PilaEventos mppe3 = new Mp_PilaEventos(2);
		mppe3.adicionarPila(0, pe2);
		mppe3.adicionarPila(1, pe3);
		//mppe3.mostrar();
		//System.out.println();		
		
		// CENTRO CONVENCION
		ColaCircularCentroConvencion cccc = new ColaCircularCentroConvencion();
		CentroConvencion cc1 = new CentroConvencion(mppe1, "Chuquiago-Marka", "Santa Cruz", 10000);
		CentroConvencion cc2 = new CentroConvencion(mppe2, "Los Tajibos", "Obrajes", 50000);
		CentroConvencion cc3 = new CentroConvencion(mppe3, "FexpoCRUZ", "Santa Cruz", 20000);
		cccc.adi(cc1);
		cccc.adi(cc2);
		cccc.adi(cc3);
		//cccc.mostrar();
                   // Guardar los datos en un archivo
                guardarDatos(cccc, "src/Datos/datosCentroConvencion.dat");

		System.out.println("\na) Listar y mostrar los eventos programados para el dia x");
                listarEventosPorDia(cccc, "01-01-2024"); // Ejemplo con fecha "01-01-2024"

		
		System.out.println("\nb) Calcular el promedio de pagos en los eventos");
		double promedioPagos = calcularPromedioPagos(cccc);
                   System.out.println("Promedio de pagos: " + promedioPagos);

        
                System.out.println("\nc) Verificar la disponibilidad de espacios de un evento");
                String nomEvent = "Chuquiago-Marka";
                verificarEspacioEvento(cccc, nomEvent);

                System.out.println("\nd) Llevar al final el evento de nombre x");
                llevarEventoAlFinalDeMultiPila(mppe1, "Arte", "01-01-2024");
                System.out.println("\n== Estado de la MultiPila de Eventos después de mover el evento al final ==");
                mppe1.mostrarSoloDatosDeEventos();

                System.out.println("\ne) Verificar si el evento x tiene seguridad");
                verificarEventoTieneSeguridad(cccc, "Arte");



                System.out.println("\nf) Agregar un evento y si hay solapamiento mostrar el evento que se está solapando");
                Eventos nuevoEve= new Eventos(mpcce3, lsns3, csp3, reserva4, "nuevoEve", "Privado", 1, 10000, "01-01-2024", "a");
                agregaEveSiEsQueExisteSolapamiento(cccc, nuevoEve);
                cccc.mostrarSoloDatosDeLosEventos();
	}
        
	
// INCISO A
public static void listarEventosPorDia(ColaCircularCentroConvencion cccc, String dia) {
    System.out.println("Eventos programados para el día: " + dia);
    boolean encontrado = false;
    ColaCircularCentroConvencion aux = new ColaCircularCentroConvencion();

    while (!cccc.esVacia()) {
        CentroConvencion centro = cccc.eli();
        aux.adi(centro);

        Mp_PilaEventos mpPilaEventos = centro.getMp_PilaEventos();
        for (int i = 0; i < mpPilaEventos.getN(); i++) {
            PilaEventos pilaEventos = mpPilaEventos.getPilas()[i];
            PilaEventos copiaPila = copiarPila(pilaEventos);

            while (!copiaPila.esVacia()) {
                Eventos evento = copiaPila.eli();
                if (evento.getFecha().equals(dia)) {
                    encontrado = true;
                    evento.mostrarDatosSoloDelEvento();
                }
            }
        }
    }

    cccc.vaciar(aux);

    if (!encontrado) {
        System.out.println("No hay eventos programados para el día " + dia);
    }
}

// Método auxiliar para copiar una pila de eventos
public static PilaEventos copiarPila(PilaEventos pilaOriginal) {
    PilaEventos copia = new PilaEventos();
    PilaEventos auxiliar = new PilaEventos();

    while (!pilaOriginal.esVacia()) {
        Eventos evento = pilaOriginal.eli();
        copia.adi(evento);
        auxiliar.adi(evento);
    }

    while (!auxiliar.esVacia()) {
        pilaOriginal.adi(auxiliar.eli());
    }

    return copia;
}

	
	// INCISO B
public static double calcularPromedioPagos(ColaCircularCentroConvencion cccc) {
    double sumaPagos = 0;
    int totalPersonas = 0;
    ColaCircularCentroConvencion aux = new ColaCircularCentroConvencion();
    while (!cccc.esVacia()) {
        CentroConvencion centro = cccc.eli();
        aux.adi(centro);
        Mp_PilaEventos mpPilaEventos = centro.getMp_PilaEventos();
        for (int i = 0; i < mpPilaEventos.getN(); i++) {
            PilaEventos pilaEventos = mpPilaEventos.getPilas()[i];
            PilaEventos copiaPila = copiarPila(pilaEventos);
            while (!copiaPila.esVacia()) {
                Eventos evento = copiaPila.eli();
                ColaSimplePersonas colaPersonas = evento.getColaSimplePersonas();
                if (colaPersonas != null) {
                    ColaSimplePersonas auxCola = new ColaSimplePersonas();
                    while (!colaPersonas.esVacia()) {
                        Personas persona = colaPersonas.eli();
                        sumaPagos += persona.getPagos();
                        totalPersonas++;
                        auxCola.adi(persona);
                    }
                    colaPersonas.vaciar(auxCola);
                }
            }
        }
    }
    cccc.vaciar(aux);
    return totalPersonas > 0 ? sumaPagos / totalPersonas : 0;
}



	
	// INCISO C
            private static void verificarEspacioEvento(ColaCircularCentroConvencion cccc, String nomEvent) {
	    ColaCircularCentroConvencion aux = new ColaCircularCentroConvencion();
	    boolean hayAsientos = false; 
	    while (!cccc.esVacia()) {
	        CentroConvencion conve = cccc.eli();
	        aux.adi(conve);
	        if (conve.getNombre().equals(nomEvent)) {
	            Mp_PilaEventos eventos = conve.getMp_PilaEventos();
	            for (int i = 0; i < eventos.getN(); i++) {
	                PilaEventos pila = eventos.getPilas()[i];
	                PilaEventos auxPila = new PilaEventos();
	                while (!pila.esVacia()) {
	                    Eventos evento = pila.eli();
	                    if (evento.getCantidadEspacios() > 0) {
	                        hayAsientos = true;
	                    }
	                    auxPila.adi(evento);
	                }
	                pila.vaciar(auxPila);
	            }
	        }
	    }
	    cccc.vaciar(aux);
	    System.out.println("Nombre del Evento: " + nomEvent);
	    if (hayAsientos) {
	        System.out.println("Hay asientos disponibles para este evento.");
	    } else {
	        System.out.println("No hay asientos disponibles para este evento.");
	    }
	}
	
	// INCISO D
	public static void llevarEventoAlFinalDeMultiPila(Mp_PilaEventos mppe, String nombreEvento, String fechaEvento) {
	    PilaEventos[] pilasTemp = new PilaEventos[mppe.getN()];
	    for (int i = 0; i < mppe.getN(); i++) {
	        pilasTemp[i] = new PilaEventos();
            }
	    Eventos eventoAMover = null;
	    for (int i = 0; i < mppe.getN(); i++) {
	        while (!mppe.getC()[i].esVacia()) {
	            Eventos e = mppe.getC()[i].eli();
	            if (e.getNombre().equals(nombreEvento) && e.getFecha().equals(fechaEvento)) {
	                eventoAMover = e;
	            } else {
	                pilasTemp[i].adi(e);
	            }
	        }
            }
	    if (eventoAMover != null) {
	        for (int i = 0; i < mppe.getN() - 1; i++) {
	            while (!pilasTemp[i].esVacia()) {
	                mppe.getC()[i].adi(pilasTemp[i].eli());
	            }
	        }
	        mppe.getC()[mppe.getN() - 1].adi(eventoAMover);
	        while (!pilasTemp[mppe.getN() - 1].esVacia()) {
	            mppe.getC()[mppe.getN() - 1].adi(pilasTemp[mppe.getN() - 1].eli());
	        }
	        
	        System.out.println("\nEvento movido exitosamente al final de la última pila:");
	        eventoAMover.mostrarDatosSoloDelEvento();
	    } else {
	        for (int i = 0; i < mppe.getN(); i++) {
	            while (!pilasTemp[i].esVacia()) {
	                mppe.getC()[i].adi(pilasTemp[i].eli());
	            }
	        }
	        System.out.println("\nEvento no encontrado en ninguna pila.");
	    }
	}
// INCISO E
public static void verificarEventoTieneSeguridad(ColaCircularCentroConvencion cccc, String nombreEvento) {
    boolean eventoEncontrado = false;
    boolean tieneSeguridad = false;
    ColaCircularCentroConvencion auxCola = new ColaCircularCentroConvencion();
    while (!cccc.esVacia()) {
        CentroConvencion centro = cccc.eli();
        Mp_PilaEventos mpPilaEventos = centro.getMp_PilaEventos();
        for (int i = 0; i < mpPilaEventos.getN(); i++) {
            PilaEventos pilaEventos = mpPilaEventos.getPilas()[i];
            PilaEventos copiaPila = copiarPila(pilaEventos);
            while (!copiaPila.esVacia()) {
                Eventos evento = copiaPila.eli();
                if (evento.getNombre().equalsIgnoreCase(nombreEvento)) {
                    eventoEncontrado = true;
                    if (evento.getLd_NormalSeguridad() != null && !evento.getLd_NormalSeguridad().esVacia()) {
                        tieneSeguridad = true;
                        System.out.println("El evento '" + nombreEvento + "' tiene medidas de seguridad:");
                        evento.getLd_NormalSeguridad().mostrar();
                    } else {
                        System.out.println("El evento '" + nombreEvento + "' no tiene medidas de seguridad.");
                    }
                }
            }
        }
        auxCola.adi(centro);
    }
    cccc.vaciar(auxCola);
    if (!eventoEncontrado) {
        System.out.println("No se encontró el evento con nombre: " + nombreEvento);
    } else if (!tieneSeguridad) {
        System.out.println("No hay medidas de seguridad asociadas al evento.");
    }
}
// INCISO F
public static void agregaEveSiEsQueExisteSolapamiento(ColaCircularCentroConvencion cccc, Eventos nuevoEvento) {
    boolean solapamientoEncontrado = false;
    ColaCircularCentroConvencion auxCola = new ColaCircularCentroConvencion();
    while (!cccc.esVacia()) {
        CentroConvencion centro = cccc.eli();
        Mp_PilaEventos mpPilaEventos = centro.getMp_PilaEventos();
        for (int i = 0; i < mpPilaEventos.getN(); i++) {
            PilaEventos pilaEventos = mpPilaEventos.getPilas()[i];
            PilaEventos copiaPila = copiarPila(pilaEventos);
            while (!copiaPila.esVacia()) {
                Eventos eventoExistente = copiaPila.eli();
                if (eventoExistente.getFecha().equals(nuevoEvento.getFecha())) {
                    solapamientoEncontrado = true;
                    System.out.println("Solapamiento encontrado con el evento:");
                    eventoExistente.mostrarDatosSoloDelEvento();
                }
            }
        }
        auxCola.adi(centro);
    }
    cccc.vaciar(auxCola);
    if (!solapamientoEncontrado) {
        // Agregar el nuevo evento a la primera pila de eventos en el primer CentroConvencion
        if (!auxCola.esVacia()) {
            CentroConvencion primerCentro = auxCola.eli();
            Mp_PilaEventos mpPilaEventos = primerCentro.getMp_PilaEventos();
            mpPilaEventos.adicionar(0, nuevoEvento); // Agregar a la primera pila
            auxCola.adi(primerCentro);

            System.out.println("El evento ha sido agregado exitosamente.");
            nuevoEvento.mostrarDatosSoloDelEvento();
        } else {
            System.out.println("No hay Centros de Convenciones disponibles para agregar el evento.");
        }
    } else {
        System.out.println("El evento no puede ser agregado debido a un solapamiento.");
    }
}

	
}