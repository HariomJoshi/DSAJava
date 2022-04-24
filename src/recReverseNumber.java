public class recReverseNumber {
    public static void main(String[] args){
        int num = 1234321;
        System.out.println(reverse(num));
        System.out.println(pOrNot(num));
        
    }

    static int reverse(int n){
        int zeroes = 1;
        int n1 = n;
        // below function finds how many zeroes we have to place after 1 in order to send the element to the right place
        while(n1>10){
            n1 = (n1 - (n1%10))/10;
            zeroes = zeroes*10;
        }
        // base condition
        if(n<10){
            return n;
        }
        int num = n%10;
        return num*zeroes + reverse((n-num)/10);

        
    }
// below function tells whether the integer is a palindrome or not
    static boolean pOrNot(int n){
        return n == reverse(n);
    }
    
}
