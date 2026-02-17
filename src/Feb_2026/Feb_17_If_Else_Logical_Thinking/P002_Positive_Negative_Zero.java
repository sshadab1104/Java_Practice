package Feb_2026.Feb_17_If_Else_Logical_Thinking;

import java.util.Scanner;

public class P002_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        if (n>0){
            System.out.println(n+": Positive number");
        } else if (n<0) {
            System.out.println(n+": Negative number");
        }
        else {
            System.out.println("The number is zero");
        }
        sc.close();
    }
}
