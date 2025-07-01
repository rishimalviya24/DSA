import java.util.*;

public class q11 {
    public static void subArrays(int numbers[]) {
        int n = numbers.length;
        int prefix[] = new int[n];

        // Step 1: Build the prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int totalSubarrays = 0;

        // Step 2: Calculate all subarray sums using prefix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray sum from i to j
                int subarraySum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                // Print the subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("= " + subarraySum);

                // Update max/min
                if (subarraySum > maxSum) maxSum = subarraySum;
                if (subarraySum < minSum) minSum = subarraySum;

                totalSubarrays++;
            }
            System.out.println();
        }

        System.out.println("Total subarrays: " + totalSubarrays);
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        subArrays(numbers);
    }
}
