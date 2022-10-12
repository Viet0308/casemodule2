package view;

import controllers.Order;

import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);

    Order order = new Order();

    public void menuUser() {
        int choice = 0;

        while (true) {

            System.out.println("---------Menu Account---------");
            System.out.println("1.Menu pruducts & add to cart");
            System.out.println("2.See your cart");
            System.out.println("3.Delete product of cart");
            System.out.println("4.Get your payment");
            System.out.println("5.Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Please enter number");
            }


            switch (choice) {
                case 1:
                    order.chon();
                    break;
                case 2:
                    order.show();
                    break;
                case 3:
                    order.xoa();
                    break;
                case 4:
                    order.tien();
                    break;
                case 5:
                    return;
            }
        }
    }

}
