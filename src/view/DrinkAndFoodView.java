package view;

import controllers.ControllerDrinkAndFood;

import java.util.Scanner;

public class DrinkAndFoodView {
    Scanner scanner = new Scanner(System.in);
    ControllerDrinkAndFood controllerDrinkAndFood = new ControllerDrinkAndFood();

    public void menuDrinkAndFood() {
        while (true) {
            int choice = 0;

            while (true) {
                System.out.println("------Menu Drink and Food------");
                System.out.println("1.Add Drink and Food");
                System.out.println("2.Edit Drink and Food");
                System.out.println("3.Delete Drink and Food");
                System.out.println("4.Display All");
                System.out.println("5.Exit");


                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.err.println("Please enter number");
                }
                switch (choice) {
                    case 1:
                        controllerDrinkAndFood.them();
                        break;
                    case 2:
                        controllerDrinkAndFood.change();
                        break;
                    case 3:
                        controllerDrinkAndFood.delete();
                        break;
                    case 4:
                        controllerDrinkAndFood.show();
                        break;
                    case 5:
                        return;
                }
            }
        }
    }
}
