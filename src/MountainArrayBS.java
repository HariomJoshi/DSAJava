import java.util.Arrays;

public class MountainArrayBS {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 3, 4, 5, 5, 8, 4, 2,1};
        int target = 3;
//        System.out.println(arr[peakIndex(arr)]); // the element itself
        System.out.println(peakIndex(arr, target)); // index of the element
        Solution_leet sol = new Solution_leet();
        System.out.println(sol.validMountainArray(arr));
    }
    static int peakIndex(int[] arr, int target){
        int start = 0;

        int end = arr.length -1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]> arr[mid+1]){
                end = mid;
                // end != mid-1 because we don't know about arr[mid -1] so far
            }else{
                start = mid+1;
            }
        }
        return start; // or end, since both are equal
    }
}
class Solution_leet {
    public boolean validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start< end){
            int mid = start + (end - start)/2;
            if(arr[mid]< arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        if(start< arr.length && start >= 0){
            return false;
        }
        return true;
    }
}