package Dao;

import Db.DbConnection;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
 private Connection connection;

    public UserDao() throws SQLException, ClassNotFoundException {
        connection = DbConnection.getConnection();
    }
    private static String selectSQL = "SELECT * FROM login WHERE username=? and password=?;";
    private  String registersql="INSERT INTO login(username,password,country,gender,state,language)VALUES(?,?,?,?,?,?)";

    public User loginuser(String username,String password) throws SQLException {
        User user=null;

            PreparedStatement ps = connection.prepareStatement(selectSQL);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user=new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setCountry(rs.getString("country"));
                user.setState(rs.getString("state"));
                user.setLanguage(rs.getString("language"));
                user.setGender(rs.getString("gender"));

            }

        return user;
    }
    public String register(String username, String password, String country, String state, String language, String gender){
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(registersql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            preparedStatement.setString(3,country);
            preparedStatement.setString(4,gender);
            preparedStatement.setString(5,state);
            preparedStatement.setString(6,language);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "login";


    }
}
