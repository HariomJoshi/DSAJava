
import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        int[] arr = {32, 4, 54, 5, 45, 6, 7, 5, 0};
        int[] arr2 = {32, 4, 54, 5, 45, 6, 7, 5, 0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
        int[] sorted = mergeSort(arr2);
        System.out.println(Arrays.toString(sorted));
        System.out.println(count2);

    }
    public static int count = 0;
    public static void insertSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int min = i;
            for(int j =arr.length-1; j>i; j--){
                if(arr[j]< arr[min]){
                    min = j;
                    
                }
                count++;
            }
            // swap arr[i] and arr[max]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));
        return merge(left, right);
    }
    public static int count2 = 0;
    public static int[] merge(int[] left, int[] right){
        int i = 0;  // left array pointer
        int j = 0;  // right array pointer
        int k = 0;  // main array pointer
        int[] output = new int[left.length + right.length];
        while(i < left.length && j< right.length){
            if(right[j]< left[i]){
                output[k++] = right[j++];
            }
            else{
                output[k++] = left[i++];
            }
            count2++;  // comparision count
        }
        // if left array is empty
        while(i< left.length){
            output[k++] = left[i++];
        }

        while(j < right.length){
            output[k++] = right[j++];

        }
        return output;
    }

}
