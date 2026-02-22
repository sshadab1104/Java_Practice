package Feb_2026.Feb_18_Loops;

public class P015_SumOfDigit {
    public static void main(String[] args) {
        int n = 423;
        int sum =0;
        while (n!=0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n/=10;
        }
        System.out.println(sum);
    }
}
