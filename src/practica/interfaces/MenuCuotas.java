package practica.interfaces;

/**
 *
 * @author luisGonzalez
 */
public class MenuCuotas extends javax.swing.JInternalFrame {

    public MenuCuotas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        modificarCuota = new javax.swing.JButton();
        modCuotaPControl = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        modificarCuota.setText("Modificar cuotas generales");
        modificarCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCuotaActionPerformed(evt);
            }
        });

        modCuotaPControl.setText("Modificar cuotas de un punto de control especifico");
        modCuotaPControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modCuotaPControlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(modCuotaPControl)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(modificarCuota)
                .addGap(18, 18, 18)
                .addComponent(modCuotaPControl)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCuotaActionPerformed
        this.dispose();
        ModificarCuotas cuota = new ModificarCuotas();
        MenuPrincipal.panelPadre.add(cuota);
        cuota.show();
    }//GEN-LAST:event_modificarCuotaActionPerformed

    private void modCuotaPControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modCuotaPControlActionPerformed
        this.dispose();
        ModCuotaPControl cuotaPControl = new ModCuotaPControl();
        MenuPrincipal.panelPadre.add(cuotaPControl);
        cuotaPControl.show();
    }//GEN-LAST:event_modCuotaPControlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton modCuotaPControl;
    private javax.swing.JButton modificarCuota;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
