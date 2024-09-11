public class main {
    public static void main(String[] args) {
    int arr[] = {4, 5, 76, 98, 125, 150};
    int target = 125;
        System.out.println(recuSearch(arr, target, 0, arr.length-1));
    }

    static int recuSearch(int[] arr, int target, int l, int r){
    if(l > r) return -1;

    int mid = (l + r)/2;
    if(arr[mid] == target) return mid;

    if(target < arr[mid]){
       return recuSearch(arr,target, l, mid-1);
    }
    else{
        return recuSearch(arr, target, mid+1, r);

    }

    }
}
