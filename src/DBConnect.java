/*
import java.sql.*;
// RDBC objecta nisvbatan pars qilish
//enum
public class DBConnect {
    public static void main(String[] args) {
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world", "root", "asadbek20071008");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from city where countrycode = 'UZB';");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("Result :" + id + " " + name);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

*/
