package validate;

import java.util.ArrayList;
import java.util.Scanner;

public class Validate {
        public static final String REGEX_STRING = "[A-Z][\\sA-Za-z]+";

        public static final String REGEX_ID_FAD = "[A-Z]{3}";
        public static final String REGEX_ACCOUNT = "[A-Za-z0-9]{6,10}";
        public static final String REGEX_EMAIL = "[A-Za-z0-9]+@[a-z]+.[com |vn]+";
        public static final String REGEX_NUMB = "[0-9]{1,4}";
        public static final String REGEX_NUM = "[0-9]+";
        static Scanner scanner = new Scanner(System.in);

        public static String validateName() {
            while (true) {
                String name = scanner.nextLine();
                if (name.matches(REGEX_STRING)) {
                    return name;
                }
                System.err.println("Enter the wrong format,( capitalize the first letter ),  re-enter :");
            }
        }

        public static int validateNum() {
            while (true) {
                String choice = scanner.nextLine();
                if (choice.matches(REGEX_NUM)) {
                    return Integer.parseInt(choice);
                } else System.err.println("Enter the wrong format (num must be 0-9), re-enter :");
            }
        }


        public static String validateEmail(){
            while(true) {
                String email = scanner.nextLine();
                if (email.matches(REGEX_EMAIL)) {
                    return email;
                } else System.err.println("Enter the wrong format ( email must be 'a-z and 0-9'@'a-z'.(com or vn)), re-enter :");
            }
        }

        public static String validatepassWord() {
            while (true) {
                String passWord = scanner.nextLine();
                if (passWord.matches(REGEX_ACCOUNT)) {
                    return passWord;
                } else
                    System.err.println("Enter the wrong format ( pw must be a-z and 0-9, into 6-10 letter ) re-enter :");
            }
        }
}
