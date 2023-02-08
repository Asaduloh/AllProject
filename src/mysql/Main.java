package mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MysqlCity connectivity=new MysqlCity("world");
        ArrayList<WorldCity> city=new ArrayList<>();
        try {
            Statement statement=connectivity.connect().createStatement();
            ResultSet rs=statement.executeQuery("select * from city");/*("select max(Population) from city;");*/
            while (rs.next()){

                city.add(new WorldCity(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));

            }
            connectivity.connect().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        city.forEach(a-> System.out.println(a.getId()+" : "+a.getName()));
    }
}