import java.util.Arrays;

// below function merges 2 sorted arrays

public class mergeApp {
    public static void main(String[] args){
       int[] arr1 = { 5, 22, 34, 54, 63, 89};
       int[] arr2 = { 2, 13, 45};
       System.out.println(Arrays.toString(merge(arr1, arr2)));

    }

    public static int[] merge(int[] array1, int[] array2){
        int[] mergedArray = new int[ array1.length + array2.length];
        int currDex = 0;
        int arr1Dex = 0;
        int arr2Dex = 0;

        // when both the iterators are inside both the respective arrays
        while(arr1Dex< array1.length && arr2Dex< array2.length){
            if(array1[arr1Dex]< array2[arr2Dex]){
               mergedArray[currDex++] = array1[arr1Dex++];
            }
            else{
                mergedArray[currDex++] = array2[arr2Dex++];
            }
        }
        // if array 1 is empty
        while(arr1Dex < array1.length){
            mergedArray[currDex++] = array1[arr1Dex++];
        }
        // if array 2 is empty
        while(arr2Dex < array2.length){
            mergedArray[currDex++] = array2[arr2Dex++];
        }
        return mergedArray;
    }
}
