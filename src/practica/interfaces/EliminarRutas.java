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
public class EliminarRutas extends javax.swing.JInternalFrame {

    private ConectorSesion login;
    private int id, lastId;
    private int[] captura2;
    private final String estadoRuta = "DESACTIVADA";
    private DefaultTableModel dtmModel;
    
    public EliminarRutas() {
        initComponents();
        try {
            cargar();
        } catch (SQLException ex) {
            Logger.getLogger(EliminarRutas.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        txt4 = new javax.swing.JLabel();
        confirmacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstado = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Desactivar Rutas:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("No. Ruta a desactivar:");

        ruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutaKeyTyped(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("(Al momento de  desactivar una ruta no podras usar sus puntos de ");

        txt4.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("control para ninguna operacion).");

        confirmacion.setText("Confirmar");
        confirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacionActionPerformed(evt);
            }
        });

        tablaEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Ruta:"
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
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(confirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmacion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(txt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutaKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_rutaKeyTyped

    private void confirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacionActionPerformed
        if(ruta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla para continuar");
        } else {
            login =  new ConectorSesion();
            Connection cn = login.getConnection();
            boolean interruptor = true; 
            id = Integer.parseInt(ruta.getText());
            String sql = "SELECT * FROM Puntos_control_ruta_"+id+" ORDER BY id DESC LIMIT 1";
            String sql2 = "SELECT * FROM Puntos_control_ruta_"+id+" WHERE id = ?";
            String selectRuta = "SELECT * FROM Rutas WHERE id = ?";            
            String desactivar = "UPDATE Rutas SET estado = '"+estadoRuta+"' WHERE id = ?";
            try{
                PreparedStatement declaracionPreparada = cn.prepareStatement(selectRuta);
                declaracionPreparada.setInt(1, id);
                ResultSet result = declaracionPreparada.executeQuery();
                if(result.next()){
                
                    Statement estado = cn.createStatement();
                    ResultSet res = estado.executeQuery(sql);
                    while(res.next()){
                        lastId = res.getInt("id");
                        captura2 = new int[lastId+1];
                        for(int i=1; i<=lastId; i++){
                            PreparedStatement declaracionPControl = cn.prepareStatement(sql2);
                            declaracionPControl.setInt(1, i);
                            ResultSet res2 = declaracionPControl.executeQuery();
                            while(res2.next()){
                                captura2[i] = res2.getInt("paquetes_actuales");
                                if(captura2[i]!=0){
                                    interruptor = false;
                                }                            
                            }
                        }
                        if(interruptor == true){
                            PreparedStatement declaracionRuta = cn.prepareStatement(desactivar);
                            declaracionRuta.setInt(1, id);
                            declaracionRuta.execute();
                            for(int i = tablaEstado.getRowCount()-1; i>=0; i--){
                                dtmModel.removeRow(i);
                            }
                            cargar();
                            JOptionPane.showMessageDialog(null, "Ruta desactivada con exito");
                        } else {
                            JOptionPane.showMessageDialog(null, "En este momento hay uno o varios puntos de control con actividad");
                        }          
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La ruta que usted busca no ha sido localizada");
                }
            }   catch (SQLException ex) {
                Logger.getLogger(EliminarRutas.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                login.Desconectar();
            }
        }
    }//GEN-LAST:event_confirmacionActionPerformed

    private void cargar() throws SQLException{
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        dtmModel = (DefaultTableModel) tablaEstado.getModel();
        String select = "SELECT * FROM Rutas WHERE estado = 'ACTIVADA'";
        CallableStatement cts = cn.prepareCall(select);
        ResultSet result = cts.executeQuery();
        while(result.next()){
            Object[] dato = new Object[2];
            dato[0] = result.getInt(1);
            dato[1] = result.getString(4);
            dtmModel.addRow(dato);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField ruta;
    private javax.swing.JTable tablaEstado;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    // End of variables declaration//GEN-END:variables
}
