public class recRotatedBS {
    public static void main(String[] args){
        int[] arr = {3, 5, 9, 14, 23, 27, 56};
        int target = 9;
        // int ans = search(arr, 0, arr.length-1, target);
        // System.out.println(ans);
        int ans2 = rotatedBS(arr, target, 0, arr.length-1);
        System.out.println(ans2);

    }

    public static int search(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = start+(end - start)/2;
            if(mid> start && arr[mid]< arr[mid-1]){
                if(rotatedBS(arr, target, 0, mid-1)!=-1){
                    return rotatedBS(arr, target, 0, mid-1);
                }
                else{
                    return rotatedBS(arr, target, mid-1, arr.length-1);
                }
                
            }
            else if(mid< end && arr[mid]> arr[mid+1]){
                if(rotatedBS(arr, target, 0, mid)!=-1){
                    return rotatedBS(arr, target, 0, mid);
                }
                else{
                    return rotatedBS(arr, target, mid-1, arr.length);
                }
            }

            else if(arr[mid]< arr[start]){
                
                end = mid-1;
            }

            else{
                
                start = mid+1;
            }
        }
        return arr.length-1;  // if not found in the between so the pivot must be in the last 
    }

    public static int rotatedBS(int[] arr, int target, int start, int end){
        int mid = start+(end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]< target){
            return rotatedBS(arr, target, mid+1, end);
        }
        else{
            return rotatedBS(arr, target, start, mid-1);
        }
    }
    
}
