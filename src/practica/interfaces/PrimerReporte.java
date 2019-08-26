package practica.interfaces;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.ConectorSesion;
import practica.html.HtmlRutas;

/**
 *
 * @author luisGonzalez
 */
public class PrimerReporte extends javax.swing.JInternalFrame {

    private DefaultTableModel dtmModel;
    private ConectorSesion login;
    HtmlRutas html;
    
    public PrimerReporte() {
        initComponents();
        try {
            cargar();
        } catch (SQLException ex) {
            Logger.getLogger(PrimerReporte.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }
    }

    //metodo encargado de mostrar en pantalla los datos que se necesitan para el reporte sacados de la base de datos
    private void cargar() throws SQLException{
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        String sql = "SELECT * FROM Rutas";
        dtmModel = (DefaultTableModel) tablaRutas.getModel();
        CallableStatement cts = cn.prepareCall(sql);
        ResultSet result = cts.executeQuery();
        while(result.next()){
            Object dato[] = new Object[6];
            dato[0] = result.getInt(1);
            dato[1] = result.getInt(2);
            dato[2] = result.getString(3);
            dato[3] = result.getString(4);
            dato[4] = result.getInt(5);
            dato[5] = result.getInt(6);
            dtmModel.addRow(dato);
        }
    }
    
    //metodo encargado de exportar ese reporte hacia un archivo html
    private void generarHtml(){
        File ruta = new File("Rutas.html");
        html = new HtmlRutas();
        try{
            FileWriter redactor = new FileWriter(ruta);
            BufferedWriter buffer = new BufferedWriter(redactor);
            html.generarEncabezado();
            html.titulos();
            buffer.write(html.salida);
            buffer.newLine();
            for(int i = 0; i<tablaRutas.getRowCount(); i++){
                html.generarTabla(Integer.parseInt(tablaRutas.getValueAt(i, 0).toString()), Integer.parseInt(tablaRutas.getValueAt(i, 1).toString()), tablaRutas.getValueAt(i, 2).toString(), tablaRutas.getValueAt(i, 3).toString(), Integer.parseInt(tablaRutas.getValueAt(i, 4).toString()), Integer.parseInt(tablaRutas.getValueAt(i, 5).toString()));
                buffer.write(html.fila);
                buffer.newLine();
            }   
            html.parteFinal();
            buffer.write(html.ultimo);
            buffer.newLine();
            buffer.close();
            redactor.close();
        } catch (IOException ex) {
            Logger.getLogger(PrimerReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRutas = new javax.swing.JTable();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        exportador = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        tablaRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "No. Puntos Control:", "Destino:", "Estado:", "Paquetes Sistema:", "Paquete Entregados:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRutas);

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Reporte de Rutas:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        exportador.setText("Exportar a HTML");
        exportador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exportador, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        JOptionPane.showMessageDialog(null, "El reporte ha sido exportado con exito");    
    }//GEN-LAST:event_exportadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaRutas;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
