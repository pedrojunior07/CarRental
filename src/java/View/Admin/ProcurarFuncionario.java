
package View.Admin;


import Controller.AdminController;
import DAO.DATABASE.Conexao;
import DAO.DATABASE.GerenteDao;
import DAO.DATABASE.VendedorDAO;
import DAO.FinacasDao;
import DAO.ImagemDirectorioDAO;
import Model.Financas;
import Model.Funcionario;
import Model.Gerente;
import Model.ImagemDirectorios;
import Model.Vendedor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class ProcurarFuncionario extends javax.swing.JPanel {
    JFrame frame;
    String teste;
    ArrayList<Funcionario> user;
    Funcionario funcionari;
    Double Salario;
    
    public ProcurarFuncionario(JFrame frame,ArrayList<Funcionario> user) {
        this.frame = frame;
        this.user = user;
        initComponents();
        
        demitir.setVisible(false);
        AlterarSalario.setVisible(false);
        Guardar.setVisible(false);
        lSala.setVisible(false);
        txSalario.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txEmail = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        Foto = new View.Admin.ImageAvatar();
        lIdade = new javax.swing.JLabel();
        LEspecialidade = new javax.swing.JLabel();
        lId = new javax.swing.JLabel();
        LnomeComleto = new javax.swing.JLabel();
        lSalario = new javax.swing.JLabel();
        lNumdevendas = new javax.swing.JLabel();
        AlterarSalario = new javax.swing.JButton();
        demitir = new javax.swing.JButton();
        lEmail = new javax.swing.JLabel();
        lSala = new javax.swing.JLabel();
        txSalario = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 41, 451, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/searchEmployee.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(919, 41, 54, 40));

        lb.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb.setText("E-Mail :");
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 44, 66, 32));

        Foto.setGradientColor1(new java.awt.Color(0, 0, 255));
        Foto.setGradientColor2(new java.awt.Color(51, 204, 0));
        Foto.setImage(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/user.png"))); // NOI18N
        add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 127, 180, 192));

        lIdade.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(lIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 250, 30));

        LEspecialidade.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(LEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 250, 28));

        lId.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        add(lId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 80, 40));

        LnomeComleto.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(LnomeComleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 250, 28));

        lSalario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(lSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 250, 28));

        lNumdevendas.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(lNumdevendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 250, 28));

        AlterarSalario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        AlterarSalario.setText("Alterar o Salario");
        AlterarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarSalarioActionPerformed(evt);
            }
        });
        add(AlterarSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 140, 50));

        demitir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        demitir.setText("Demitir");
        demitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demitirActionPerformed(evt);
            }
        });
        add(demitir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 140, 50));

        lEmail.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(lEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 260, 30));

        lSala.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lSala.setText("Novo Salario");
        add(lSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 90, 40));
        add(txSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 90, 40));

        Guardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 90, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        teste = new String();
        for (Funcionario funcionario : user) {
            if(funcionario.geteMail().equalsIgnoreCase(txEmail.getText())){
                demitir.setVisible(true);
        AlterarSalario.setVisible(true);
               this.funcionari =funcionario;
               if(!funcionario.isEstado()){
               demitir.setText("Readimitir");
               }else{
               
                  demitir.setText("Demitir");
               }
                lId.setText("ID: "+funcionario.getId());
            LnomeComleto.setText(funcionario.getNome()+" "+funcionario.getApelido());
            lIdade.setText("Idade :  "+funcionario.getIdade());
            LEspecialidade.setText("Especialidade: "+funcionario.getEspecialidade());
            lSalario.setText("Salario: "+funcionario.getSalario());
            if(funcionario.getEspecialidade().equalsIgnoreCase("vendedor")){
          Vendedor vende;
                
                lNumdevendas.setText("Numero De Vendas "+0 );}
             lEmail.setText(" Identidade : "+funcionario.getIdentidade());
           teste = funcionario.getIdentidade();
            }
            
            ImagemDirectorioDAO img = new ImagemDirectorioDAO();
            ArrayList<ImagemDirectorios> openFile = img.openFile("Imagens");
              for (int i=0; i<openFile.size();i++){
                  
              if(teste.equalsIgnoreCase(openFile.get(i).getIdentidade())){
              Foto.setImage(openFile.get(i).getIcon());
                  
              }
                  }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void demitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demitirActionPerformed
   int asw = JOptionPane.showConfirmDialog(null, "Demitir ?");
        
        switch (asw) {
             case 0:{
             
              if(funcionari.isEstado()){
        funcionari.setEstado(false);
       
       
       if(funcionari.getEspecialidade().equalsIgnoreCase("vendedor")){
        Vendedor usero = (Vendedor) funcionari;
        Conexao cc = new Conexao();
        try {
            VendedorDAO dao = new VendedorDAO(cc.getConnection());
              
            dao.updateVendedor(usero);
        } catch (SQLException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       }else{
        Gerente user1 = (Gerente) funcionari;
        Conexao cc = new Conexao();
        try {
            GerenteDao dao = new GerenteDao(cc.getConnection());
            
            dao.updateVendedor(user1);
        } catch (SQLException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       }}else{

    
       
       if(funcionari.getEspecialidade().equalsIgnoreCase("vendedor")){
       Vendedor usero = (Vendedor) funcionari;
        funcionari.setEstado(true);
        Conexao cc = new Conexao();
        try {
            VendedorDAO dao = new VendedorDAO(cc.getConnection());
              
            dao.updateVendedor(usero);
        } catch (SQLException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       }else{
        Gerente user1 = (Gerente) funcionari;
         funcionari.setEstado(true);
        Conexao cc = new Conexao();
        try {
            GerenteDao dao = new GerenteDao(cc.getConnection());
            
            dao.updateVendedor(user1);
        } catch (SQLException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       }
    
    }
             }
                
                break;
            case 1:{
            
            JOptionPane.showMessageDialog(null, "Cancelado");
            }
                
                break; case 2:{
              JOptionPane.showMessageDialog(null, "Cancelado");
                
                }
                
                break; case -1:{
                
                JOptionPane.showMessageDialog(null, "Cancelado");
                }
                
                break;
            default:
                throw new AssertionError();
        }
       
       
       
    }//GEN-LAST:event_demitirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
   Salario = funcionari.getSalario();
       
           funcionari.setSalario(Double.parseDouble(txSalario.getText()));
          
           
         
      

           //=============================================================================================================
           
             if(funcionari.getEspecialidade().equalsIgnoreCase("vendedor")){
       Vendedor users = (Vendedor) funcionari;
        Conexao cc = new Conexao();
        try {
            VendedorDAO dao = new VendedorDAO(cc.getConnection());
            
            dao.updateVendedor(users);
        } catch (SQLException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       }else{
         Gerente user1 = (Gerente) funcionari;
        Conexao cc = new Conexao();
        try {
            GerenteDao dao = new GerenteDao(cc.getConnection());
            
            dao.updateVendedor(user1);
        } catch (SQLException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcurarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
       }

           //=============================================================================================================
           
           FinacasDao dao = new FinacasDao();
           ArrayList<Financas> openFile = dao.openFile();
           openFile.get(0).setDispesas( openFile.get(0).getDispesas()-Salario+(Double.parseDouble(txSalario.getText())));
           dao.insert( openFile.get(0));
          
           








  

//=================================================================
           Guardar.setVisible(false);
        lSala.setVisible(false);
        txSalario.setVisible(false);
    }//GEN-LAST:event_GuardarActionPerformed

    private void AlterarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarSalarioActionPerformed
        Guardar.setVisible(true);
        lSala.setVisible(true);
        txSalario.setVisible(true);
    

    }//GEN-LAST:event_AlterarSalarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarSalario;
    private View.Admin.ImageAvatar Foto;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel LEspecialidade;
    private javax.swing.JLabel LnomeComleto;
    private javax.swing.JButton demitir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lId;
    private javax.swing.JLabel lIdade;
    private javax.swing.JLabel lNumdevendas;
    private javax.swing.JLabel lSala;
    private javax.swing.JLabel lSalario;
    private javax.swing.JLabel lb;
    private javax.swing.JFormattedTextField txEmail;
    private javax.swing.JTextField txSalario;
    // End of variables declaration//GEN-END:variables
}
