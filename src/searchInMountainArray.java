import java.util.ArrayList;

public class searchInMountainArray {
    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        int ans = sol.findInMountainArray(2, arr);
        System.out.println(ans);
//        System.out.println(sol.peakIndex(arr));

    }

}
class Solution_1 {
    public int findInMountainArray(int target, ArrayList<Integer> mountainArr) {
        int peakInd = peakIndex(mountainArr); // defined below
        if(binarySearch(mountainArr, target, 0, peakInd) == -1){ // also defined below
            return binarySearch(mountainArr, target, peakInd, mountainArr.size()-1);
        }else{
            return binarySearch(mountainArr, target, 0, peakInd);
        }
    }


    static int binarySearch(ArrayList<Integer> arr, int target, int start, int end){
        boolean isAsc= false;
        if((arr.get(start) - arr.get(end)) < 0){
            isAsc = true;
        }
        if(isAsc){
            while(start<=end){
                int mid = start + (end - start)/2;
                if(arr.get(mid) == target){
                    return mid;
                }else if(arr.get(mid)< target){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
        }else{
            while(start<=end){
                int mid = start + (end - start)/2;
                if(arr.get(mid) == target){
                    return mid;
                }else if(arr.get(mid)< target){
                    end = mid -1;

                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }



    static int peakIndex(ArrayList<Integer> arr){
        int start = 0;
        int end = arr.size()-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr.get(mid)> arr.get(mid+1)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}