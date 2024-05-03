package View;

import Controller.AdminController;
import DAO.AdminDao;
import Model.Admin;
import Model.Funcionario;
import Model.Vendedor;
import View.Admin.AddFuncionario;
import View.Admin.Finacas;
import View.Admin.Header;
import View.Admin.ListarFuncionarios;
import View.Admin.NewAdmin;
import View.Admin.ProcurarFuncionario;
import View.Admin.TelaAdmin;
import View.Admin.mess;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.extras.components.FlatButton;
import static com.formdev.flatlaf.extras.components.FlatButton.ButtonType.roundRect;
import com.formdev.flatlaf.icons.FlatAnimatedIcon;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.ui.FlatButtonBorder;
import com.formdev.flatlaf.ui.FlatButtonUI;
import com.formdev.flatlaf.ui.FlatLineBorder;
import com.formdev.flatlaf.ui.FlatRoundBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.management.Notification;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import pedro.glasspanepopup.GlassPanePopup;

/**
 *
 * @author Pedro
 */
public class ADMFrame extends javax.swing.JFrame {

    TelaAdmin p5;
    int xMouse, yMouse;
    DrawerController drawer;
    ADMFrame fr = this;
    ArrayList<Funcionario> useri;
    Admin admin;
    Finacas pf;

  /**
   * 
   * @param admin
   * 
   * essa e a tela do Admin
   * 
   * @throws SQLException
   * @throws ClassNotFoundException 
   */
    
    
    
    
       


    public ADMFrame() {
        
    }

    public ADMFrame(Admin admin) throws SQLException, ClassNotFoundException {
        this.admin = admin;
        UIManager.put("Button.arc", 999);
        //  UIManager.put( "TextField.arc" , 999 );
        initComponents();
        btMassage.setBackground(bt1.getBackground());
        btNoti.setBackground(bt1.getBackground());
        GlassPanePopup.install(fr);
        //   btNoti.setBadges(5);
        // UIManager.put( "Button.arc" , 999 );
        p5 = new TelaAdmin(fr, admin);
        p5.setSize(1000, 620);
        p5.setLocation(0, 0);
      

        content.setLayout(new BorderLayout());
        content.removeAll();
        content.add(p5, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        content.setLayout(new BorderLayout());
        //============PopUP

        //===============================
        //++++++++++++++++++++++++++++++++++++++++++
        // FlatGitHubIJTheme.installBorder(bt1, "Round");
        //++++++++++++++++++++++++++++++++++++++++++
        //======================================================================
//        drawer = Drawer.newDrawer(this)
//                .background(new Color(90, 90, 90))
//                 .drawerBackground(this.getBackground())
//                .closeOnPress(true)
//                .backgroundTransparent(0.3f)
//                .leftDrawer(true)
//                .enableScroll(true)
//                .enableScrollUI(false)
//                .headerHeight(190)
//                .header(new Header())
//                .space(3)
//                .addChild(new DrawerItem("Adicionar Funcionario ").icon(new ImageIcon(getClass().getResource("/icon/user.png"))).build())
//                .addChild(new DrawerItem("Fornecedores").icon(new ImageIcon(getClass().getResource("/icon/cont.png"))).build())
//                .addChild(new DrawerItem("Relatorios").icon(new ImageIcon(getClass().getResource("/icon/report.png"))).build())
//                .addChild(new DrawerItem("Receita").icon(new ImageIcon(getClass().getResource("/icon/income.png"))).build())
//                .addChild(new DrawerItem("Despesa").icon(new ImageIcon(getClass().getResource("/icon/expense.png"))).build())
//                .addChild(new DrawerItem("Dados").icon(new ImageIcon(getClass().getResource("/icon/data.png"))).build())
//                .addFooter(new DrawerItem("Sair").icon(new ImageIcon(getClass().getResource("/icon/exit.png"))).build())
//                .event(new EventDrawer() {
//                    @Override
//                    public void selected(int index, DrawerItem item) {
//                     if(drawer.isShow()){
//                         drawer.hide();
//                     }
//                     
//                     switch (index) {
//    case 1:{System.out.println("1");}break;
//    case 2 :{
//        System.out.println("2");
//    }break;
//     case 3 :{
//         System.out.println("3");}break;
//      case 4 :{System.out.println("4");}break;
//       case 5 :{System.out.println("5");}break;
//        case 6 :{  System.exit(0);;}break;
//         case 0 :{
//            AddFuncionario p1 = new AddFuncionario();
//        p1.setSize(1000, 620);
//        p1.setLocation(0,0);
//        content.removeAll();
//        content.add(p1, BorderLayout.CENTER );
//        content.revalidate();
//        content.repaint();
//         }break;
//     
//                     }
//
//                     
//                    }
//                })
//                .build();
//======================================================================
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        imageAvatar2 = new View.Admin.ImageAvatar();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        BArraDeTitulo = new javax.swing.JPanel();
        btMassage = new com.pedro.swing.win_button.ButtonBadges();
        btNoti = new com.pedro.swing.win_button.ButtonBadges();
        escuro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        content.add(imageAvatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 140));

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 1010, 626));

        jButton1.setFont(new java.awt.Font("Roboto Medium", 1, 48)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/chart-simple-horizontal.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/SearchEmployye.png"))); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/2.png"))); // NOI18N
        bt1.setDoubleBuffered(true);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        btListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/employees.png"))); // NOI18N
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt6.setText("LogOut");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/equality (1).png"))); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/5.png"))); // NOI18N

        bt5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt5.setText("Home");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(83, 83, 83)
                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 630));

        BArraDeTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BArraDeTituloMouseDragged(evt);
            }
        });
        BArraDeTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BArraDeTituloMousePressed(evt);
            }
        });

        btMassage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/message.png"))); // NOI18N
        btMassage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMassageActionPerformed(evt);
            }
        });

        btNoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/noti.png"))); // NOI18N
        btNoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNotiActionPerformed(evt);
            }
        });

        escuro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        escuro.setText("ModoEscuro");
        escuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escuroActionPerformed(evt);
            }
        });
        escuro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                escuroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout BArraDeTituloLayout = new javax.swing.GroupLayout(BArraDeTitulo);
        BArraDeTitulo.setLayout(BArraDeTituloLayout);
        BArraDeTituloLayout.setHorizontalGroup(
            BArraDeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BArraDeTituloLayout.createSequentialGroup()
                .addContainerGap(685, Short.MAX_VALUE)
                .addComponent(escuro)
                .addGap(166, 166, 166)
                .addComponent(btNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btMassage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        BArraDeTituloLayout.setVerticalGroup(
            BArraDeTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BArraDeTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escuro)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(btNoti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btMassage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(BArraDeTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BArraDeTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BArraDeTituloMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BArraDeTituloMousePressed

    private void BArraDeTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BArraDeTituloMouseDragged
        setLocation(evt.getXOnScreen() - xMouse, evt.getYOnScreen() - yMouse);
    }//GEN-LAST:event_BArraDeTituloMouseDragged

    private void btMassageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMassageActionPerformed
  GlassPanePopup.showPopup(new Messagens());
    }//GEN-LAST:event_btMassageActionPerformed

    private void escuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escuroActionPerformed

        if (escuro.isSelected()) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatGitHubDarkIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();

                    //++++++++++++++++++++++++++++++++++++++++++
                    btMassage.setBackground(bt1.getBackground());
                    btNoti.setBackground(bt1.getBackground());
                 
                    content.repaint();
                    p5.repaint();
                    Insets insets = new Insets(1, 1, 1, 1);
                     if(p5!= null){
                    p5.getP1().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getP2().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getP3().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getP4().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getPain().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));}
