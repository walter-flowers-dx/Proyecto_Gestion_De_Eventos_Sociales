/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import pkg121.*;


/**
 *
 * @author USUARIO
 */
public class Page14 extends javax.swing.JPanel {

  
 private ColaCircularCentroConvencion cccc;
         private DefaultTableModel modeloTabla;

    public Page14() {
       initComponents();
        cargarDatosDesdeArchivo();
        inicializarTabla(); // Inicializa las columnas de la tabla
        mostrarDatosEnTabla();
        
    }
   // Método para cargar los datos de la cola circular
    public void setColaCircularCentroConvencion(ColaCircularCentroConvencion cccc) {
        this.cccc = cccc;
    }
 private void inicializarTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre del Evento");
        modeloTabla.addColumn("Tipo de Evento");
        modeloTabla.addColumn("Fecha");
        jTable1.setModel(modeloTabla);
    }

    // Método para mostrar los datos en la tabla
    private void mostrarDatosEnTabla() {
        if (cccc == null || cccc.esVacia()) {
            System.out.println("No hay datos del Centro de Convenciones cargados.");
            return;
        }

        ColaCircularCentroConvencion aux = new ColaCircularCentroConvencion();

        while (!cccc.esVacia()) {
            CentroConvencion cc = cccc.eli(); // Extraemos un centro
            Mp_PilaEventos mpPilaEventos = cc.getMp_PilaEventos();

            for (int i = 0; i < mpPilaEventos.getN(); i++) {
                PilaEventos pilaEventos = mpPilaEventos.getPilas()[i];

                // Usamos una pila auxiliar para no perder los datos
                PilaEventos pilaAuxiliar = new PilaEventos();

                while (!pilaEventos.esVacia()) {
                    Eventos evento = pilaEventos.eli();
                    modeloTabla.addRow(new Object[]{
                        evento.getNombre(),
                        evento.getTipoEvento(),
                        evento.getFecha()
                    });
                    pilaAuxiliar.adi(evento); // Restauramos los eventos
                }

                pilaEventos.vaciar(pilaAuxiliar); // Restauramos la pila original
            }

            aux.adi(cc); // Restauramos el centro de convenciones
        }

        cccc.vaciar(aux); // Restauramos la cola circular original
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
        nombrex = new javax.swing.JTextField();
        fechay = new javax.swing.JTextField();
        llevaralfinal = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Llevar al final el evento de nombre x, fecha y al final ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        nombrex.setText("nombre");
        nombrex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrexActionPerformed(evt);
            }
        });

        fechay.setText("fecha");
        fechay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechayActionPerformed(evt);
            }
        });

        llevaralfinal.setText("llevarfinal");
        llevaralfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llevaralfinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechay, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrex, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(llevaralfinal))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(nombrex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fechay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(llevaralfinal)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 420));
    }// </editor-fold>//GEN-END:initComponents
    // Método para cargar datos desde el archivo
    private void cargarDatosDesdeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Datos/datosCentroConvencion.dat"))) {
            cccc = (ColaCircularCentroConvencion) ois.readObject();
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (Exception e) {
            cccc = new ColaCircularCentroConvencion();
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }
    private void llevaralfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llevaralfinalActionPerformed
 
    String nombreEvento = nombrex.getText().trim();
    String fechaEvento = fechay.getText().trim();

    if (nombreEvento.isEmpty() || fechaEvento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del evento y la fecha.");
        return;
    }

    if (cccc == null || cccc.esVacia()) {
        JOptionPane.showMessageDialog(this, "No hay datos del Centro de Convenciones cargados.");
        return;
    }

    boolean encontrado = false;

    // Iterar por todos los centros de convenciones para mover el evento al final
    ColaCircularCentroConvencion auxCola = new ColaCircularCentroConvencion();

    while (!cccc.esVacia()) {
        CentroConvencion centro = cccc.eli();
        Mp_PilaEventos mpPilaEventos = centro.getMp_PilaEventos();
        encontrado = moverEventoAlFinal(mpPilaEventos, nombreEvento, fechaEvento) || encontrado;
        auxCola.adi(centro);
    }

    // Restaurar la estructura original de la cola circular
    cccc.vaciar(auxCola);

    if (encontrado) {
        mostrarDatosTabla(); // Mostrar los datos actualizados en la tabla
        JOptionPane.showMessageDialog(this, "El evento fue movido exitosamente al final.");
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró el evento con nombre '" + nombreEvento + "' y fecha '" + fechaEvento + "'.");
    }
}

