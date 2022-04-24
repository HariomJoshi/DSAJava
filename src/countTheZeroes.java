// https://practice.geeksforgeeks.org/problems/count-the-zeros2550/1/?category[]=Searching&category[]=Searching&difficulty[]=0&page=1&query=category[]Searchingdifficulty[]0page1category[]Searching


public class countTheZeroes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,1,1, 1,1, 1, 1, 1, 0, 0, 0, 0, 0};
        int n = 13;
        System.out.println(sol.countZeroes(arr, n));
    }
}

class Solution {
    int countZeroes(int[] arr, int n) {
        int count = 0;
        for(int element: arr){
            if(element == 0){
                count++;
            }
        }
        return count;
    }

}
