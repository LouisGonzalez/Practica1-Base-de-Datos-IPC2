package practica.interfaces;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica.clases.ConectorSesion;

/**
 *
 * @author luisGonzalez
 */
public class NuevoPuntoControl extends javax.swing.JInternalFrame {

    ConectorSesion login;
    private int id, puntos;
    private DefaultTableModel dtmModel;
    private int cont = 0;
    
    public NuevoPuntoControl() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        fondo2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        idRuta = new javax.swing.JTextField();
        verificador = new javax.swing.JButton();
        fondo3 = new javax.swing.JPanel();
        txt2 = new javax.swing.JLabel();
        pControl = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPControl = new javax.swing.JTable();
        txt3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        fondo2.setBackground(new java.awt.Color(51, 255, 51));

        titulo.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 102));
        titulo.setText("Puntos de Control:");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("ID Ruta a usar:");

        idRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idRutaKeyTyped(evt);
            }
        });

        verificador.setText("Verificar existencia Ruta");
        verificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificadorActionPerformed(evt);
            }
        });

        fondo3.setBackground(new java.awt.Color(204, 255, 255));
        fondo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("No. Puntos de Control a ser agregados:");

        pControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pControlKeyTyped(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        tablaPControl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Paquetes Maximos::", "Operador:", "Cuota Operacion:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPControl);

        txt3.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("(En la tabla se muestran todos los puntos de control que posee la ruta que usted mando a llamar).");

        javax.swing.GroupLayout fondo3Layout = new javax.swing.GroupLayout(fondo3);
        fondo3.setLayout(fondo3Layout);
        fondo3Layout.setHorizontalGroup(
            fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo3Layout.createSequentialGroup()
                .addGroup(fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondo3Layout.createSequentialGroup()
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pControl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(fondo3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        fondo3Layout.setVerticalGroup(
            fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(pControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verificador, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(fondo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificador))
                .addGap(18, 18, 18)
                .addComponent(fondo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idRutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idRutaKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_idRutaKeyTyped

    private void pControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pControlKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_pControlKeyTyped

    private void verificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificadorActionPerformed
        if(idRuta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla de indicada para continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            id = Integer.parseInt(idRuta.getText());
            String captura = "";
            //busca la ruta que ha sido ingresada
            String sql = "SELECT * FROM Rutas WHERE id = ?";
            try{
                PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                declaracionPreparada.setInt(1, id);
                ResultSet result = declaracionPreparada.executeQuery();
                //si la ruta existe carga los datos de la tabla de sus puntos de control
                if(result.next()){
                    captura = result.getString("id");
                    cargarTabla(cn, id);
                } else {
                    JOptionPane.showMessageDialog(null, "No encontrado");
                }            
            } catch (SQLException ex) {
                Logger.getLogger(NuevoPuntoControl.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                login.Desconectar();
            }
        }    
    }//GEN-LAST:event_verificadorActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if(idRuta.getText().equals("") || pControl.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar todas las casillas para continuar");
        } else {
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            id = Integer.parseInt(idRuta.getText());
            puntos = Integer.parseInt(pControl.getText());
            String captura = "";
            String estadoActual = "";
            String sql = "SELECT * FROM Rutas WHERE id = ?";
            try{
                Statement estado = cn.createStatement();
                PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                declaracionPreparada.setInt(1, id);
                ResultSet result = declaracionPreparada.executeQuery();
                while(result.next()){
                    captura = result.getString("no_puntos_control");
                    estadoActual = result.getString("estado");
                }             
                if(estadoActual.equals("DESACTIVADA")){
                    JOptionPane.showMessageDialog(null, "Esta ruta se encuentra desactivada por el momento, activala antes de seguir con el proceso");
                } else {
                    int total = Integer.parseInt(captura)+puntos;
                    //modifica en la tabla Rutas el numero de puntos de control que existen
                    String nuevoValor = "UPDATE Rutas SET no_puntos_control='"+total+"' WHERE id='"+id+"'";
                    estado.executeUpdate(nuevoValor);
                    //debido a que cada punto de control debe estar a cargo de un operador, ciclo que se encarga de mostrar los frames necesarios para agregar operadores segun la cantidad de puntos de control que vayan a ser agregados 
                    for(int i=puntos; i>0; i--){
                        int suma = Integer.parseInt(captura)+i;
                        OperadorPControl pControl = new OperadorPControl(suma, id, dtmModel, tablaPControl);
                        MenuPrincipal.panelPadre.add(pControl);
                        pControl.show();
                    }   
                }
            } catch (SQLException ex) {
                Logger.getLogger(NuevoPuntoControl.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "no encontrado  ");
            } finally{
                login.Desconectar();
            }
        }    
    }//GEN-LAST:event_agregarActionPerformed

    private void cargarTabla(Connection cn, int id) throws SQLException{
       cont++;
       if(cont == 1){
           tabla(cn);
       } else {
        for(int i = dtmModel.getRowCount()-1; i>=0; i--){
            dtmModel.removeRow(i);
        }
        tabla(cn);
        }    
    }
    
    //metodo encargado de mostrar los datos necesarios en tabla
    private void tabla(Connection cn) throws SQLException{
        dtmModel = (DefaultTableModel) tablaPControl.getModel();            
        String sql = "SELECT * FROM Puntos_control_ruta_?";
        PreparedStatement declaracionTabla = cn.prepareStatement(sql);
        declaracionTabla.setInt(1, id);
        ResultSet result = declaracionTabla.executeQuery();
        while(result.next()){
            Object[] dato = new Object[4];
            dato[0] = result.getInt(1);
            dato[1] = result.getInt(3);
            dato[2] = result.getString(4);
            dato[3] = result.getInt(5);
            dtmModel.addRow(dato);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JPanel fondo2;
    private javax.swing.JPanel fondo3;
    private javax.swing.JTextField idRuta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pControl;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaPControl;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JButton verificador;
    // End of variables declaration//GEN-END:variables
}
