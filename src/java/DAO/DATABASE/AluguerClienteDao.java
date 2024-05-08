/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import Model.Aluguer;
import java.util.ArrayList;
import Model.Cliente;
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
public class AluguerClienteDao {

    private static Connection connection;

    public AluguerClienteDao(Connection connection) {
        this.connection = connection;
    }

    public static void insertAluguerCliente(Aluguer aluguer) throws SQLException {
        String sql = "INSERT INTO Aluguer_Cliente (IdCarro, IdCliente, dataInicio, dataFim, status, Preco) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, aluguer.getIdCarro());
        statement.setInt(2, aluguer.getIdCliente());
        statement.setDate(3, aluguer.getDataInicio());
        statement.setDate(4, aluguer.getDataFim());
        statement.setBoolean(5, aluguer.getStatus());
        statement.setDouble(6, aluguer.getPreco());

        statement.execute();
    }

    public static ArrayList<Aluguer> selectAllAlugueres() throws SQLException {
        String sql = "SELECT * FROM Aluguer_Cliente";
        PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisaAlugueres(statement);
    }

    private static ArrayList<Aluguer> pesquisaAlugueres(PreparedStatement statement) throws SQLException {
        ArrayList<Aluguer> alugueres = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Aluguer aluguer = new Aluguer();
            aluguer.setIdCarro(resultSet.getInt("IdCarro"));
            aluguer.setIdCliente(resultSet.getInt("IdCliente"));
            aluguer.setDataInicio(resultSet.getDate("dataInicio"));
            aluguer.setDataFim(resultSet.getDate("dataFim"));
            aluguer.setStatus(resultSet.getBoolean("status"));
            aluguer.setPreco(resultSet.getDouble("Preco"));

            alugueres.add(aluguer);
        }

        return alugueres;
    }
}