package proyecto2_andru_bernal;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private ArrayList<Usuarios> listaUsuarios;
    private Usuarios usuarioActual;
    
    
    public Principal(ArrayList<Usuarios> listaUsuarios, Usuarios usuarioActual) {
        
        this.listaUsuarios = listaUsuarios;
        this.usuarioActual = usuarioActual;
        
       initComponents();

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nuevapartida_btn = new javax.swing.JButton();
        micuenta_btn = new javax.swing.JButton();
        reportes_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nuevapartida_btn.setText("Jugar");
        nuevapartida_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevapartida_btnActionPerformed(evt);
            }
        });

        micuenta_btn.setText("Mi Cuenta");
        micuenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micuenta_btnActionPerformed(evt);
            }
        });

        reportes_btn.setText("Reportes");
        reportes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportes_btnActionPerformed(evt);
            }
        });

        logout_btn.setText("Cerrar Sesion");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(reportes_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(262, 262, 262))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nuevapartida_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(micuenta_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(nuevapartida_btn)
                .addGap(48, 48, 48)
                .addComponent(micuenta_btn)
                .addGap(50, 50, 50)
                .addComponent(reportes_btn)
                .addGap(41, 41, 41)
                .addComponent(logout_btn)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void micuenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micuenta_btnActionPerformed
        Yo miCuentaWindow = new Yo(listaUsuarios, usuarioActual);
        miCuentaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_micuenta_btnActionPerformed

    private void reportes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportes_btnActionPerformed
         
    JDialog dialogoReportes = new JDialog(this, "Reportes", true);
    dialogoReportes.setSize(400, 300);
    dialogoReportes.setLocationRelativeTo(this);
    dialogoReportes.setLayout(new BorderLayout());

    
    JButton btnRanking = new JButton("Ranking de Jugadores");
    JButton btnLogPartidos = new JButton("Log de Mis Últimos Partidos");

    
    btnRanking.addActionListener(e -> {
        
        mostrarRankingJugadores();
        
        dialogoReportes.dispose();
    });

    btnLogPartidos.addActionListener(e -> {
        
        mostrarLogPartidos();
        
        dialogoReportes.dispose();
    });
    
    JPanel panelBotones = new JPanel();
    panelBotones.setLayout(new GridLayout(2, 1, 10, 10));
    panelBotones.add(btnRanking);
    panelBotones.add(btnLogPartidos);

    dialogoReportes.add(panelBotones, BorderLayout.CENTER);

    dialogoReportes.setVisible(true);
}

private void mostrarRankingJugadores() {
    
    JDialog dialogoRanking = new JDialog(this, "Ranking", true);
    dialogoRanking.setSize(700, 500);
    dialogoRanking.setLocationRelativeTo(this);
    dialogoRanking.setLayout(new BorderLayout());

    DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Posicin", "Usuario", "Puntos"}, 0);
    JTable tablaRanking = new JTable(modeloTabla);

    listaUsuarios.sort((u1, u2) -> Integer.compare(u2.getPuntos(), u1.getPuntos()));

    int posicion = 1;
    for (Usuarios usuario : listaUsuarios) {
        modeloTabla.addRow(new Object[]{posicion++, usuario.getUser(), usuario.getPuntos()});
    }

    JButton btnVolver = new JButton("Volver");
    btnVolver.addActionListener(e -> {
        dialogoRanking.dispose(); 
        Principal menu = new Principal(listaUsuarios, usuarioActual);
        menu.setVisible(true); 
        dispose();
    });

    dialogoRanking.add(new JScrollPane(tablaRanking), BorderLayout.CENTER);
    dialogoRanking.add(btnVolver, BorderLayout.SOUTH); // Agregar el botón al sur

    dialogoRanking.setVisible(true);
}

private void mostrarLogPartidos() {
    
    JDialog dialogoLog = new JDialog(this, "Ultimos Juegos", true);
    dialogoLog.setSize(500, 400);
    dialogoLog.setLocationRelativeTo(this); 

    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    JList<String> listaPartidos = new JList<>(modeloLista);

    ArrayList<InfJuego> partidasRecientes = usuarioActual.getPartidasRecientes();
    
    partidasRecientes.sort((p1, p2) -> p2.getFecha().compareTo(p1.getFecha()));

    for (InfJuego partida : partidasRecientes) {
        String resultado = partida.getResultado(); 
        String oponente = partida.getOponente(); 
        String detalles = String.format("Partido contra %s - Resultado: %s", oponente, resultado);
        modeloLista.addElement(detalles);
    }

    dialogoLog.add(new JScrollPane(listaPartidos), BorderLayout.CENTER);

    JButton btnVolver = new JButton("Volver");
    btnVolver.addActionListener(e -> dialogoLog.dispose());
    dialogoLog.add(btnVolver, BorderLayout.SOUTH);

    btnVolver.addActionListener(e -> {
        dialogoLog.dispose(); 
        Principal menu = new Principal(listaUsuarios, usuarioActual);
        menu.setVisible(true);
        dispose();
    });
    
    dialogoLog.setVisible(true);


    }//GEN-LAST:event_reportes_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        LogIn loginWindow = new LogIn(listaUsuarios);
        loginWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btnActionPerformed

    private void nuevapartida_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevapartida_btnActionPerformed
        
         JDialog dialogoJugadores = new JDialog(this, "Seleccionar Jugador", true);
        dialogoJugadores.setSize(500, 500);
        dialogoJugadores.setLocationRelativeTo(this);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (Usuarios usuario : listaUsuarios) {
            if (!usuario.getUser().equals(usuarioActual.getUser())) { 
                modeloLista.addElement(usuario.getUser());
            }
        }

        JList<String> listaJugadores = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(listaJugadores);

        JButton btnSeleccionar = new JButton("Seleccionar");
        btnSeleccionar.addActionListener(e -> {
            String jugadorSeleccionado = listaJugadores.getSelectedValue();
            if (jugadorSeleccionado != null) {
                Usuarios oponente = buscarUsuarioRecursivo(listaUsuarios, jugadorSeleccionado, 0);
                if (oponente != null) {
                    Tablero tablero = new Tablero(listaUsuarios, usuarioActual, oponente);
                    tablero.setVisible(true);
                    dialogoJugadores.dispose();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(dialogoJugadores, "El jugador no existe");
                }
            } else {
                JOptionPane.showMessageDialog(dialogoJugadores, "Sleccionar un rival");
            }
        });

        dialogoJugadores.setLayout(new BorderLayout());
        dialogoJugadores.add(scrollPane, BorderLayout.CENTER);
        dialogoJugadores.add(btnSeleccionar, BorderLayout.SOUTH);

        dialogoJugadores.setVisible(true);
    
    }//GEN-LAST:event_nuevapartida_btnActionPerformed
     //recursividad
    private Usuarios buscarUsuarioRecursivo(ArrayList<Usuarios> usuarios, String nombre, int index) {
    
    if (index >= usuarios.size()) {
        return null;
    }
    
    if (usuarios.get(index).getUser().equals(nombre)) {
        return usuarios.get(index);
    }
    
    return buscarUsuarioRecursivo(usuarios, nombre, index + 1);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton micuenta_btn;
    private javax.swing.JButton nuevapartida_btn;
    private javax.swing.JButton reportes_btn;
    // End of variables declaration//GEN-END:variables
}
