import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int count = 0;
            for(int j = 1; j< arr.length -i; j++){
                // swap if the current item is smaller than previous item
                if (arr[j]< arr[j-1]){
                    swap(j, j-1, arr);
                    count ++;
                }
            }
            // if no swap occurs for one whole pass
            if(count == 0){
                break;
            }
        }
    }
    static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
