package shop;

import java.util.*;

public class User {
    Scanner scanner = new Scanner(System.in);
    DBase database = new DBase();

    public void getUser() {
        Map<Integer, Integer> map = new HashMap<>();
        int i = -1;
        int editCount;
        int id;
        while (i != 0) {
            System.out.println("Biror narsa xarid qilmoqchimisiz xa-> 1 Chekni chiqarish ->2 Toxtatish-> 0");

            i = scanner.nextInt();
            database.getProduct();
            switch (i) {
                case 1 -> {
                    System.out.println("Enter id");
                    id = scanner.nextInt();
                    System.out.println("Enter product count");
                    editCount = scanner.nextInt();
                    database.minusProduct(new Product(id, editCount));
                    map.put(id, editCount);

                }
                case 2 -> {
                    int i1 = 0;
                    for (int key : map.keySet()) {
                        System.err.println(database.chek(key).getName() + " : " + map.get(key) + " ta " + database.chek(key).getPrice() * map.get(key) + " so'm");
                        i1 += database.chek(key).getPrice() * map.get(key);
                    }

                    System.out.println("QQS: 12%");
                    System.out.println("Jami: " + (i1 + i1 * 12 / 100));
                }
            }
        }

    }
}
