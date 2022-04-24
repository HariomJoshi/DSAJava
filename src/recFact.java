import javax.sound.sampled.SourceDataLine;

public class recFact {
    public static void main(String[] args){
        System.out.println(fact(6));
    }

    static int fact(int n){
        // base condition
        if(n<2){
            return 1;
        }
        return n*fact(n-1);  // recursion
    }
}
