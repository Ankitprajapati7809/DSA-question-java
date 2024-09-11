import java.util.*;

public class findDaysforBoke {
    public static void main(String[] args) {
        int[] arr ={21212,10101,12121};
        int m = 89945;
        int k = 32127;
        System.out.println(minDays(arr, m, k));
    }

    public static int minDays(int[] arr, int m, int k) {
        int maxE = Arrays.stream(arr).max().getAsInt();
        int minE = Arrays.stream(arr).min().getAsInt();
        int n = arr.length;
        int val = m*k;
        if (val > n) return -1;
        int low = minE;
        int high = maxE;
        int result = -1;
        while(low <= high){
            int mid = (low + high)/2;
            int boke = findBoke(arr, mid, m, k, n);
            if(boke >= m){
                result = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return result;

    }
    public static int findBoke(int[] arr, int days, int m, int k, int n){
        int boke = 0;
        int count = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] <= days){
                count++;
            }else{
                boke += (count/k);
                count = 0;
            }
        }
        boke += (count/k);

        return boke;
    }
    }
