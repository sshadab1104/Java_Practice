package Feb_2026.Feb_18_Loops;

public class P012_Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i =1; i<=n; i++){
            fact = fact*i;
            System.out.println(fact);
        }
        System.out.println(fact);
    }
}
