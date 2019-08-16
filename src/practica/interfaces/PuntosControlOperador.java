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
public class PuntosControlOperador extends javax.swing.JInternalFrame {
    
    private ConectorSesion login;
    private int primero = 0;
    private int ultimo = 0;
    private int primerPunto = 0;
    private int ultimoPunto = 0;
    private String destinoRuta = "";
    private String operador = "";
    private final DefaultTableModel dtmModel;
        
    
    public PuntosControlOperador(String usuario) {
        initComponents();
        login = new ConectorSesion();
        Connection cn= login.getConnection();
        dtmModel = (DefaultTableModel) tablaPuntos.getModel();
        String primerRuta = "SELECT * FROM Rutas ORDER BY id ASC LIMIT 1";
        String ultimaRuta = "SELECT * FROM Rutas ORDER BY id DESC LIMIT 1";
        String destino = "SELECT * FROM Rutas WHERE id = ?";
        String pControl = "SELECT * FROM Puntos_control_ruta_? ORDER BY id ASC LIMIT 1";
        String pControl2 = "SELECT * FROM Puntos_control_ruta_? ORDER BY id DESC LIMIT 1";
        String busqueda = "SELECT * FROM Puntos_control_ruta_? WHERE id = ?";
        try{
            PreparedStatement declaracionPrimero = cn.prepareStatement(primerRuta);
            ResultSet result = declaracionPrimero.executeQuery();
            PreparedStatement declaracionUltimo = cn.prepareStatement(ultimaRuta);
            ResultSet result2 = declaracionUltimo.executeQuery();
            while(result.next()){
                primero = result.getInt("id");
            }
            while(result2.next()){
                ultimo = result2.getInt("id");
            }
            for(int i = primero; i<=ultimo; i++){
                PreparedStatement declaracionId = cn.prepareStatement(pControl);
                declaracionId.setInt(1, i);
                ResultSet result3 = declaracionId.executeQuery();
                PreparedStatement declaracionUltId = cn.prepareStatement(pControl2);
                declaracionUltId.setInt(1, i);
                ResultSet result4 = declaracionUltId.executeQuery();
                PreparedStatement declaracionDestino = cn.prepareStatement(destino);
                declaracionDestino.setInt(1, i);
                ResultSet result7 = declaracionDestino.executeQuery();
                while(result7.next()){
                    destinoRuta = result7.getString("destino");
                }
                while(result3.next()){
                    primerPunto = result3.getInt("id");
                } 
                while(result4.next()){
                    ultimoPunto = result4.getInt("id");
                }
                for(int x = primerPunto; x<=ultimoPunto; x++){
                    PreparedStatement declaracionBusqueda = cn.prepareStatement(busqueda);
                    declaracionBusqueda.setInt(1, i);
                    declaracionBusqueda.setInt(2, x);
                    ResultSet result5 = declaracionBusqueda.executeQuery();
                    while(result5.next()){
                        operador = result5.getString("operador_al_mando");
                    }
                    if(operador.equals(usuario)){
                       dtmModel.addRow(new Object[]{x, i, destinoRuta});                    
                    } 
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PuntosControlOperador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuntos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        tablaPuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P. Control:", "Ruta:", "Destino:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPuntosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPuntos);
        if (tablaPuntos.getColumnModel().getColumnCount() > 0) {
            tablaPuntos.getColumnModel().getColumn(0).setPreferredWidth(3);
            tablaPuntos.getColumnModel().getColumn(1).setPreferredWidth(3);
        }

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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

    private void tablaPuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPuntosMouseClicked
        int fila = tablaPuntos.rowAtPoint(evt.getPoint());
        int columna = tablaPuntos.columnAtPoint(evt.getPoint());
        int pControl = 0;
        int ruta = 0;
        if(columna == 1){
            try {
                pControl = (Integer) (dtmModel.getValueAt(fila, 0));
                ruta = (Integer) (dtmModel.getValueAt(fila, columna));
                PaquetesOperador paquete = new PaquetesOperador(pControl, ruta);
                MenuPrincipal.panelPadre.add(paquete);
                paquete.show();
            } catch (SQLException ex) {
                Logger.getLogger(PuntosControlOperador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(columna == 0){
            try {
                pControl = (Integer) (dtmModel.getValueAt(fila, columna));
                ruta = (Integer) (dtmModel.getValueAt(fila, 1));
                PaquetesOperador paquete = new PaquetesOperador(pControl, ruta);
                MenuPrincipal.panelPadre.add(paquete);
                paquete.show();
            } catch (SQLException ex) {
                Logger.getLogger(PuntosControlOperador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_tablaPuntosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaPuntos;
    // End of variables declaration//GEN-END:variables
}
