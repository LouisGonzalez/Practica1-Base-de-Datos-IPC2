package practica.interfaces;

/**
 *
 * @author luisGonzalez
 */
public class EliminarDatos extends javax.swing.JInternalFrame {

    public EliminarDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        eliminarPControl = new javax.swing.JButton();
        eliminarRutas = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        eliminarPControl.setText("Eliminar Puntos de Control");
        eliminarPControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPControlActionPerformed(evt);
            }
        });

        eliminarRutas.setText("Eliminar Rutas");
        eliminarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRutasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminarPControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarRutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(eliminarRutas)
                .addGap(18, 18, 18)
                .addComponent(eliminarPControl)
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

    private void eliminarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRutasActionPerformed
        EliminarRutas rutas = new EliminarRutas();
        MenuPrincipal.panelPadre.add(rutas);
        rutas.show();
    }//GEN-LAST:event_eliminarRutasActionPerformed

    private void eliminarPControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPControlActionPerformed
        EliminarPuntosControl pControl = new EliminarPuntosControl();
        MenuPrincipal.panelPadre.add(pControl);
        pControl.show();
    }//GEN-LAST:event_eliminarPControlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarPControl;
    private javax.swing.JButton eliminarRutas;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
