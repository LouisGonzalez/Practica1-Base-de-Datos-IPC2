package practica.interfaces;

/**
 *
 * @author luisGonzalez
 */
public class MenuReportes extends javax.swing.JInternalFrame {

    public MenuReportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        primerReporte = new javax.swing.JButton();
        segundoReporte = new javax.swing.JButton();
        tercerReporte = new javax.swing.JButton();
        cuartoReporte = new javax.swing.JButton();
        quintoReporte = new javax.swing.JButton();
        sextoReporte = new javax.swing.JButton();

        setClosable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        primerReporte.setText("Reporte de rutas");
        primerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerReporteActionPerformed(evt);
            }
        });

        segundoReporte.setText("Reporte de clientes");
        segundoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoReporteActionPerformed(evt);
            }
        });

        tercerReporte.setText("Rutas mas populares");
        tercerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tercerReporteActionPerformed(evt);
            }
        });

        cuartoReporte.setText("Reporte de rutas (ganancias)");
        cuartoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuartoReporteActionPerformed(evt);
            }
        });

        quintoReporte.setText("Reporte de ventas");
        quintoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quintoReporteActionPerformed(evt);
            }
        });

        sextoReporte.setText("Paquetes en sistema");
        sextoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sextoReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(segundoReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primerReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tercerReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuartoReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quintoReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sextoReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sextoReporte)
                .addGap(12, 12, 12)
                .addComponent(primerReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuartoReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tercerReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(segundoReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quintoReporte)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerReporteActionPerformed
        this.dispose();
        PrimerReporte reporteRutas = new PrimerReporte();
        MenuPrincipal.panelPadre.add(reporteRutas);
        reporteRutas.show();
    }//GEN-LAST:event_primerReporteActionPerformed

    private void segundoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoReporteActionPerformed
        this.dispose();
        SegundoReporte reporteCliente = new SegundoReporte();
        MenuPrincipal.panelPadre.add(reporteCliente);
        reporteCliente.show();
    }//GEN-LAST:event_segundoReporteActionPerformed

    private void tercerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tercerReporteActionPerformed
        this.dispose();     
        TercerReporte reportePopular = new TercerReporte();
        MenuPrincipal.panelPadre.add(reportePopular);
        reportePopular.show();
    }//GEN-LAST:event_tercerReporteActionPerformed

    private void cuartoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuartoReporteActionPerformed
        this.dispose();
        CuartoReporte reporteGanancias = new CuartoReporte();
        MenuPrincipal.panelPadre.add(reporteGanancias);
        reporteGanancias.show();
    }//GEN-LAST:event_cuartoReporteActionPerformed

    private void quintoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quintoReporteActionPerformed
        this.dispose();
        QuintoReporte ventas = new QuintoReporte();
        MenuPrincipal.panelPadre.add(ventas);
        ventas.show();
    }//GEN-LAST:event_quintoReporteActionPerformed

    private void sextoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sextoReporteActionPerformed
        this.dispose();
        SextoReporte paquetes = new SextoReporte();
        MenuPrincipal.panelPadre.add(paquetes);
        paquetes.show();
    }//GEN-LAST:event_sextoReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cuartoReporte;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JButton primerReporte;
    private javax.swing.JButton quintoReporte;
    private javax.swing.JButton segundoReporte;
    private javax.swing.JButton sextoReporte;
    private javax.swing.JButton tercerReporte;
    // End of variables declaration//GEN-END:variables
}
