public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-342, -43, -8, -2, 0, 4, 5, 8, 23, 45, 76, 645};
        int target = 8;
        System.out.println(binarysearch(arr, target));

    }

    // return the index
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            // int mid = (start+ end)/2;
            // might be possible mid exceeds the range of integer in java
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                // ystem.out.printf("Element found at index %d", mid);
                return  mid;
            }
        }
        return -1;
    }
}
