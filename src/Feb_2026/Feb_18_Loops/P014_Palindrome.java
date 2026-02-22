package Feb_2026.Feb_18_Loops;

public class P014_Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int org_n = n;
        int rev =0;
        while (n!=0){
            int lastDigit = n%10;
            rev = rev * 10 +lastDigit;
            n/=10;
        }
        if (org_n == rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not");
        }
    }
}
