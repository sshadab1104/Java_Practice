package Feb_2026.Feb_18_Loops;

public class P011_ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int org_n = n;
        int rev =0;
        while (n!=0){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;
        }
        System.out.println(rev+org_n);
    }
}
