package Feb_2026.Feb_22_Methods;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter User Name:");
        String userName = sc.nextLine();
        System.out.println("Please enter Password");
        String password = sc.nextLine();
        boolean isValid = validateLogin(userName,password);
        if (isValid){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Invalid Credentials ");
        }

    }
    public static boolean validateLogin(String userName, String password) {
        return "admin".equals(userName)&& "1234".equals(password);
    }

}
