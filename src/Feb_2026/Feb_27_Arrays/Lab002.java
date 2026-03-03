package Feb_2026.Feb_27_Arrays;

public class Lab002 {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,5,78,0,3};
        int j= arr.length-1;
        for (int i=arr.length-1; i>=0; i--){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int n: arr){
            System.out.print(n+" ");
        }
    }
}
