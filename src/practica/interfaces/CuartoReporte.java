package practica.interfaces;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.ConectorSesion;
import practica.html.HtmlRutasGanancias;

/**
 *
 * @author luisGonzalez
 */
public class CuartoReporte extends javax.swing.JInternalFrame {

    private DefaultTableModel dtmModel;
    private ConectorSesion login;
    private HtmlRutasGanancias html;
    
    public CuartoReporte() {
        initComponents();
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGanancias = new javax.swing.JTable();
        exportador = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Reporte de Rutas (ganancias):");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaGanancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Destino:", "Costos:", "Ingresos:", "Ganancias:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaGanancias);

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
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exportador, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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

    private void cargar(){
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        try {   
            actualizarDatos(cn);
        } catch (SQLException ex) {
            Logger.getLogger(CuartoReporte.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }
    }
    
    //muestra en pantalla los datos que se necesitan para el reporte
    private void actualizarDatos(Connection cn) throws SQLException {
        String sql = "SELECT * FROM Rutas";
        dtmModel = (DefaultTableModel) tablaGanancias.getModel();
        CallableStatement cts = cn.prepareCall(sql);
        ResultSet result = cts.executeQuery();
        while(result.next()){
            Object dato[] = new Object[5];
            dato[0] = result.getInt(1);
            dato[1] = result.getString(3);
            dato[2] = result.getInt(9);
            dato[3] = result.getInt(8);
            dato[4] = result.getInt(10);
            dtmModel.addRow(dato);
        }
    }
    
    private void generarHtml(){
        File ganancias = new File("Ganancias.html");
        html = new HtmlRutasGanancias();
        try{
            FileWriter redactor = new FileWriter(ganancias);
            BufferedWriter buffer = new BufferedWriter(redactor);
            html.generarEncabezado();
            html.titulos();
            buffer.write(html.salida);
            System.out.println(tablaGanancias.getRowCount());
            for(int i = 0; i < tablaGanancias.getRowCount(); i++){
                html.generarTabla(Integer.parseInt(tablaGanancias.getValueAt(i, 0).toString()), tablaGanancias.getValueAt(i, 1).toString(), Integer.parseInt(tablaGanancias.getValueAt(i, 2).toString()), Integer.parseInt(tablaGanancias.getValueAt(i, 3).toString()), Integer.parseInt(tablaGanancias.getValueAt(i, 4).toString()));
                buffer.write(html.fila);

            }
            html.parteFinal();
            buffer.write(html.ultimo);
          
            buffer.close();
            redactor.close();
        } catch (IOException ex) {
            Logger.getLogger(CuartoReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaGanancias;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
