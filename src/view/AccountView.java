package view;

import controllers.ControllerAccount;

import java.util.Scanner;

import static java.nio.file.Files.delete;

public class AccountView {
    Scanner scanner = new Scanner(System.in);

    ControllerAccount controllerAccount = new ControllerAccount();
    DrinkAndFoodView drinkAndFoodView = new DrinkAndFoodView();

    public void menuAccount() {
        int choice = 0;

        while (true) {
            System.out.println("---------Menu Account---------");
            System.out.println("1.Add account");
            System.out.println("2.Edit account");
            System.out.println("3.Delete account");
            System.out.println("4.Display all");
            System.out.println("5.Menu food");
            System.out.println("6.Exit");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Please enter number");
                choice = -1;
            }
            switch (choice) {
                case 1:
                    controllerAccount.addAcc();
                    break;
                case 2:
                    controllerAccount.editAcc();
                    break;
                case 3:
                    controllerAccount.delete();
                    break;
                case 4:
                    controllerAccount.show1();
                    break;
                case 5:
                    drinkAndFoodView.menuDrinkAndFood();
                    break;
                case 6:
                    return;

            }
        }
    }
}
