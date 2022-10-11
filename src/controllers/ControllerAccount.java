package controllers;
import io.ReadAndWrite;
import models.Account;
import models.admin;
import models.user;
import validate.*;
import view.AccountView;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerAccount {
    Scanner scanner = new Scanner(System.in);
    File file = new File("Account.txt");
    ReadAndWrite readAndWrite = new ReadAndWrite();
    ArrayList<Account> ListAccount = readAndWrite.read(file);


//    public void Login() {
////         public admin(String name, String userName, String passWord, String email, String rights, String permission
//        ListAccount.add(new admin("viet","viet1234","123456","viet1234@gmail.com","admin"));
//        readAndWrite.write(ListAccount,file);
//        System.out.println("Moi ban nhap ten dang nhap");
//        String name = scanner.nextLine();
//        System.out.println("nhap password");
//        String pass = scanner.nextLine();
//        int i = 0;
//        while (i < ListAccount.size()) {
//            if (name == ListAccount.get(i).getUserName() && pass == ListAccount.get(i).getPassWord()) {
//                if (ListAccount.get(i) instanceof admin) {
//                    accountView.menuAccount();
//                } else {
//
////                    quanlyuser, san pham
//                }
//            } else {
//                System.out.println("Nhap lai");
//                Login();
//                return;
//            }
//            i++;
//        }
//    }

    public void addAcc(){
        System.out.println("Enter your name");
        String name = Validate.validateName();
        System.out.println("Enter your userName");
        String userName = scanner.nextLine();
        for(int i=0; i<ListAccount.size();i++){
            if(userName.equals(ListAccount.get(i).getUserName())){
                System.out.println("userName is exist, re-enter different userName");
                return;
            }
        }
        System.out.println("Enter your password");
        String passWord = Validate.validatepassWord();
        System.out.println("Enter your email");
        String email = Validate.validateEmail();


        Account account = new Account(name,userName,passWord,email);
        ListAccount.add(account);
        readAndWrite.write(ListAccount,file);
    }

    public void editAcc(){
        System.out.println("Enter userName need to be change");
        String userName = scanner.nextLine();
        for ( int i=0; i<ListAccount.size();i++){
            if(userName.equals(ListAccount.get(i).getUserName())){
                System.out.println("Enter your name");
                ListAccount.get(i).getName();
                System.out.println("Enter your Email");
                ListAccount.get(i).getEmail();
                System.out.println("Enter your username");
                ListAccount.get(i).getUserName();
                System.out.println("Enter password");
                ListAccount.get(i).getPassWord();
            }
        }
    }

    public void delete(){
        System.out.println("nhap ten userName can xoa");
        String userName = scanner.nextLine();
        for(int i = 0; i<ListAccount.size(); i++){
            if(userName.equals(ListAccount.get(i).getUserName())){
                ListAccount.remove(i);
            }
        }
    }

    public void show1(){
        for (Account x:ListAccount) {
            System.out.println(x.toString());

        }
    }
}