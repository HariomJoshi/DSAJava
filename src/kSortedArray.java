import java.lang.reflect.Array;
import java.util.Arrays;


public class kSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 21, 41, 5, 38, 7, 37, 2, 13, 40, 17, 34};
        int k = 3;
        int n = 12;
        String ans = isKSortedArray(arr, n, k);
        System.out.println(ans);
    }
    static String isKSortedArray(int[] arr, int n, int k){
        int[] oldArr = new int[n];
        for (int i=0; i<n; i++){
            oldArr[i] = arr[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i<n; i++){
            int sortedIndex = binarySearch(arr, oldArr[i]);
            System.out.println(i);
            System.out.println(sortedIndex);
            if(Math.abs(sortedIndex - i) <=k){
                count++;
            }
        }
        if(count == arr.length){
            return "Yes";
        }
        else{
            return "No";
        }
    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1; // the code mustn't reach here
    }
}
