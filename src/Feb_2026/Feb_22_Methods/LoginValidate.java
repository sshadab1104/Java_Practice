package Feb_2026.Feb_22_Methods;

import java.util.Scanner;

public class LoginValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter User Name:");
        String userName = sc.nextLine();
        System.out.println("Please enter Password");
        String password = sc.nextLine();
        boolean isValid = validateLogin(userName,password);
        if (isValid){
            System.out.println("login successful");
        }
        else {
            System.out.println("Invalid credentials");
        }

    }
    public static boolean validateLogin(String userName, String password){
        if ("admin".equals(userName) && "1234".equals(password)){
            return true;
        }
        else {
            return false;
        }
    }
}
