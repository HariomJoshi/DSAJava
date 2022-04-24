public class recLinearsearch {
    public static void main(String[] args){
        int[] arr = {21, 43, 54, 6, 54};
        int target = 321;
        int location = recLS(arr, target, 0);
        System.out.println(location);


    }

    static int recLS(int[] arr, int target, int index){
        // base condition
        if(arr[index] == target){
            return index;
        }
        if(index == arr.length -1){
            return -1;
        }
        return recLS(arr, target, index+1);
    }
    // in case of multiple occurences, whenever you find and element, do not return anything just add the answer into an arrayList
    // and at the end display that arrayList
    
}
