public class findTransitionPoint {
    public static void main(String[] args) {
        GfG gfg = new GfG();
        int[] arr = {1};
        int n = 1;
        System.out.println(gfg.transitionPoint(arr, n));
    }
}

class GfG {
    int transitionPoint(int arr[], int n) {
        int target = 1;
        if(arr[0] == 1){
            return 0;
        }
        for(int i = 0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
