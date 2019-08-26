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
public class ModCuotaPControl extends javax.swing.JInternalFrame {
    
    private ConectorSesion login;
    private int idRuta, idPControl, nuevoValor;
    
    public ModCuotaPControl() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        ruta = new javax.swing.JTextField();
        pControl = new javax.swing.JTextField();
        verificador = new javax.swing.JButton();
        txt4 = new javax.swing.JLabel();
        cuotaLaboral = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Cuotas Puntos de Control:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Id Ruta:");

        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("No. Punto de Control:");

        ruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutaKeyTyped(evt);
            }
        });

        pControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pControlKeyTyped(evt);
            }
        });

        verificador.setText("Aceptar");
        verificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificadorActionPerformed(evt);
            }
        });

        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("Nueva cuota laboral:");

        cuotaLaboral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuotaLaboralKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuotaLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(pControl)
                    .addComponent(ruta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3)
                    .addComponent(pControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4)
                    .addComponent(cuotaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(verificador)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificadorActionPerformed
        if(ruta.getText().equals("") || pControl.getText().equals("") || cuotaLaboral.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Porfavor llena todas las casillas antes de continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            String estadoActual = "";
            idRuta = Integer.parseInt(ruta.getText());
            idPControl = Integer.parseInt(pControl.getText());
            nuevoValor = Integer.parseInt(cuotaLaboral.getText());
            String sql = "SELECT * FROM Rutas WHERE id = ?";
            String sql2 = "SELECT * FROM Puntos_control_ruta_"+idRuta+" WHERE id = ?";
            String cuota = "UPDATE Puntos_control_ruta_"+idRuta+" SET cuota_operacion = ? WHERE id ="+idPControl; 
            try{
                //se busca la ruta que el usuario ingreso
                PreparedStatement declaracionRuta = cn.prepareStatement(sql);
                declaracionRuta.setInt(1, idRuta);
                ResultSet result = declaracionRuta.executeQuery();
                if(result.next()){
                    //si la ruta existe pero esta desactivada entonces no se podra trabajar con ella
                    estadoActual = result.getString("estado");
                    if(estadoActual.equals("DESACTIVADA")){
                        JOptionPane.showMessageDialog(null, "Esta ruta se encuentra desactivada por el momento, porfavor activala antes de seguir con el proceso");
                    } else {
                        PreparedStatement declaracionPControl = cn.prepareStatement(sql2);
                        declaracionPControl.setInt(1, idPControl);
                        ResultSet result2 = declaracionPControl.executeQuery();
                        if(result2.next()){
                            //si la ruta existe y esta activada modifica los datos de la cuota laboral del punto de control que se requiere
                            PreparedStatement declaracionValor = cn.prepareStatement(cuota);
                            declaracionValor.setInt(1, nuevoValor);
                            declaracionValor.execute();
                            JOptionPane.showMessageDialog(null, "La operacion ha sido concretada con exito");
                        } else {
                            JOptionPane.showMessageDialog(null, "La ruta ha sido encontrada mas sin embargo el punto de control que buscas no existe");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La ruta que buscas no ha sido localizada");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ModCuotaPControl.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                login.Desconectar();
            }
        }
    }//GEN-LAST:event_verificadorActionPerformed

    private void rutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutaKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_rutaKeyTyped

    private void pControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pControlKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_pControlKeyTyped

    private void cuotaLaboralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotaLaboralKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_cuotaLaboralKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuotaLaboral;
    private javax.swing.JTextField pControl;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField ruta;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JButton verificador;
    // End of variables declaration//GEN-END:variables
}
