public class minMovesToReachTarget {
    public static void main(String[] args){
        int num = 23;
        System.out.println(minMoves(num, 3));

    }

    static int doubleCount = 0;
    static int num = 1;
    static int minMoves(int target, int maxDoubles) {
        // base condition
        if(num == target){
            return 0;
        }
        if(doubleCount<=maxDoubles && num < target/2){
            doubleCount++;
            return 1+  minMoves(num*2, maxDoubles);
        }
        else{
            return target - num;
        }
    }
}
