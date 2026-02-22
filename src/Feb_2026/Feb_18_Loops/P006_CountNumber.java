package Feb_2026.Feb_18_Loops;

public class P006_CountNumber {
    public static void main(String[] args) {
        // Write program to count how many numbers between 1–100 are divisible by 3.
        int count =0;
        for (int i=1; i<=100; i++){
            if (i%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
