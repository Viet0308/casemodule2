package controllers;

import io.ReadAndWrite;
import models.DrinkandFood;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    ControllerDrinkAndFood controllerDrinkAndFood = new ControllerDrinkAndFood();
    File file = new File("D&F.txt");
    ReadAndWrite readAndWrite = new ReadAndWrite();

    ArrayList<DrinkandFood> ListProduct = readAndWrite.read(file);
    ArrayList<DrinkandFood> orders = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);


    public void chon() {
        controllerDrinkAndFood.show();
        System.out.println("Pick ID for add to cart");
        String c = scanner.nextLine();
        System.out.println("Enter your amount");
        int a = Integer.parseInt(scanner.nextLine());

        int i = 0;
        while (i < ListProduct.size()) {
            if (c.equals(ListProduct.get(i).getId())) {
                DrinkandFood drinkandFood = new DrinkandFood(ListProduct.get(i).getId(),ListProduct.get(i).getName(),a,ListProduct.get(i).getPrice());
                orders.add(drinkandFood);
                ListProduct.get(i).setAmount(ListProduct.get(i).getAmount()-a);
            }
            i++;
        }readAndWrite.write(ListProduct,file);
    }

    public void tien() {
        double sum = 0;
        int i = 0;
        while (i < orders.size()) {
            System.out.println(orders.get(i).toString());
            sum += orders.get(i).getPrice()*orders.get(i).getAmount();
            i++;
        }
        System.out.println("Total price " + sum + " $");
    }

    public void xoa() {
        System.out.println("Enter ID need to remove of Oders");
        String id = scanner.nextLine();
        for (int i = 0; i < orders.size(); i++) {
            if (id.equals(orders.get(i).getId())) {
                orders.remove(i);
            }
            return;
        }
        System.out.println("Cannot find product");
    }
    public void show(){
        for (DrinkandFood df : orders){
            System.out.println(df);
        }
    }
}
