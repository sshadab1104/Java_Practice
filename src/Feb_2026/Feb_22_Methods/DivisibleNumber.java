package Feb_2026.Feb_22_Methods;

import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        String result = checkNumber(n);
        System.out.println(result);

    }
    public static String checkNumber(int number){
        if (number%5==0 && number%3==0){
            return "Divisible by both";
        }
        else if (number%5==0){
            return "Divisible by 5";
        } else if (number%3==0) {
            return "Divisible by 3";
        }
        else {
            return "Not Divisible";
        }
    }
}
