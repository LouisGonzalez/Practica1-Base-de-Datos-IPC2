package practica.interfaces;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import practica.clases.ConectorSesion;
import practica.html.HtmlClientes;

/**
 *
 * @author luisGonzalez
 */
public class SegundoReporte extends javax.swing.JInternalFrame {

    private DefaultTableModel dtmModel;
    private ConectorSesion login;
    HtmlClientes html; 
    
    public SegundoReporte() {
        initComponents();
        try {
            cargar();
        } catch (SQLException ex) {
            Logger.getLogger(SegundoReporte.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }
    }

    private void cargar() throws SQLException{
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        dtmModel = (DefaultTableModel) tablaClientes.getModel();
        String sql = "SELECT * FROM Clientes";
        CallableStatement cts = cn.prepareCall(sql);
        ResultSet result = cts.executeQuery();
        while(result.next()){
            Object dato[] = new Object[7];
            dato[0] = result.getInt(2);
            dato[1] = result.getInt(6);
            dato[2] = result.getInt(7);
            dato[3] = result.getInt(11);
            dato[4] = result.getInt(8);
            dato[5] = result.getInt(9);
            dato[6] = result.getInt(10);
            dtmModel.addRow(dato);
        }
    }
    
    private void generarHtml(){
        File cliente = new File("Clientes.html");
        html = new HtmlClientes();
        try{
            FileWriter redactor = new FileWriter(cliente);
            BufferedWriter buffer = new BufferedWriter(redactor);
            html.generarEncabezado();
            html.titulos();
            buffer.write(html.salida);
            buffer.newLine();
            for(int i = 0; i<tablaClientes.getRowCount(); i++){
                html.generarTabla(Integer.parseInt(tablaClientes.getValueAt(i, 0).toString()), Integer.parseInt(tablaClientes.getValueAt(i, 1).toString()), Integer.parseInt(tablaClientes.getValueAt(i, 2).toString()), Integer.parseInt(tablaClientes.getValueAt(i, 3).toString()), Integer.parseInt(tablaClientes.getValueAt(i, 4).toString()), Integer.parseInt(tablaClientes.getValueAt(i, 5).toString()), Integer.parseInt(tablaClientes.getValueAt(i, 6).toString()));
                buffer.write(html.fila);        
                buffer.newLine();
            }
            html.parteFinal();
            buffer.write(html.ultimo);
            buffer.newLine();
            buffer.close();
            redactor.close();
        } catch (IOException ex) {
            Logger.getLogger(SegundoReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        exportador = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Reporte de Clientes:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nit:", "Telefono:", "Paquetes Entregados:", "Paquetes Sistema:", "Costos:", "Ingresos:", "Ganancias:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        exportador.setText("Exportar a html");
        exportador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(exportador, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportador)
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

    private void exportadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportadorActionPerformed
        generarHtml();
    }//GEN-LAST:event_exportadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
