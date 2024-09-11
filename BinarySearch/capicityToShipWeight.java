import java.util.*;
import java.util.stream.IntStream;
public class capicityToShipWeight {
    public static void main(String[] args) {
        int weight[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println( shipWithinDays(weight, days));
    }
        public static int shipWithinDays(int[] weights, int days) {
            int maxE = Arrays.stream(weights).max().getAsInt();
            int sum = IntStream.of(weights).sum();
            int low = maxE;
            int high = sum;

            while (low <= high){
                int mid = (low + high)/2;
                int reqdays = findShip(weights, mid);
                if(reqdays <= days){
                    // ans = mid;
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }

            }
            return low;
        }
        public static int findShip(int[] arr, int capacity){
            int n = arr.length;
            int load = 0;
            int days = 1;
            for(int i = 0; i<n; i++){
                if(arr[i] + load > capacity){
                    days = days + 1;
                    load = arr[i];
                }else{
                    load += arr[i];
                }
            }
            return days;
        }
    }


