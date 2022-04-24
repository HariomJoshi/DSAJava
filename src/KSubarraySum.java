import java.util.Arrays;
import java.util.Scanner;


class kSubarraySum{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i<T; i++){
            int N = scan.nextInt();
            int K = scan.nextInt();
            int M = scan.nextInt();
            int[] arr = new int[N];
            int[][] subarrays = new int[N-K+1][K];
            for(int j = 0; j< N; j++){
                arr[j] = scan.nextInt();
            }
            for(int j= 0; j<=N-K; j++){
                subarrays[j] = Arrays.copyOfRange(arr, j, j+K);
            }
            for(int[] elements:subarrays){
                for(int num: elements){
                    System.out.print(num);
                }
                System.out.println(" ");
            }
        }
    }
}