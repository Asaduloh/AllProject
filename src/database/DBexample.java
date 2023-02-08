package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBexample {
   String url = "jdbc:mysql://127.0.0.1:3306/world";
   String user = "root";
   String password= "asadbek20071008";

   public void saveProduct(Product product){
      try {
         Connection connection = DriverManager.getConnection(url,user,password);
         Statement statement = connection.createStatement();
         String query = "INSERT INTO products (product_name,product_price,product_count) values ('"+product.productName+"', '"+product.productPrice+"', '"+product.productCount+"');";

         statement.execute(query);
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }
}
