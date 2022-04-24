import java.util.Arrays;

public class coinPiles {
    public static void main(String[] args) {
//        Solution8 sol = new Solution8();
        int[] arr = {1,3};
        int N = 2;
        int K = 0;
        int ans = Solution8.minSteps(arr, N, K);
        System.out.println(ans);
    }
}

class Solution8{
    static int minSteps(int[] A, int N, int K) {
        // code here
        Arrays.sort(A);
        int count=0;
        for(int i = 0; i<N; i++){
            int target = A[i];
            if (i > 0 && A[i] == A[i-1]) {
                continue;
            }
            int start = 0;
            int end = N -1;
            int mid = 0;
            while(start<=end){
                mid = start + (end-start)/2;
//                System.out.println(mid);
                if(A[mid]-target <= K){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
//            count = count + (N-1-mid);
            if(N == 2){
                count = N-mid;
            }else{
                count = count +(N-1-mid);
            }

        }
        return count;
    }
}
