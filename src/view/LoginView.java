package view;

import controllers.ControllerAccount;
import io.ReadAndWrite;
import models.Account;
import models.admin;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginView {
    Scanner scanner = new Scanner(System.in);

    ControllerAccount controllerAccount = new ControllerAccount();
    File file = new File("Account.txt");
    ReadAndWrite readAndWrite = new ReadAndWrite();
    ArrayList<Account> ListAccount = readAndWrite.read(file);
    AccountView accountView = new AccountView();
    UserView userView;

    public void LoginView() {
        int choice = 0;

        while (true) {
                System.out.println("---------Menu Login---------");
                System.out.println("1.Login");
                System.out.println("2.Register");
                System.out.println("3.Exit");
            try {
               choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter number");
            }
            switch (choice){
                case 1:
                    Login();
                    break;
                case 2:
                    controllerAccount.addAcc();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please re-enter");
                    break;
            }
        }
    }
    public void Login() {
//         public admin(String name, String userName, String passWord, String email, String rights, String permission
//        ListAccount.add(new admin("viet","viet1234","123456","viet1234@gmail.com","admin"));
        readAndWrite.write(ListAccount,file);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your password");
        String pass = scanner.nextLine();
        int i = 0;
        boolean checkTK = false;
        while (i < ListAccount.size()) {
            if (name.equals(ListAccount.get(i).getUserName()) && pass.equals(ListAccount.get(i).getPassWord())) {
                checkTK = true;
                if (ListAccount.get(i) instanceof admin) {
                    accountView.menuAccount();
                } else {
                    userView = new UserView();
                    userView.menuUser();
                }
            }
            i++;
        }
        if (checkTK == false){
            System.out.println("Wrong ID or PassWord, please contact Admin for more information");
        }

    }
//    public void addAcc(){
//        System.out.println("Nhap ten");
//        String name = scanner.nextLine();
//        System.out.println("Nhap ten account");
//        String userName = scanner.nextLine();
//        System.out.println("Nhap mat khau");
//        String passWord = scanner.nextLine();
//        System.out.println("Nhap email");
//        String email = scanner.nextLine();
//
//        Account account = new Account(name,userName,passWord,email);
//        ListAccount.add(account);
//        readAndWrite.write(ListAccount,file);
//    }
}
