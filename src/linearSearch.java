public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {21, 43, 64, 75, -2, -65, 5, 65};
        int target = 21;
        System.out.println(linearSearch1(arr, target, 2, 6));
        System.out.println(linearSearch2(arr, target));

    }
    static int linearSearch1(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index<end; index++){
            int element = arr[index];
            if(element == target){
                return index;
                // once we hit return function, it will come out of the function
            }
        }
        return -1;
    }

    // the following functionn returns the element itself insted of index
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // following is enhanced for loop
        for(int element: arr){
            if(element == target){
                return element;
                // once we hit return function, it will come out of the function
            }
        }
        return -1;
    }
}
