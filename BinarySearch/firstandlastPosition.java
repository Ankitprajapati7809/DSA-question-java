
import java.util.Arrays;

public class firstandlastPosition {

    public static void main(String[] args) {
       int[] arr = {5,7,7,8,8,10};
       int k = 8;

        System.out.println(Arrays.toString(searchRange(arr, k)));
    }
        public static int[] searchRange(int[] arr, int k) {
            int[] result = new int[2];

            int n = arr.length;
            int first = firstOcc(arr, n, k);
            if(first == -1){
                result[0] = -1;
                result[1] = -1;
                return  result;
            }
            int last = lastOcc(arr, n, k);
            result[0] = first;
            result[1] = last;
            return result;

        }

        public static int firstOcc(int []arr, int n, int k) {
            int high = n-1;
            int low = 0;
            int first = -1;

            while(low <= high){
                int mid = (low + high)/2;

                if(arr[mid]==k){
                    first = mid;
                    high = mid-1;
                }else if(arr[mid]<k){
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
            return first;
        }

        public static int lastOcc(int []arr, int n, int k){
            int low = 0;
            int high = n-1;
            int last = -1;

            while(low <= high){
                int mid = (low + high)/2;
                if(arr[mid]==k){
                    last = mid;
                    low = mid + 1;
                }else if(arr[mid]<k){
                    low = mid+1;
                }else{
                    high = mid-1;
                }

            }
            return last;
        }
    }

