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
public class OperadorPControl extends javax.swing.JInternalFrame {

    private ConectorSesion login;
    private String verOperador;
    private int id;
    
    public OperadorPControl(int i, int id) {
        initComponents();
        this.id = id;
        txt1.setText("Operador a cargo del p. Control no. "+i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        operador = new javax.swing.JTextField();
        nombrarOp = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        txt1.setForeground(new java.awt.Color(0, 0, 102));

        nombrarOp.setText("Nombrar");
        nombrarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrarOpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(nombrarOp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(operador, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(181, 181, 181))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrarOp)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombrarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrarOpActionPerformed
        if(operador.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla para continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            verOperador = operador.getText();
            String captura = "";
            int valorCuota = 0;
            String sql = "SELECT * FROM Usuarios WHERE nickname = ?";
            String cuota = "SELECT * FROM Cuotas WHERE id = 1";
            try {
                Statement estado = cn.createStatement();
                PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                declaracionPreparada.setString(1, verOperador);
                ResultSet result = declaracionPreparada.executeQuery();
                PreparedStatement declaracionCuota = cn.prepareStatement(cuota);
                ResultSet result2 = declaracionCuota.executeQuery();
                while(result.next()){
                    captura = result.getString("tipo_usuario");
                }
                while(result2.next()){
                    valorCuota = result2.getInt("total");
                }
                if(captura.equals("Operador")){
                    estado.executeUpdate("INSERT INTO Puntos_control_ruta_"+id+" VALUES('"+0+"','"+0+"','"+5+"','"+verOperador+"','"+valorCuota+"')");
                    JOptionPane.showMessageDialog(null, "Operador agregado con exito");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario que usted busca no es un operador");
                }
            } catch (SQLException ex) {
                Logger.getLogger(OperadorPControl.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                login.Desconectar();
            }
        }    
    }//GEN-LAST:event_nombrarOpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton nombrarOp;
    private javax.swing.JTextField operador;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
