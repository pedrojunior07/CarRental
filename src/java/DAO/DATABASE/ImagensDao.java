package DAO.DATABASE;


import Model.ImagemDirectorios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ImagensDao {
    private Connection connection;

    public ImagensDao(Connection connection) {
        this.connection = connection;
    }

    public boolean insertImagem(String matricula, String caminho) throws SQLException {
        String sql = "INSERT INTO imagens (caminho, matricula) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, caminho);
        statement.setString(2, matricula);
        return statement.executeUpdate() > 0;
    }

    public ImagemDirectorios selectImagensPorMatricula(String matricula) throws SQLException {
        String sql = "SELECT * FROM imagens WHERE matricula = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, matricula);
        ResultSet resultSet = statement.executeQuery();
      
            ImagemDirectorios imagem = new ImagemDirectorios();
            imagem.setMatricula(matricula);
            imagem.setCarroImagens(  new ArrayList<String>());
        while (resultSet.next()) {
            imagem
                   .getCarroImagens()
                   .add(resultSet.getString("caminho"));
          
        }
        return imagem;
    }

    public boolean deleteImagensPorMatricula(int matricula) throws SQLException {
        String sql = "DELETE FROM imagens WHERE matricula = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, matricula);
        return statement.executeUpdate() > 0;
    }
}
