import java.util.Arrays;


class recMergeSort{
    public static void main(String[] args){
        int[] arr = {3, 545, 6, 76, 8, 0, -2, 455};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }
    // the below code is to just merge 2 sorted array in such a way that the resultant is also a sorted array.
    public static int[] merge(int[] arr1, int [] arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];
        int a = 0; 
        int b = 0;
        int c = 0;
        // if none of them is empty so we have to compare elements and then place it
        while(a< arr1.length && b< arr2.length){
            if(arr1[a]< arr2[b]){
                mergedArray[c++] = arr1[a++];
            }else{
                mergedArray[c++] = arr2[b++];
            }
        }
        // if any of the array is empty so we just have to place another remaining array before that

        // if array 2 is empty
        while(a< arr1.length){
            mergedArray[c++] = arr1[a++];
        }

        // if array 1 is empty
        while(b< arr2.length){
            mergedArray[c++] = arr2[b++];
        }

        return mergedArray;
    }
} 