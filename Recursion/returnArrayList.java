import java.util.ArrayList;

public class returnArrayList {
    public static void main(String[] args) {
        int [] arr = {1, 2, 8, 66, 25, 25, 3, 20, 25};
        int target = 25;
        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(linearSearch2(arr, target, 0, list));
        System.out.println(linearSearch3(arr, target, 0));
    }
    public static ArrayList linearSearch2(int[] arr, int target, int i, ArrayList list) {

        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return linearSearch2(arr, target, i+1, list);
    }

    public static ArrayList linearSearch3(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }

        ArrayList ansFromBelowCalls = linearSearch3(arr, target, i+1);

            list.addAll(ansFromBelowCalls);

       return list;
    }


}
