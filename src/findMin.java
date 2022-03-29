public class findMin {
    public static void main(String[] args) {
        int[] array = {21, 43, 54, 65, 76, -23, 5, 65, -4 };
        System.out.println(min(array));
    }

    // function to find the minimum
    static int min(int[] arr){
        int ans = arr[0];
        for(int num: arr){
            if(num< ans){
                ans = num;
            }
        }
        return ans;
    }
}
