
import java.util.Arrays;

// import countSort

public class radixSort extends countSort{
    public static void main(String[] args){
        int[] arr = {234, 1234, 435, 543, 904, 123, 546};
        // int[] arr2 = {3,4,5,6,6,2,3,1};
        int[] result = countSort(arr, 10);
        System.out.println("COUNT SORT -> "+ Arrays.toString(result));
        
        int[] result2 = rSorting(arr, arr.length);
        System.out.println("RADIX SORT -> "+Arrays.toString(result2));


    }

    public static int[] rSorting(int[] arr, int n){
        int max = arr[0];
        for(int i = 0; i<n; i++){  // we have to find the max
            if(arr[i]> max) max = arr[i];
        }
        System.out.println(max);
        // now we have our max element
        int i = 1;
        while(max/i > 0){
            arr = countSort(arr, i);
            i*=10;
        }
        return arr;

    }

    public static int[] countSort(int[] arr, int exp){
        int[] count = new int[10];
        Arrays.fill(count, 0);
        
        for(int i=0; i< arr.length; i++){
            count[(arr[i]/exp)%10]+=1;
        }
        // adding adjacent elements to make count array
        for(int i=0; i<9; i++){
            count[i+1] += count[i];
        }

        int[] output = new int[arr.length+1];
        for(int i=output.length -1; i>=0; i--){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]-=1;
        }
        return output;
    }
}