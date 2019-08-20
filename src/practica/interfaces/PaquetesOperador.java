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
        int paquetesActuales = 0;
        int rangoPaquetes = 0;
        int paqueteAnt = 0;
        int totalPaquete = 0;
        int totalPaqueteAnt = 0;
        int horasSistema = 0;
        int nuevaHora = 0;
        int noNit = 0;
        int costos = 0;
        int costosPaquete;
        int paqueteEntregado = 0;
        int paqueteSistema = 0;
        int costoPaquete = 0;
        int paqueteEntregado2;
        int paqueteSistema2;
        int costosCliente;
        int nuevoControl = pControl + 1;
        //Detecta si la casilla de horas no ha sido llenada con un valor
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
                String selectNit = "SELECT * FROM Paquetes WHERE no_venta = ? AND no_paquete_venta = ?";
                String cliente = "UPDATE Clientes SET costos_cliente = ? WHERE nit = ?";
                String modPunto = "UPDATE Puntos_control_ruta_? SET paquetes_actuales = ? WHERE id = ?";  
                String modPuntoAnt = "UPDATE Puntos_control_ruta_? SET paquetes_actuales = ? WHERE id = ?";
                String selectPunto = "SELECT * FROM Puntos_control_ruta_? WHERE id = ?";
                String selectPuntoAnt = "SELECT * FROM Puntos_control_ruta_? WHERE id = ?";
                String quitarPaquete = "DELETE FROM Paquetes WHERE no_venta = ? AND no_paquete_venta = ?";
                String paqueteCliente = "SELECT * FROM Clientes WHERE nit = ?";
                String nuevoDatoCliente = "UPDATE Clientes SET paquetes_entregados = ? WHERE nit = ?";
                String nuevoDatoCliente2 = "UPDATE Clientes SET paquetes_en_sistema = ? WHERE nit = ?";
                String buscarRegistro = "SELECT * FROM Registro_horas WHERE no_venta = ? AND no_paquete_venta = ?";
                String registroHoras = "UPDATE Registro_horas SET ttotal_horas = ? WHERE no_venta = ? AND no_paquete_venta = ?";
                                
                try {
                    PreparedStatement declaracionId = cn.prepareStatement(ultimoPunto);
                    declaracionId.setInt(1, ruta);
                    ResultSet result = declaracionId.executeQuery();
                        while(result.next()){
                        id = result.getInt("id");
                        if(nuevoControl<=id){
                            //busca el punto de control donde se encontrara el paquete
                            PreparedStatement declaracionBusquedaPunto = cn.prepareStatement(selectPunto);
                            declaracionBusquedaPunto.setInt(1, ruta);
                            declaracionBusquedaPunto.setInt(2, nuevoControl);
                            ResultSet result2 = declaracionBusquedaPunto.executeQuery();
                            //busca el punto de control donde se encuentra el paquete
                            PreparedStatement declaracionBusquedaAnt = cn.prepareStatement(selectPuntoAnt);
                            declaracionBusquedaAnt.setInt(1, ruta);
                            declaracionBusquedaAnt.setInt(2, pControl);
                            ResultSet result3 = declaracionBusquedaAnt.executeQuery(); 
                            //busca el nit de la persona que ordeno el paquete
                            PreparedStatement declaracionNit = cn.prepareStatement(selectNit);
                            declaracionNit.setInt(1, nVenta);
                            declaracionNit.setInt(2, nPaquete);
                            ResultSet result5 = declaracionNit.executeQuery();
                            //De la tabla clientes busca los datos debidos
                            PreparedStatement declaracionBusqueda = cn.prepareStatement(paqueteCliente);
                            declaracionBusqueda.setInt(1, noNit);
                            ResultSet result6 = declaracionBusqueda.executeQuery();
                            while(result6.next()){
                                paqueteEntregado = result6.getInt("paquetes_entregados");
                                paqueteSistema = result6.getInt("paquetes_en_sistema");
                                costoPaquete = result6.getInt("costos_cliente");
                            }
                            while(result5.next()){
                                noNit = result5.getInt("nit_persona");
                                }
                            //detecta el rango del punto de control donde sera agregado el paquete, ademas de eso tambien detecta la cantidad de paquetes que hay ahi justo en ese momento
                            while(result2.next()){
                                paquetesActuales = result2.getInt("paquetes_actuales");
                                rangoPaquetes = result2.getInt("paquetes_maximos");
                            }
                            //detecta la cantidad de paquetes que hay en el punto de control donde se encuentra el paquete justo ahora y tambien la cuota de operacion que posee ese punto de control
                            while(result3.next()){
                                paqueteAnt = result3.getInt("paquetes_actuales");
                                costos = result3.getInt("cuota_operacion");
                            }
                            totalPaquete = paquetesActuales + 1;
                            totalPaqueteAnt = paqueteAnt - 1;
                            //Revisa si el punto de control al que el paquete quiere ser agregado esta lleno en ese momento
                            if(totalPaquete>rangoPaquetes){
                                JOptionPane.showMessageDialog(null, "El punto de control se encuentra lleno, porfavor intenta mas tarde");
                            } else {
                                //a la tabla paquetes se le cambia el punto de control donde esta justo ahora
                                PreparedStatement declaracionPaquete = cn.prepareStatement(modPaquete);
                                declaracionPaquete.setInt(1, nuevoControl);
                                declaracionPaquete.setInt(2, nVenta);
                                declaracionPaquete.setInt(3, nPaquete);
                                declaracionPaquete.execute();
                                //agrega el paquete al nuevo punto de control al que se envia
                                PreparedStatement declaracionModPunto = cn.prepareStatement(modPunto);
                                declaracionModPunto.setInt(1, ruta);
                                declaracionModPunto.setInt(2, totalPaquete);
                                declaracionModPunto.setInt(3, nuevoControl);
                                declaracionModPunto.execute();
                                //quita el paquete del punto de control del que acaba de salir
                                PreparedStatement declaracionModPuntoAnt = cn.prepareStatement(modPuntoAnt);
                                declaracionModPuntoAnt.setInt(1, ruta);
                                declaracionModPuntoAnt.setInt(2, totalPaqueteAnt);
                                declaracionModPuntoAnt.setInt(3, pControl);
                                declaracionModPuntoAnt.execute();
                                //agrega el paquete a la tabla de registro_horas para registrar cuanto tiempo estuvo en un punto de control
                                PreparedStatement declaracionBusqRegistro = cn.prepareStatement(buscarRegistro);
                                declaracionBusqRegistro.setInt(1, nVenta);
                                declaracionBusqRegistro.setInt(2, nPaquete);
                                ResultSet result4 = declaracionBusqRegistro.executeQuery();
                                while(result4.next()){
                                    horasSistema = result4.getInt("ttotal_horas");
                                }
                                nuevaHora = horasSistema + totalHoras;
                                //Actualiza el total de horas en el sistema
                                PreparedStatement declaracionHoras = cn.prepareStatement(registroHoras);
                                declaracionHoras.setInt(1, nuevaHora);
                                declaracionHoras.setInt(2, nVenta);
                                declaracionHoras.setInt(3, nPaquete);
                                declaracionHoras.execute();
                                //agrega a la tabla clientes el costo que le ha costado a la empresa que su paquete este ahi
                                costosPaquete = totalHoras * costos;
                                costosCliente = costoPaquete + costosPaquete;
                                PreparedStatement declaracionCliente = cn.prepareStatement(cliente);
                                declaracionCliente.setInt(1, costosCliente);
                                declaracionCliente.setInt(2, noNit);
                                declaracionCliente.execute();
                            }
                        } else {        
                            //busca el nit de la persona que ordeno el paquete
                            PreparedStatement declaracionNit = cn.prepareStatement(selectNit);
                            declaracionNit.setInt(1, nVenta);
                            declaracionNit.setInt(2, nPaquete);
                            ResultSet result5 = declaracionNit.executeQuery();
                            while(result5.next()){
                                noNit = result5.getInt("nit_persona");
                            }
                            //busca el punto de control donde se encuentra el paquete
                            PreparedStatement declaracionBusquedaAnt = cn.prepareStatement(selectPuntoAnt);
                            declaracionBusquedaAnt.setInt(1, ruta);
                            declaracionBusquedaAnt.setInt(2, pControl);
                            ResultSet result3 = declaracionBusquedaAnt.executeQuery(); 
                            //detecta la cantidad de paquetes que hay en el punto de control donde se encuentra el paquete justo ahora y tambien la cuota de operacion que posee ese punto de control
                            while(result3.next()){
                                paqueteAnt = result3.getInt("paquetes_actuales");
                                costos = result3.getInt("cuota_operacion");
                            }
                            totalPaqueteAnt = paqueteAnt - 1;
                            //quita el paquete del punto de control del que acaba de salir
                            PreparedStatement declaracionModPuntoAnt = cn.prepareStatement(modPuntoAnt);
                            declaracionModPuntoAnt.setInt(1, ruta);
                            declaracionModPuntoAnt.setInt(2, totalPaqueteAnt);
                            declaracionModPuntoAnt.setInt(3, pControl);
                            declaracionModPuntoAnt.execute();
                            //agrega el paquete a la tabla de registro_horas para registrar cuanto tiempo estuvo en un punto de control
                            PreparedStatement declaracionBusqRegistro = cn.prepareStatement(buscarRegistro);
                            declaracionBusqRegistro.setInt(1, nVenta);
                            declaracionBusqRegistro.setInt(2, nPaquete);
                            ResultSet result4 = declaracionBusqRegistro.executeQuery();
                            while(result4.next()){
                                horasSistema = result4.getInt("ttotal_horas");
                            }
                            nuevaHora = horasSistema + totalHoras;
                            //Actualiza el total de horas en el sistema
                            PreparedStatement declaracionHoras = cn.prepareStatement(registroHoras);
                            declaracionHoras.setInt(1, nuevaHora);
                            declaracionHoras.setInt(2, nVenta);
                            declaracionHoras.setInt(3, nPaquete);
                            declaracionHoras.execute();
                            //agrega el paquete a la bodega final donde ya solo espera que el usuario final vaya por el    
                            String bodegaFinal = "INSERT INTO Bodegas_finales VALUES ('"+0+"','"+noNit+"','"+ruta+"','"+nVenta+"','"+nPaquete+"')";                                
                            PreparedStatement declaracionFinal = cn.prepareStatement(bodegaFinal);
                            declaracionFinal.execute();
                            //De la tabla clientes busca los datos debidos
                            PreparedStatement declaracionBusqueda = cn.prepareStatement(paqueteCliente);
                            declaracionBusqueda.setInt(1, noNit);
                            ResultSet result6 = declaracionBusqueda.executeQuery();
                            while(result6.next()){
                                paqueteEntregado = result6.getInt("paquetes_entregados");
                                paqueteSistema = result6.getInt("paquetes_en_sistema");
                                costoPaquete = result6.getInt("costos_cliente");
                            }
                            //quita el paquete de la tabla paquetes debido a que ya esta en su destino
                            PreparedStatement declaracionPaquete = cn.prepareStatement(quitarPaquete);
                            declaracionPaquete.setInt(1, nVenta);
                            declaracionPaquete.setInt(2, nPaquete);
                            declaracionPaquete.execute();
                            //agrega a la tabla clientes el costo que le ha costado a la empresa que su paquete este ahi
                            costosPaquete = totalHoras * costos;
                            costosCliente = costoPaquete + costosPaquete;
                            PreparedStatement declaracionCliente = cn.prepareStatement(cliente);
                            declaracionCliente.setInt(1, costosCliente);
                            declaracionCliente.setInt(2, noNit);
                            declaracionCliente.execute();
                            
                            paqueteEntregado2 = paqueteEntregado + 1;
                            paqueteSistema2 = paqueteSistema - 1;
                            

                            //Quita el paquete de la columna paquetes_en_sistema de la tabla clientes
                            /*PreparedStatement declaracionSistema = cn.prepareStatement(nuevoDatoCliente2);
                            declaracionSistema.setInt(1, paqueteSistema2);
                            declaracionSistema.setInt(2, noNit);
                            declaracionSistema.execute();*/
                            //REVISAR ESTA PARTE QUE HAY QUE VER PORQUE EN LA TABLA DE ENTREGA DE PAQUETES REPITES EL QUITAR EL PAQUETE DEL SISTEMA ENTONCES TECNICAMENTE SE QUITA DOS VECES 
                            
                            
                            
                            
                           
                            
                            //Agrega el paquete a la columna paquetes_entregados de la tabla clientes
                            PreparedStatement declaracionEntregado = cn.prepareStatement(nuevoDatoCliente);
                            declaracionEntregado.setInt(1, paqueteEntregado2);
                            declaracionEntregado.setInt(2, noNit);
                            declaracionEntregado.execute();
                        }   
                    }    
                } catch (SQLException ex) {
                    Logger.getLogger(PaquetesOperador.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    login.Desconectar();
                }
            }
        } else {
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
