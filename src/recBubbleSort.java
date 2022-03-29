import java.lang.reflect.Array;
import java.util.Arrays;

public class recBubbleSort {
    public static void main(String[] args){
    // num starts with 1
        int[] array = {21, 54, 6, 7, 3, 1, 56};
        int[] sorted = bubbleSort(array, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    static int[] bubbleSort(int[] arr, int num){
        int swap = 0;
        for(int i = 0; i< num;i++){
            if(arr[i]>arr[i+1]){
                // swap 
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap++; //stores the number of swaps

            }
        }
        // base condition
        if(swap == 0){
            return arr;
        }
        return bubbleSort(arr, num-1);

    }
}
