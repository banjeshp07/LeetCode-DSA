package Arrays;

public class MaximumSubarraySum {

    public static int maxSubarraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}
    
