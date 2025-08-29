package Arrays;

import java.util.HashMap;

public class LargestSubarraySumK {
    public static int longestSubarrayWithSumK(int[] arr, int K) {
        HashMap<Integer, Integer> prefixSumIndex = new HashMap<>(); // stores first occurrence of prefix sum
        int sum = 0;       // running prefix sum
        int maxLen = 0;    // length of longest subarray with sum K

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // update prefix sum

            // Case 1: Subarray from start has sum K
            if (sum == K) {
                maxLen = i + 1;
            }

            // Case 2: Check if there exists a prefix sum that makes current subarray sum K
            if (prefixSumIndex.containsKey(sum - K)) {
                int len = i - prefixSumIndex.get(sum - K);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence of this prefix sum
            if (!prefixSumIndex.containsKey(sum)) {
                prefixSumIndex.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int K = 3;

        int result = longestSubarrayWithSumK(arr, K);
        System.out.println("Length of longest subarray with sum " + K + " is: " + result);
    }
}

