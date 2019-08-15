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
public class Factura extends javax.swing.JInternalFrame {

    private ConectorSesion login;
    private final DefaultTableModel dtmModel;
    private final String[] capturas = new String[5];
    private int noPaquetes, nit, totalPaquetes, pagoTotal, totalFinal;
    private String destinoPaquete, pagoPrioridad, valores;
    
    public Factura(int nit) throws SQLException {
        initComponents();
        this.nit = nit;
        dtmModel =(DefaultTableModel) tablaDatos.getModel();
        txt2.setText("Nit: "+nit);
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        String sql = "SELECT* FROM Clientes WHERE nit = ?";
        PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
        declaracionPreparada.setInt(1, nit);
        ResultSet result = declaracionPreparada.executeQuery();
        while(result.next()){
            capturas[0] = result.getString("nombres");
            capturas[1] = result.getString("apellidos");
            capturas[2] = result.getString("domicilio");
            capturas[3] = result.getString("telefono");
        }
        txt3.setText("Nombres: "+capturas[0]);
        txt4.setText("Apellidos: "+capturas[1]);
        txt5.setText("Domicilio: "+capturas[2]);
        txt6.setText("Telefono: "+capturas[3]);
        login.Desconectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        pago = new javax.swing.JPanel();
        txt7 = new javax.swing.JLabel();
        cajaPaquetes = new javax.swing.JTextField();
        agregarFIlas = new javax.swing.JButton();
        txt8 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        generarPago = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        eliminarFilas = new javax.swing.JButton();
        calculoTotal = new javax.swing.JButton();
        txt9 = new javax.swing.JLabel();
        destino = new javax.swing.JComboBox<>();
        txt10 = new javax.swing.JLabel();
        selecPrioridad = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Factura:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt2.setForeground(new java.awt.Color(0, 0, 102));

        txt3.setForeground(new java.awt.Color(0, 0, 102));

        txt4.setForeground(new java.awt.Color(0, 0, 102));

        txt5.setForeground(new java.awt.Color(0, 0, 102));

        txt6.setForeground(new java.awt.Color(0, 0, 102));

        pago.setBackground(new java.awt.Color(204, 255, 255));
        pago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt7.setForeground(new java.awt.Color(0, 0, 102));
        txt7.setText("No. Paquetes:");

        cajaPaquetes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaPaquetesKeyTyped(evt);
            }
        });

        agregarFIlas.setText("Agregar filas");
        agregarFIlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFIlasActionPerformed(evt);
            }
        });

        txt8.setForeground(new java.awt.Color(0, 0, 102));
        txt8.setText("Total:");

        generarPago.setText("Confirmar pago");
        generarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarPagoActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Paquetes", "Peso (kg)"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setResizable(false);
        }

        eliminarFilas.setText("Eliminar filas");
        eliminarFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFilasActionPerformed(evt);
            }
        });

        calculoTotal.setText("Calcular total");
        calculoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoTotalActionPerformed(evt);
            }
        });

        txt9.setForeground(new java.awt.Color(0, 0, 102));
        txt9.setText("Destino:");

        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nueva York (Estados Unidos)", "Londres (Reino Unido)", "Paris (Francia)", "Tokio (Japon)", "Hong Kong (China)", "Singapur (Singapur)", "Los Angeles (Estados Unidos)", "Chicago (Estados Unidos)", "Pekin (China)", "Washington D.C. (Estados Unidos)", "Madrid (España)", "Buenos Aires (Argentina)", "Rio de Janeiro (Brasil)", "Berlin (Alemania)", "Bogota (Colombia)", "Roma (Italia)" }));

        txt10.setForeground(new java.awt.Color(0, 0, 102));
        txt10.setText("Prioridad:");

        selecPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        selecPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecPrioridadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pagoLayout = new javax.swing.GroupLayout(pago);
        pago.setLayout(pagoLayout);
        pagoLayout.setHorizontalGroup(
            pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagoLayout.createSequentialGroup()
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destino, 0, 1, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(pagoLayout.createSequentialGroup()
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pagoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pagoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selecPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pagoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarFilas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agregarFIlas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        pagoLayout.setVerticalGroup(
            pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7)
                    .addComponent(cajaPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt8)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(pagoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selecPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarFIlas)
                        .addGap(10, 10, 10)
                        .addComponent(eliminarFilas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calculoTotal)
                        .addGap(25, 25, 25)
                        .addComponent(generarPago)
                        .addGap(12, 12, 12))))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void agregarFIlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFIlasActionPerformed
        if(cajaPaquetes.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla para calcular el total");
        } else {
            noPaquetes = Integer.parseInt(cajaPaquetes.getText());
            for(int i=0; i<noPaquetes; i++){
                dtmModel.addRow(new Object[]{i+1});
            }
        }
    }//GEN-LAST:event_agregarFIlasActionPerformed

    private void cajaPaquetesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPaquetesKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();        
    }//GEN-LAST:event_cajaPaquetesKeyTyped

    private void calculoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoTotalActionPerformed
        int filas = dtmModel.getRowCount();
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        pagoPrioridad = selecPrioridad.getSelectedItem().toString();            
        int valorLibra = 0;
        int valorCDestino = 0;
        int valorVip = 0;
        String precioLibra = "SELECT * FROM Cuotas WHERE id = 4";
        String cuotaDestino = "SELECT * FROM Cuotas WHERE id = 2";
        String cuotaVip = "SELECT * FROM Cuotas WHERE id = 3";
        try {
            PreparedStatement declaracionLibra = cn.prepareStatement(precioLibra);
            PreparedStatement declaracionVip = cn.prepareStatement(cuotaVip);
            PreparedStatement declaracionDestino = cn.prepareStatement(cuotaDestino);
            ResultSet result = declaracionLibra.executeQuery();
            ResultSet result2 = declaracionDestino.executeQuery();
            ResultSet result3 = declaracionVip.executeQuery();
            while(result.next()){
                valorLibra = result.getInt("total");
            }
            while(result2.next()){
                valorCDestino = result2.getInt("total");
            }
            while(result3.next()){
                valorVip = result3.getInt("total");
            }
            int conversion;
            int totales = 0;
            for(int i=0; i<filas; i++){
                valores = (String) dtmModel.getValueAt(i, 1);
                conversion = Integer.parseInt(valores)*valorLibra;
                totales = totales + conversion;                
            }
            if(pagoPrioridad.equals("NO")){
                totalFinal = totales + valorCDestino;
            } else if(pagoPrioridad.equals("SI")){
                totalFinal = totales + valorCDestino + valorVip;
            }
            total.setText(Integer.toString(totalFinal));
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }        
    }//GEN-LAST:event_calculoTotalActionPerformed

    private void eliminarFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFilasActionPerformed
        int filas = dtmModel.getRowCount();
        for(int i=0; i<filas; i++){
            dtmModel.removeRow(0);
        }
    }//GEN-LAST:event_eliminarFilasActionPerformed

    private void generarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarPagoActionPerformed
        if(total.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes calcular antes el total a pagar para continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            destinoPaquete = destino.getSelectedItem().toString();
            totalPaquetes = Integer.parseInt(cajaPaquetes.getText());
            pagoTotal = Integer.parseInt(total.getText());
            int paqueteSistema = 0;
            int ingresoCliente = 0;
            int nuevoValor = 0;
            int nuevoValor2 = 0;
            String sql = "INSERT INTO Bodega VALUES ('"+0+"','"+nit+"','"+pagoPrioridad+"','"+destinoPaquete+"')";
            String nuevaVenta = "INSERT INTO Ventas VALUES ('"+0+"','"+nit+"','"+totalPaquetes+"','"+pagoTotal+"')";                            
            String cliente = "SELECT * FROM Clientes WHERE nit = ?";
            String dato = "UPDATE Clientes SET paquetes_en_sistema = ? WHERE nit = ?";
            String dato2 = "UPDATE Clientes SET ingresos_cliente = ? WHERE nit = ?";
            try{
                PreparedStatement declaracionCliente = cn.prepareStatement(cliente);
                declaracionCliente.setInt(1, nit);
                ResultSet result = declaracionCliente.executeQuery();
                while(result.next()){
                    paqueteSistema = result.getInt("paquetes_en_sistema");
                    ingresoCliente = result.getInt("ingresos_cliente");
                }
                nuevoValor = ingresoCliente + pagoTotal;
                nuevoValor2 = paqueteSistema + totalPaquetes;
                PreparedStatement declaracionValor = cn.prepareStatement(dato);
                declaracionValor.setInt(1, nuevoValor2);
                declaracionValor.setInt(2, nit);
                declaracionValor.execute();
                PreparedStatement declaracionValor2 = cn.prepareStatement(dato2);
                declaracionValor2.setInt(1, nuevoValor);
                declaracionValor2.setInt(2, nit);
                declaracionValor2.execute();
                for(int i = 1; i <= totalPaquetes; i++) {
                    PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                    declaracionPreparada.execute();                    
                }
                PreparedStatement declaracionVenta = cn.prepareStatement(nuevaVenta);
                declaracionVenta.execute();
                JOptionPane.showMessageDialog(null, "Transaccion exitosa");
            } catch (SQLException ex) {
                Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                login.Desconectar();
            }
        }
    }//GEN-LAST:event_generarPagoActionPerformed

    private void selecPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecPrioridadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarFIlas;
    private javax.swing.JTextField cajaPaquetes;
    private javax.swing.JButton calculoTotal;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JButton eliminarFilas;
    private javax.swing.JButton generarPago;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pago;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JComboBox<String> selecPrioridad;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}
