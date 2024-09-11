public class MedianofTwoSortedarrays {
    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {3,4};
        System.out.println(findMedianSortedArray(arr1, arr2));
    }
    public static double findMedianSortedArray(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int j = 0;
        int i = 0;
        int nm = n+m;
        int idx1 = nm/2 -1;
        int idx2 = nm/2;
        int ind1Emt = -1;
        int ind2Emt = -1;
        int cnt = 0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
               if(cnt == idx1) ind1Emt = arr1[i];
               if(cnt == idx2) ind2Emt = arr1[i];
               cnt++;
               i++;
            }else{
                if(cnt == idx1) ind1Emt = arr2[j];
                if(cnt == idx2) ind2Emt = arr2[j];
                cnt++;
                j++;
            }
        }
        if(i<n){
            if(cnt == idx1) ind1Emt = arr1[i];
            if(cnt == idx2) ind2Emt = arr1[i];
            cnt++;
            i++;
        }
        if(j<m){
            if(cnt == idx1) ind1Emt = arr2[j];
            if(cnt == idx2) ind2Emt = arr2[j];
            cnt++;
            j++;
        }

        if(nm % 2 == 1){
            return ind2Emt;
        }

        return (double)((double)(ind1Emt + ind2Emt)) / 2.0;
    }
}
