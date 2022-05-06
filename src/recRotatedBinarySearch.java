public class recRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {15, 16, 17, 24, 26, 35, 1, 3, 4, 7, 8, 9, 11,14};
        int target = 9;
        int ans = RBS(arr, target);
        System.out.println(ans);

    }

    // simple binary search program 
    public static int BS(int[] arr, int target, int s, int e){
        while(s<=e){
            int m = s + (e -s)/2;
            if(arr[m]== target){
                return m;
            }
            else if(arr[m]< target){
                s = m+1;
            }
            else if(arr[m]> target){
                e = m-1;
            }
        }
        return -1;
    }

    // the below function can find an element in sorted or rotated array in logN time
    public static int RBS(int[] arr, int target){
        int p = -1;
        int s = 0;
        int e = arr.length -1;
        // finding pivot
        while(s<=e){
            int m = s + (e - s)/2;
            if(arr[m]< arr[e] && arr[m-1]< arr[m]){
                e = m-1;
            }
            if(arr[m]> arr[s] && arr[m+1]> arr[m]){
                s = m+1;
            }
            // check the before and front of 
            if(arr[m+1] < arr[m] || arr[m-1] > arr[m]){
                p =  m-1;
                break;  // pivot found
            }
        }

        // if pivot is present
        if (p != -1){
            if(BS(arr, target, s, p)!=-1){
                return BS(arr, target, s, p);
            }
            else{
                return BS(arr, target, p+1, e);
            }
        }
        else{
            return BS(arr, target, s, e);
        }

    }
}
