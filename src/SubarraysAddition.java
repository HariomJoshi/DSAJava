import java.util.Arrays;

// given an array of positive integers, find the subarrays that add upto a given number.
// subarrays are contiguoous subsets of array
public class SubarraysAddition {
    public static void main(String[] args){
        int[] arr = {1, 7, 4, 3, 1, 2, 1, 5, 1};
        int number = 7;
        // so we have to find the subarrays of arr that adds up to 7
        specificSum(arr, number);

    }

    public static void specificSum(int[] arr, int number){
        int s = 0;
        int l = 0;
        int sum = 0;
        while(l<= arr.length -1){
            while(sum< number){
                sum += arr[l++]; 
            }
            while(sum> number){
                sum -= arr[s++];
            }
            if(sum == number){
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, s, l)));
                sum -= arr[s];
                s++;
                // we don't need to do l++ because it is already incremented
            }
        }
    }
}
