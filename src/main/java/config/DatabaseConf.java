package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConf implements Database{

    private final String user = "nikita";
    private final String password = "nikita123";
    private final String url = "jdbc:postgresql://localhost:5432/ithillel.lesson22";
    private final Connection connection;

    public DatabaseConf() {
        this.connection = createConnection();
    }

    private Connection createConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Connection getDBConnection() {
        return this.connection;
    }
}