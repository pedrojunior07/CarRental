/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View.Gerente;

import DAO.AdminDao;
import DAO.FinacasDao;
import Model.Admin;
import Model.Financas;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        AdminDao ad = new AdminDao();
//        ArrayList<Admin> openFile = ad.openFile();
//       openFile.get(0).setSenha("paranoid");
//        ad.upDate(openFile.get(0));
       // System.out.println( openFile.get(0).getSenha());
        
        Calendar c = Calendar.getInstance();
        FlatMacDarkLaf.setup();
       
        System.out.println( JOptionPane.showConfirmDialog(null, "confirmar"));  
    }
    
}
