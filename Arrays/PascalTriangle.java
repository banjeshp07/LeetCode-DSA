package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    
    public  static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currentRow.add(1); // edges
                } else {
                    int val = triangle.get(row-1).get(col-1) + triangle.get(row - 1).get(col);
                    currentRow.add(val); // middle values
                }
            }
        
            triangle.add(currentRow);
        }
        return triangle;
    }
    public static void main(String[] args) {
        int rows = 5;
        System.out.println(generate(rows));
        
    }
    
}

