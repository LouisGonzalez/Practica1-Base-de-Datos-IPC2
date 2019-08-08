package practica.interfaces;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luisGonzalez
 */
public class MenuAdministrador extends javax.swing.JInternalFrame {

    private final ImageIcon nuevaRuta = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/flecha.jpg");
    private final ImageIcon punto = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/mas.png");
    private final ImageIcon rango = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/paquete.jpg");    
    public MenuAdministrador() {
        initComponents();
        Icon rutas = new ImageIcon(nuevaRuta.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        Icon puntosControl = new ImageIcon(punto.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        Icon paquetes = new ImageIcon(rango.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        ruta.setIcon(rutas);
        puntoControl.setIcon(puntosControl);
        totalPaquete.setIcon(paquetes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        ruta = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        puntoControl = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        totalPaquete = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ruta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutaMouseClicked(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt1.setForeground(new java.awt.Color(153, 0, 0));
        txt1.setText("Nueva Ruta.");

        puntoControl.setBackground(new java.awt.Color(255, 255, 255));
        puntoControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        puntoControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntoControlMouseClicked(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt2.setForeground(new java.awt.Color(153, 0, 0));
        txt2.setText("Crear puntos de control");

        txt3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt3.setForeground(new java.awt.Color(153, 0, 0));
        txt3.setText("a rutas existentes.");

        totalPaquete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalPaqueteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(puntoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(totalPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(puntoControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(txt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutaMouseClicked
        NuevaRuta ruta = new NuevaRuta();
        MenuPrincipal.panelPadre.add(ruta);
        ruta.show();
    }//GEN-LAST:event_rutaMouseClicked

    private void puntoControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntoControlMouseClicked
        NuevoPuntoControl pControl = new NuevoPuntoControl();
        MenuPrincipal.panelPadre.add(pControl);
        pControl.show();
    }//GEN-LAST:event_puntoControlMouseClicked

    private void totalPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalPaqueteMouseClicked
        RangoPaquetesControl rango = new RangoPaquetesControl();
        MenuPrincipal.panelPadre.add(rango);
        rango.show();
    }//GEN-LAST:event_totalPaqueteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel puntoControl;
    private javax.swing.JLabel ruta;
    private javax.swing.JLabel totalPaquete;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
