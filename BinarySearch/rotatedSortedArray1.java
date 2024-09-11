public class rotatedSortedArray1 {
    public static void main(String[] args) {
        //           0  1  2  3  4  5  6  7  8
        int arr[] = {7, 8, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int k = 8;
        System.out.println(search(arr, n, k));
    }
    public static int search(int[] arr, int n, int k){
        int low = 0;
        int high = n-1;

        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid]==k) return mid;
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
        return -1;
    }
}
