package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    //    private String
    Scanner scanner = new Scanner(System.in);
    DBase database = new DBase();

    public void getUser() {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = -1;
        int editCount = 1;

        while (i != 0) {
            System.out.println("Biror narsa xarid qilmoqchimisiz xa-> 1 Chekni chiqarish ->2 Toxtatish-> 0");
            i = scanner.nextInt();
            database.getProduct();
            switch (i) {
                case 1:
                    System.out.println("Enter id");
                    i = scanner.nextInt();
                    System.out.println("Enter product count");
                    editCount = scanner.nextInt();
                    database.minusProduct(new Product(i, editCount));

                    break;

                case 2:

                    database.chek(i,editCount);
                   /*map.put(i,editCount);
                   System.out.println(map);*/
                    break;
            }
        }

    }
}
