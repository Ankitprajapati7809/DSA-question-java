public class kokoEatingBanana {
    public static void main(String[] args) {
    int piles[] = {312884470};
    int h = 312884469;
        System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = high; // Start with the maximum possible value.

        while (low <= high) {
            int mid = (low + high) / 2;
            int hoursNeeded = perHrBna(piles, mid);

            if (hoursNeeded <= h) {
                ans = mid;  // This could be a potential answer.
                high = mid - 1;  // Try to find a smaller valid speed.
            } else {
                low = mid + 1;  // Increase the speed to reduce hoursNeeded.
            }
        }
        return ans;
    }

    public static int perHrBna(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (arr[i] + k - 1) / k; // This calculates the number of hours needed by rounding up.
        }
        return sum;
    }

    public static int findMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

}
