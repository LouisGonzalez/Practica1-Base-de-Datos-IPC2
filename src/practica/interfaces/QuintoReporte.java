package practica.interfaces;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.ConectorSesion;
import practica.html.HtmlVentas;

/**
 *
 * @author luisGonzalez
 */
public class QuintoReporte extends javax.swing.JInternalFrame {

    private DefaultTableModel dtmModel;
    private ConectorSesion login;
    private HtmlVentas html;
    
    public QuintoReporte() {
        initComponents();
        try {
            cargar();
        } catch (SQLException ex) {
            Logger.getLogger(QuintoReporte.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }
    }
    
    private void cargar() throws SQLException{
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        dtmModel = (DefaultTableModel) tablaVentas.getModel();
        String sql = "SELECT * FROM Ventas";
        CallableStatement cts = cn.prepareCall(sql);
        ResultSet result = cts.executeQuery();
        while(result.next()){
            Object[] dato = new Object[4];
            dato[0] = result.getInt(1);
            dato[1] = result.getInt(2);
            dato[2] = result.getInt(3);
            dato[3] = result.getInt(4);
            dtmModel.addRow(dato);
        }
    }
    
    private void generarHtml(){
        File venta = new File("Ventas.html");
        html = new HtmlVentas();
        try {
            FileWriter redactor = new FileWriter(venta);
            BufferedWriter buffer = new BufferedWriter(redactor);
            html.generarEncabezado();
            html.titulos();
            buffer.write(html.salida);
            buffer.newLine();
            for(int i = 0; i < tablaVentas.getRowCount(); i++){
                html.generarTabla(Integer.parseInt(tablaVentas.getValueAt(i, 0).toString()), Integer.parseInt(tablaVentas.getValueAt(i, 1).toString()), Integer.parseInt(tablaVentas.getValueAt(i, 2).toString()), Integer.parseInt(tablaVentas.getValueAt(i, 3).toString()));
                buffer.write(html.fila);
                buffer.newLine();
            }
            html.parteFinal();
            buffer.write(html.ultimo);
            buffer.newLine();
            buffer.close();
            redactor.close();
        } catch (IOException ex) {
            Logger.getLogger(QuintoReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        exportador = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("REPORTE DE VENTAS:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelFondo.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 60));

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Nit:", "No. Paquetes:", "Total:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 80, 530, 190));

        exportador.setText("Exportar a HTML");
        exportador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportadorActionPerformed(evt);
            }
        });
        panelFondo.add(exportador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportadorActionPerformed
        generarHtml();
        JOptionPane.showMessageDialog(null, "El reporte ha sido exportado con exito");
    }//GEN-LAST:event_exportadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
