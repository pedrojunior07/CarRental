/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DAO.DATABASE;

import Model.Carro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
         new CarroDao(new Conexao().getConnection());
                ArrayList<Carro> carros = CarroDao.selectAll();
                for (Carro elem : carros) {
                      System.out.println(
                    new ImagensDao(new Conexao()
                    .getConnection())
                    .selectImagensPorMatricula(elem
                    .getMatricula())
                    .getCarroImagens().toString());
                        
                 
                    }
        
        
    }
    
}
