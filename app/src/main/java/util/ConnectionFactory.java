package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
    
    //Fechar a Conexão e o Statement
    public static void closeConnection(Connection connection, PreparedStatement statement){
        try {
            if(connection != null){
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultset){
        try {
            if(connection != null){
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultset != null) {
                resultset.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    }
}
