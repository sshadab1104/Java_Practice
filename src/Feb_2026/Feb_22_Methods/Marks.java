package Feb_2026.Feb_22_Methods;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the marks:");
        int result = sc.nextInt();
        System.out.println(marks(result));

    }
    public static String marks(int n){
        if(n>=40){
            return "Pass";
        }
        else {
            return "Fail";
        }
    }
}
