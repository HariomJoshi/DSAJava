// https://practice.geeksforgeeks.org/problems/number-and-the-digit-sum4021/1/?category[]=Binary%20Search&category[]=Binary%20Search&problemStatus=unsolved&page=1&query=category[]Binary%20SearchproblemStatusunsolvedpage1category[]Binary%20Search#
public class numAndDigSum {
    public static void main(String[] args) {
        long ans =Sol.numberCount(13, 2);
        System.out.println(ans);
    }

}

class Sol{
    public static long numberCount (long N, long K){
        // your code here
        long start = 1;
        long end = N;
        while(start<= end){
            long mid = (start+end)/2;
            if((mid - sumOfDigits(mid))>=K && (mid-1-sumOfDigits(mid-1))<K){
                return (N - mid +1);
            }
            else if(mid - sumOfDigits(mid)>=K){
                end = mid;

            }else{
                start = mid +1;
            }

        }
        return (N-start+1);
    }

    static long sumOfDigits(long number){
        long sum = 0;
        while(number>9){
            long digit = number%10;
            sum += digit;
            number = (number-digit)/10;

        }
        sum += number;
        return sum;
    }
}
