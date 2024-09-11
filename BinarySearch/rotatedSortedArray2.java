public class rotatedSortedArray2 {
    public static void main(String[] args) {
        //           0 1 2 3 4 5
        int arr[] = {1,0,1,1,1,1};
        int n = arr.length;
        int k = 0;
        System.out.println(search(arr, n, k));
    }
    public static boolean search(int[] arr, int n, int k){
        int low = 0;
        int high = n-1;

        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid]==k) return true;
            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k <= arr[mid - 1]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }

            }
            else{
                if(arr[mid + 1] <= k && k <= arr[high]){
                    low  = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
