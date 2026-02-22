package Feb_2026.Feb_21_Nested_Loops_Pattern_Logic;

public class P015_PrintStarPlus {
    public static void main(String[] args) {
        int n = 5;
        int mid = n/2 + 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n;j++){
                if (i==mid || j==mid){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
