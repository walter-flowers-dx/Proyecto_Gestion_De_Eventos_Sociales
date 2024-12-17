
package interfaz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class PageMain extends javax.swing.JPanel {

   
    public PageMain() {
        initComponents();
        SetDate();
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Text1 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        NText1 = new javax.swing.JLabel();
        NText2 = new javax.swing.JLabel();
        NText3 = new javax.swing.JLabel();
        NText4 = new javax.swing.JLabel();
        NText5 = new javax.swing.JLabel();
        NText6 = new javax.swing.JLabel();
        NText7 = new javax.swing.JLabel();
        NText8 = new javax.swing.JLabel();
        ImgText = new javax.swing.JLabel();
        NText9 = new javax.swing.JLabel();
        NText10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        Text1.setBackground(new java.awt.Color(51, 51, 51));
        Text1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("i BIENVENIDO !");

        dateText.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        titleText.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        titleText.setText("Administración/Control/Sistema de Registro de Cámaras");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        NText1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText1.setForeground(new java.awt.Color(204, 204, 204));
        NText1.setText("Sistema de Gestion de Centros de Convenciones.");

        NText2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText2.setForeground(new java.awt.Color(204, 204, 204));
        NText2.setText("Administre y controle los eventos y espacios de los centros de convenciones de forma eficiente y organizada.");

        NText3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText3.setForeground(new java.awt.Color(204, 204, 204));
        NText3.setText("Esta herramienta le permitirá llevar un control completo y detallado de los Centros de");

        NText4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText4.setForeground(new java.awt.Color(204, 204, 204));
        NText4.setText("Convenciones, con acceso a herramientas especiales para tareas específicas, como son:");

        NText5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText5.setForeground(new java.awt.Color(204, 204, 204));
        NText5.setText("• Listar y mostrar con detalles los eventos programados para el día X");

        NText6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText6.setForeground(new java.awt.Color(204, 204, 204));
        NText6.setText("• Calcular el promedio de pagos en los eventos");

        NText7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText7.setForeground(new java.awt.Color(204, 204, 204));
        NText7.setText("• Verificar la disponibilidad de espacios de un evento");

        NText8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText8.setForeground(new java.awt.Color(204, 204, 204));
        NText8.setText("• Llevar al final el evento de nombre X, fecha Y al final");

        ImgText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Inicio/icons8-city-100.png"))); // NOI18N

        NText9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText9.setForeground(new java.awt.Color(204, 204, 204));
        NText9.setText("• Verificar si el evento X tiene seguridad");

        NText10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        NText10.setForeground(new java.awt.Color(204, 204, 204));
        NText10.setText("• Agregar un evento y si hay solapamiento, mostrar el evento que se está solapando");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NText2)
                            .addComponent(NText3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NText4, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NText5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImgText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(NText1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NText6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NText7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NText8, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NText9, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NText10, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Text1)
                .addGap(18, 18, 18)
                .addComponent(NText1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ImgText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(NText2)
                        .addGap(25, 25, 25)
                        .addComponent(NText3)
                        .addGap(5, 5, 5)
                        .addComponent(NText4)
                        .addGap(18, 18, 18)
                        .addComponent(NText5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NText6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NText7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NText8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NText9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NText10)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 420));
    }// </editor-fold>//GEN-END:initComponents
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgText;
    private javax.swing.JLabel NText1;
    private javax.swing.JLabel NText10;
    private javax.swing.JLabel NText2;
    private javax.swing.JLabel NText3;
    private javax.swing.JLabel NText4;
    private javax.swing.JLabel NText5;
    private javax.swing.JLabel NText6;
    private javax.swing.JLabel NText7;
    private javax.swing.JLabel NText8;
    private javax.swing.JLabel NText9;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
