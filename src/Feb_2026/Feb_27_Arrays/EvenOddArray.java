package Feb_2026.Feb_27_Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = {20,15,45,78,6};
        for (int i=0; i< arr.length; i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]+": is even number");
            }
            else {
                System.out.println(arr[i]+": is odd number");
            }
        }
    }
}
