import java.util.Arrays;

public class questionEO {
    public static void main(String[] args){
        int[] arr = {21,23,25,27,29,22,24,26,28,30};
        System.out.println(Arrays.toString(evenOdd(arr)));

    }

    static int[] evenOdd(int[] arr){
        int odd = 1;
        int even = 0;
        while(odd < arr.length && even < arr.length){
            while(arr[odd]%2 ==1){
                odd +=2;
            }
            while(arr[even]%2 ==0){
                 even +=2;
            }
            if(odd < arr.length && even < arr.length){
                // swap
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
                odd +=2;
                even +=2;
            }
        }
        return arr;
    }

}
