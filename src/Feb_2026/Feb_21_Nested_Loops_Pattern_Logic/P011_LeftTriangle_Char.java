package Feb_2026.Feb_21_Nested_Loops_Pattern_Logic;

public class P011_LeftTriangle_Char {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char) (64+j)+" ");
            }
            System.out.println();
        }
    }
}
