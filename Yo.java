
package proyecto2_andru_bernal;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Yo extends javax.swing.JFrame {

    
   
    private Usuarios Usuariolog;
    private ArrayList<Usuarios> lUsuario;
    
    public Yo(ArrayList<Usuarios> listaUsuarios, Usuarios usuarioActual) {
        initComponents();
        this.lUsuario = listaUsuarios;
        this.Usuariolog = usuarioActual;
        setLocationRelativeTo(null);
        mostrarDatosUsuario();
    }
    
    private void mostrarDatosUsuario() {
    name.setText(Usuariolog.getUser());
    Fecha.setText(Usuariolog.getFechaIngreso().toString());
    status.setText(Usuariolog.isActivo() ? "Activo" : "Inactivo");
    cantidadpuntos.setText(String.valueOf(Usuariolog.getPuntos())); 
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username_lbl = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        fechaingreso_lbl = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        cantidadpuntos = new javax.swing.JLabel();
        Puntos_lbl = new javax.swing.JLabel();
        cambiarcontrasena_btn = new javax.swing.JButton();
        borrarcuenta_btn = new javax.swing.JButton();
        volvermenu_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        username_lbl.setText("Jugador");
        username_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name.setText(".");
        name.setBorder(new javax.swing.border.MatteBorder(null));

        fechaingreso_lbl.setText("Fecha ingreso:");

        Fecha.setText(".");
        Fecha.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Estado:");

        status.setBorder(new javax.swing.border.MatteBorder(null));

        cantidadpuntos.setBorder(new javax.swing.border.MatteBorder(null));

        Puntos_lbl.setText("Puntos:");

        cambiarcontrasena_btn.setText("Cambiar contraseña");
        cambiarcontrasena_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarcontrasena_btnActionPerformed(evt);
            }
        });

        borrarcuenta_btn.setText("Eliminar Cuenta");
        borrarcuenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarcuenta_btnActionPerformed(evt);
            }
        });

        volvermenu_btn.setText("Atras");
        volvermenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volvermenu_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Puntos_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaingreso_lbl)
                            .addComponent(username_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cantidadpuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(cambiarcontrasena_btn)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(volvermenu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(borrarcuenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_lbl)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaingreso_lbl)
                    .addComponent(Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cambiarcontrasena_btn)
                    .addComponent(Puntos_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(cantidadpuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volvermenu_btn)
                    .addComponent(borrarcuenta_btn))
                .addGap(129, 129, 129))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volvermenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volvermenu_btnActionPerformed
        
        Principal menu = new Principal(lUsuario, Usuariolog);
        menu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_volvermenu_btnActionPerformed

    private void cambiarcontrasena_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarcontrasena_btnActionPerformed
        
        boolean contrasenaCorrecta = false;

    while (!contrasenaCorrecta) {
       
        String passwordActual = JOptionPane.showInputDialog(this, "Ingrese su contraseña (ACTUAL)");

        if (passwordActual == null) {
            JOptionPane.showMessageDialog(this, "Operacion cancelada");
            
            Yo miCuentaWindow = new Yo(lUsuario, Usuariolog);
            miCuentaWindow.setVisible(true);
            dispose(); 
            return; 
        }

        if (!Usuariolog.getContrasena().equals(passwordActual)) {
            JOptionPane.showMessageDialog(this, "Contraseña actual incorrecta, vuelva a inetentar denuevo.");
        } else {
            contrasenaCorrecta = true; 
        }
    }

    boolean nuevaContrasenaValida = false; 

    while (!nuevaContrasenaValida) {
        
        String nuevaContrasena = JOptionPane.showInputDialog(this, "Ingrese su nueva contraseña [5 caracteres]:");

        if (nuevaContrasena == null) {
            JOptionPane.showMessageDialog(this, "Operacion cancelada.");
            Yo miCuentaWindow = new Yo(lUsuario, Usuariolog);
            miCuentaWindow.setVisible(true);
            dispose(); 
            return; 
        }

        if (nuevaContrasena.length() != 5) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña debe tener exactamente 5 caracteres.");
            continue; 
        }

        if (nuevaContrasena.equals(Usuariolog.getContrasena())) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña no puede ser igual a la contraseña actual");
            continue; // 
        }

        Usuariolog.setContrasena(nuevaContrasena);
        nuevaContrasenaValida = true; 
    }

    JOptionPane.showMessageDialog(this, "Contraseña cambiada exitosamente.");

    Yo miCuentaWindow = new Yo(lUsuario, Usuariolog);
    miCuentaWindow.setVisible(true); 

    dispose();
    }//GEN-LAST:event_cambiarcontrasena_btnActionPerformed

    private void borrarcuenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarcuenta_btnActionPerformed
    boolean contrasenaCorrecta = false;

    while (!contrasenaCorrecta) {
        
        String passwordActual = JOptionPane.showInputDialog(this, "Ingrese su contraseña actual para confirmar la eliminación de la cuenta:");

        if (passwordActual == null || passwordActual.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Operacion cancelada.");
            return; 
        }

        if (!Usuariolog.getContrasena().equals(passwordActual)) {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta. Intente de nuevo.");
        } else {
            contrasenaCorrecta = true; 
        }
    }

    int confirmacion = JOptionPane.showConfirmDialog(this, "Seguro desea eliminar su cuenta?", "Confirmacion", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        
        lUsuario.remove(Usuariolog);
        
        JOptionPane.showMessageDialog(this, "Su cuenta fue eliminada exitosamente");

       
        LogIn loginWindow = new LogIn(lUsuario); 
        loginWindow.setVisible(true);

        dispose();
    }
    }//GEN-LAST:event_borrarcuenta_btnActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Puntos_lbl;
    private javax.swing.JButton borrarcuenta_btn;
    private javax.swing.JButton cambiarcontrasena_btn;
    private javax.swing.JLabel cantidadpuntos;
    private javax.swing.JLabel fechaingreso_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel status;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JButton volvermenu_btn;
    // End of variables declaration//GEN-END:variables
}
