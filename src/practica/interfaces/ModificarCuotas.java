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
public class ModificarCuotas extends javax.swing.JInternalFrame {
    
    private ConectorSesion login;
    private String tipo_cuota;
    private int nuevo_valor;
    private DefaultTableModel dtmModel;
    
    public ModificarCuotas() {
        initComponents();
        cargar();
    }
    
    private void cargar(){
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        dtmModel = (DefaultTableModel) tablaCuotas.getModel();
        try {
            cargarTabla(cn);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarCuotas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        tipoCuota = new javax.swing.JComboBox<>();
        nuevoValor = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuotas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Cuota a modificar:");

        tipoCuota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarifa de operacion global", "Cuota de destino", "Cuota extra de priorizacion", "Precio por libra" }));
        tipoCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCuotaActionPerformed(evt);
            }
        });

        nuevoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoValorActionPerformed(evt);
            }
        });
        nuevoValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoValorKeyTyped(evt);
            }
        });

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Nuevo valor:");

        botonGuardar.setText("Guardar cambios");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("(Modificar el costo de una cuota no modificara el costo a los paquetes ya ingresados");

        txt4.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("con anterioridad).");

        tablaCuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "TIpo de Cuota:", "Total:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCuotas);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nuevoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tipoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(tipoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2)
                    .addComponent(botonGuardar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(txt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void nuevoValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoValorKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_nuevoValorKeyTyped

    private void nuevoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoValorActionPerformed
    }//GEN-LAST:event_nuevoValorActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if(nuevoValor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla para continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            tipo_cuota = tipoCuota.getSelectedItem().toString();
            nuevo_valor = Integer.parseInt(nuevoValor.getText());
            String cuota1 = "UPDATE Cuotas SET total = ? WHERE id = 1";
            String cuota2 = "UPDATE Cuotas SET total = ? WHERE id = 2";
            String cuota3 = "UPDATE Cuotas SET total = ? WHERE id = 3";
            String cuota4 = "UPDATE Cuotas SET total = ? WHERE id = 4";
            try{
                //dependiendo de la cuota que see desee cambiar se hace la sentencia
                switch (tipo_cuota) {
                    case "Tarifa de operacion global":
                        PreparedStatement declaracionCuota1 = cn.prepareStatement(cuota1);
                        declaracionCuota1.setInt(1, nuevo_valor);
                        declaracionCuota1.execute();
                        JOptionPane.showMessageDialog(null, "El cambio ha sido guardado con exito");
                        break;
                    case "Cuota de destino":
                        PreparedStatement declaracionCuota2 = cn.prepareStatement(cuota2);
                        declaracionCuota2.setInt(1, nuevo_valor);
                        declaracionCuota2.execute();
                        JOptionPane.showMessageDialog(null, "El cambio ha sido guardado con exito");
                        break;
                    case "Cuota extra de priorizacion":
                        PreparedStatement declaracionCuota3 = cn.prepareStatement(cuota3);
                        declaracionCuota3.setInt(1, nuevo_valor);
                        declaracionCuota3.execute();
                        JOptionPane.showMessageDialog(null, "El cambio ha sido guardado con exito");
                        break;
                    case "Precio por libra":
                        PreparedStatement declaracionCuota4 = cn.prepareStatement(cuota4);
                        declaracionCuota4.setInt(1, nuevo_valor);
                        declaracionCuota4.execute();
                        JOptionPane.showMessageDialog(null, "El cambio ha sido guardado con exito");
                        break;
                    default:
                        break;
                }       
                int filas = dtmModel.getRowCount();
                for(int i=0; i<filas; i++){
                    dtmModel.removeRow(0);
                }
                cargarTabla(cn);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarCuotas.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                login.Desconectar();
            }
        }    
    }//GEN-LAST:event_botonGuardarActionPerformed

    //metodo que se encarga de mostrar en pantalla los datos actuales de las cuotas    
    private void cargarTabla(Connection cn) throws SQLException{
        String sql = "SELECT * FROM Cuotas";
        CallableStatement cts = cn.prepareCall(sql);
        ResultSet result = cts.executeQuery();
        while(result.next()){
            Object dato[] = new Object[3];
            for(int i = 0; i < 3; i++){
                dato[i] = result.getString(i+1);
            }
            dtmModel.addRow(dato);
            }
    }
    
    private void tipoCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCuotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nuevoValor;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaCuotas;
    private javax.swing.JComboBox<String> tipoCuota;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    // End of variables declaration//GEN-END:variables
}
