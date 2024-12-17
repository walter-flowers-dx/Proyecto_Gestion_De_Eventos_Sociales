/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import pkg121.*;


/**
 *
 * @author USUARIO
 */
public class Page3 extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    private Mp_PilaEventos mppe1; 
    
    DefaultTableModel t1=new DefaultTableModel();

    
    public Page3() {
        initComponents();
        t1 = (DefaultTableModel) jTable1.getModel();
        
    }
    public Page3(Mp_PilaEventos mppe1) {
        this(); // Llamar al constructor para inicializar componentes
        this.mppe1 = mppe1;

        // Añadir un ActionListener al botón para buscar y llenar la tabla
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton1ActionPerformed(e);
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        llenar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calcula el promedio de pagos en los eventos ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        llenar.setText("llenar");
        llenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(llenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(llenar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Verificar si la MultiPila de Eventos está inicializada y tiene datos
    if (mppe1 == null || mppe1.getN() == 0) {
        JOptionPane.showMessageDialog(this, "La MultiPila de Eventos no ha sido asignada o no tiene datos.");
        return;
    }

    // Crear el modelo de la tabla con las columnas correspondientes
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Evento");
    modelo.addColumn("Cantidad Personas");
    modelo.addColumn("Pagos");

    // Variables para el cálculo del promedio general
    double sumaPagosTotal = 0;
    int cantidadPersonasTotal = 0;

    // Iterar sobre cada pila de la MultiPila de Eventos
    for (int i = 0; i < mppe1.getN(); i++) {
        PilaEventos pilaEventos = mppe1.getC()[i];
        PilaEventos copiaPila = copiarPila(pilaEventos); // Hacer una copia de la pila original para iterar

        // Iterar sobre cada evento en la pila de eventos
        while (!copiaPila.esVacia()) {
            Eventos evento = copiaPila.eli();
            ColaSimplePersonas colaPersonas = evento.getColaSimplePersonas();

            int cantidadPersonas = 0;
            double sumaPagosEvento = 0;

            // Iterar sobre las personas en la cola para obtener la cantidad y los pagos
            ColaSimplePersonas colaAux = new ColaSimplePersonas();
            while (!colaPersonas.esVacia()) {
                Personas persona = colaPersonas.eli();
                cantidadPersonas += 1;
                sumaPagosEvento += persona.getPagos();
                colaAux.adi(persona);
            }
            // Restaurar la cola original
            colaPersonas.vaciar(colaAux);

            // Añadir los datos al modelo de la tabla
            modelo.addRow(new Object[]{evento.getNombre(), cantidadPersonas, sumaPagosEvento});

            // Acumular para el promedio general
            sumaPagosTotal += sumaPagosEvento;
            cantidadPersonasTotal += cantidadPersonas;
        }
    }

// Calcular y añadir una fila para mostrar el promedio de pagos general
    double promedioGeneral = (cantidadPersonasTotal > 0) ? (sumaPagosTotal / cantidadPersonasTotal) : 0;

    // Formatear el valor del promedio a tres decimales
    DecimalFormat df = new DecimalFormat("#.##");
    String promedioFormateado = df.format(promedioGeneral);

    // Añadir la fila del promedio general
    modelo.addRow(new Object[]{"Promedio General", cantidadPersonasTotal, promedioFormateado});

    // Asignar el modelo a la tabla
    jTable1.setModel(modelo);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarActionPerformed
    // Inicializar las estructuras de datos para la MultiPila de Eventos

    // Lista de recursos
    LS_NormalRecursos lsnr1 = new LS_NormalRecursos();
    lsnr1.adiFinal(new Recursos(100, 50, 75));

    LS_NormalRecursos lsnr2 = new LS_NormalRecursos();
    lsnr2.adiFinal(new Recursos(25, 10, 15));

    LS_NormalRecursos lsnr3 = new LS_NormalRecursos();
    lsnr3.adiFinal(new Recursos(35, 40, 45));

    // Espacios
    ColaSimpleEspacios cse1 = new ColaSimpleEspacios();
    cse1.adi(new Espacios(lsnr1, "EspacioA", 250.5));
    cse1.adi(new Espacios(lsnr2, "EspacioB", 50));
    cse1.adi(new Espacios(lsnr3, "EspacioC", 100.75));

    ColaSimpleEspacios cse2 = new ColaSimpleEspacios();
    cse2.adi(new Espacios(lsnr1, "EspacioA", 300.5));

    ColaSimpleEspacios cse3 = new ColaSimpleEspacios();
    cse3.adi(new Espacios(lsnr1, "EspacioA", 250));
    cse3.adi(new Espacios(lsnr2, "EspacioB", 75));
    cse3.adi(new Espacios(lsnr3, "EspacioC", 45));

    Mp_ColaCircularEspacios mpcce1 = new Mp_ColaCircularEspacios(3);
    mpcce1.adicionar(0, cse1);
    mpcce1.adicionar(1, cse2);
    mpcce1.adicionar(2, cse3);

    // Seguridad
    LD_NormalSeguridad lsns1 = new LD_NormalSeguridad();
    lsns1.adiFinal(new Seguridad("Patrullando", 25, "Privada"));
    lsns1.adiFinal(new Seguridad("Call-911", 50, "Publica"));

    LD_NormalSeguridad lsns2 = new LD_NormalSeguridad();
    lsns2.adiFinal(new Seguridad("Radio-Pat", 10, "Privada"));

    // Personas (utilizando los datos proporcionados)
    ColaSimplePersonas csp1 = new ColaSimplePersonas();
    csp1.adi(new Personas(100, "VIP", "10-10-2024", 5000));

    ColaSimplePersonas csp2 = new ColaSimplePersonas();
    csp2.adi(new Personas(200, "General", "10-10-2024", 3000));

    ColaSimplePersonas csp3 = new ColaSimplePersonas();
    csp3.adi(new Personas(300, "Preferencial", "03-03-2025", 25500));

    ColaSimplePersonas csp4 = new ColaSimplePersonas();
    csp4.adi(new Personas(300, "Preferencial", "01-01-2024", 25500));

    ColaSimplePersonas csp5 = new ColaSimplePersonas();
    csp5.adi(new Personas(300, "Preferencial", "20-12-2024", 25500));
    csp5.adi(new Personas(300, "Preferencial", "20-12-2024", 3));




    // Reservas
    Reserva reserva1 = new Reserva("VIP", "10-10-2024", csp1);
    Reserva reserva2 = new Reserva("General", "10-10-2024", csp2);
    Reserva reserva3 = new Reserva("Preferencial", "01-01-2024", csp3);
    Reserva reserva4 = new Reserva("Preferencial", "20-12-2024", csp4);
    
    

    // Pilas de eventos
    PilaEventos pe1 = new PilaEventos();
    pe1.adi(new Eventos(null, lsns2, csp1, reserva3, "Arte", "Privado", 1, 10000, "01-01-2024", "a"));

    PilaEventos pe2 = new PilaEventos();
    pe2.adi(new Eventos(mpcce1, lsns1, csp2, reserva1, "Ciencia", "Privado", 3, 10000, "10-10-2024", "a"));
    pe2.adi(new Eventos(mpcce1, lsns2, csp3, reserva2, "Tecnologia", "Privado", 0, 10000, "10-10-2024", "a"));

    PilaEventos pe3 = new PilaEventos();
    pe3.adi(new Eventos(mpcce1, lsns1, csp4, reserva4, "Politica", "Privado", 2, 10000, "20-12-2024", "a"));
    pe3.adi(new Eventos(mpcce1, lsns2, csp5, reserva1, "Ciberseguridad", "Privado", 3, 10000, "20-12-2024", "a"));

    // Crear la MultiPila de Eventos y adicionar las pilas de eventos
    mppe1 = new Mp_PilaEventos(3);
    mppe1.adicionarPila(0, pe1);
    mppe1.adicionarPila(1, pe2);
    mppe1.adicionarPila(2, pe3);

    JOptionPane.showMessageDialog(this, "Datos llenados correctamente en la MultiPila de Eventos.");

    }//GEN-LAST:event_llenarActionPerformed
         private PilaEventos copiarPila(PilaEventos pilaOriginal) {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton llenar;
    // End of variables declaration//GEN-END:variables
}
