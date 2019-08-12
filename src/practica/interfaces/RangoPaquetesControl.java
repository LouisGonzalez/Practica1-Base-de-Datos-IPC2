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
public class RangoPaquetesControl extends javax.swing.JInternalFrame {

    private ConectorSesion login;
    private int valorId, valorPControl;
    
    public RangoPaquetesControl() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        idRuta = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        noPControl = new javax.swing.JTextField();
        buscador = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Id de la ruta donde se encuentra el punto de control:");

        idRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idRutaKeyTyped(evt);
            }
        });

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("No. de punto de control:");

        noPControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noPControlKeyTyped(evt);
            }
        });

        buscador.setText("Buscar");
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(buscador))
                    .addComponent(noPControl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(buscador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noPControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        login = new ConectorSesion();
        if(idRuta.getText().equals("") || noPControl.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar ambos parametros");
        } else { 
        Connection cn = login.getConnection();
        valorId = Integer.parseInt(idRuta.getText());
        valorPControl = Integer.parseInt(noPControl.getText());
        String captura="";
        String sql = "SELECT * FROM Rutas WHERE id = ?";        
            try{
                PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                declaracionPreparada.setInt(1, valorId);
                ResultSet result = declaracionPreparada.executeQuery();
                if(result.next()){
                    captura = result.getString("no_puntos_control");
                    if(valorPControl<=Integer.parseInt(captura)){
                        JOptionPane.showMessageDialog(null, "Se ha encontrado la ruta y el punto de control");
                        RangoPaquetesControl2 control = new RangoPaquetesControl2(valorId, valorPControl);
                        MenuPrincipal.panelPadre.add(control);
                        control.show();
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor no encontrado en la base de datos");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "Esta id no existe en la base de datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RangoPaquetesControl.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                login.Desconectar();
            }
        }
    }//GEN-LAST:event_buscadorActionPerformed

    private void idRutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idRutaKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();        
    }//GEN-LAST:event_idRutaKeyTyped

    private void noPControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noPControlKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_noPControlKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscador;
    private javax.swing.JTextField idRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField noPControl;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
