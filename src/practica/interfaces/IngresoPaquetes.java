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
public class IngresoPaquetes extends javax.swing.JInternalFrame {
    
    private ConectorSesion login;
    private int nitCliente;
    
    public IngresoPaquetes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        nit = new javax.swing.JTextField();
        verificador = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Verificacion Nit:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Nit:");

        nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitActionPerformed(evt);
            }
        });
        nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitKeyTyped(evt);
            }
        });

        verificador.setText("Continuar");
        verificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(verificador, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificador))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificadorActionPerformed
        if(nit.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla para continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            nitCliente = Integer.parseInt(nit.getText());
            String sql = "SELECT * FROM Clientes WHERE nit = ?";
            if(nitCliente>99999999 || nitCliente<10000000){
                JOptionPane.showMessageDialog(null, "Un nit no puede ser un numero que no tenga 8 digitos");
            } else {
                try{
                    //busca el cliente que el recepcionista intenta encontrar
                    PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                    declaracionPreparada.setInt(1, nitCliente);
                    ResultSet result = declaracionPreparada.executeQuery();
                    //si el cliente existe procede al Frame de facturas para continuar con el pago
                    if(result.next()){
                        this.dispose();
                        Factura factura = new Factura(nitCliente);
                        MenuPrincipal.panelPadre.add(factura);
                        factura.show();
                    } else {
                        //si el cliente no existe se procede a ingresarlo a la base de datos
                        JOptionPane.showMessageDialog(null, "No existe este nit en la base de datos, se procedera a crear el cliente");
                        this.dispose();
                        NuevoCliente nuevo = new NuevoCliente(nitCliente);
                        MenuPrincipal.panelPadre.add(nuevo);
                        nuevo.show();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(IngresoPaquetes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        }
    }//GEN-LAST:event_verificadorActionPerformed

    private void nitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_nitKeyTyped

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed
    }//GEN-LAST:event_nitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nit;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JButton verificador;
    // End of variables declaration//GEN-END:variables
}
