


import java.util.Arrays;

public class sortingString {
    public static void main(String[] args) {
        String[] arr = {"dog", "elephant", "ball", "apple", "cat"};
        insertionSortString(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSortString(String[] arr){
            for(int i = 1; i< arr.length; i++){
                String key = arr[i];
                int curr = i-1;
                while(curr>=0 && arr[curr].compareTo(key)>0){  // reversion the comparision sign will sort the array in descending order
                    arr[curr+1] = arr[curr];
                    curr--;
                }
                arr[curr+1] = key;
            }
    }
}
