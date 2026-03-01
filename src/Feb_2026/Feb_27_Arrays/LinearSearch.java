package Feb_2026.Feb_27_Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        boolean found = false;
        int[] arr = {20,45,78,89,56,23 };
        for (int i=0; i< arr.length; i++){
            if (arr[i]==n){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Number found in array");
        }
        else {
            System.out.println("Not found: "+found);
        }
   }
}
