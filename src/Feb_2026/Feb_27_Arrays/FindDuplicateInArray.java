package Feb_2026.Feb_27_Arrays;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,2,8,9,2,6,1,4};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]== arr[j]){
                    System.out.println("Duplicate element: "+arr[i]);
                    break;
                }
            }
        }
    }
}