//---------------------------------------------------------------------------------------------------------------------------------
                     if(pf!= null){
                        
                    pf.getP1().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP2().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP3().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP4().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP5().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));}
                }
            });
        } else {

            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatGitHubIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    content.repaint();
                    btMassage.setBackground(bt1.getBackground());
                    btNoti.setBackground(bt1.getBackground());
                
                    Insets insets = new Insets(1, 1, 1, 1);
                    if(p5 != null){
                    p5.getP1().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getP2().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getP3().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getP4().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getPain().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    }
                    if(pf!=null){
                    pf.getP1().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP2().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP3().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP4().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP5().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));}

                }
            });

        }//===========================================================
        btMassage.setBackground(this.getForeground());
        btNoti.setBackground(this.getForeground());
        //=============================================================


    }//GEN-LAST:event_escuroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        drawer = Drawer.newDrawer(this)
                .background(new Color(90, 90, 90))
                .drawerBackground(this.getBackground())
                .closeOnPress(true)
                .backgroundTransparent(0.3f)
                .leftDrawer(true)
                .enableScroll(true)
                .enableScrollUI(false)
                .headerHeight(193)
                .header(new Header())
                .space(3)
                .addChild(new DrawerItem("Adicionar Funcionario ").icon(new ImageIcon(getClass().getResource("/icon/user.png"))).build())
                .addChild(new DrawerItem("Listar Funcionaarrios").icon(new ImageIcon(getClass().getResource("/icon/employees.png"))).build())
                .addChild(new DrawerItem("Pesquisar Funcionario").icon(new ImageIcon(getClass().getResource("/icon/searchEmployee.png"))).build())
                .addChild(new DrawerItem("Finacas").icon(new ImageIcon(getClass().getResource("/icon/equality (1).png"))).build())
                .addChild(new DrawerItem("Configuracoes").icon(new ImageIcon(getClass().getResource("/icon/5.png"))).build())
                .addFooter(new DrawerItem("LogOut").icon(new ImageIcon(getClass().getResource("/icon/exit.png"))).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                        if (drawer.isShow()) {
                            drawer.hide();
                        }

                        switch (index) {
                            case 1: {

                                ListarFuncionarios p1 = new ListarFuncionarios(fr);
                                p1.setSize(1000, 620);
                                p1.setLocation(0, 0);
                                content.removeAll();
                                content.add(p1, BorderLayout.CENTER);
                                content.revalidate();
                                content.repaint();

                            }
                            break;
                            case 2: {
                          AdminController cc = new AdminController(fr);

        try {
            useri = cc.sellectAllFuncionario();
            ProcurarFuncionario p1 = new ProcurarFuncionario(fr, useri);
        p1.setSize(1000, 620);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                            }
                            break;
                            case 3: {
                               pf = new Finacas();
        pf.setSize(1000, 620);
        pf.setLocation(0, 0);
        content.removeAll();
        content.add(pf, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
                            }
                            break;
                            case 4: {
                                System.out.println("4");
                            }
                            break; 
                            
                            case 5: {
                                fr.dispose();
        try {
          new LoginP().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                            }
                           
                           
                            case 0: {
                               
                                AddFuncionario p1 = new AddFuncionario(fr);
                                p1.setSize(1000, 620);
                                p1.setLocation(0, 0);
                                content.removeAll();
                                content.add(p1, BorderLayout.CENTER);
                                content.revalidate();
                                content.repaint();
                            }
                            break;

                        }

                    }
                })
                .build();
        //=======================================================
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        ListarFuncionarios p1 = new ListarFuncionarios(this);
        p1.setSize(1000, 620);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btListarActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        AddFuncionario p1 = new AddFuncionario(this);
        p1.setSize(1000, 620);
        p1.setLocation(0, 0);
        content.setLayout(new BorderLayout());
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        AdminController cc = new AdminController(fr);

        try {
            useri = cc.sellectAllFuncionario();
        } catch (SQLException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ProcurarFuncionario p1 = new ProcurarFuncionario(fr, useri);
        p1.setSize(1000, 620);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        pf = new Finacas();
        pf.setSize(1000, 620);
        pf.setLocation(0, 0);
        content.removeAll();
        content.add(pf, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_bt4ActionPerformed

    private void btNotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNotiActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        try {
            p5 = new TelaAdmin(fr, admin);
            p5.setSize(1000, 620);
        p5.setLocation(0, 0);
      

        content.setLayout(new BorderLayout());
        content.removeAll();
        content.add(p5, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        content.setLayout(new BorderLayout());
        } catch (SQLException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
      this.dispose();
        try {
          new LoginP().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void escuroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escuroKeyPressed
  
        if(evt.getKeyCode()==10){
            if(escuro.isSelected()){
  escuro.setSelected(false);
  }else{
  escuro.setSelected(true);
  }
        if (escuro.isSelected()) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatGitHubDarkIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();

                    //++++++++++++++++++++++++++++++++++++++++++
                    btMassage.setBackground(bt1.getBackground());
                    btNoti.setBackground(bt1.getBackground());
                   
                    content.repaint();
                    p5.repaint();
                    Insets insets = new Insets(1, 1, 1, 1);
                     if(p5!= null){
                    p5.getP1().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getP2().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getP3().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getP4().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    p5.getPain().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));}
//---------------------------------------------------------------------------------------------------------------------------------
                     if(pf!= null){
                        
                    pf.getP1().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP2().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP3().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP4().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));
                    pf.getP5().setBorder(new FlatLineBorder(insets, new Color(245, 104, 10), 2, 050));}
                }
            });
        } else {

            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatGitHubIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    content.repaint();
                    btMassage.setBackground(bt1.getBackground());
                    btNoti.setBackground(bt1.getBackground());
                
                    Insets insets = new Insets(1, 1, 1, 1);
                    if(p5 != null){
                    p5.getP1().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getP2().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getP3().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getP4().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    p5.getPain().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    }
                    if(pf!=null){
                    pf.getP1().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP2().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP3().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP4().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));
                    pf.getP5().setBorder(new FlatLineBorder(insets, new Color(78, 170, 82), 2, 050));}

                }
            });
      
      }}
    }//GEN-LAST:event_escuroKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // FlatGitHubIJTheme.registerCustomDefaultsSource("style");
        FlatGitHubIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new ADMFrame().setVisible(true);
                AdminDao d = new AdminDao();
                ArrayList<Admin> openFile = d.openFile();
                try {
                    new ADMFrame(openFile.get(0)).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ADMFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BArraDeTitulo;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton btListar;
    private com.pedro.swing.win_button.ButtonBadges btMassage;
    private com.pedro.swing.win_button.ButtonBadges btNoti;
    private javax.swing.JPanel content;
    private javax.swing.JRadioButton escuro;
    private View.Admin.ImageAvatar imageAvatar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
