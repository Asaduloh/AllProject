package database;

public class Product {
    Integer id;
    String productName;
    Integer productPrice;
    Integer productCount;


    public Product(Integer id, String productName, Integer productPrice, Integer productCount) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
    }

    public Product(String productName, Integer productPrice, Integer productCount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
    }

    public Integer getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCount=" + productCount +
                '}';
    }
}
