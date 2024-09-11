public class MaxOneRow {

    public static int rowWithMaxOnes(int[][] arr) {
        int maxOnesRow = -1;
        int maxOnes = 0;
        int cols = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = cols - 1;

            // Binary search to find the first occurrence of 1
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[i][mid] == 1) {
                    high = mid - 1; // Move left to find the first 1
                } else {
                    low = mid + 1;
                }
            }

            // Number of 1s in the current row
            int numberOfOnes = cols - low;

            // Check if this row has more 1s than the previous max
            if (numberOfOnes > maxOnes) {
                maxOnes = numberOfOnes;
                maxOnesRow = i;
            }
        }

        return maxOnesRow;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };

        int result = rowWithMaxOnes(arr);
        System.out.println("Row with maximum 1s is: " + (result + 1));
    }
}

