package View.Admin;

import DAO.AdminDao;
import Model.Admin;
import java.util.ArrayList;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
        AdminDao  dao = new AdminDao();
        ArrayList<Admin> openFile = dao.openFile();
        lNome.setText(openFile.get(0).getNome()+" "+openFile.get(0).getApelido());
        lEmail.setText(openFile.get(0).getE_mail());
        imageAvatar1.setImage(openFile.get(0).getIcon());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNome = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        imageAvatar1 = new View.Admin.ImageAvatar();

        setMinimumSize(new java.awt.Dimension(264, 193));

        lNome.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        lNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome.setText("a");
        lNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lEmail.setText("a");

        imageAvatar1.setGradientColor1(new java.awt.Color(118, 11, 189));
        imageAvatar1.setGradientColor2(new java.awt.Color(199, 162, 17));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmail)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Admin.ImageAvatar imageAvatar1;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNome;
    // End of variables declaration//GEN-END:variables
}
