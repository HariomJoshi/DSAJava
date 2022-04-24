public class recArrSortedOrNot{
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 7, 8, 12, 15, 18};
        boolean ans = sorted(arr, 0);
        System.out.println(ans);

    }
    static boolean sorted(int[] arr, int index){
        // base condition
        if(index == arr.length -2){
            return (arr[index]<= arr[index+1]);
        }
        
        // either this 

        // if(arr[index]<= arr[index+1]){
        //     return sorted(arr, index+1);
        // }
        // if(arr[index]> arr[index+1]){
        //     return false;
        // }
        
        
        // if (sorted(arr, index+1)){  // recursion
        //     return true;
        // }
        // else{
        //     return false;
        // }

        // or this

        return arr[index]< arr[index+1] && sorted(arr, index+1);
    }
}