public class searchIn2Dmatrix_II {
    public static void main(String[] args) {
       int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
       int t = 5;
        System.out.println(searchMatrix(arr, t));
    }
        public static boolean searchMatrix(int[][] arr, int t) {
            int n = arr.length;
            int m = arr[0].length;
            int r = 0;
            int c = m-1;
            // int cor = arr[r][c];
            while(r<n && c>=0){
                if(arr[r][c] == t) return true;
                else if(arr[r][c] < t){
                    r++;
                }else{
                    c--;
                }
            }
            return false;
        }
    }

