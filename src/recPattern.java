import javax.print.event.PrintEvent;

public class recPattern {
    public static void main(String[] args) {
        int num = 10;
        // System.out.println(downTriangle(num));
        downTriangle2(10, 0);
        downTriangle3(10, 0);
        
    }

    public static String downTriangle(int n){
        String str = "";

        // base condition
        if(n ==1 ){
            return "*";
        }
        for(int i = 0; i< n;i++){
            str = str + "*";
        }
        str = str + "\n";
        String bottomStars = downTriangle(n-1);
        str = str + bottomStars;
        return str;
    }

    // approach 2
    public static void downTriangle2(int r, int c){
        // base condition 
        if(r == 0){
            return;
        }
        if(c < r){
            // printing it while going to function call
            System.out.print("*");
            downTriangle2(r, c+1);
        }else{
            // printing it while going to function call
            System.out.println();
            downTriangle2(r-1, 0);
        }
        
    }

    // straight triangle
    public static void downTriangle3(int r, int c){
        // base condition 
        if(r == 0){
            return;
        }
        if(c < r){
            // printing it while returning from function call
            downTriangle3(r, c+1);
            System.out.print("*");
            
        }else{
            // printing it while we are returning from function call
            downTriangle3(r-1, 0);
            System.out.println();
            
        }
        
    }

}
