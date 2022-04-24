import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {21, 43, 2, 54, 7, 6, 14, 9};
        System.out.println(Arrays.toString(selecSort(arr, 8)));
    }

    static int[] selecSort(int[] arr, int N){
        int count = 0;
        for (int i = 0; i<N; i++){
            count += N -i-1;
//            int min = arr[i];
            // since we have to swap elements, so we will store index instead of number
            int min = i;
            for(int j = i+1; j<N; j++){
                if (arr[min] > arr[j]){
//                    min = arr[j];
                    min = j;
                }
//                count++;
            }
            swap(arr, i, min);
        }
        System.out.println(count);
        return arr;
    }
    static void swap(int[] arr, int i, int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
