package Feb_2026.Feb_27_Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {10,25,7,99,3};
        int max = Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number is: "+max);
    }

}
