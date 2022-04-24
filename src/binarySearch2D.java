import java.util.Arrays;

public class binarySearch2D {
    public static void main(String[] args){
        int[][] arr =
                {{1, 2, 3, 4},
                {12, 14, 17, 19},
                {14, 24, 29, 30},
                {19, 34, 56, 78}};
        int target = 33;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length -1;
        while (r<arr.length && c>=0){
            if(arr[r][c] == target){
                return new int[]{r, c};
            }
            else if(arr[r][c]< target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
