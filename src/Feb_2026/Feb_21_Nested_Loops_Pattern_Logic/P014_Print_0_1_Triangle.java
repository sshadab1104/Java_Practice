package Feb_2026.Feb_21_Nested_Loops_Pattern_Logic;

public class P014_Print_0_1_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2 ==0){
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

    }
}
