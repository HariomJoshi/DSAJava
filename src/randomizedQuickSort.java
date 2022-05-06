import java.util.Arrays;
import java.util.Random;

public class randomizedQuickSort {
    public static void main(String[] args) {
        int[] arr= {32,4,54,6,-2,5, 0};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        // int pivot2 = r.nextInt(6-0) + 0;
        // System.out.println(arr[pivot2]);
    }
    static Random r = new Random();
    public static int comparisions = 0;
    public static void quickSort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int p = r.nextInt(e-s) + s;
        // int p = e + (s -e)/2;
        int l = s;
        int h = e;
        while(l<=h){
            while(arr[l]< arr[p]){
                comparisions++;
                l++;
            }
            while(arr[h]> arr[p]){
                comparisions++;
                h--;
            }
            if(l<=h){
                // swap both the voilations
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
                h--;
            }
        }
        
        quickSort(arr, s, h);
        quickSort(arr, l, e);
    }
}
