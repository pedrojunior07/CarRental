
package ViewFuncionario;


import DAO.clienteDao;
import Model.Carro;
import Model.Cliente;
import Model.Funcionario;
import View.vendedorFrame;
import com.raven.datechooser.DateChooser;
import java.awt.BorderLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import jnafilechooser.api.JnaFileChooser;
import raven.toast.Notifications;

/**
 *
 * @author Celso Mongane
 */
public class FormularioDoCliente extends javax.swing.JPanel {
public vendedorFrame frame;
    public Carro carro;
    
    public  ImageIcon image;
    public Funcionario funcionario;
    
    
    public FormularioDoCliente(Carro carro,Funcionario funcionario,vendedorFrame frame ) {
        this.frame = frame;
        this.funcionario = funcionario;
        this.carro= carro;
        initComponents();
        JFrame painel =null;
        Datas.setTextRefernce(DatedeNascimento);
         Notifications.getInstance().setJFrame(frame);
   
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Datas = new ViewFuncionario.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        NomedoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Apelido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BilhetedeIdentidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Telefone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rMasculino = new javax.swing.JRadioButton();
        rFeminino = new javax.swing.JRadioButton();
        DatedeNascimento = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        imageAvatar2 = new View.Admin.ImageAvatar();
        Selecionar = new javax.swing.JButton();
        Registar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Nacionalidade = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        JestadoCivil = new javax.swing.JComboBox<>();
        Email = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomedoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomedoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(NomedoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 263, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setText("Preechimento do formulario do cliente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 32, 325, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/2.png"))); // NOI18N
        jLabel3.setText("Nome do cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        Apelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApelidoActionPerformed(evt);
            }
        });
        jPanel1.add(Apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 220, 40));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("Apelido");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 97, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("BI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 27, -1));

        BilhetedeIdentidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BilhetedeIdentidadeActionPerformed(evt);
            }
        });
        jPanel1.add(BilhetedeIdentidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 220, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setText("Nacionalidade");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 97, 30));
        jPanel1.add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 220, 40));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setText("Sexo:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 97, 23));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setText("Data de Nascimento");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 131, 23));

        rMasculino.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        rMasculino.setText("Masculino");
        rMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(rMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 80, -1));

        rFeminino.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        rFeminino.setText("Femenino");
        rFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemininoActionPerformed(evt);
            }
        });
        jPanel1.add(rFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        DatedeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatedeNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(DatedeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 150, 30));

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 30, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel14.setText("Estado Civil");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, 26));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cont.png"))); // NOI18N
        jLabel15.setText("Telefone");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 97, 30));

        imageAvatar2.setGradientColor1(new java.awt.Color(242, 242, 242));
        imageAvatar2.setGradientColor2(new java.awt.Color(242, 242, 242));
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/user.png"))); // NOI18N
        jPanel1.add(imageAvatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 200, 170));

        Selecionar.setText("Selecionar foto");
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });
        jPanel1.add(Selecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 140, 30));

        Registar.setText("Registar");
        Registar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarActionPerformed(evt);
            }
        });
        jPanel1.add(Registar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 108, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/datechooser/previous.png"))); // NOI18N
        jButton3.setText("Voltar");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 80, 30));

        Nacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionalidade", "Abecásia", "Afeganistão", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Antígua e Barbuda", "Arábia Saudita", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein (ou Barein, ou Barém)", "Bangladesh", "Barbados", "Bélgica", "Belize", "Benim", "Bielorrússia", "Bolívia", "Bósnia e Herzegovina", "Botswana (ou Botsuana)", "Brasil", "Brunei", "Bulgária", "Burkina Faso (ou Burquina Faso)", "Burundi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar (ou Qatar)", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Cingapura (ou Singapura)", "Colômbia", "Comores", "Congo", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Dinamarca", "Djibouti (ou Djibuti)", "Dominica", "Egito", "El Salvador", "Emirados Árabes Unidos", "Equador", "Eritreia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estados Federados da Micronésia", "Estados Unidos da América", "Estônia", "Eswatini (ou Essuatíni, ou Suazilândia)", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Granada", "Grécia", "Guatemala", "Guiana", "Guiné", "Guiné-Bissau", "Guiné Equatorial", "Haiti", "Holanda", "Honduras", "Hungria", "Iêmen", "Índia", "Indonésia", "Inglaterra", "Irã (ou Irão)", "Iraque", "Irlanda do Norte", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kiribati (ou Quiribati)", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letônia", "Líbano", "Libéria", "Líbia", "Liechtenstein (ou Listenstaine)", "Lituânia", "Luxemburgo", "Macedônia do Norte", "Madagascar (ou Madagáscar)", "Malásia", "Malawi (ou Malauí)", "Maldivas", "Mali", "Malta", "Marrocos", "Marshall", "Maurícia", "Mauritânia", "México", "Mianmar", "Micronésia", "Moçambique", "Moldávia", "Mônaco", "Mongólia", "Montenegro", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Níger", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "Ossétia do Sul", "País de Gales", "Países Baixos", "Palau", "Palestina", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paraguai", "Peru", "Polônia", "Portugal", "Qatar (ou Catar)", "Quênia", "Quirguistão", "Quiribati (ou Kiribati)", "Reino Unido", "República Árabe Saaraui Democrática", "República Centro-Africana", "República Democrática do Congo", "República do Congo", "República Dominicana", "República Tcheca (ou Tchéquia)", "República Turca de Chipre do Norte", "Romênia", "Ruanda", "Rússia", "Salomão", "Samoa", "San Marino (ou São Marinho)", "Santa Lúcia", "São Cristóvão e Névis (ou São Cristóvão e Neves)", "São Tomé e Príncipe", "São Vicente e Granadinas", "Senegal", "Serra Leoa", "Sérvia", "Seychelles (ou Seicheles)", "Singapura (ou Cingapura)", "Síria", "Somália", "Sri Lanka", "Suazilândia (ou Eswatini, ou Essuatíni)", "Sudão do Sul", "Sudão", "Suécia", "Suíça", "Suriname", "Tailândia", "Taiwan", "Tajiquistão (ou Tadjiquistão)", "Tanzânia", "Tchéquia (ou República Tcheca)", "Timor-Leste", "Togo", "Tonga", "Trinidad e Tobago", "Tunísia", "Turcomenistão (ou Turquemenistão)", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "Uruguai", "Uzbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietnã (ou Vietname)", "Zâmbia", "Zimbábue" }));
        jPanel1.add(Nacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 210, 40));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel16.setText("Email");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 263, 97, 30));

        JestadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Civil", "Solteriro/a", "Casado/a", "Divorciado/", " " }));
        JestadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JestadoCivilActionPerformed(evt);
            }
        });
        jPanel1.add(JestadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 220, 40));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 220, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void JestadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JestadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JestadoCivilActionPerformed

    private void RegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarActionPerformed
     //   ClienteModel c =new ClienteModel();
     
     if(NomedoCliente.getText().isEmpty()||Apelido.getText().isEmpty()||BilhetedeIdentidade.getText().isEmpty()||Telefone.getText().isEmpty()){ Notifications.getInstance().show(Notifications.Type.WARNING
                , "Preecha Todos Campos");}else{
        Cliente a = new Cliente();
        String Data = " "+Datas.getSelectedDate().getDay()+" de "+Datas.getSelectedDate().getMonth()+" de "+Datas.getSelectedDate().getYear();

        String sexo ="";
        if(rFeminino.isSelected()){
            sexo = "Femenino";
        }else if(rMasculino.isSelected()){
            sexo ="Masculino";
        }

        String nacionalidade = Nacionalidade.getSelectedItem().toString();
        String nome = NomedoCliente.getText();
        String apelido = Apelido.getText();
        String identidade = BilhetedeIdentidade.getText();
        String estadoCivil = JestadoCivil.getSelectedItem().toString();
        
      
       String email = Telefone.getText();
        clienteDao dao = new clienteDao();
    ArrayList<Cliente> openFile = dao.openFile();
       a.setNome(nome);
       a.setId((openFile.size()+1));
       a.setApelido(apelido);
       a.setNaturalidade(nacionalidade);
       a.setEstadocivil(estadoCivil);
       a.setIdentidade(identidade);
       a.setSexo(sexo);
       a.setDataNascimento(Data);
       a.setIcon(image);
       a.setCarro(carro);
        System.out.println(carro.getFabricante());
        dao.insert(a);
        
         Pagamentos form = new Pagamentos(funcionario, carro, a,frame);
         
         frame.getContente().setLayout(new BorderLayout());
         frame.getContente().removeAll();
         frame.getContente().add(form,BorderLayout.CENTER);
         frame.getContente().revalidate();
         frame.getContente().repaint();
      a.setTelefone(Integer.parseInt(Telefone.getText()));}
    }//GEN-LAST:event_RegistarActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        // TODO add your handling code here:
        JnaFileChooser ch = new JnaFileChooser() ;
        ch.showOpenDialog(frame);

        String selectedFile = ch.getSelectedFile().toString();
        image = new ImageIcon(selectedFile);
        imageAvatar2.setImage(image);
    }//GEN-LAST:event_SelecionarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        Datas.showPopup();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void DatedeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatedeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatedeNascimentoActionPerformed

    private void rFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFemininoActionPerformed
        if(rFeminino.isSelected()){
            rMasculino.setSelected(false);
        }
    }//GEN-LAST:event_rFemininoActionPerformed

    private void rMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMasculinoActionPerformed
        if(rMasculino.isSelected()){
            rFeminino.setSelected(false);
        }
    }//GEN-LAST:event_rMasculinoActionPerformed

    private void BilhetedeIdentidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BilhetedeIdentidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BilhetedeIdentidadeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApelidoActionPerformed

    private void NomedoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomedoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomedoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apelido;
    private javax.swing.JTextField BilhetedeIdentidade;
    private ViewFuncionario.DateChooser Datas;
    private javax.swing.JTextField DatedeNascimento;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> JestadoCivil;
    private javax.swing.JComboBox<String> Nacionalidade;
    private javax.swing.JTextField NomedoCliente;
    private javax.swing.JButton Registar;
    private javax.swing.JButton Selecionar;
    private javax.swing.JTextField Telefone;
    private View.Admin.ImageAvatar imageAvatar2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rFeminino;
    private javax.swing.JRadioButton rMasculino;
    // End of variables declaration//GEN-END:variables
}
