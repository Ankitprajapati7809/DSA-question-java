import java.util.*;

public class smallestDivisionThreshold {
    public static void main(String[] args) {
        int[] arr = {21212,10101,12121};
        int threshold = 1000000;
        System.out.println(smallestDivisor(arr, threshold));
    }

        public static int smallestDivisor(int[] arr, int threshold) {
            int maxE = Arrays.stream(arr).max().getAsInt();
            int low = 1;
            int high = maxE;
            int ans = -1;
            while(low <= high){
                int mid = (low + high)/2;
                int div = findSmallestDivisor(arr, mid);
                if(div <= threshold){
                    ans = mid;
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }

            }
            return ans;
        }
        public static int findSmallestDivisor(int[] arr, int mid){
            int n = arr.length;
            int totalS = 0;
            for(int i=0; i<n; i++){
                totalS += Math.ceil((double)(arr[i]) / (double)(mid));
            }
            return totalS;
        }
    }
