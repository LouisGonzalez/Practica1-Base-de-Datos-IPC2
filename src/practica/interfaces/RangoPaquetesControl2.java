package practica.interfaces;

import java.sql.*;
import javax.swing.JOptionPane;
import practica.clases.ConectorSesion;

/**
 *
 * @author luisGonzalez
 */
public class RangoPaquetesControl2 extends javax.swing.JInternalFrame {
    
    private ConectorSesion login;
    private int id, pControl, rango;
    
    public RangoPaquetesControl2(int id, int pControl) throws SQLException {
        initComponents();
        this.id = id;
        this.pControl = pControl;
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        txt1.setText("Id Ruta no: "+id);
        txt2.setText("Punto de Control no: "+pControl);
        //--------------------------------------------------
        String captura = "";
        String captura2 = "";
        String sql = "SELECT * FROM Puntos_control_ruta_"+id+" WHERE id = ?";
        PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
        declaracionPreparada.setInt(1, pControl);
        ResultSet result = declaracionPreparada.executeQuery();
        while(result.next()){
            captura = result.getString("paquetes_maximos");
            captura2 = result.getString("paquetes_actuales");
        }
        txt5.setText("Paquetes en cola: "+captura2);
        txt6.setText("Rango de cola actual: "+captura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        rangoCola = new javax.swing.JTextField();
        guardarCambios = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        txt1.setForeground(new java.awt.Color(102, 0, 0));

        txt2.setForeground(new java.awt.Color(102, 0, 0));

        txt3.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("(Se puede modificar el rango de un punto de control unicamente si no hay ");

        txt4.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("paquetes por entregar dentro del punto de control en ese instante).");

        txt5.setForeground(new java.awt.Color(102, 0, 0));

        txt6.setForeground(new java.awt.Color(102, 0, 0));

        txt7.setForeground(new java.awt.Color(0, 0, 102));
        txt7.setText("Modificar rango de cola:");

        rangoCola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rangoColaKeyTyped(evt);
            }
        });

        guardarCambios.setText("Guardar");
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createSequentialGroup()
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt6, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rangoCola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(guardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
                    .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(txt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7)
                    .addComponent(rangoCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarCambios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(txt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4)
                .addGap(16, 16, 16))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rangoColaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rangoColaKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();        
    }//GEN-LAST:event_rangoColaKeyTyped

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        if(rangoCola.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla para continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            String captura = "";
            String captura2 = "";
            rango = Integer.parseInt(rangoCola.getText());
            String sql = "SELECT * FROM Puntos_control_ruta_"+id+" WHERE id = ?";
            try{
                Statement estado = cn.createStatement();
                PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                declaracionPreparada.setInt(1, pControl);
                ResultSet result = declaracionPreparada.executeQuery();
                while(result.next()){
                    captura = result.getString("paquetes_maximos");
                    captura2 = result.getString("paquetes_actuales");
                    if(Integer.parseInt(captura2)!=0){
                        JOptionPane.showMessageDialog(null, "Hay paquetes dentro de la cola en este instante por lo tanto no se puede modificar su rango actual");
                    } else {
                    String nuevoValor = "UPDATE Puntos_control_ruta_"+id+" SET paquetes_maximos='"+rango+"' WHERE id='"+pControl+"'";
                    estado.executeUpdate(nuevoValor);
                    JOptionPane.showMessageDialog(null, "El rango del punto de control ha sido modificado con exito");
                    rangoCola.setText("");
                    }
                }
            } catch(SQLException e){
            
            } finally{
                login.Desconectar();
            }
        }    
    }//GEN-LAST:event_guardarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardarCambios;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField rangoCola;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    // End of variables declaration//GEN-END:variables
}
