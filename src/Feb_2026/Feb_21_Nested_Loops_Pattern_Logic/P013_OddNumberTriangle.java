package Feb_2026.Feb_21_Nested_Loops_Pattern_Logic;

public class P013_OddNumberTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
    }


}
