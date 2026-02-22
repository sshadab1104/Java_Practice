package Feb_2026.Feb_21_Nested_Loops_Pattern_Logic;

public class P019_ReverseTriangle2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
