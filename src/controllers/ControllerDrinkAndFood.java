package controllers;

import io.ReadAndWrite;
import models.DrinkandFood;
import view.DrinkAndFoodView;

import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerDrinkAndFood {
    File file = new File("D&F.txt");
    ReadAndWrite readAndWrite = new ReadAndWrite();

    ArrayList<DrinkandFood> ListProduct = readAndWrite.read(file);
    Scanner scanner = new Scanner(System.in);


    public void them(){
        System.out.println("Enter id");
        String id = scanner.nextLine();
        for(int i=0;i<ListProduct.size();i++){
            if(id.equals(ListProduct.get(i).getId())) {
                System.out.println("ID was exist, Re-enter ID");
                return;
            }
        }
        System.out.println("Enter name of food or drink");
        String name = scanner.nextLine();
        System.out.println("Enter amount");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter price");
        double price = Double.parseDouble(scanner.nextLine());

        DrinkandFood drinkandFood = new DrinkandFood(id,name,amount,price);
        ListProduct.add(drinkandFood);
        readAndWrite.write(ListProduct, file);

    }

    public void show(){
        for (DrinkandFood x:ListProduct) {
            System.out.println(x.toString());
        }
    }

    public void delete(){
        System.out.println("Enter ID to delete");
        String id = scanner.nextLine();
        for ( int i = 0;i<ListProduct.size();i++){
            if(id.equals(ListProduct.get(i).getId())){
                ListProduct.remove(i);
            }
            return;
        }
        System.out.println("Can not find product");
    }

    public void change(){
        System.out.println("Enter ID to change");
        String id = scanner.nextLine();
        for (int i = 0; i<ListProduct.size(); i++){
            if(id.equals(ListProduct.get(i).getId())){
                ListProduct.get(i).setId(scanner.nextLine());
                ListProduct.get(i).setAmount(Integer.parseInt(scanner.nextLine()));
                ListProduct.get(i).setName(scanner.nextLine());
                ListProduct.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
            }
        }
    }

//    public void chon(){
//        System.out.println("nhap id mon muon chon");
//        String id = scanner.nextLine();
//        for(int i=0; i<ListProduct.size(); i++){
//            ListProduct.get(i).getId();
//            System.out.println(ListProduct.get(i).toString());
//            ListProductOrder.add(ListProduct.get(i));
//            break;
//        }
//    }



}