/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Gerente;

import Controller.AdminController;
import Controller.GerenteController;
import Model.Carro;
import Model.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class ListarPesquisarCarro extends javax.swing.JPanel {
JFrame frame ;
    DefaultTableModel model;
     ArrayList<Carro> sellectAllCarros ;
    public ListarPesquisarCarro(JFrame frame) throws SQLException, ClassNotFoundException {
        this.frame = frame;
        
        
        
        initComponents();
        
        GerenteController cc = new GerenteController(frame);
                sellectAllCarros = cc.sellectAllCarros();
                model = new DefaultTableModel();
		model.addColumn("Marca");
		model.addColumn("modelo");
		model.addColumn("Numero de Chassi");
		model.addColumn("Numero do Motor");
		model.addColumn("Preco");
		model.addColumn("Estado");
		model.addColumn("cor");
		
                
                Table.setModel(model);
		
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        listarTodos = new javax.swing.JRadioButton();
        listarDisponiveis = new javax.swing.JRadioButton();
        listarVendidos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(Table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 710, 370));

        listarTodos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        listarTodos.setText("Listas Todos");
        listarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodosActionPerformed(evt);
            }
        });
        add(listarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 110, -1));

        listarDisponiveis.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        listarDisponiveis.setText("Listar Disponiveis");
        listarDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarDisponiveisActionPerformed(evt);
            }
        });
        add(listarDisponiveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        listarVendidos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        listarVendidos.setText("Listar Vendidos");
        listarVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarVendidosActionPerformed(evt);
            }
        });
        add(listarVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("Dispinibilidade");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 80, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Marca");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 40));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Modelo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Trcacao");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 80, 40));

        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton1.setText("Proxima");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 30));

        Anterior.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Anterior.setText("Anterior");
        add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void listarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTodosActionPerformed
listarDisponiveis.setSelected(false);
listarVendidos.setSelected(false);
 
          while (model.getRowCount() > 0) {
			model.removeRow(0);
		}
          
        for(Carro c : sellectAllCarros){
        
        model.addRow(new Object[] {   c.getFabricante(), c.getModelo(),c.getNumChassi(),c.getNumMotor(),c.getPreco(), c.isVendido(), "sem cor" });
        
        }
    }//GEN-LAST:event_listarTodosActionPerformed

    private void listarDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarDisponiveisActionPerformed
         
        listarTodos.setSelected(false);
        listarVendidos.setSelected(false);
        while (model.getRowCount() > 0) {
			model.removeRow(0);
		}
          
        for(Carro c : sellectAllCarros){
        if(!c.isVendido()){
        model.addRow(new Object[] {   c.getFabricante(), c.getModelo(),c.getNumChassi(),c.getNumMotor(),c.getPreco(), c.isVendido(), "sem cor" });
        }
        }
    }//GEN-LAST:event_listarDisponiveisActionPerformed

    private void listarVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarVendidosActionPerformed
     
        listarDisponiveis.setSelected(false);
        listarTodos.setSelected(false);
        while (model.getRowCount() > 0) {
			model.removeRow(0);
		}
          
        for(Carro c : sellectAllCarros){
        if(c.isVendido()){
        model.addRow(new Object[] {   c.getFabricante(), c.getModelo(),c.getNumChassi(),c.getNumMotor(),c.getPreco(), c.isVendido(), "sem cor" });
        }
        }
    }//GEN-LAST:event_listarVendidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton listarDisponiveis;
    private javax.swing.JRadioButton listarTodos;
    private javax.swing.JRadioButton listarVendidos;
    // End of variables declaration//GEN-END:variables
}
