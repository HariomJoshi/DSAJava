public class ceilingOfNumber {

    public static void main(String[] args) {
         int[] arr = {-342, -43, -8, -2, 0, 4, 5, 8, 23, 45, 76, 645};
//        int[] arr = {342, 222, 43, 5, 0, -4, -90, -101, -300};

        int target = 24;
        int ans = ceil(arr, target);
        int ans2 = floor(arr, target);
        System.out.println(ans);
        System.out.println(ans2);
    }


    static int ciel2(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            boolean isAsc = arr[start]<arr[end];
            if (arr[mid] == target){
                return mid;
            }
            else if(isAsc){
                if(target< arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(!isAsc){
                if(target> arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            ans = mid;
        }
        if(arr[ans]< target){
            return arr[ans+1];
        }else{
            return arr[ans];
        }
    }
// another, more easy way of doing this is
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            // find whether the array is ascending or descending
            if(target> arr[arr.length -1]){
                return -1;
            }

            if (arr[mid] == target){
                return mid;
            }
            else if(isAsc){
                if(target< arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target> arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return arr[start];
    }

    // to find the biggest number, smaller than the target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start]<arr[end];
        if (target<arr[0]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            // find whether the array is ascending or descending

            if (arr[mid] == target){
                return mid;
            }
            else if(isAsc){
                if(target< arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target> arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return arr[end];
    }
}
