package Feb_2026.Feb_27_Arrays;

public class Lab01 {
    public static void main(String[] args) {
        int[] arr ={1,0,4,0,5,78,0,3};
        int j = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                j++;
            }
        }
        for (int n: arr){
            System.out.print(n+" ");
        }
    }
}
