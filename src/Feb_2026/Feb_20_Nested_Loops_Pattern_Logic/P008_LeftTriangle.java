package Feb_2026.Feb_20_Nested_Loops_Pattern_Logic;

public class P008_LeftTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i=n; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
