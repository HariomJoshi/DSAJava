import java.util.Arrays;

public class recSelectionSort {
    public static void main(String[] args){
        int[] arr = {21, 4, 5, 65, 75, 40, 1};
        int[] sorted = selectionSort(arr,1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] selectionSort(int[] arr, int num){
        // base condition
        if(num == arr.length-1){
            return arr;
        }

        int min = 0;
        for(int i =num; i<arr.length; i++){
            if(arr[i]< arr[min]){
                min = i;  // min stored the index of the minimum number
            }
        }
        // swapping min with its right place
        int temp = arr[min];
        arr[min] = arr[num];
        arr[num] = temp;

        return selectionSort(arr, num+1);
        



    }
    
}
