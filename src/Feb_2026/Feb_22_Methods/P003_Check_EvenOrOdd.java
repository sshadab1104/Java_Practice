package Feb_2026.Feb_22_Methods;

import java.util.Scanner;

public class P003_Check_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        System.out.println(isEven(n));

        }
     // Parameter boolean, return type boolean
    public static String isEven(int n){
        if(n%2==0){
            return "Even";
        }else {
            return "Odd";
        }

    }

}
