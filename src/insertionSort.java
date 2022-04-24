import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args){
        int[] arr = {32, -4, 5,65, 7,76,90};
        insertionSortfunc(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(median(arr));
    }
    // [21, 43, 54, 6, 54]
    // [21, 43, 54, 54, 54]
    // [21, 43, 43, 54, 54]
    // [21, 21, 43, 54, 54]
    // [6, 21, 43, 54, 54]

    static void insertionSortfunc(int[] arr){
        int copies = 0;
        int comparisions = 0;
        for (int i = 1; i<arr.length; i++){
            int curr = i-1;
            int key = arr[i];
            while(curr>=0 && arr[curr]> key){
                comparisions++;
                arr[curr+1] = arr[curr];
                copies++;
                curr--;  // when curr == 0 so it will be decremented to -1, therefore
                // to avoid index out of bounds exception we have to use it by curr+1
                // because curr+1 is our desired location instead of curr
            }
            arr[curr+1] = key;
            if(curr == -1){
                comparisions++;
            }
            
        }
        System.out.println(copies);
        System.out.println(comparisions);
    }

    // following function returns the median of the array
    static int median(int[] arr){
        // insertionSortfunc(arr);
        int mid = (0 + arr.length -1)/2;
        return arr[mid];

    }

    static void noDups(int[] arr){

    }
}
