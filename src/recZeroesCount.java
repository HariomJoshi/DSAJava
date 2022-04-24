public class recZeroesCount {
    public static void main(String[] args){
        System.out.println(zeroesCount(304002));

    } 
    
    static int zeroesCount(int n){
        // base condition
        if(n<10){
            return 0;
        }
        if(n%10 == 0){
            return 1 + zeroesCount((n - n%10)/10);
        }
        return zeroesCount((n-n%10)/10);
    }
}
