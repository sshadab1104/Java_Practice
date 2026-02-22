package Feb_2026.Feb_18_Loops;

import java.util.Scanner;

public class P005_Print_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum = n*i;
            System.out.println(n+" * "+i+" = "+sum);
        }
    }
}
