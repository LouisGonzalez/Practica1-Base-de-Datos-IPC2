package practica.interfaces;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practica.clases.ConectorSesion;

/**
 *
 * @author luisGonzalez
 */
public class EliminarPuntosControl extends javax.swing.JInternalFrame {
    
    private ConectorSesion login;
    private int idRuta, idPControl;
    
    public EliminarPuntosControl() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        ruta = new javax.swing.JTextField();
        txt3 = new javax.swing.JLabel();
        pControl = new javax.swing.JTextField();
        borrarPcontrol = new javax.swing.JButton();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Eliminar Puntos de Control:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("No. Ruta:");

        ruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutaKeyTyped(evt);
            }
        });

        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("No. Punto de Control:");

        pControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pControlKeyTyped(evt);
            }
        });

        borrarPcontrol.setText("Confirmar");
        borrarPcontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarPcontrolActionPerformed(evt);
            }
        });

        txt4.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("(Un punto de control puede ser borrado solo si no hay paquetes dentro de el");

        txt5.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt5.setForeground(new java.awt.Color(0, 0, 102));
        txt5.setText("en ese instante).");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelFondoLayout.createSequentialGroup()
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelFondoLayout.createSequentialGroup()
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ruta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addComponent(borrarPcontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt2)
                            .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3)
                            .addComponent(pControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(borrarPcontrol)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5)
                .addGap(7, 7, 7))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutaKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_rutaKeyTyped

    private void pControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pControlKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_pControlKeyTyped

    private void borrarPcontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarPcontrolActionPerformed
        if(ruta.getText().equals("") || pControl.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Porfavor llena todas las casillas antes de continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            String estadoActual = "";
            idRuta = Integer.parseInt(ruta.getText());
            idPControl = Integer.parseInt(pControl.getText());
            int captura;
            String sql = "SELECT * FROM Rutas WHERE id = ?";
            String sql2 = "SELECT * FROM Puntos_control_ruta_"+idRuta+" WHERE id = ?";
            String borrarPControl = "DELETE FROM Puntos_control_ruta_"+idRuta+" WHERE id = ?";
            try{
                PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                declaracionPreparada.setInt(1, idRuta);
                ResultSet result = declaracionPreparada.executeQuery();
                if(result.next()){
                    estadoActual = result.getString("estado");
                    if(estadoActual.equals("DESACTIVADA")){
                        JOptionPane.showMessageDialog(null, "Esta ruta se encuentra desactivada por el momento, activala antes de seguir con el proceso");
                    } else {
                        PreparedStatement declaracionPunto = cn.prepareStatement(sql2);
                        declaracionPunto.setInt(1, idPControl);
                        ResultSet result2 = declaracionPunto.executeQuery();
                        if(result2.next()){
                            captura = result2.getInt("paquetes_actuales");
                            if(captura==0){
                                PreparedStatement borrarPunto = cn.prepareStatement(borrarPControl);
                                borrarPunto.setInt(1, idPControl);
                                borrarPunto.execute();
                                JOptionPane.showMessageDialog(null, "El punto de control no. "+idPControl+" ha sido borrado con exito");
                            } else {
                                JOptionPane.showMessageDialog(null, "En este momento el punto de control que usted desea eliminar no se encuentra vacio");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La ruta ha sido encontrada mas sin embargo no el punto de control");
                        }     
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Ruta no encontrada en la base de datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EliminarPuntosControl.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                login.Desconectar();
            }
        }
    }//GEN-LAST:event_borrarPcontrolActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarPcontrol;
    private javax.swing.JTextField pControl;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField ruta;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
}
