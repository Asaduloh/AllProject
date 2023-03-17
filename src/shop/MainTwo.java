package shop;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        User user =new User();
        int i;
        System.out.println("Admin bolsangiz->1  Haridor bolsangiz ->2");
        i = scanner.nextInt();
        if (i == 1) {

            admin.getAdmin();
        } else if (i==2) {

            user.getUser();
        }
    }


}
