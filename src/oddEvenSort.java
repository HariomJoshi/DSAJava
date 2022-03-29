import java.util.Arrays;

class oddEvenSort{
    public static void main(String[] args) {
        int[] arr = {32, 3, 51, 6, 76, 8, 45, 4, 80, -5, 23};
        oddEvenSortFunc(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void oddEvenSortFunc(int[] arr){
        boolean isSorted = false;  // initialy array is unsorted
        while(!isSorted){
            isSorted = true;
            // bubble sort for even elements
            for(int j = 0; j<=arr.length -2; j+=2){
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            // bubble sort for odd elements
            for(int j = 1; j<=arr.length -2; j+=2){
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}