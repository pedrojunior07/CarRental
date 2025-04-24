/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import DAO.FinacasDao;
import Model.Carro;
import Model.Financas;
import Model.Vendedor;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class CarroDao implements Serializable{
      
    
    
    public static  Connection connection;

  
    
    public CarroDao(Connection connection) throws SQLException, ClassNotFoundException {
       this.connection = connection;
    }
 
    public static boolean insertBaseDedados(Carro user) throws SQLException {

        String sql ="INSERT INTO `carro` ( `modelo`, `tracao`, `categoria`, `fabricante`, `anoDeFabrico`, `quilometrosPercoridos`,`preco`, `disponivel` "
                + ", `tipoDeComustivel`"
                + ",`cor`,`descricao`,`matricula`,`assentos`,`km_litro`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

       PreparedStatement statement = connection.prepareStatement(sql);
       
       statement.setString(1, user.getModelo());
       statement.setString(2, user.getTracao());
       statement.setString(3,  user.getCategoria());
       statement.setString(4,  user.getFabricante());
       statement.setInt(5,  user.getAnoDeFabrico());
       statement.setInt(6,  user.getQuilometosPercoridos());
       statement.setDouble(7,  user.getPreco());
       statement.setBoolean(8, user.isDisponivel());
       statement.setString(9, user.getTipoDeComustivel());
       statement.setString(10,user.getCor());
       statement.setString(11, user.getDescricao());
       statement.setString(12, user.getMatricula());
       statement.setInt(13, user.getAssentos());
       statement.setInt(14, user.getKm_litro());
               
        boolean execute = statement.execute();
       
        return execute;
    }
    
    
     public static boolean updateCarro(Carro user) throws SQLException {
        String sql = "UPDATE `carro` SET `modelo`=?, `tracao`=?, `categoria`=?,"
                + " `fabricante`=?,"
                + " `anoDeFabrico`=?, " +
                     "`quilometrosPercoridos`=?,  `preco`=?,"
                + " `disponivel`=?,  "
                + "`tipoDeComustivel`=?, "
                + "`descriicao` =?, `cor`= ?" +
                   
                     "WHERE `Id`=?";
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1, user.getModelo());
       statement.setString(2, user.getTracao());
       statement.setString(3,  user.getCategoria());
       statement.setString(4,  user.getFabricante());
       statement.setInt(5,  user.getAnoDeFabrico());
       statement.setInt(6,  user.getQuilometosPercoridos());
       statement.setDouble(7,  user.getPreco());
       statement.setBoolean(8, user.isDisponivel());
       statement.setString(9, user.getTipoDeComustivel());
       statement.setString(10, user.getDescricao());
       statement.setString(11, user.getCor());
       statement.setInt(12, user.getId());
                 
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
       
    }
     
     public static boolean AlugarCarro(Carro user) throws SQLException {
        String sql = "UPDATE `carro` SET `disponiver` = ? WHERE `Id` = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, true);
            statement.setInt(2, user.getId());        
            return statement.executeUpdate() >0;
}
     
     
     public static ArrayList<Carro> selectAll() throws SQLException {
        String sql = "select * from  carro";
        PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);
    }
     
     
     private  static ArrayList<Carro> pesquisa(PreparedStatement statement1) throws SQLException {
        ArrayList<Carro> usuarios = new ArrayList<Carro>();
        statement1.execute();
        
     
        ResultSet resultSet = statement1.getResultSet();
         while (resultSet.next()) {

                Carro user = new Carro();
                user.setId(resultSet.getInt("Id"));
                user.setModelo(resultSet.getString("modelo"));
                user.setQuilometosPercoridos(resultSet.getInt("quilometrosPercoridos"));
                user.setTracao(resultSet.getString("tracao"));
                user.setCategoria(resultSet.getString("categoria"));
                user.setFabricante(resultSet.getString("fabricante"));
                user.setDisponivel(resultSet.getBoolean("disponivel"));
                user.setAnoDeFabrico(resultSet.getInt("anoDeFabrico"));
                user.setTipoDeComustivel(resultSet.getString("tipoDeComustivel"));
                user.setCor(resultSet.getString("cor"));
                user.setDescricao(resultSet.getString("descricao"));
                user.setPreco(resultSet.getDouble("preco"));
                user.setMatricula(resultSet.getString("matricula"));
                user.setAssentos(resultSet.getInt("assentos"));
                user.setKm_litro(resultSet.getInt("km_litro"));
                
          usuarios.add(user);
         }
         return usuarios;
    }
      
     
     public static Carro selectPorId(int id)throws SQLException{    
     String sql = "select * from carro where  Id = ? ";
     PreparedStatement statement = connection.prepareStatement(sql);
     statement.setInt(1,id);
    return  pesquisa(statement).get(0);  
}     
}
