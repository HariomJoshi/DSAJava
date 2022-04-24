public class recBasicQues {
    public static void main(String[] args){
        oneToN(1, 10);
        NToOne(10, 1);
    }

    static void oneToN(int from, int to){
        // base condition
        if(from > to){
            return;
        }
        System.out.println(from);  //body
        oneToN(from+1, to);  // recursion
    }

    static void NToOne(int from, int to){
        // base condition
        if(from<to){
            return;
        }
        System.out.println(from);  //body
        NToOne(from-1, to);  // recursion
    }
    
}
