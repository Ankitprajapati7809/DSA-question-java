public class linearSearch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 8, 66, 25, 3, 20};
        int target = 25;
        System.out.println(linearSearch2(arr, target, 0));

    }
    public static boolean linearSearch1(int[] arr, int target, int i) {
        if(i == arr.length){
            return false;
        }
        if(arr[i] == target || linearSearch1(arr, target, i+1)){
            return true;
        }
        return false;
    }
    public static int linearSearch2(int[] arr, int target, int i) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return linearSearch2(arr, target, i+1);
    }
}
