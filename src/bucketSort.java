import java.util.Arrays;
import java.util.LinkedList;

public class bucketSort {
    public static void main(String[] args){
        int[] arr = {32, 43, 54, 64, 34, 35, 65, 45, 86, 98, 76, 94, 65, 74};
        // System.out.println(Arrays.toString(bSort(arr)));
        System.out.println(bSort(arr));
    }
    
    public static LinkedList[] bSort(int[] arr){
        LinkedList[] list = new LinkedList[10];
        for(int number: arr){
            int index = (int) Math.floor(number/10);
            
            System.out.println("x");
            list[index].push(number);
            
        }
        return list;

    }
}
