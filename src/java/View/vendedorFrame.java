/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.geom.FlatteningPathIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import AppPackage.AnimationClass;
import Model.Funcionario;
import View.Admin.AddFuncionario;
import View.Admin.mess;
import View.Gerente.AddCarro;
import View.Gerente.AdicionarFornecedor;
import View.Gerente.GerentePainel;
import View.Gerente.ListarPesquisarCarro;
import View.Gerente.gStockTaxes;
import ViewFuncionario.ClientesLocais;
import ViewFuncionario.EfectuarVenda;
import ViewFuncionario.VendedorInicial;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;

import java.awt.EventQueue;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import pedro.glasspanepopup.GlassPanePopup;

import raven.toast.Notifications;

/**
 *
 * @author Pedro
 */
public class vendedorFrame extends javax.swing.JFrame {

    ImageIcon icon;
    Funcionario funcionrio;
   int id;
    public vendedorFrame(ImageIcon icon, Funcionario funcionrio) throws SQLException, ClassNotFoundException {
        // UIManager.put( "Button.arc" , 999 );
        this.icon = icon;
        this.funcionrio = funcionrio;
        this.id = funcionrio.getId();
        initComponents();
         
        Messagem.setBackground(btListarCarro.getBackground());
        // UIManager.put( "Button.arc" , 999 );
        imagem.setImage(icon);
        lbNome.setText(funcionrio.getNome() + " " + funcionrio.getApelido());

        GlassPanePopup.install(this);
        FlatGitHubIJTheme.setup();
        
        //================================================
        lbNome.setText(funcionrio.getNome()+" "+ funcionrio.getApelido());
        imagem.setImage(icon);
        //---------------------------------------------------
        VendedorInicial p1 = new VendedorInicial(this, funcionrio);
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imagem = new View.Admin.ImageAvatar();
        btListarCarro = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        btListarCarro1 = new javax.swing.JButton();
        btListarCarro2 = new javax.swing.JButton();
        btListarCarro3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Messagem = new com.pedro.swing.win_button.ButtonBadges();
        escuro = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 620));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 140));

        btListarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/Listar.png"))); // NOI18N
        btListarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarCarroActionPerformed(evt);
            }
        });
        jPanel1.add(btListarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 110, 50));

        lbNome.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lbNome.setText("Nome Completo");
        jPanel1.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 30));

        btListarCarro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Carrinho.png"))); // NOI18N
        btListarCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarCarro1ActionPerformed(evt);
            }
        });
        jPanel1.add(btListarCarro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 110, 50));

        btListarCarro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/stats.png"))); // NOI18N
        btListarCarro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarCarro2ActionPerformed(evt);
            }
        });
        jPanel1.add(btListarCarro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 50));

        btListarCarro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/comercial1.png"))); // NOI18N
        btListarCarro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarCarro3ActionPerformed(evt);
            }
        });
        jPanel1.add(btListarCarro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, 50));

        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 210, 620));

        Messagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/message.png"))); // NOI18N
        getContentPane().add(Messagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 60));

        escuro.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        escuro.setText("Modo Escuro");
        escuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escuroMouseEntered(evt);
            }
        });
        escuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escuroActionPerformed(evt);
            }
        });
        getContentPane().add(escuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btListarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarCarroActionPerformed

        ListarPesquisarCarro p1;
        try {
            p1 = new ListarPesquisarCarro(this);
            p1.setSize(1000, 620);

          
            content.setLayout(new BorderLayout());
            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(mess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_btListarCarroActionPerformed

    private void escuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escuroActionPerformed
        if (escuro.isSelected()) {
            Messagem.setBackground(btListarCarro.getBackground());
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatGitHubDarkIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    escuro.setText("Modo Claro");
                    //++++++++++++++++++++++++++++++++++++++++++

                }
            });
        } else {
            escuro.setText("Modo Escuro");
            Messagem.setBackground(btListarCarro.getBackground());
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatGitHubIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                }
            });

        }
    }//GEN-LAST:event_escuroActionPerformed

    private void escuroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuroMouseEntered
        if (escuro.isSelected()) {

            escuro.setToolTipText("Alterar de Escucuro para Claro");

        } else {

            escuro.setToolTipText("Alterar de Claro para Escucuro");
        }
    }//GEN-LAST:event_escuroMouseEntered

    private void btListarCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarCarro1ActionPerformed
        try {
            EfectuarVenda painel1 = new EfectuarVenda(this, funcionrio);
            content.setLayout(new BorderLayout());
            content.removeAll();
            content.add(painel1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(vendedorFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vendedorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btListarCarro1ActionPerformed

    private void btListarCarro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarCarro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btListarCarro2ActionPerformed

    private void btListarCarro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarCarro3ActionPerformed
     ClientesLocais c = new ClientesLocais(id);
        content.setLayout(new BorderLayout());
        content.removeAll();
        content.add(c, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btListarCarro3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      VendedorInicial p1;
        try {
            p1 = new VendedorInicial(this, funcionrio);
             p1.setSize(1000,620);
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(vendedorFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vendedorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        FlatGitHubIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new vendedorFrame().setVisible(true);
            }
        });

    }

    public JPanel getContente() {
        return content;
    }

    public void setContente(JPanel contente) {
        this.content = contente;
    }

    public JButton getBtListarCarro() {
        return btListarCarro;
    }

    public void setBtListarCarro(JButton btListarCarro) {
        this.btListarCarro = btListarCarro;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.pedro.swing.win_button.ButtonBadges Messagem;
    private javax.swing.JButton btListarCarro;
    private javax.swing.JButton btListarCarro1;
    private javax.swing.JButton btListarCarro2;
    private javax.swing.JButton btListarCarro3;
    private javax.swing.JPanel content;
    private javax.swing.JToggleButton escuro;
    private View.Admin.ImageAvatar imagem;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNome;
    // End of variables declaration//GEN-END:variables
}
