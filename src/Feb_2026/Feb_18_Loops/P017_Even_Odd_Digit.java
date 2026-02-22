package Feb_2026.Feb_18_Loops;

public class P017_Even_Odd_Digit {
    public static void main(String[] args) {
        int n = 123456;
        int even = 0;
        int odd = 0;
        while (n!=0){
            int lastDigit = n%10;
            if (lastDigit%2==0){
                even++;
            }
            else {
                odd++;
            }
            n/=10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
