package Feb_2026.Feb_22_Methods;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        int result = getSquare(num);
        System.out.println(num+" square is: "+result);

    }
    public static int getSquare(int n){
        return n*n;
    }
}
