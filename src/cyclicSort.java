// when given numbers from range 1 to N, we must use cyclic sort
import java.util.Arrays;
public class cyclicSort{
    public static void main(String[] args){
        int[] arr = {5,3,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    static void sort(int[] arr){
        for(int i =0; i< arr.length; i++){
            if(arr[i]!=i+1){
                // swap with number with number -1 index
                int temp = arr[i];
                arr[i] = arr[temp -1];
                arr[temp-1] = temp;
                i--;
            }
        }
    }
}