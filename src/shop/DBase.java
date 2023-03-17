package shop;

import java.sql.*;

public class DBase {

    public static final String url = "jdbc:mysql://localhost:3306/world";
    public static final String dbuser = "root";
    public static final String dbpassword = "asadbek20071008";

    public DBase() {

    }

    public void saveProduct(Product product) {
        try {
            Connection connection =
                    DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            String query = "INSERT INTO product (product_name,product_price,product_count) values('" + product.getName() + "','" + product.getPrice() + "','" + product.getCount() + "')";
            statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getProduct() {
        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM product";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String productName = resultSet.getString("product_name");
                int productPrice = resultSet.getInt(3);
                int productCount = resultSet.getInt(4);
                Product product = new
                        Product(id, productName, productPrice, productCount);
                System.out.println(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(int id) {
        Connection connection;
        try {
            connection =
                    DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            String query = "DELETE FROM product where id = '" + id + "'";
            statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct(Product product) {
        try {
            Connection connection =
                    DriverManager.getConnection(url, dbuser, dbpassword);
            PreparedStatement statement = connection.prepareStatement("UPDATE product set product_name = ? ,product_price =? , product_count = ? where id = ? ;");
            statement.setString(1, product.getName());
            statement.setInt(2, product.getPrice());
            statement.setInt(3, product.getCount());
            statement.setInt(4, product.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void minusProduct(Product product) {

        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpassword);
            PreparedStatement statement = connection.prepareStatement("Update product set product_count = product_count - ? where id = ? ");
            statement.setInt(1, product.getCount());
            statement.setInt(2, product.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }


    public Product chek(int id) {


        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            String query = "select * from product  where ID = '" + id + "'; ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                return new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public String toString() {
        return "DBase{}";
    }
}
