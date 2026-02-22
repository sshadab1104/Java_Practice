package Feb_2026.Feb_19_Nested_Loops_Pattern_Logic;

public class P001_Rectangle {
    public static void main(String[] args) {
        int r = 3;
        int c = 5;
        for (int i =1; i<=r; i++){
            for (int j=1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
