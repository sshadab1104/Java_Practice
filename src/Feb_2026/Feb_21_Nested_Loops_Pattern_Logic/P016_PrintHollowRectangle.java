package Feb_2026.Feb_21_Nested_Loops_Pattern_Logic;

public class P016_PrintHollowRectangle {
    public static void main(String[] args) {
        int r = 4, c = 6;
        for (int i=1; i<=r; i++){
            for (int j=1; j<=c; j++){
                 if (i==1 || i==r || j==1 || j==c){
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
