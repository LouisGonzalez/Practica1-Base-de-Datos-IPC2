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
public class PaquetesOperador extends javax.swing.JInternalFrame {
    
    private final DefaultTableModel dtmModel;
    private ConectorSesion login;
    private final int pControl;
    private final int ruta;
    private int cont = 0;
    private int nit = 0;
    private int noVenta = 0;
    private int noPaquete = 0;
    private int totalHoras;
    
    public PaquetesOperador(int pControl, int ruta) throws SQLException {
        initComponents();
        this.pControl = pControl;
        this.ruta = ruta;
        txt1.setText("Paquetes Ruta: "+ruta+"  P. Control: "+pControl);
        dtmModel = (DefaultTableModel) tablaPaquetes.getModel();
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        String contador = "SELECT COUNT(*) FROM Paquetes WHERE no_punto_control = ? AND no_ruta = ?";
        String sql = "SELECT * FROM Paquetes WHERE no_punto_control = ? AND no_ruta = ? LIMIT ?";
        PreparedStatement declaracionContador = cn.prepareStatement(contador);
        declaracionContador.setInt(1, pControl);
        declaracionContador.setInt(2, ruta);
        ResultSet result = declaracionContador.executeQuery();
        while(result.next()) {
            cont = result.getInt("COUNT(*)");
            for(int x=1; x<=cont; x++) {
                PreparedStatement declaracionBusqueda = cn.prepareStatement(sql);
                declaracionBusqueda.setInt(1, pControl);
                declaracionBusqueda.setInt(2, ruta);
                declaracionBusqueda.setInt(3, x);
                ResultSet result2 = declaracionBusqueda.executeQuery();
                while(result2.next()) {
                    nit = result2.getInt("nit_persona");  
                    noVenta = result2.getInt("no_venta");
                    noPaquete = result2.getInt("no_paquete_venta");
                    
                }
                dtmModel.addRow(new Object[]{nit, noVenta, noPaquete});
            }
            
        }
        login.Desconectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPaquetes = new javax.swing.JTable();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        cajaHoras = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nit:", "No. Venta:", "No. Paq. Venta:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPaquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPaquetesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPaquetes);

        txt2.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("(Por orden de llegada solo la primer fila es la que puede pasar al siguiente punto");

        txt3.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("de control).");

        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("No. Horas:");

        cajaHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaHorasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4)
                    .addComponent(cajaHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txt2)
                .addGap(7, 7, 7)
                .addComponent(txt3))
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

    private void tablaPaquetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPaquetesMouseClicked
        int fila = tablaPaquetes.rowAtPoint(evt.getPoint());
        int nVenta = 0;
        int nPaquete = 0;
        int id = 0;
        int nuevoControl = pControl + 1;
        if(fila == 0){
            if(cajaHoras.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes llenar la casilla para continuar");
            } else {
                totalHoras = Integer.parseInt(cajaHoras.getText());
                nVenta = (Integer) (dtmModel.getValueAt(fila, 1));
                nPaquete = (Integer) (dtmModel.getValueAt(fila, 2));
                login = new ConectorSesion();
                Connection cn = login.getConnection();
                String ultimoPunto = "SELECT * FROM Puntos_control_ruta_? ORDER BY id DESC LIMIT 1";
                String modPaquete = "UPDATE Paquetes SET no_punto_control = ? WHERE no_venta = ? AND no_paquete_venta = ?";
                String modPunto = "UPDATE Puntos_control_ruta_? SET paquetes_actuales = ? WHERE id = ?";     
                try{
                    PreparedStatement declaracionId = cn.prepareStatement(ultimoPunto);
                    declaracionId.setInt(1, ruta);
                    ResultSet result = declaracionId.executeQuery();
                        while(result.next()){
                        id = result.getInt("id");
                        if(nuevoControl<=id){
                            PreparedStatement declaracionPaquete = cn.prepareStatement(modPaquete);
                            declaracionPaquete.setInt(1, nuevoControl);
                            declaracionPaquete.setInt(2, nVenta);
                            declaracionPaquete.setInt(3, nPaquete);
                            declaracionPaquete.execute();
                        } else {
                            JOptionPane.showMessageDialog(null, "ya te pasaste maquina");
                        }
                    }
                
                
                } catch (SQLException ex) {
                    Logger.getLogger(PaquetesOperador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, ":v");
        }
    }//GEN-LAST:event_tablaPaquetesMouseClicked

    private void cajaHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaHorasKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_cajaHorasKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaHoras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaPaquetes;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    // End of variables declaration//GEN-END:variables
}
