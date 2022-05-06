import java.util.Arrays;

public class resSelectionSort {
    public static void main(String[] args) {
        int[] arr = {32, 35, 6, 3, 23, 0, -12};
        selecSort(arr, 0, 0, arr[0]);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void selecSort(int[] arr, int s, int i, int min){
        // selecting the smallest element and placing it to left
        if(s>= arr.length){  // base condition
            return;
        }
        if(arr[s]< min){
            int temp = arr[s];
            arr[s] = min;
            min = temp; 
        }
        selecSort(arr, s+1, i, min);
        selecSort(arr, i, i, min);
    }
}
