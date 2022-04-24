// https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1/?category[]=Searching&category[]=Searching&problemStatus=unsolved&difficulty[]=0&page=1&query=category[]SearchingproblemStatusunsolveddifficulty[]0page1category[]Searching

public class bitonicPoint {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr = {1,15,25,45,42,21,17,12,11};
        int n = 9;
        System.out.println(sol.findMaximum(arr, n));
    }
}
class Solution2 {
    int findMaximum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int number: arr){
            if(number>max){
                max = number;
            }
            else{
                return max;
            }
        }
        return max;
    }
}
