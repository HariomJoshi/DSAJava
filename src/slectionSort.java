import java.util.Arrays;

public class slectionSort {
    public static void main(String[] args) {
        int[] arr = {4 ,5, 3, 1,2, 0, -7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // below, I am selecting the minimum element and putting it in i'th place
    // you can select the max also, in that case the loop must be reverse
    static void sort(int[] arr){
        for (int i = 0; i< arr.length; i++){
            int minIndex = i;  // you can take max as well
            for (int j = i; j< arr.length; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(i, minIndex, arr);
        }
    }
    static void swap(int a,int b,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
