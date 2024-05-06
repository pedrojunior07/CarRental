package DAO.DATABASE;

import Model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDao {
    
    private static Connection connection;

    public ClienteDao(Connection connection) {
        this.connection = connection;
    }

    public static void insertCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, sexo, apelido, naturalidade, identidade, estadocivil, email, senha, localizacao, dataNascimento, idade, telefone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getSexo());
        statement.setString(3, cliente.getApelido());
        statement.setString(4, cliente.getNaturalidade());
        statement.setString(5, cliente.getIdentidade());
        statement.setString(6, cliente.getEstadocivil());
        statement.setString(7, cliente.geteMail());
        statement.setString(8, cliente.getSenha());
        statement.setString(9, cliente.getLocalizacao());
        statement.setDate(10, cliente.getDataNascimento());
        statement.setInt(11, cliente.getIdade());
        statement.setInt(12, cliente.getTelefone());

        statement.execute();
        connection.close();
        JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso", "Base De Dados", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean updateCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nome=?, sexo=?, apelido=?, naturalidade=?, identidade=?, estadocivil=?, email=?, senha=?, localizacao=?, dataNascimento=?, idade=?, telefone=? WHERE Id=?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getSexo());
        statement.setString(3, cliente.getApelido());
        statement.setString(4, cliente.getNaturalidade());
        statement.setString(5, cliente.getIdentidade());
        statement.setString(6, cliente.getEstadocivil());
        statement.setString(7, cliente.geteMail());
        statement.setString(8, cliente.getSenha());
        statement.setString(9, cliente.getLocalizacao());
        statement.setDate(10, cliente.getDataNascimento());
        statement.setInt(11, cliente.getIdade());
        statement.setInt(12, cliente.getTelefone());
        statement.setInt(13, cliente.getId());

        int rowsUpdated = statement.executeUpdate();
        return rowsUpdated > 0;
    }

    public static ArrayList<Cliente> selectAllClientes() throws SQLException {
        String sql = "SELECT * FROM cliente";
        PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisaClientes(statement);
    }

    private static ArrayList<Cliente> pesquisaClientes(PreparedStatement statement) throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("Id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setSexo(resultSet.getString("sexo"));
            cliente.setApelido(resultSet.getString("apelido"));
            cliente.setNaturalidade(resultSet.getString("naturalidade"));
            cliente.setIdentidade(resultSet.getString("identidade"));
            cliente.setEstadocivil(resultSet.getString("estadocivil"));
            cliente.seteMail(resultSet.getString("email"));
            cliente.setSenha(resultSet.getString("senha"));
            cliente.setLocalizacao(resultSet.getString("localizacao"));
            cliente.setDataNascimento(resultSet.getDate("dataNascimento"));
            cliente.setIdade(resultSet.getInt("idade"));
            cliente.setTelefone(resultSet.getInt("telefone"));

            clientes.add(cliente);
        }

        return clientes;
    }

    public static Cliente selectClienteById(int id) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE Id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ArrayList<Cliente> clientes = pesquisaClientes(statement);
        if (clientes.size() > 0) {
            return clientes.get(0);
        } else {
            return null;
        }
    }
}
