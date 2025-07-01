import java.util.*;

public class q12 {

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static int kadanes(int numbers[]) {
        // Initialize maxSum to smallest possible integer value
        int maxSum = Integer.MIN_VALUE;

        // This will store the current subarray sum while traversing
        int currSum = 0;

        // Traverse each element of the array
        for (int i = 0; i < numbers.length; i++) {
            // Add the current element to the current sum
            currSum += numbers[i];

            // If current sum becomes negative, reset it to 0
            // (because a negative sum will reduce the value of future subarrays)
            if (currSum < 0) {
                currSum = 0;
            }

            // Update maxSum if current sum is greater than maxSum
            maxSum = Math.max(currSum, maxSum);
        }

        // Print the maximum subarray sum found
        System.out.println("OUR max SubArray sum is: " + maxSum);

        return maxSum; // returning maxSum (optional if only printing)
    }

    public static void main(String args[]) {
        // Input array
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // Call Kadane's Algorithm function
        kadanes(numbers);
    }
}
