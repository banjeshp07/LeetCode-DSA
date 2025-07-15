package Arrays;
import java.util.*;

public class FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n*n;
        long actual_sum = 0;
        long actual_sqsum = 0;
        long diffSum ;
        long diffsqSum;
        long sum;

        long exp_sum = (long) N * (N + 1) / 2;
        long exp_sqsum = (long) N * (N + 1) * (2*N + 1) / 6;

        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                actual_sum += grid[i][j];
                actual_sqsum += grid[i][j]*grid[i][j]; 
            }
        }
        diffSum = actual_sum - exp_sum;
        diffsqSum = actual_sqsum - exp_sqsum;

         sum = diffsqSum / diffSum ;
        
        
        int a = (int)(diffSum + sum) / 2;
        int b = (int)( a - diffSum);
        int[] ans = new int[2];  // ✅ array banaya with size 2
        ans[0] = a;
        ans[1] = b;
        return ans;

        }

        public static void main(String[] args) {
            int[][] grid = {
                {1, 3},
                {2, 2}
            };
            int[] ans = findMissingAndRepeatedValues(grid);
            System.out.println(Arrays.toString(ans));
        }
        

    }


