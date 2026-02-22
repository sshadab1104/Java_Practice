package Feb_2026.Feb_18_Loops;

public class P009_MulOfDigit_NonZero {
    public static void main(String[] args) {
        int n = 12506019;
        int result = 1;
        while (n!=0){
            int lastDigit = n%10;
            if (lastDigit != 0){
                result *=lastDigit;
            }
            n/=10;
        }
        System.out.println(result);
    }
}
