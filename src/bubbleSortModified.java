import java.util.Arrays;

public class bubbleSortModified {
    public static void main(String[] args) {
        int[] arr = {32, 4, 5, 65, 8, 43, 0};
        bubblesortmod(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubblesortmod(int[] arr){
        for(int i = 0; i< arr.length; i++){
            //looping forward
            for(int j = i; j<arr.length -i -1; j++){
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // once the last element is at its place, so looping backwards
            for(int j = arr.length -i-1; j>i; j--){
                if(arr[j-1]> arr[j]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
