
package interfaz;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import pkg121.*;



public class Page11 extends javax.swing.JPanel{
    
 private ColaCircularCentroConvencion cccc;
          private DefaultTableModel modeloTabla;


    public Page11() {
 initComponents();
        cargarDatosDesdeArchivo();
        inicializarTabla(); // Inicializa las columnas de la tabla
        mostrarDatosEnTabla();
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
     private void cargarDatosDesdeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Datos/datosCentroConvencion.dat"))) {
            cccc = (ColaCircularCentroConvencion) ois.readObject();
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (Exception e) {
            cccc = new ColaCircularCentroConvencion();
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eventos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        dateText.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");
        jPanel2.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 35));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 760, 13));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 630, 240));

        Buscar.setText("buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalles de un Evento");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void SetDate() {
       
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private Object cargarDatos(String rutaArchivo) {
    try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
        return entrada.readObject();
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
        return null;
    }
}
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
   // Obtener la fecha ingresada en jTextField1
    String fechaEvento = jTextField1.getText().trim();

    // Validar que el campo no esté vacío
    if (fechaEvento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese la fecha del evento que desea buscar (formato: dd-MM-yyyy).", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Crear el modelo de la tabla con las columnas requeridas
    DefaultTableModel modeloTabla = new DefaultTableModel();
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Tipo de Evento");
    modeloTabla.addColumn("Cantidad de Espacios");
    modeloTabla.addColumn("Presupuesto General");
    modeloTabla.addColumn("Fecha");
    modeloTabla.addColumn("Tipo de Solicitud");

    boolean encontrado = false;

    // Iterar sobre la cola circular de Centros de Convenciones (cccc)
    ColaCircularCentroConvencion aux = new ColaCircularCentroConvencion();
    while (!cccc.esVacia()) {
        CentroConvencion centro = cccc.eli();
        System.out.println("Revisando centro de convenciones: " + centro.getNombre());
        Mp_PilaEventos mppe = centro.getMp_PilaEventos();

        if (mppe != null) {
            // Iterar sobre cada pila de eventos
            for (int i = 0; i < mppe.getN(); i++) {
                PilaEventos pila = mppe.getPilas()[i];
                if (pila != null) {
                    PilaEventos pilaAux = new PilaEventos();
                    while (!pila.esVacia()) {
                        Eventos evento = pila.eli();
                        System.out.println("Revisando evento: " + evento.getNombre() + ", Fecha: " + evento.getFecha());
                        if (evento.getFecha().equals(fechaEvento)) {
                            // Agregar el evento al modelo de la tabla
                            modeloTabla.addRow(new Object[]{
                                evento.getNombre(),
                                evento.getTipoEvento(),
                                evento.getCantidadEspacios(),
                                evento.getPresupuestoGeneral(),
                                evento.getFecha(),
                                evento.getTipoSolicitud()
                            });
                            encontrado = true;
                        }
                        pilaAux.adi(evento); // Restaurar el evento en la pila
                    }
                    pila.vaciar(pilaAux); // Restaurar todos los datos de la pila
                }
            }
        }
        aux.adi(centro); // Restaurar el centro en la cola auxiliar
    }

    cccc.vaciar(aux); // Restaurar los datos de cccc desde la cola auxiliar

    // Verificar si se encontró algún evento
    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No se encontró ningún evento con la fecha: " + fechaEvento, "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Evento(s) encontrado(s) y mostrado(s) en la tabla.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    // Configurar el modelo en la tabla
    jTable1.setModel(modeloTabla);
    }//GEN-LAST:event_BuscarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
