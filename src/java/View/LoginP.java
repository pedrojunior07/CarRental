/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AdminController;
import DAO.AdminDao;
import DAO.ImagemDirectorioDAO;
import Model.Admin;
import Model.Funcionario;
import Model.ImagemDirectorios;
import ViewFuncionario.Base;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.ui.FlatLineBorder;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import raven.toast.Notifications;

/**
 *
 * @author Pedro
 */
public class LoginP extends javax.swing.JFrame {
   int x, y;
    AdminDao adminDao;
    ImageIcon icon;
    ArrayList<Admin> openFile;
    ArrayList<Funcionario> sellectAllFuncionario;

    public LoginP() throws SQLException, ClassNotFoundException {
      Toolkit.getDefaultToolkit().beep();
        adminDao = new AdminDao();
        openFile = adminDao.openFile();
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime().toString());
        UIManager.put("PasswordField.capsLockIconColor", "#B92303");
        UIManager.put("PasswordField.showRevealButton", true);
        //   UIManager.put( "Button.arc" , 999 );
        initComponents();
 Notifications.getInstance().setJFrame(this);
       
        Controller.AdminController cc = new AdminController(this);
        sellectAllFuncionario = cc.sellectAllFuncionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pfSenha = new textfield.PasswordField();
        txEmail = new textfield.TextField();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(511, 563));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setDoubleBuffered(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LogIn");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pfSenha.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        pfSenha.setLabelText("Senha :");
        pfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaActionPerformed(evt);
            }
        });

        txEmail.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txEmail.setLabelText("E-Mail");
        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton1.setText("entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 330, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEmailActionPerformed

    private void pfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaActionPerformed

    }//GEN-LAST:event_pfSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Funcionario object = null;

        for (Funcionario f : sellectAllFuncionario) {
            if (f.geteMail().equalsIgnoreCase(txEmail.getText())) {
                object = f;

            }
        }

        if (object != null && object.getEspecialidade().equalsIgnoreCase("Gerente")) {
            String senha = new String(pfSenha.getPassword()).trim();
            if (senha.equalsIgnoreCase(object.getSenha())&&(object.isEstado())) {
                ImagemDirectorioDAO dao = new ImagemDirectorioDAO();
                String teste = object.getIdentidade();
                ImagemDirectorioDAO img = new ImagemDirectorioDAO();
                ArrayList<ImagemDirectorios> openFile = img.openFile("Imagens");
                for (int i = 0; i < openFile.size(); i++) {

                    if (teste.equalsIgnoreCase(openFile.get(i).getIdentidade())) {

                        new GerenteFrame(openFile.get(i).getIcon(), object).setVisible(true);
                        this.dispose();
                    }
                }
            } else {
                Toolkit.getDefaultToolkit().beep();
                Notifications.getInstance().show(Notifications.Type.ERROR, "Usuario ou Senha Incorrectos");
            }
        } else if (object != null && object.getEspecialidade().equalsIgnoreCase("Vendedor")) {

            String senha = new String(pfSenha.getPassword()).trim();
            if (senha.equalsIgnoreCase(object.getSenha())&&(object.isEstado())) {
                ImagemDirectorioDAO dao = new ImagemDirectorioDAO();
                String teste = object.getIdentidade();
                ImagemDirectorioDAO img = new ImagemDirectorioDAO();
                ArrayList<ImagemDirectorios> openFile = img.openFile("Imagens");
                for (int i = 0; i < openFile.size(); i++) {

                    if (teste.equalsIgnoreCase(openFile.get(i).getIdentidade())) {
                 
                
                        try {
                            new vendedorFrame(   openFile.get(i).getIcon(), object).setVisible(true);
                        } catch (SQLException ex) {
                            Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        this.dispose();
                    }
                }
            } else {
                Toolkit.getDefaultToolkit().beep();
                Notifications.getInstance().show(Notifications.Type.ERROR, "Usuario ou Senha Incorrectos");
            }

        } else if (txEmail.getText().equalsIgnoreCase(openFile.get(0).getE_mail())) {

            String senha = new String(pfSenha.getPassword()).trim();
            System.out.println(openFile.get(0).getSenha());
            if (senha.equalsIgnoreCase(openFile.get(0).getSenha())) {
                try {
                    new ADMFrame(openFile.get(0)).setVisible(true);
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                 Toolkit.getDefaultToolkit().beep();
                Notifications.getInstance().show(Notifications.Type.ERROR, "Usuario ou Senha Incorrectos");

            }

        } else {
           Toolkit.getDefaultToolkit().beep();
                Notifications.getInstance().show(Notifications.Type.ERROR, "Usuario ou Senha Incorrectos");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
     
               
        System.exit(0);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
     this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_button2ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
     x = evt.getX();
     y = evt.getY();
     
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
     this.setLocation(evt.getXOnScreen()-x , evt.getYOnScreen()-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    Insets insets = new Insets(1, 1, 1, 1);
                   p1.setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050)); 
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
           Insets insets = new Insets(1, 1, 1, 1);
        p1.setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
    }//GEN-LAST:event_formWindowLostFocus

    private void button2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_button2FocusGained
   
    }//GEN-LAST:event_button2FocusGained

    private void button2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_button2FocusLost
    
    }//GEN-LAST:event_button2FocusLost

    private void button1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_button1FocusGained
    
    }//GEN-LAST:event_button1FocusGained

    private void button1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_button1FocusLost
     
    }//GEN-LAST:event_button1FocusLost

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // FlatIntelliJLaf.registerCustomDefaultsSource("style");
// FlatGitHubIJTheme.setup();
            UIManager.setLookAndFeel(new FlatGitHubIJTheme());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginP().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                
                    Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel p1;
    private textfield.PasswordField pfSenha;
    private textfield.TextField txEmail;
    // End of variables declaration//GEN-END:variables
}