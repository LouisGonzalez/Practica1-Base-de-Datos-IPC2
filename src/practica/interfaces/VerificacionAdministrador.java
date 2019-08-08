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
public class VerificacionAdministrador extends javax.swing.JInternalFrame {
    
    private ConectorSesion login;
    private String user, pass;
    
    public VerificacionAdministrador() {
        initComponents();
        login = new ConectorSesion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        accederForm = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        txt1.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("(Solo los usuarios con rango de administrador pueden hacer uso del formulario ");

        txt2.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("de creacion de usuarios)");

        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("Usuario:");

        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("Password:");

        accederForm.setText("Entrar");
        accederForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederFormActionPerformed(evt);
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
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accederForm, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2)
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addComponent(accederForm)
                        .addGap(2, 2, 2)))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accederFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederFormActionPerformed
        String captura = "";
        user = usuario.getText();
        pass = password.getText();
        String sql = "SELECT * FROM Usuarios WHERE nickname = ? AND password = ? ";
        try { 
            Connection cn = login.getConnection();
            PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
            declaracionPreparada.setString(1, user);
            declaracionPreparada.setString(2, pass);
            ResultSet result = declaracionPreparada.executeQuery();
            while(result.next()){
                captura=result.getString("tipo_usuario");                
            }
            if(captura.equals("Administrador")){
                NuevoUsuario nuevo = new NuevoUsuario();
                MenuPrincipal.panelPadre.add(nuevo);
                nuevo.show();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario que usted agrego no es un administrador");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VerificacionAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_accederFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederForm;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
