public class bikeRacing {
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        int N = 3;
        long M = 400;
        long L = 120;
        long[] H = {2,4,6,8,10};
        long[] A = {2,4,6,8,10};
//        long[] H = {20, 50, 20, 40, 30, 20, 50, 20, 70, 90, 10};
//        long[] A = {20, 70, 90, 20, 50, 90, 80, 30, 20, 10, 60};
        long ans = sol.buzzTime(N, M, L, H, A);
        System.out.println(ans);
    }

}

class Solution10{
    long buzzTime(int N, long M, long L, long[] H, long[] A){
        // code here
        while(true){
            int start = 0;
            int end = 99;
            int ans =  BinarySearch(start, end, M, H, A, L, N);
            if(ans == end+1){
                start = end+1;
                end = end+100;
            }else{
                return ans;
            }
        }
    }

    int BinarySearch(int sInd, int eInd, long M, long[] H, long[] A, long L, int N){
        while(sInd<= eInd){
            int mid = sInd + (eInd - sInd)/2;
            long currentElement = sumElements(mid, N, H, A, L);
            if(currentElement == M){
                return mid;
            }
            else if(currentElement< M){
                sInd  = mid +1;
            }
            else{
                eInd = mid -1;
            }
        }
        return sInd;
    }

    long sumElements(int index, int N, long[] H, long[] A, long L){
        long sum = 0;
        for(int i = 0; i<N; i++){
            long elem = H[i] + index*A[i];
            if(elem>=L){
                sum = sum + elem;
            }
        }
        return sum;
    }
}