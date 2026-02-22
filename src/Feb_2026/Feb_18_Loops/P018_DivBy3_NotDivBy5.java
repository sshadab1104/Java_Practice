package Feb_2026.Feb_18_Loops;

public class P018_DivBy3_NotDivBy5 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%3==0 && i%5!=0){
                System.out.println(i);
            }
        }
    }
}
