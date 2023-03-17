package shop;


public class Product {
    private  Integer id;
    private  String name;
    private Integer price;
    private final Integer count;

    public Product(Integer id, String name, Integer price, Integer count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public Product(Integer id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public Product(String name, Integer price, Integer count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count ;
    }
}
