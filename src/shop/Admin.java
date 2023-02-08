package shop;

import java.util.Scanner;

public class Admin {
    Scanner scanner = new Scanner(System.in);
    DBase database = new DBase();

    public void getAdmin(){
        int i = -1;
        while (i != 0) {
            System.out.println("1->Add Product 2-> Show Product 3 -> Delete Product 4-> Update Product 0->exit");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Enter product name");
                    String name = scanner.next();
                    System.out.println("Enter product price");
                    int price = scanner.nextInt();
                    System.out.println("Enter product count");
                    int count = scanner.nextInt();
                    database.saveProduct(new Product(name, price, count));
                    break;
                case 2:
                    database.getProduct();
                    break;
                case 3:
                    database.getProduct();
                    System.out.println("Enter id");
                    int id = scanner.nextInt();
                    database.deleteProduct(id);
                    break;
                case 4:
                    database.getProduct();
                    System.out.println("Enter id");
                    id = scanner.nextInt();
                    System.out.println("Enter product name");
                    String editname = scanner.next();
                    System.out.println("Enter product price");
                    int editPrice = scanner.nextInt();
                    System.out.println("Enter product count");
                    int editCount = scanner.nextInt();
                    database.updateProduct(new Product(id, editname, editPrice, editCount));
            }
        }

    }
}
