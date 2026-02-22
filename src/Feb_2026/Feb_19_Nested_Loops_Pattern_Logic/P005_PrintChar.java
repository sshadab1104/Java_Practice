package Feb_2026.Feb_19_Nested_Loops_Pattern_Logic;

public class P005_PrintChar {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n;j++){
                System.out.print((char) (64+i)+" ");
            }
            System.out.println();
        }
    }
}
