package Feb_2026.Feb_18_Loops;

public class P010_SumOfEvenDigit {
    public static void main(String[] args) {
        int n = 125619;
        int sum = 0;
        while (n!=0){
            int lastDigit = n%10;
            if(lastDigit % 2 ==0){
                sum +=lastDigit;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
