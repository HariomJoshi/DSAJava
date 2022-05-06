import java.lang.reflect.Array;
import java.util.Arrays;

public class recBubbleSort {
    public static void main(String[] args){
    // num starts with 1
        int[] array = {21, 54, 6, 7,56, 3, 1, -43, 5, 43,4, 4323};
        // int[] sorted = bubbleSort(array, array.length-1);
        // System.out.println(Arrays.toString(array));
        bubbleSort2(array,0, array.length);
        System.out.println(Arrays.toString(array));
        
    }

    // approach 1
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

    // approach 2
    // much easier approach for bubble sort recursion
\

    // bubbleSort2(array, 0, array.length);
    static void bubbleSort2(int[] arr, int s, int t){
        // t must be equal to arr.length initially
        if(s >= t -1){
            return;
        }
        if(arr[s] > arr[s+1]){
            // swap 
            int temp = arr[s];
            arr[s] = arr[s+1];
            arr[s+1] = temp;
            
        }
        bubbleSort2(arr, s + 1, t);
        bubbleSort2(arr, 0, t-1);
    }
}
