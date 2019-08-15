package practica.interfaces;

/**
 *
 * @author luisGonzalez
 */
public class ModificadorTablas extends javax.swing.JInternalFrame {

    public ModificadorTablas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        primerOpcion = new javax.swing.JButton();
        segundaOpcion = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        primerOpcion.setText("Activar Rutas");
        primerOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerOpcionActionPerformed(evt);
            }
        });

        segundaOpcion.setText("Modificar rango de un punto de control");
        segundaOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundaOpcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(primerOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(segundaOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(primerOpcion)
                .addGap(18, 18, 18)
                .addComponent(segundaOpcion)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primerOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerOpcionActionPerformed
        this.dispose();
        ActivadorRuta ruta = new ActivadorRuta();
        MenuPrincipal.panelPadre.add(ruta);
        ruta.show();
    }//GEN-LAST:event_primerOpcionActionPerformed

    private void segundaOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaOpcionActionPerformed
        this.dispose();
        RangoPaquetesControl rango = new RangoPaquetesControl();
        MenuPrincipal.panelPadre.add(rango);
        rango.show();
        
    }//GEN-LAST:event_segundaOpcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelFondo;
    private javax.swing.JButton primerOpcion;
    private javax.swing.JButton segundaOpcion;
    // End of variables declaration//GEN-END:variables
}
