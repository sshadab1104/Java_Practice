package Feb_2026.Feb_17_If_Else_Logical_Thinking;

//import java.util.Scanner;

import java.util.Scanner;

public class P004_Simple_Login_Logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter user name");
        String userName = sc.nextLine();
        System.out.println("Please enter password");
        String password = sc.nextLine();
        //String userName = "admin";
        //String password = "1234";
        if (userName.equals("admin") && password.equals("1234")){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Invalid Credentials");
        }
    }
}
