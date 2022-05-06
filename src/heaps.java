import java.util.Arrays;

public class heaps {
    public static void main(String[] args) {
        int[] arr = {40, 30, 60, 50, 10, 7, -1, -1, -1};
        heapify(arr, 2, 6);
        System.out.println(Arrays.toString(arr)); 
        int[] sorted = heapSort(arr, 6);
        System.out.println(Arrays.toString(sorted)); 
    }

    public static void insert(int[] arr, int number, int n){
        n +=1;
        arr[n] = number;
        while(n>1){
            int parent = (int)Math.floor(n/2);
            if(arr[parent]< arr[n]){
                int temp = arr[parent];
                arr[parent] = arr[n];
                arr[n] = temp;
                n = parent;
            }else{
                return;
            }
        }

    }

    public static void delete(int[] arr, int index, int n){
        if(index >= arr.length){
            System.out.println("Index does not exists! ");
            return;
        }
        arr[index] = arr[n];
        arr[n] = -1;
        int i = index;
        while(i> 1){
            int parent = (int)Math.floor(i/2);
            if(arr[parent]< arr[i]){
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;
                i = parent;
            }
            else{
                return;
            }
        }

    }

    public static void heapify(int[] arr, int parent, int n){  
        // index is the index which we have to take as root
        // n is the size of the tree
        int largest = parent;
        int left = parent*2 + 1;
        int right = parent*2 + 2;
        // base condition
        if(parent < 0){
            return;
        }
        if(left < n && arr[left]> arr[largest]){
            largest = left;
        }
        // if right is bigger than largest so far
        else if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        // we won't make a case for only right child because it is not possible to have only right child in heaps.
        // swapping the largest and the index
        if(largest != parent ){
            // swap arr[largest] and arr[parent]
            int temp = arr[largest];
            arr[largest] = arr[parent];
            arr[parent] = temp;
            heapify(arr, largest, n);
        } 
        heapify(arr, parent-1, n);  
    }

    public static int[] heapSort(int[] arr, int n){
        int[] sorted = new int[n];
        int loopExec = n;
        for(int i = 0; i< loopExec; i++){
            sorted[i] = arr[0];
            arr[0] = arr[n-1];
            arr[n-1] = -1;
            heapify(arr, arr[0], --n);
        }
        return sorted;
    } 
}