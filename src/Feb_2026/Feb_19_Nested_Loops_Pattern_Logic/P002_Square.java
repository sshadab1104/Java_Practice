package Feb_2026.Feb_19_Nested_Loops_Pattern_Logic;

public class P002_Square {
    public static void main(String[] args) {
        int a = 4, b = 4;
        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
