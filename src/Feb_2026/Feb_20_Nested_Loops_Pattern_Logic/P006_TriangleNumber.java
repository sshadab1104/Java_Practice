package Feb_2026.Feb_20_Nested_Loops_Pattern_Logic;

public class P006_TriangleNumber {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
