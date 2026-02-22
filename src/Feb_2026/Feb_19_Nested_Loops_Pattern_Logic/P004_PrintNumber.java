package Feb_2026.Feb_19_Nested_Loops_Pattern_Logic;

import java.util.Scanner;

public class P004_PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
