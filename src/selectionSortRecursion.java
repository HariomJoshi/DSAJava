import java.sql.SQLOutput;
import java.util.Arrays;

public class selectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {21, 43, 2, 54, 7, 6, 14, 9};
        selecSort(arr, 8, 1);
    }
    static void selecSort(int[] arr, int N, int start){
        int min = start;
        if(start == N-1){
            System.out.println(Arrays.toString(arr));
        }
        for(int j = start+1; j<N; j++){
            if (arr[min] > arr[j]){
                min = j;
            }
        }
        swap(arr, start, min);
        selecSort(arr, N, start+1);
    }
    static void swap(int[] arr, int i, int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
