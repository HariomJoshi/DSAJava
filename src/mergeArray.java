import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6,8,12,15,18};
        int[] arr2 = {5,7,9,10,14,18,19,20};
        System.out.println(Arrays.toString(merge(arr1, arr2)));

    }

    static int[] merge(int[] arr1, int[] arr2){
        int[] mergedArr = new int[arr1.length + arr2.length];
        int arr1Count = 0;
        int arr2Count = 0;
        for (int i =0; i<mergedArr.length; i++){
            // the following code won't work since
            if (arr1Count == arr1.length){ // if first array is empty so no need to check for its values, just insert the values of the left array
                for(int j = arr2Count; j< arr2.length; j++){
                    mergedArr[j] = arr2[j];
                }
            }
            else if(arr2Count == arr2.length){
                for(int j = arr1Count; j<arr1.length; j++){
                    mergedArr[j] = arr1[j];
                }
            }
            if(arr1[0]< arr2[0]){
                mergedArr[i] = arr1[0];
                delete(0, arr1);
                arr1Count+=1;
            }else if (arr1[0]> arr2[0]){
                mergedArr[i] = arr2[0];
                delete(0 , arr2);
                arr2Count +=1;
            }else{
                mergedArr[i] = arr2[0];  // it could have been arr1[0] as well
                delete(0, arr2);
                arr2Count +=1;
            }
        }
        return mergedArr;
    }

    static void delete(int index, int[] arr){
        for( int i= index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
    }
}
