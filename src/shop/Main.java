/*
package shop;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBase database = new DBase();
        String password = "asadbek20071008";
        int i = -1;
        System.out.println("Admin bolsangiz->1  Haridor bolsangiz ->2" );
        i = scanner.nextInt();
        while (i != 0) {
            switch (i){
                case 1:
                    System.out.print("parolni kiriting: " );
                    String code = scanner.next();
                    if (Objects.equals(code, password)) {
                        System.out.println("Qoshish uchun->1 Maxsulotni korish uchun->2 Yngilash uchun->4 Ochirish uchun->3 ");
                        switch (i){
                            case 2:
                                System.out.println("Enter product name" );
                                String name = scanner.next();
                                System.out.println("Enter product price" );
                                int price = scanner.nextInt();
                                System.out.println("Enter product count" );
                                int count = scanner.nextInt();
                                database.saveProduct(new Product(name, price, count));
                                break;
                            case 3:
                                database.getProduct();
                                break;
                            case 4:
                                database.getProduct();
                                System.out.println("Enter id" );
                                int id = scanner.nextInt();
                                database.deleteProduct(id);
                                break;
                            case 5:
                                database.getProduct();
                                System.out.println("Enter id" );
                                id = scanner.nextInt();
                                System.out.println("Enter product name" );
                                String editname = scanner.next();
                                System.out.println("Enter product price" );
                                int editPrice = scanner.nextInt();
                                System.out.println("Enter product count" );
                                int editCount = scanner.nextInt();
                                database.updateProduct(new Product(id, editname, editPrice, editCount));
                        }
                    }
                    else {
                        break;
*/
                   // }
//                case 2:
//                    database.getProduct();

          //  }

            /*switch (i) {
                case 1:
                    System.out.print("parolni kiriting: " );
                    String code = scanner.next();
                    if (!Objects.equals(code, password)) {
                        break;
                    }
                    System.out.println("Enter product name" );
                    String name = scanner.next();
                    System.out.println("Enter product price" );
                    int price = scanner.nextInt();
                    System.out.println("Enter product count" );
                    int count = scanner.nextInt();
                    database.saveProduct(new Product(name, price, count));

                    break;
                case 2:
                    database.getProduct();
                    break;
                case 3:
                    database.getProduct();
                    System.out.println("Enter id" );
                    int id = scanner.nextInt();
                    database.deleteProduct(id);
                    break;
                case 4:
                    database.getProduct();
                    System.out.println("Enter id" );
                    id = scanner.nextInt();
                    System.out.println("Enter product name" );
                    String editname = scanner.next();
                    System.out.println("Enter product price" );
                    int editPrice = scanner.nextInt();
                    System.out.println("Enter product count" );
                    int editCount = scanner.nextInt();
                    database.updateProduct(new Product(id, editname, editPrice, editCount));
            }

        }*/
    /*    }
    }
}*/