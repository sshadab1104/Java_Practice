package Feb_2026.Feb_27_Arrays;

import java.util.Scanner;

public class LinearSearchMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        boolean result = numberFound(number);
        if (result){
        System.out.println("Number found in Array");
        }
        else {
            System.out.println("Number not found in Array");
        }
    }
    public static boolean numberFound(int number){
        int[] arr = {20,45, 78, 89, 56, 23 };
        for (int i=0; i<arr.length; i++){
            if (arr[i]==number){
                return true;

            }
        }
        return false;
    }
}
