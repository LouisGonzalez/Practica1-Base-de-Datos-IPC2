package practica.interfaces;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practica.clases.ConectorSesion;

/**
 *
 * @author luisGonzalez
 */
public class NuevaRuta extends javax.swing.JInternalFrame {
    
    ConectorSesion login;
    private String destinos, op;
    private final String estadoRuta = "ACTIVADA";
    
    public NuevaRuta() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        fondo2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        ciudades = new javax.swing.JComboBox<>();
        guardarDatos = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        operador = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        fondo2.setBackground(new java.awt.Color(51, 255, 51));

        txt1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 102));
        txt1.setText("Nueva Ruta:");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt3.setForeground(new java.awt.Color(0, 0, 102));
        txt3.setText("Destino de la Ruta:");

        ciudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nueva York (Estados Unidos)", "Londres (Reino Unido)", "Paris (Francia)", "Tokio (Japon)", "Hong Kong (China)", "Singapur (Singapur)", "Los Angeles (Estados Unidos)", "Chicago (Estados Unidos)", "Pekin (China)", "Washington D.C. (Estados Unidos)", "Madrid (España)", "Buenos Aires (Argentina)", "Rio de Janeiro (Brasil)", "Berlin (Alemania)", "Bogota (Colombia)", "Roma (Italia)" }));

        guardarDatos.setText("Confirmar");
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 102));
        txt2.setText("(Por defecto una ruta establece un punto de control");

        txt4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 102));
        txt4.setText("predeterminado, nombre al operador a cargo de este");

        txt5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        txt5.setForeground(new java.awt.Color(0, 0, 102));
        txt5.setText("punto de control).");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operador, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3)
                    .addComponent(ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(guardarDatos)
                .addGap(47, 47, 47))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
        if(operador.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla para continuar");
        } else {
            login =  new ConectorSesion();
            Connection cn = login.getConnection();
            destinos = ciudades.getSelectedItem().toString();
            op = operador.getText();
            String captura = "";
            String captura2 ="";
            int valor = 0;
            String sql = "SELECT * FROM Usuarios WHERE nickname = ?";
            String rs = "SELECT * FROM Rutas ORDER BY id DESC LIMIT 1";
            String cuota = "SELECT * FROM Cuotas WHERE id = 1";
            try {
                Statement estado = cn.createStatement();
                PreparedStatement declaracionPreparada = cn.prepareStatement(sql);
                declaracionPreparada.setString(1, op);
                ResultSet result2 = declaracionPreparada.executeQuery();
                while(result2.next()){
                    captura = result2.getString("tipo_usuario");
                }
                ResultSet result3 = estado.executeQuery(cuota);
                while(result3.next()){
                    valor = result3.getInt("total");
                }
                if(captura.equals("Operador")){
                    estado.executeUpdate("INSERT INTO Rutas VALUES('"+0+"','"+1+"','"+destinos+"','"+estadoRuta+"')");
                    ResultSet res = estado.executeQuery(rs);
                    while(res.next()){
                        captura2 = res.getString("id"); 
                    }
                    JOptionPane.showMessageDialog(null, captura2);
                    estado.executeUpdate("CREATE TABLE Puntos_control_ruta_"+captura2+" (id INT AUTO_INCREMENT PRIMARY KEY, paquetes_actuales INT, paquetes_maximos INT, operador_al_mando VARCHAR(40), cuota_operacion VARCHAR(40), FOREIGN KEY (operador_al_mando) REFERENCES Usuarios (nickname) );");
                    estado.executeUpdate("INSERT INTO Puntos_control_ruta_"+captura2+" VALUES('"+0+"','"+0+"','"+5+"','"+op+"','"+valor+"')");
                    JOptionPane.showMessageDialog(null, "La ruta ha sido agregada con exito");                    
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario que usted busca no es un operador");
                }
            } catch (SQLException ex) {
                Logger.getLogger(NuevaRuta.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                login.Desconectar();
            }
        }    
    }//GEN-LAST:event_guardarDatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ciudades;
    private javax.swing.JPanel fondo2;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JTextField operador;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
}
