import java.util.Arrays;

public class quickSortRec{
    public static void main(String[] args){
        int[] arr = {32, 43, 5, 675, 0, -3, -9, 56};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    
    static void quickSort(int[] arr, int l, int h){
        // base condition
        if(l >= h){
            return;
        }

        // we assign the values to different variables because, when the program runs it will alter the variables
        // and we will not be able to use them in recursion 

        int s = l;
        int e = h;
        int m = s + (e -s)/2;
        int p = arr[m];


        while(s <= e){
            while(arr[s] < p){
                s++;
            }
            while(arr[e] > p){
                e--;
            }
            if(s <= e){
                // swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, l, e);  // recursion on left part
        // s == e + 1 , since that is the only condition for loop breaking
        quickSort(arr, s, h);  // recursion on right part
    }
}