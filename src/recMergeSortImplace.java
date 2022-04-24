import java.util.Arrays;

public class recMergeSortImplace {
    public static void main(String[] args){
        int[] arr = {2, 43, 5, 65, 75, 0, 86, -3, 54, 8};
        mergeSort(arr, 0, arr.length);
        // since j < end (line 31 and 43) so arr.length is exclusive, not inclusive
        System.out.println(Arrays.toString(arr));
    }

    // in implace we don't make another array, we sort the current array

    public static void mergeSort(int[] arr, int l, int r){
        if(r - l == 1){
            return;
        }
        int mid = (l + r)/2;
        mergeSort(arr, l, mid);  // merge sort in the left part
        mergeSort(arr, mid, r);  // merge sort in the right part

        merge(arr, l, mid, r);

    }

    public static void merge(int[] arr, int l, int m, int r){
        int[] newArr = new int[r-l];

        int i = l;
        int j = m;
        int k = 0;  // only one pointer needed in new array
        while(i< m && j< r){
            if(arr[i]< arr[j]){
                newArr[k++] = arr[i++];
            }else{
                newArr[k++] = arr[j++];
            }
        }

        while(i< m){
            newArr[k++] = arr[i++];
        }

        while(j< r){
            newArr[k++] = arr[j++];
        }

        // copying the newly made array to the original array
        int b = 0;
        for(int a = l; a< r; a++){
            arr[a] = newArr[b];
            b++;
        }

    }
        
}
