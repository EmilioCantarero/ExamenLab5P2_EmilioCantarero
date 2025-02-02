/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_emiliocantarero;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio Cantarero
 */
public class Login extends javax.swing.JFrame {
    
    ArrayList<Usuario>usuarios=new ArrayList();
    private String nombre;
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    /**
     * Creates new form Login
     */
    public Login() {
        
        
        usuarios.add(new Administrador("James", "Jamesito", "123", 18));
        
        usuarios.add(new Vendedor(0, 0, new CuentaBancaria(8000.0, 12345678), "Juan", "Juan456", "123", 23));
        usuarios.add(new Vendedor(0, 0, new CuentaBancaria(7500.0, 12345679), "Pedro", "Pedrito88", "123", 25));
        usuarios.add(new Comprador(new CuentaBancaria(6000, 23451234), 500, "Julio", "Julito", "123", 30));
        usuarios.add(new Comprador(new CuentaBancaria(7000, 53451234), 600, "Gael", "HanSolo", "123", 19));
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T_Login = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        T_Usuario = new javax.swing.JLabel();
        e_Usuario = new javax.swing.JTextField();
        T_Contra = new javax.swing.JLabel();
        e_Contra = new javax.swing.JPasswordField();
        B_IniciarSesion = new javax.swing.JButton();
        B_Registrarse = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        T_Login1 = new javax.swing.JLabel();

        T_Login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        T_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_Login.setText("Login");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        T_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        T_Usuario.setText("Usuario");

        e_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_UsuarioActionPerformed(evt);
            }
        });

        T_Contra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        T_Contra.setText("Contraseña");

        B_IniciarSesion.setText("Iniciar sesión");
        B_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_IniciarSesionActionPerformed(evt);
            }
        });

        B_Registrarse.setText("Registrarse");
        B_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RegistrarseActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        T_Login1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        T_Login1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_Login1.setText("Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(T_Login1)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T_Login1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(T_Usuario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B_IniciarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(B_Registrarse))
                    .addComponent(T_Contra)
                    .addComponent(e_Usuario)
                    .addComponent(e_Contra))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(T_Usuario)
                .addGap(5, 5, 5)
                .addComponent(e_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(T_Contra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(e_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_IniciarSesion)
                    .addComponent(B_Registrarse))
                .addContainerGap(13, Short.MAX_VALUE))
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
    
    private void B_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_IniciarSesionActionPerformed
        int c1=0;
        for (Usuario t : usuarios) {
            vAdmin a=new vAdmin();
            if (e_Usuario.getText().equals(t.getnUsuario())&&e_Contra.getText().equals(t.getContraseña())){
                if (t instanceof Comprador){
                    this.setVisible(false);
                    vComprador c = new vComprador();
                    c.setVisible(true);
                    
                    break;
                }
                if (t instanceof Vendedor){
                    this.setVisible(false);
                    vVendedor v=new vVendedor();
                    v.setVisible(true);
                    
                    break;
                }
                if (t instanceof Administrador){
                    this.setVisible(false);
                    
                    a.setVisible(true);
                    this.nombre=t.getNombre();
                    break;
                }
                break;
                
            }
            c1++;   
        }
        if (c1==usuarios.size()){
            JOptionPane.showMessageDialog(this, "El usuario o la contraseña ingresada no coinciden");
        }
    }//GEN-LAST:event_B_IniciarSesionActionPerformed

    private void B_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RegistrarseActionPerformed
        this.setVisible(false);
        vRegistro r = new vRegistro();
        r.setVisible(true);
    }//GEN-LAST:event_B_RegistrarseActionPerformed

    private void e_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_UsuarioActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_IniciarSesion;
    private javax.swing.JButton B_Registrarse;
    private javax.swing.JLabel T_Contra;
    private javax.swing.JLabel T_Login;
    private javax.swing.JLabel T_Login1;
    private javax.swing.JLabel T_Usuario;
    private javax.swing.JPasswordField e_Contra;
    private javax.swing.JTextField e_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}


