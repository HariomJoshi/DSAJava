// keep in mind that recursion is not a necessity, it is just to keep things simple.
// practically recursion is worse than the iterative approach as it takes much more space, 
// but since it simplifies answers both for reading and thinking so it seems to be a great approach
// To derive an optimised solution, first solve the solution with recursive approach and then with 
// iterative approach

public class recursion {
    public static void main(String[] args){
        System.out.println(fibRec(7));  // calling fibonacci function
        System.out.println(fact(5));  // calling factorial function

    }
    static int fibRec(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n ==2){
            return 1;
        }
        else{
            return fibRec(n-1) +fibRec(n-2);
        }
        
    }

    static int fact(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    
}
