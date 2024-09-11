import java.util.Arrays;

// public class selection_sort {
//     public static void main(String[] args){
//     int[] arr ={3, 1, 5, 4, 2};
//     selection(arr);
//     System.out.println(Arrays.toString(arr));
//     }

//     static void selection(int[] arr){
//      for(int i = 0; i < arr.length; i++){
//         int last = arr.length-i-1;
//         int maxIndex = getMaxIndex(arr, 0, last);
//         swap(arr, maxIndex, last);
//      }
//     }
   
//    private static int getMaxIndex(int[] arr, int left, int right){
//          int max = left;
//          for(int j = 0; j <= right; j++){
//             if(arr[j]>arr[max]){
//                 max=j;
//             }
//          }
//          return max;
//     }

//     static void swap(int[] arr, int maxIndex, int last){
//       int temp = arr[maxIndex];
//       arr[maxIndex] = arr[last];
//       arr[last] = temp;
//     }
// }

