/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.Color;
import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static proyecto.ListaUsers.*;

/**
 *
 * @author manugr
 */
public class login extends javax.swing.JFrame {
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());

    //METODOS
    public static void nuevomodel(){
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("administrador");
        for (int i = 0; i < UsuariosLista.size(); i++){
            modelo.addElement(UsuariosLista.get(i).Usuario.toString());
        }
        USER.setModel(modelo); 
    }
    
    public login() {
        initComponents();
        
        LOGO.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Pollo.png")));
        nuevomodel();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        loginPanel = new javax.swing.JPanel();
        Plog = new javax.swing.JPanel();
        PinicLogo = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        lblContraseña = new javax.swing.JLabel();
        PinicioSesion = new javax.swing.JPanel();
        lblint = new javax.swing.JLabel();
        USER = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOS POLLOS HERMANOS");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(null);

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Plog.setBackground(new java.awt.Color(255, 255, 255));
        Plog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PinicLogo.setBackground(new java.awt.Color(255, 204, 102));

        LOGO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PinicLogoLayout = new javax.swing.GroupLayout(PinicLogo);
        PinicLogo.setLayout(PinicLogoLayout);
        PinicLogoLayout.setHorizontalGroup(
            PinicLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinicLogoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        PinicLogoLayout.setVerticalGroup(
            PinicLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinicLogoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        Plog.add(PinicLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -10, 460, 581));

        lblUser.setFont(new java.awt.Font("Mingzat", 1, 18)); // NOI18N
        lblUser.setText("Usuario");
        Plog.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 153, 36));

        Contraseña.setForeground(new java.awt.Color(153, 153, 153));
        Contraseña.setText("*Contraseña");
        Contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContraseñaFocusLost(evt);
            }
        });
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraseñaMousePressed(evt);
            }
        });
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        Plog.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 308, 35));

        lblContraseña.setFont(new java.awt.Font("Mingzat", 1, 18)); // NOI18N
        lblContraseña.setText("Contraseña");
        Plog.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 121, 25));

        PinicioSesion.setBackground(new java.awt.Color(255, 204, 102));
        PinicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PinicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PinicioSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PinicioSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PinicioSesionMousePressed(evt);
            }
        });

        lblint.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 15)); // NOI18N
        lblint.setText("Iniciar Sesion");
        lblint.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblintMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblintMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PinicioSesionLayout = new javax.swing.GroupLayout(PinicioSesion);
        PinicioSesion.setLayout(PinicioSesionLayout);
        PinicioSesionLayout.setHorizontalGroup(
            PinicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinicioSesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblint)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PinicioSesionLayout.setVerticalGroup(
            PinicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblint, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        Plog.add(PinicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        USER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador" }));
        Plog.add(USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 300, 30));

        loginPanel.add(Plog, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 844, 540));

        getContentPane().add(loginPanel);
        loginPanel.setBounds(-4, -4, 850, 540);

        setBounds(0, 0, 843, 568);
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaFocusLost
        if(String.valueOf(Contraseña.getPassword()).isEmpty()){
            Contraseña.setText("*Contraseña");
            Contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ContraseñaFocusLost

    private void ContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMousePressed
     if(String.valueOf(Contraseña.getPassword()).equals("*Contraseña")){   
        Contraseña.setText("");
        Contraseña.setForeground(Color.black);
     }
    }//GEN-LAST:event_ContraseñaMousePressed
//new Color(255,204,102)
//[255,153,51]
    private void PinicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PinicioSesionMouseEntered
        PinicioSesion.setBackground(new Color(255,153,51));
        lblint.setForeground(Color.white);
    }//GEN-LAST:event_PinicioSesionMouseEntered

    private void PinicioSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PinicioSesionMouseExited
        PinicioSesion.setBackground(new Color(255,204,102));
        lblint.setForeground(Color.BLACK);
    }//GEN-LAST:event_PinicioSesionMouseExited

    private void PinicioSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PinicioSesionMousePressed
    String admin = USER.getSelectedItem().toString();
    String contra = String.valueOf(Contraseña.getPassword());

// Si es el usuario administrador
    if (contra.equals("admin") && admin.equals("administrador")) {
        PanelAdmin panel = new PanelAdmin(); // Sustituye "OtroPanel" por el nombre de tu clase


        getContentPane().removeAll();
        getContentPane().add(panel);
        
        panel.setBounds(0, 0, getWidth(), getHeight()); 
        panel.setVisible(true);
        revalidate();
        repaint();
    }

    else if (ListaUsers.validarLogin(admin, contra)) {
        System.out.println("Bienvenido");
        Menu_1 m = new Menu_1();

        getContentPane().removeAll();
        getContentPane().add(m);
        m.setBounds(0, 0, getWidth(), getHeight()); 
        m.setVisible(true);
        revalidate();
        repaint();
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
    }

    
        
    }//GEN-LAST:event_PinicioSesionMousePressed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void lblintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblintMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblintMouseClicked

    private void lblintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblintMousePressed
    
    }//GEN-LAST:event_lblintMousePressed
//    public static void borrauno(){
//        
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
        
        
    }
    


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel PinicLogo;
    private javax.swing.JPanel PinicioSesion;
    public static javax.swing.JPanel Plog;
    public static javax.swing.JComboBox<String> USER;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblint;
    public static javax.swing.JPanel loginPanel;
    // End of variables declaration//GEN-END:variables
}
