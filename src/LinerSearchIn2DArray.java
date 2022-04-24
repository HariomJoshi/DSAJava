import java.util.Arrays;

public class LinerSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21, 43, 5},
                {34, 56, 65},
                {54, 65 , -7, 43},
                {3, -78}
        };
        int target = -7;
        System.out.println(Arrays.toString(find(arr, target))); // we cannot print array directly, as it will print the adress
        System.out.println(max(arr));
    }

    static int[] find(int[][] arr, int target){
        if (arr.length ==0){
            return new int[]{-1}; // since, the array is not initalized so we have to initialize it while returning
        }
        for(int row =0; row<arr.length; row++){
            for (int col =0; col<arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    }

    static int max(int[][] arr){
        if (arr.length ==0){
            return -1; // since, the array is not initalized so we have to initialize it while returning
        }
        int ans = Integer.MIN_VALUE;  // min value an integer can contain
        for(int[] row : arr){
            for (int col: row){
                if(col>ans){
                    ans = col;
                }
            }
        }
        return ans;
    }
    static int min(int[][] arr){
        if (arr.length ==0){
            return -1; // since, the array is not initalized so we have to initialize it while returning
        }
        int ans = Integer.MAX_VALUE;
        for(int[] row : arr){
            for (int col: row){
                if(col<ans){
                    ans = col;
                }
            }
        }
        return ans;
    }
}
