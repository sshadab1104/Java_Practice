package Feb_2026.Feb_17_If_Else_Logical_Thinking;

import java.util.Scanner;

public class P001_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is Even number");
        }
        else {
            System.out.println(n+" is Odd number");
        }
        sc.close();


    }
}
