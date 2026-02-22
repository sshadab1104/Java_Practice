package Feb_2026.Feb_18_Loops;

public class P008_MulOfDigit {
    public static void main(String[] args) {
        int n = 125619;
        int result = 1;
        while (n!=0){
            int lastDigit = n%10;
            result *= lastDigit;
            n/= 10;
        }
        System.out.println(result);
    }


}
