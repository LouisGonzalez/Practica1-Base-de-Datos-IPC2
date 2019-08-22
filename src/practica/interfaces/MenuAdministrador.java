package practica.interfaces;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luisGonzalez
 */
public class MenuAdministrador extends javax.swing.JInternalFrame {

    private final ImageIcon nuevaRuta = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/flecha.jpg");
    private final ImageIcon punto = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/mas.png");
    private final ImageIcon rango = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/paquete.jpg");    
    private final ImageIcon eliminar = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/x-30465_960_720.png");
    private final ImageIcon imgUsuario = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/usuario.jpg");
    private final ImageIcon imgCuotas = new ImageIcon("/home/luisitopapurey/Escritorio/Practica 1 IPC2/Practica1 IPC2/src/practica/imagenes/dinero.jpg");
    private final String usuarios;
    
    public MenuAdministrador(String usuarios) {
        initComponents();
        this.usuarios = usuarios;
        Icon rutas = new ImageIcon(nuevaRuta.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        Icon puntosControl = new ImageIcon(punto.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        Icon paquetes = new ImageIcon(rango.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        Icon datosBorrados = new ImageIcon(eliminar.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        Icon borrarUsuario = new ImageIcon(imgUsuario.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        Icon cuota = new ImageIcon(imgCuotas.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        cuotas.setIcon(cuota);
        eliminarDatos.setIcon(datosBorrados);
        ruta.setIcon(rutas);
        puntoControl.setIcon(puntosControl);
        totalPaquete.setIcon(paquetes);
        usuario.setIcon(borrarUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        ruta = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        puntoControl = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        totalPaquete = new javax.swing.JLabel();
        eliminarDatos = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        aa1 = new javax.swing.JLabel();
        cuotas = new javax.swing.JLabel();
        txt8 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        txt10 = new javax.swing.JLabel();
        txt11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(51, 255, 51));

        ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ruta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutaMouseClicked(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt1.setForeground(new java.awt.Color(153, 0, 0));
        txt1.setText("Nueva Ruta.");

        puntoControl.setBackground(new java.awt.Color(255, 255, 255));
        puntoControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        puntoControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntoControlMouseClicked(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt2.setForeground(new java.awt.Color(153, 0, 0));
        txt2.setText("Crear puntos de control");

        txt3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt3.setForeground(new java.awt.Color(153, 0, 0));
        txt3.setText("a rutas existentes.");

        totalPaquete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalPaqueteMouseClicked(evt);
            }
        });

        eliminarDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eliminarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarDatosMouseClicked(evt);
            }
        });
        eliminarDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eliminarDatosKeyTyped(evt);
            }
        });

        txt4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt4.setForeground(new java.awt.Color(153, 0, 0));
        txt4.setText("Eliminar Datos.");

        txt5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt5.setForeground(new java.awt.Color(153, 0, 0));
        txt5.setText("Activar rutas o rango de");

        txt6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt6.setForeground(new java.awt.Color(153, 0, 0));
        txt6.setText("un punto de control");

        usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });

        txt7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt7.setForeground(new java.awt.Color(153, 0, 0));
        txt7.setText("Eliminar Usuarios.");

        cuotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuotasMouseClicked(evt);
            }
        });

        txt8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt8.setForeground(new java.awt.Color(153, 0, 0));
        txt8.setText("Modificar costo de");

        txt9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt9.setForeground(new java.awt.Color(153, 0, 0));
        txt9.setText("las tarifas.");

        txt10.setAutoscrolls(true);
        txt10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt10MouseClicked(evt);
            }
        });

        txt11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt11.setForeground(new java.awt.Color(153, 0, 0));
        txt11.setText("Reportes");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aa1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cuotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(eliminarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(puntoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(totalPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(txt8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt5))
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(aa1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt10, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(totalPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(puntoControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5)
                    .addComponent(txt1)
                    .addComponent(txt11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3)
                    .addComponent(txt6))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(eliminarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt4)
                        .addComponent(txt7))
                    .addComponent(txt8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutaMouseClicked
        NuevaRuta ruta = new NuevaRuta();
        MenuPrincipal.panelPadre.add(ruta);
        ruta.show();
    }//GEN-LAST:event_rutaMouseClicked

    private void puntoControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntoControlMouseClicked
        NuevoPuntoControl pControl = new NuevoPuntoControl();
        MenuPrincipal.panelPadre.add(pControl);
        pControl.show();
    }//GEN-LAST:event_puntoControlMouseClicked

    private void totalPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalPaqueteMouseClicked
        ModificadorTablas tabla = new ModificadorTablas();
        MenuPrincipal.panelPadre.add(tabla);
        tabla.show();
    }//GEN-LAST:event_totalPaqueteMouseClicked

    private void eliminarDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eliminarDatosKeyTyped
    }//GEN-LAST:event_eliminarDatosKeyTyped

    private void eliminarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarDatosMouseClicked
        EliminarDatos datoBorrado = new EliminarDatos();
        MenuPrincipal.panelPadre.add(datoBorrado);
        datoBorrado.show();
    }//GEN-LAST:event_eliminarDatosMouseClicked

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        EliminarUsuarios usuario = new EliminarUsuarios();
        MenuPrincipal.panelPadre.add(usuario);
        usuario.show();
    }//GEN-LAST:event_usuarioMouseClicked

    private void cuotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuotasMouseClicked
        MenuCuotas cuota = new MenuCuotas();
        MenuPrincipal.panelPadre.add(cuota);
        cuota.show();
    }//GEN-LAST:event_cuotasMouseClicked

    private void txt10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt10MouseClicked
        MenuReportes reportes = new MenuReportes();
        MenuPrincipal.panelPadre.add(reportes);
        reportes.show();
    }//GEN-LAST:event_txt10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aa1;
    private javax.swing.JLabel cuotas;
    private javax.swing.JLabel eliminarDatos;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel puntoControl;
    private javax.swing.JLabel ruta;
    private javax.swing.JLabel totalPaquete;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
