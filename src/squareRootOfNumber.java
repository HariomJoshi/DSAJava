public class squareRootOfNumber {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        long n = 3;
        long ans = sol.floorSqrt(n);
        System.out.println(ans);
    }

}

// x: element to find square root
class Solution3{
    public long floorSqrt(long x){
        long start = 0;
        long end = x;
        while(start<=end){
            long mid = start +(end-start)/2;
            if(mid*mid == x){
                return mid;
            }else if(mid*mid<x){
                start = start+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}