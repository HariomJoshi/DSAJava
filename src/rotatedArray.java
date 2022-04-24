public class rotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 6, 7, 1, 2, 3, 3};
        int target = 2;
        // System.out.println(findPivot(arr));
        int pivot = findPivot(arr);
        System.out.println(pivot);
        int ans = BinarySearch(arr, target, 0, pivot);
        if(ans == -1){
            ans =  BinarySearch(arr, target, pivot, arr.length-1);
        }
        System.out.println(ans);

    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid> end && arr[mid]<arr[mid+1]){
                return mid;
            }
            else if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<arr[start]){
                end = mid-1;
            }
            else{
                start = start +1;
            }
        }
        return -1;
    }
}
