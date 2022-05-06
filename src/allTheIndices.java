import java.util.ArrayList;

public class allTheIndices {
    public static void main(String[] args) {
        int[] arr = {32, 43, 5, 65, 7, 5, 4, 65, 5, 78, 0, 5};
        int target = 5;
        System.out.println(searchAllIndices(target, arr, 0));
    }

    //approach 1
    // this function needs to be called
    public static ArrayList<Integer> search(int[] arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        allIndices(arr, target, 0, ans);
        return ans;
    }

    // recursive function to find all the indices of the array
    public static void allIndices(int[] arr, int target, int index, ArrayList<Integer> ans){
        // base condition
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            ans.add(index);
        }
        // recursion
        allIndices(arr, target, index+1, ans);

    }


    // 2nd approach

    public static ArrayList<Integer> searchAllIndices(int target, int[] arr, int index){
        ArrayList<Integer> ansList = new ArrayList<>();
        // base condition
        if (index == arr.length){
            return ansList;
        }
        if(arr[index] == target){
            ansList.add(index);
        }
        ArrayList<Integer> ansFromBelow = searchAllIndices(target, arr, index+1);
        ansList.addAll(ansFromBelow);
        return ansList;
    }
    
}
