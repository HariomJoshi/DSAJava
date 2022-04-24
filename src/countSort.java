import java.util.Arrays;


public class countSort {
    public static void main(String[] args){
        int[] arr = {5,8,4,3,8,5,4,8,3};
        System.out.println(Arrays.toString(sorting(arr)));

    }

    public static int[] sorting(int[] arr){
        int[] count = new int[arr.length];
        // storing the count of elements in a different array
        for(int i = 0; i< arr.length; i++){
            count[arr[i]] +=1;
        }
        // adding the consecuting elements
        for(int i = 1; i< count.length; i++){
            count[i] += count[i-1];
        }

        int[] finalArr = new int[count.length];
        // now this loop will be in reverse since we want to keep our algorithm stable
        for(int i = count.length-1; i>=0; i--){
            finalArr[count[arr[i]]-1] = arr[i];
            count[arr[i]] -=1;
        }
        return finalArr;

    }
}
