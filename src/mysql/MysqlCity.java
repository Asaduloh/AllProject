package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlCity {
    private final String dataBase;
    public static final String className = "oracle  .jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER = "root";
    public static final String PASSWORD = "asadbek20071008";

    public MysqlCity(String dataBase) {
        this.dataBase = dataBase;
    }

    public Connection connect() {
        Connection connection;
        try {
            // Class.forName(className);
            connection = DriverManager.getConnection(URL + getDataBase(), USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public String getDataBase() {
        return dataBase;
    }
}