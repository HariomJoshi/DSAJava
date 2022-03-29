public class smallestCharGreaterThanTarget {
    public static void main(String[] args){
        char[] arr = {'c', 'f', 'f','f','j'};
        char target = 'f';
        int index = smallestCharIndex(arr, target);
        System.out.println(index);
        System.out.println(arr[index]);
    }
    static int smallestCharIndex(char[] arr, char target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
// we did not put an equal to condition because it is very necessary for the loop to run fully
            if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        start = start%(arr.length);
        return start;
    }
}
