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
public class TercerReporte extends javax.swing.JInternalFrame {

    private ConectorSesion login;
    private DefaultTableModel dtmModel;
    private String dia, mes, anualidad;
    
    public TercerReporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        cajaDia = new javax.swing.JTextField();
        txt3 = new javax.swing.JLabel();
        cajaMes = new javax.swing.JTextField();
        txt4 = new javax.swing.JLabel();
        cajaAnualidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFechas = new javax.swing.JTable();
        buscador = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Rutas mas populares:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("Dia:");

        cajaDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaDiaKeyTyped(evt);
            }
        });

        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("Mes:");

        cajaMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaMesKeyTyped(evt);
            }
        });

        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("Año:");

        cajaAnualidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaAnualidadKeyTyped(evt);
            }
        });

        tablaFechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Ruta:", "Total Paquetes:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaFechas);

        buscador.setText("Buscar");
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaAnualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(cajaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3)
                    .addComponent(cajaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4)
                    .addComponent(cajaAnualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscador))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        if(cajaDia.getText().equals("") || cajaMes.getText().equals("") || cajaAnualidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llener todas las casillas para continuar");
        } else {
            dia = cajaDia.getText();
            mes = cajaMes.getText();
            anualidad = cajaAnualidad.getText();
            String fecha = dia+"-"+mes+"-"+anualidad;
            int ultimoId = 0;
            login = new ConectorSesion();
            Connection cn = login.getConnection();
            dtmModel = (DefaultTableModel) tablaFechas.getModel();
            Object[] fila = new Object[dtmModel.getColumnCount()];                    
            String idRuta = "SELECT * FROM Rutas ORDER BY id DESC LIMIT 1";
            String contadorRuta = "SELECT COUNT(*) FROM Registro_fechas WHERE no_ruta = ? AND fecha_ingreso = ?";
            try{
                PreparedStatement declaracionRuta = cn.prepareStatement(idRuta);
                ResultSet result = declaracionRuta.executeQuery();
                while(result.next()){
                    ultimoId = result.getInt("id");
                    int[] contPaquetes = new int[ultimoId+1];
                    int[] contPaquetes2 = new int[ultimoId+1];
                    for(int i = 1; i <=ultimoId; i++){
                        PreparedStatement declaracionContador = cn.prepareStatement(contadorRuta);
                        declaracionContador.setInt(1, i);
                        declaracionContador.setString(2, fecha);
                        ResultSet result2 = declaracionContador.executeQuery();
                        while(result2.next()){
                            contPaquetes[i] = result2.getInt("COUNT(*)");                            
                        }
                    }
                    // ciclo con el ordenamiento burbuja
                    ordenamientoBurbuja(contPaquetes);
                    //ciclo para ordenar descendentemente la lista
                    ordenamiento(cn, ultimoId, contadorRuta, fecha, contPaquetes2, contPaquetes, fila);
                    int filas = dtmModel.getRowCount();
                    //si hay mas de 3 rutas con paquetes en esa fecha que quite las filas de la tabla que sean de 3 para abajo
                    if(filas>3){
                        for(int i=filas-1; i>2; i--){
                            dtmModel.removeRow(i);
                        }
                    }           
                }
            } catch (SQLException ex) {
                Logger.getLogger(TercerReporte.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                login.Desconectar();
            }      
        } 
    }//GEN-LAST:event_buscadorActionPerformed
    
    private void ordenamientoBurbuja(int[] contPaquetes){
        for(int x = 1; x<contPaquetes.length-1; x++){
            for(int i=1; i<contPaquetes.length-1; i++){
                if(contPaquetes[i+1]>contPaquetes[i]){
                    int aux = contPaquetes[i+1];
                    contPaquetes[i+1] = contPaquetes[i];
                    contPaquetes[i] = aux;
                }
            }            
        }                   
    }
    
    private void ordenamiento(Connection cn, int ultimoId, String contadorRuta, String fecha, int[] contPaquetes2, int[] contPaquetes, Object[] fila) throws SQLException{
        boolean[] comprobante = new boolean[ultimoId+1];
        for(int i = 1; i<=ultimoId; i++){
            comprobante[i] = true;
            
        }
        for(int i=1; i<=ultimoId; i++){   
            //segundo ciclo para identificar el numero de ruta al que pertenece la cantidad de paquetes
            int cont = 0;
            for(int x=1; x<=ultimoId; x++){
                if(cont == 0){
                PreparedStatement comprobacion = cn.prepareStatement(contadorRuta);
                comprobacion.setInt(1, x);
                comprobacion.setString(2, fecha);
                ResultSet result2 = comprobacion.executeQuery();
                    while(result2.next()){
                        contPaquetes2[x] = result2.getInt("COUNT(*)");
                        if(comprobante[x] == true){                        
                            if(contPaquetes[i] == contPaquetes2[x]){
                                fila[0] = x;  
                                comprobante[x] = false;
                                cont = 1;
                            }
                        }                   
                    }          
                }
            }    
            // si la cantidad de  paquetes es mayor a 0 que los muestre en la tabla
            if(contPaquetes[i] != 0){
                fila[1] = contPaquetes[i];
                dtmModel.addRow(fila);
            }   
        }
    }
    
    
    private void cajaDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaDiaKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_cajaDiaKeyTyped

    private void cajaMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaMesKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_cajaMesKeyTyped

    private void cajaAnualidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaAnualidadKeyTyped
        char v = evt.getKeyChar();
        if(v<'0' || v>'9') evt.consume();
    }//GEN-LAST:event_cajaAnualidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscador;
    private javax.swing.JTextField cajaAnualidad;
    private javax.swing.JTextField cajaDia;
    private javax.swing.JTextField cajaMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaFechas;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    // End of variables declaration//GEN-END:variables
}
