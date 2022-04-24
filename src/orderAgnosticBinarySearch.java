public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        // following is a descending order sorted array
        // int[] arr = {-342, -43, -8, -2, 0, 4, 5, 8, 23, 45, 76, 645};
        // the following is a descending order sorted array
        int[] arr = {342, 222, 43, 5, 0, -4, -90, -101, -300};

        int target = -4;
        int ans = OABS(arr, target);
        System.out.println(ans);
    }

    static int OABS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            // find whether the array is ascending or descending
            boolean isAsc = arr[start]<arr[end];
            if (arr[mid] == target){
                   return mid;
            }
            else if(isAsc){
                if(target< arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target> arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}

// time complexity is same because one of the will run in any case