// Método auxiliar para mover un evento al final de Mp_PilaEventos
private boolean moverEventoAlFinal(Mp_PilaEventos mppe, String nombreEvento, String fechaEvento) {
    PilaEventos[] pilasTemp = new PilaEventos[mppe.getN()];
    for (int i = 0; i < mppe.getN(); i++) {
        pilasTemp[i] = new PilaEventos();
    }

    Eventos eventoAMover = null;

    // Paso 1: Buscar el evento en toda la multi-pila
    for (int i = 0; i < mppe.getN(); i++) {
        while (!mppe.getPilas()[i].esVacia()) {
            Eventos evento = mppe.getPilas()[i].eli();
            if (eventoAMover == null && evento.getNombre().equalsIgnoreCase(nombreEvento) && evento.getFecha().equalsIgnoreCase(fechaEvento)) {
                eventoAMover = evento;
            } else {
                pilasTemp[i].adi(evento);
            }
        }
    }

    // Si no se encontró el evento, restaurar las pilas y retornar false
    if (eventoAMover == null) {
        for (int i = 0; i < mppe.getN(); i++) {
            while (!pilasTemp[i].esVacia()) {
                mppe.getPilas()[i].adi(pilasTemp[i].eli());
            }
        }
        return false;
    }

    // Paso 2: Restaurar las pilas excepto la última
    for (int i = 0; i < mppe.getN() - 1; i++) {
        while (!pilasTemp[i].esVacia()) {
            mppe.getPilas()[i].adi(pilasTemp[i].eli());
        }
    }

    // Paso 3: Mover el evento al final de la última pila
    mppe.getPilas()[mppe.getN() - 1].adi(eventoAMover);

    // Restaurar la última pila
    while (!pilasTemp[mppe.getN() - 1].esVacia()) {
        mppe.getPilas()[mppe.getN() - 1].adi(pilasTemp[mppe.getN() - 1].eli());
    }

    return true;
}

// Método para mostrar los datos actualizados en la tabla
private void mostrarDatosTabla() {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    modeloTabla.addColumn("Nombre de Evento");
    modeloTabla.addColumn("Fecha");
    modeloTabla.addColumn("Tipo de Evento");

    ColaCircularCentroConvencion auxCola = new ColaCircularCentroConvencion();

    while (!cccc.esVacia()) {
        CentroConvencion centro = cccc.eli();
        Mp_PilaEventos mpPilaEventos = centro.getMp_PilaEventos();

        for (int i = 0; i < mpPilaEventos.getN(); i++) {
            PilaEventos pilaEventos = mpPilaEventos.getPilas()[i];
            PilaEventos pilaAuxiliar = new PilaEventos();

            while (!pilaEventos.esVacia()) {
                Eventos evento = pilaEventos.eli();
                modeloTabla.addRow(new Object[]{
                        evento.getNombre(),
                        evento.getFecha(),
                        evento.getTipoEvento()
                });
                pilaAuxiliar.adi(evento);
            }

            // Restaurar la pila original
            pilaEventos.vaciar(pilaAuxiliar);
        }

        auxCola.adi(centro);
    }

    // Restaurar la cola circular
    cccc.vaciar(auxCola);

    // Asignar el modelo a la tabla
    jTable1.setModel(modeloTabla);

    }//GEN-LAST:event_llevaralfinalActionPerformed

    private void nombrexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrexActionPerformed

    private void fechayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechayActionPerformed
       


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fechay;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton llevaralfinal;
    private javax.swing.JTextField nombrex;
    // End of variables declaration//GEN-END:variables
}
