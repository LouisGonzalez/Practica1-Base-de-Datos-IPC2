package practica.interfaces;

import java.sql.*;
import javax.swing.JOptionPane;
import practica.clases.ConectorSesion;

/**
 *
 * @author luisGonzalez
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    ConectorSesion login;
    private String user, pass;
    
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPadre = new javax.swing.JDesktopPane();
        titulo = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        sesion = new javax.swing.JButton();
        txt3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPadre.setBackground(new java.awt.Color(204, 255, 255));

        titulo.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 102));
        titulo.setText("INICIO DE SESION:");

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Usuario:");

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Password:");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        sesion.setText("Entrar");
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Dyuthi", 2, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("Crea una cuenta");
        txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt3MouseClicked(evt);
            }
        });

        panelPadre.setLayer(titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPadre.setLayer(txt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPadre.setLayer(txt2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPadre.setLayer(usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPadre.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPadre.setLayer(sesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPadre.setLayer(txt3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelPadreLayout = new javax.swing.GroupLayout(panelPadre);
        panelPadre.setLayout(panelPadreLayout);
        panelPadreLayout.setHorizontalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPadreLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPadreLayout.createSequentialGroup()
                        .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(usuario)))
                    .addGroup(panelPadreLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPadreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPadreLayout.setVerticalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPadreLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(sesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(txt3)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPadre)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPadre)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceder(){
        login = new ConectorSesion();
        String captura = "";
        user = usuario.getText();
        pass = password.getText();
        String sql = "SELECT * FROM Usuarios WHERE nickname = ? AND password = ?";  
        try{
            Connection cn = login.getConnection();
            PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
            declaracionPreparada.setString(1, user);
            declaracionPreparada.setString(2, pass);
            ResultSet result2 = declaracionPreparada.executeQuery();
            while(result2.next()){
                captura=result2.getString("tipo_usuario");
            }    
            if(captura.equals("Administrador")){
                MenuAdministrador admin = new MenuAdministrador();
                this.panelPadre.add(admin);
                admin.show();
            } else if(captura.equals("Operador")){
                MenuOperador operador = new MenuOperador();
                this.panelPadre.add(operador);
                operador.show();
            } else if(captura.equals("Recepcionista")){
                MenuRecepcionista recep = new MenuRecepcionista();
                this.panelPadre.add(recep);
                recep.show();
            } else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas");
            }
        } catch(SQLException ex){
           
        }
        
    }
    
    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
    }//GEN-LAST:event_usuarioActionPerformed

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
        acceder();
    }//GEN-LAST:event_sesionActionPerformed

    private void txt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MouseClicked
        VerificacionAdministrador admin = new VerificacionAdministrador();
        this.panelPadre.add(admin);
        admin.show();
    }//GEN-LAST:event_txt3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane panelPadre;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton sesion;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
