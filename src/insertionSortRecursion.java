import java.util.Arrays;

public class insertionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {21, 43, 2, 54, 7, 6, 14, 9};
        insertionSort(arr, 8, 1);
    }

    static void insertionSort(int[] arr, int N, int start){
        if (start >=N){
            System.out.println(Arrays.toString(arr));
        }
        else{
            int j = start-1;
            int key = arr[start];
            while(j>0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            insertionSort(arr, N, start + 1);
        }
    }
}
