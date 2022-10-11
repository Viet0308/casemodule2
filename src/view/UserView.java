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
            System.out.println("1.Chon mon");
            System.out.println("2.Xoa mon");
            System.out.println("3.Tinh tien");
            System.out.println("4.Exit");
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
                    order.xoa();
                    break;
                case 3:
                    order.tien();
                    break;
                case 4:
                    return;
            }
        }
    }

}
