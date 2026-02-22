package Feb_2026.Feb_18_Loops;

public class P016_LargestDigit {
    public static void main(String[] args) {
        int n = 3827;
        int max = Integer.MIN_VALUE;
        while (n!=0){
            int lastDigit = n%10;
            if (max<lastDigit){
                max = lastDigit;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
