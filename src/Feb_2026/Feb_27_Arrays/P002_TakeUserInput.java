package Feb_2026.Feb_27_Arrays;

import java.util.Scanner;

public class P002_TakeUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int number = sc.nextInt();
        int sum =0;
        int[] arr = new int[number];
        for (int i=0; i<arr.length; i++ ){
            System.out.println("Please enter array element");
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array is: "+sum);
    }
}
