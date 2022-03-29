import java.util.Arrays;

public class BSSorted2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 8)));

    }
    // for searching in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            else if(matrix[row][mid] < target){
                cStart = mid +1;

            }
            else{
                cEnd = mid -1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        // rows are horizontal >
        int rows = matrix.length;
        // columns are vertical ^
        int columns = matrix[0].length;
        if(rows == 1){
            binarySearch(matrix, 0, 0, columns-1, target);
        }
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = columns/2;
        // run the loop till only two rows are remaining
        while (rStart < (rEnd - 1)) {
            int mid = rStart +(rEnd-rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }

        }
        // now we have 2 rows left
        // check whether the target is in the middle row
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, rEnd};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, rEnd};
        }
        // if not found so
        // search in 1st half
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        else if(target>=matrix[rStart][cMid+1] && target >= matrix[rStart][columns-1]){
            return binarySearch(matrix, rStart+1, cMid-1, columns -1, target);

        }
        // search in 3rd half
        else if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        // search in 4th half
//        if(target>=matrix[rStart+1][cMid+1]){
        else{
            return binarySearch(matrix, rStart+1, cMid+1, columns-1, target);
        }
    }
}

// complexity of the above code is logN -> the same as that of binary search in 1D array


