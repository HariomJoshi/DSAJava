public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 21, 43, 54, 56, 67, 68, 69, 70, 71, 72, 73, 74, 74, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94};
        int target = 76;
        int answer = ans(arr,target);
        System.out.println(answer);



    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            int temp = end +1;
            end = end + (end - start +1)*2;
            start = temp;
        }
        return binarysearch(arr, target, start, end);
    }


    static int binarysearch(int[] arr, int target, int start, int end){
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
