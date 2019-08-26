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
public class EgresoPaquetes extends javax.swing.JInternalFrame {
    
    private DefaultTableModel dtmModel;
    private ConectorSesion login;
    
    public EgresoPaquetes() {
        initComponents();
        cargar();
    }
    
    //pasa a la tabla todos los paquetes que ya estan por ser retirados
    private void cargar() {
        try {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            dtmModel = (DefaultTableModel) tablaEntregados.getModel();
            CallableStatement cts = cn.prepareCall("SELECT * FROM Bodegas_finales");
            ResultSet result = cts.executeQuery();
            while(result.next()){
                Object dato[] = new Object[5];
                for(int i = 0; i<5; i++){
                    dato[i] = result.getInt(i+1);
                }
                dtmModel.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EgresoPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            login.Desconectar();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntregados = new javax.swing.JTable();
        txt2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Entrega de Paquetes:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaEntregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Nit:", "No. Ruta:", "No. Venta:", "No. Paquete:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEntregados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEntregadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEntregados);

        txt2.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("(Marca la casilla para marcar como entregado y finalizar la entrega).");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(txt2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 450, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEntregadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntregadosMouseClicked
        int fila = tablaEntregados.rowAtPoint(evt.getPoint());
        int nVenta = (Integer) (dtmModel.getValueAt(fila, 3));
        int nPaquete = (Integer) (dtmModel.getValueAt(fila, 4));
        int nNit = (Integer) (dtmModel.getValueAt(fila, 1));
        int nRuta = (Integer) (dtmModel.getValueAt(fila, 2));
        int paquetesEntregadosRuta = 0;
        int paquetesSistemaRuta = 0;
        int paquetesSistemaCliente = 0;
        int paqueteEntregadoCliente = 0;
        int nuevoPaqEntregadoRuta = 0;
        int nuevoPaqSistemaRuta = 0;
        int nuevoPaqCliente = 0;
        int nuevoPaqCliente2 = 0;
        login = new ConectorSesion();
        Connection cn = login.getConnection();
        String entregado = "DELETE FROM Bodegas_finales WHERE no_venta = ? AND no_paquete_venta = ?";
        String borrarRegistro = "DELETE FROM Registro_horas WHERE no_venta = ? AND no_paquete_venta = ?";
        String quitarPaqueteRuta = "UPDATE Rutas SET paquetes_en_sistema = ? WHERE id = ?";
        String paqueteEntRuta = "UPDATE Rutas SET paquetes_entregados = ? WHERE id = ?";
        String quitarPaqueteCliente = "UPDATE Clientes SET paquetes_en_sistema = ? WHERE nit = ?";
        String paqEntregadoCliente = "UPDATE Clientes SET paquetes_entregados = ? WHERE nit = ?";
        String busquedaRuta = "SELECT * FROM Rutas WHERE id = ?";
        String busquedaClientes = "SELECT * FROM Clientes WHERE nit = ?";
        try {
            dtmModel.removeRow(fila);            
            //busca los valores de la ruta para poder modificarlos
            PreparedStatement declaracionBusquedaRuta = cn.prepareStatement(busquedaRuta);
            declaracionBusquedaRuta.setInt(1, nRuta);
            ResultSet result = declaracionBusquedaRuta.executeQuery(); 
            while(result.next()){
                paquetesEntregadosRuta = result.getInt("paquetes_entregados");
                paquetesSistemaRuta = result.getInt("paquetes_en_sistema");
            }
            nuevoPaqEntregadoRuta = paquetesEntregadosRuta + 1;
            nuevoPaqSistemaRuta = paquetesSistemaRuta - 1;
            //busca los valores necesarios en la tabla clientes
            PreparedStatement declaracionBusquedaCliente = cn.prepareStatement(busquedaClientes);
            declaracionBusquedaCliente.setInt(1, nNit);
            ResultSet result2 = declaracionBusquedaCliente.executeQuery();
            while(result2.next()){
                paquetesSistemaCliente = result2.getInt("paquetes_en_sistema");
                paqueteEntregadoCliente = result2.getInt("paquetes_entregados");
                
            }
            nuevoPaqCliente = paquetesSistemaCliente - 1;
            nuevoPaqCliente2 = paqueteEntregadoCliente + 1;
            //modifica el valor de los paquetes en sistema en la tabla clientes
            PreparedStatement declaracionPaqCliente = cn.prepareStatement(quitarPaqueteCliente);
            declaracionPaqCliente.setInt(1, nuevoPaqCliente);
            declaracionPaqCliente.setInt(2, nNit);
            declaracionPaqCliente.execute();
            //modifica el valor de los paquetes entregados en la tabla clientes
            PreparedStatement decEntregadoCliente = cn.prepareStatement(paqEntregadoCliente);
            decEntregadoCliente.setInt(1, nuevoPaqCliente2);
            decEntregadoCliente.setInt(2, nNit);
            decEntregadoCliente.execute();
            //modifica el valor de los paquetes entregados en la tabla rutas 
            PreparedStatement declaracionPaqEntregado = cn.prepareStatement(paqueteEntRuta);
            declaracionPaqEntregado.setInt(1, nuevoPaqEntregadoRuta);
            declaracionPaqEntregado.setInt(2, nRuta);
            declaracionPaqEntregado.execute();
            //modifica el valor de los paquetes en sistema en la tabla rutas
            PreparedStatement declaracionPaqSistema = cn.prepareStatement(quitarPaqueteRuta);
            declaracionPaqSistema.setInt(1, nuevoPaqSistemaRuta);
            declaracionPaqSistema.setInt(2, nRuta);
            declaracionPaqSistema.execute();
            // quita el paquete de la bodega final
            PreparedStatement declaracionEntregado = cn.prepareStatement(entregado);
            declaracionEntregado.setInt(1, nVenta);
            declaracionEntregado.setInt(2, nPaquete);
            declaracionEntregado.execute();
            //quita el paquete del registro de horas
            PreparedStatement declaracionHoras = cn.prepareStatement(borrarRegistro);
            declaracionHoras.setInt(1, nVenta);
            declaracionHoras.setInt(2, nPaquete);
            declaracionHoras.execute();
            JOptionPane.showMessageDialog(null, "El paquete ha sido entregado con exito");
        } catch (SQLException ex) {
            Logger.getLogger(EgresoPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaEntregadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaEntregados;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
