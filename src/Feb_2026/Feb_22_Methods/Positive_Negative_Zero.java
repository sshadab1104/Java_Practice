package Feb_2026.Feb_22_Methods;

import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int input = sc.nextInt();
        String result = checkNumber(input);
        System.out.println("Number is: "+result);

    }
    public static String checkNumber(int number){
        if (number==0){
            return "Zero";
        } else if (number>0) {
            return "Positive";
        }
        else {
            return "Negative";
        }
    }
}
