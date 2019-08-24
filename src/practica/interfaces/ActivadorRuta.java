package practica.interfaces;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.ConectorSesion;

/**
 *
 * @author luisGonzalez
 */
public class ActivadorRuta extends javax.swing.JInternalFrame {

    private ConectorSesion login;
    private int ruta;
    private DefaultTableModel dtmModel;
    private int cont = 0;
    
    public ActivadorRuta() {
        initComponents();
        try {
            cargar();
        } catch (SQLException ex) {
            Logger.getLogger(ActivadorRuta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        idRuta = new javax.swing.JTextField();
        activador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstado = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Activar Rutas:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("ID Ruta:");

        activador.setText("Confirmar");
        activador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activadorActionPerformed(evt);
            }
        });

        tablaEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Estado:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEstado);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(activador, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activador))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activadorActionPerformed
        if(idRuta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla antes de continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            ruta = Integer.parseInt(idRuta.getText());
            String estado  = "";
            String sql = "SELECT * FROM Rutas WHERE id = ?";
            String actualizacion = "UPDATE Rutas SET estado = 'ACTIVADA' WHERE id = ?";
            try {
                PreparedStatement declaracionRuta = cn.prepareStatement(sql);
                declaracionRuta.setInt(1, ruta);
                ResultSet result = declaracionRuta.executeQuery();
                while(result.next()) {
                    estado = result.getString("estado");
                }
                if(estado.equals("ACTIVADA")) {
                    JOptionPane.showMessageDialog(null, "Esta ruta ya se encuentra activada");
                } else if(estado.equals("DESACTIVADA")) {
                    PreparedStatement declaracionValor = cn.prepareStatement(actualizacion);
                    declaracionValor.setInt(1, ruta);
                    declaracionValor.execute();
                    JOptionPane.showMessageDialog(null, "Ruta activada con exito");
                    for(int i = tablaEstado.getRowCount()-1; i >=0; i--){
                        dtmModel.removeRow(i);
                    }
                    cargar();
                } else {
                    JOptionPane.showMessageDialog(null, "Esta ruta no existe en la base de datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ActivadorRuta.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                login.Desconectar();
            }
        }
    }//GEN-LAST:event_activadorActionPerformed
    
    private void cargar() throws SQLException{
        cont++;
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        cargarDatos(cn);
    }
    
    private void cargarDatos(Connection cn) throws SQLException{
        login = new ConectorSesion();
        dtmModel = (DefaultTableModel) tablaEstado.getModel();
        String sql = "SELECT * FROM Rutas WHERE estado = 'DESACTIVADA'";
        CallableStatement cts = cn.prepareCall(sql);
        ResultSet result = cts.executeQuery();
        while(result.next()){
            Object[] dato = new Object[2];
            dato[0] = result.getInt(1);
            dato[1] = result.getString(4);
            dtmModel.addRow(dato);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activador;
    private javax.swing.JTextField idRuta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaEstado;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
