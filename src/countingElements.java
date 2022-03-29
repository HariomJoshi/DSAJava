import java.util.ArrayList;
import java.util.Arrays;

public class countingElements {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>(arr1.length);
        Arrays.sort(arr2);
        for(int i = 0; i< arr1.length; i++){
            ans.add(binarySearch(arr2, arr1[i]));
        }
        return ans;

    }

    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start +(end -start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;

            }
        }
        return end;
    }
}
