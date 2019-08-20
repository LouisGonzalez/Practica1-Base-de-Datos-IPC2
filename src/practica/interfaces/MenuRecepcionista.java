package practica.interfaces;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author luisGonzalez
 */
public class MenuRecepcionista extends javax.swing.JInternalFrame {
    
    private final ImageIcon enviado = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/66669042-un-vector-de-dibujos-animados-que-representa-un-conjunto-de-productos-postales-un-paquete-de-cartón-mar.jpg");
    private final ImageIcon entregado = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/34784755-cartero-pidiendo-a-la-firma-a-un-hombre-después-de-la-entrega-de-3-parcelas-a-él-en-plana-del-estilo-de-.jpg");
    private final String usuario;
    
    public MenuRecepcionista(String usuario) {
        initComponents();
        this.usuario = usuario;
        Icon paqEnviado = new ImageIcon(enviado.getImage().getScaledInstance(117, 101, Image.SCALE_DEFAULT));
        Icon paqEntregado = new ImageIcon(entregado.getImage().getScaledInstance(119, 101, Image.SCALE_DEFAULT));
        nuevoPaquete.setIcon(paqEnviado);
        paqueteEntregado.setIcon(paqEntregado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        nuevoPaquete = new javax.swing.JLabel();
        paqueteEntregado = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Usuario:");

        txt2.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        nuevoPaquete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevoPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoPaqueteMouseClicked(evt);
            }
        });

        paqueteEntregado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paqueteEntregado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paqueteEntregadoMouseClicked(evt);
            }
        });

        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("Ingreso Paquetes");

        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("Retiro Paquetes");

        txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(nuevoPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paqueteEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevoPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(paqueteEntregado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 500, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoPaqueteMouseClicked
        IngresoPaquetes paqueteIngreso = new IngresoPaquetes();
        MenuPrincipal.panelPadre.add(paqueteIngreso);
        paqueteIngreso.show();
    }//GEN-LAST:event_nuevoPaqueteMouseClicked

    private void paqueteEntregadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paqueteEntregadoMouseClicked
        EgresoPaquetes paqueteEgreso = new EgresoPaquetes();
        MenuPrincipal.panelPadre.add(paqueteEgreso);
        paqueteEgreso.show();
    }//GEN-LAST:event_paqueteEntregadoMouseClicked

    private void txt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt5MouseClicked
        LocalizacionPaquetes locPaquete = new LocalizacionPaquetes();
        MenuPrincipal.panelPadre.add(locPaquete);
        locPaquete.show();
    }//GEN-LAST:event_txt5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nuevoPaquete;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel paqueteEntregado;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
}
