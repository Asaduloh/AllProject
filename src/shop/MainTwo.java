package shop;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = -1;
        System.out.println("Admin bolsangiz->1  Haridor bolsangiz ->2");
        i = scanner.nextInt();
        if (i == 1) {
            Admin admin = new Admin();
            admin.getAdmin();
        } else if (i==2) {
            User user =new User();
            user.getUser();
        }
    }


}
