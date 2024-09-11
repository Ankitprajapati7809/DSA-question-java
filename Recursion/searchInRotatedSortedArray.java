public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {5,6,7,1,2,3,4};
        int tar = 7;
        System.out.println(search(arr, 0, arr.length-1, tar));
    }
    public static int search(int[] arr, int low, int high, int tar){
        if(low > high) return -1;
        int mid = (low + high)/2;

        if(arr[mid] == tar){
            return mid;
        }
        if(arr[low] <= arr[mid]){
            if(arr[low] <= tar && tar <= arr[mid]){
               return search(arr, low, mid-1, tar);
            } else{
               return search(arr, mid+1, high, tar);
            }
        } else{
            if(arr[mid +1] <= tar && tar <= arr[high]){
                return  search(arr, mid+1, high, tar);
            } else{
                return search(arr, low, mid-1, tar);
            }
        }
    }
}
