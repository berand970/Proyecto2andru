
package proyecto2_andru_bernal;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class LogIn extends javax.swing.JFrame {

    
    private ArrayList<Usuarios> listaUsuarios;
   
    
    public LogIn(ArrayList<Usuarios> listaUsuarios) {
    this.listaUsuarios = listaUsuarios;
        
       initComponents();

        setLocationRelativeTo(null);
        
    }
    
    private Usuarios obtenerUsuarioPorNombre(String username) {
        for (Usuarios usuario : listaUsuarios) {
            if (usuario.getUser().equals(username)) {
            return usuario; 
        }
    }
    return null; 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username_lbl = new javax.swing.JLabel();
        username_txtfield = new javax.swing.JTextField();
        contrasena_lbl = new javax.swing.JLabel();
        contrasena_txtfield = new javax.swing.JTextField();
        loginentrar_btn = new javax.swing.JButton();
        Cerrarlogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        username_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_lbl.setText("Nombre");
        username_lbl.setToolTipText("");

        contrasena_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contrasena_lbl.setForeground(new java.awt.Color(51, 51, 51));
        contrasena_lbl.setText("Contraseña");

        loginentrar_btn.setText("Log In");
        loginentrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginentrar_btnActionPerformed(evt);
            }
        });

        Cerrarlogin.setText("Cerrar Juego");
        Cerrarlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarloginActionPerformed(evt);
            }
        });

        jButton1.setText("Crear Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrarlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(loginentrar_btn)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contrasena_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contrasena_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 193, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(251, 251, 251))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(username_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasena_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasena_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginentrar_btn)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(Cerrarlogin)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarloginActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarloginActionPerformed

    private void loginentrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginentrar_btnActionPerformed
         String username = username_txtfield.getText();
    String contrasena = contrasena_txtfield.getText();

    Usuarios usuarioActual = null; 

    boolean loginExitoso = false;

    
    for (Usuarios usuario : listaUsuarios) {
        if (usuario.verificarLogin(username, contrasena)) {
            loginExitoso = true;
            usuarioActual = usuario; 
            break;
        }
    }

    if (loginExitoso) {
        JOptionPane.showMessageDialog(this, "Bienvenido " + username);
        
        Principal menu = new Principal(listaUsuarios, usuarioActual);
        menu.setVisible(true);
        dispose(); 
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
    }
   
    }//GEN-LAST:event_loginentrar_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                          CrearCuenta crearCuentaWindow = new CrearCuenta(listaUsuarios); 
                    crearCuentaWindow.setVisible(true);
                    dispose(); 

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrarlogin;
    private javax.swing.JLabel contrasena_lbl;
    private javax.swing.JTextField contrasena_txtfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginentrar_btn;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_txtfield;
    // End of variables declaration//GEN-END:variables
}
