public class NthRootofM {
    public static void main(String[] args) {
        int n = 9;
        int m = 1953125;
        System.out.println(NthRoot(n, m));
    }
        public static int NthRoot(int n, int m) {
            // Write your code here.
            int low = 1;
            int high = m;
            while(low <= high){
                int mid = (low + high)/2;
                int rtnans = multi(n, mid);
                if(rtnans == m) return mid;
                else if(rtnans > m){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return -1;
        }
        public static int multi(int n, int mid){
            int i=1;
            int ans = 1;
            while(i<=n){
                ans = ans*mid;
                i++;
            }
            return ans;
        }
    }

