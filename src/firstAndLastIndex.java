
import java.util.Arrays;

public class firstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 5, 5, 6, 6, 7};
        int target = 3;
        System.out.println(Arrays.toString(indexes(arr, target)));
    }
    static int[] indexes(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int[] ans = {-1, -1};
        // we can run the whole loop 2 times, first is for the first occurrence and second one for the last occurrence

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid -1;

            }
            else{
                // when target == arr[mid] we want to move on to array with larger numbers
                start = mid+1;
            }
        }
        ans[1] = start-1;


        start = 0;
        end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1;

            }
            else{
                // when target == arr[mid] we want to move on to array with larger numbers
                end = mid-1;
            }

        }
        ans[0] = end+1;
        return ans;
    }
}
