public class binarySearchRec {
    public static void main(String[] args){
        int[] arr = {3,7,8, 23, 56, 78, 109};
        int ans = bsRec2(arr, 23, 0, arr.length-1);
        System.out.println(ans);
    }

    static int bsRec(int[] arr, int target, int start , int end){

        int mid = start + (end -start)/2;
        // item not found
        if(start> end){
            return -1;
        }
        // base condition
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]<target){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
        
        return bsRec(arr, target, start, end);  // recursive approach for binary search
        
    }

    // one more recursive approach could be as follows

    static int bsRec2(int[] arr, int target, int start, int end ){
        int mid = start + (end - start)/2;
        // item not found
        if(start>= end){
            return -1;
        }
        // base case
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return bsRec2(arr, target, start, mid -1);
        }
        else{
            return bsRec2(arr, target, mid + 1, end);
        }
        
        
    }
    
}
