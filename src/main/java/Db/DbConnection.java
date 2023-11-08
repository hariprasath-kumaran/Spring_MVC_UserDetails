package Db;

import Dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static final String connectionUrl = "jdbc:mysql://localhost:3306/spring_db";
    public static final String username = "root";
    public static final String password = "root";

    public static Connection getConnection() throws ClassNotFoundException,SQLException {
        java.sql.Connection connection;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(connectionUrl, username, password);
        System.out.println("Connection" + !connection.isClosed());
        return connection;
    }

}
