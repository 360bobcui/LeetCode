/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangesumquery2d;

/**
 *
 * @author menglu
 */
public class NumMatrix {
    private int row;
    private int col;
    private int[][] sum = null;
    public NumMatrix(int[][] A) {
        if (A != null && A.length > 0) {
            row = A.length;
            col = A[0].length;
            sum = new int[row + 1][col + 1];
            //int tempSum = 0;
            for (int i = 0; i < col; i++) {
                sum[1][i + 1] += (sum[1][i] + A[0][i]);
            }

            for (int i = 1; i < row; i++) {
                sum[i + 1][1] += (sum[i][1] + A[i][0]); 
            }

            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++){
                    sum[i + 1][j + 1] = sum[i][j + 1] + sum[i + 1][j] - sum[i][j] + A[i][j]; 
                }
            }
        } else {
            row = 0;
            col = 0;
            sum = new int[row][col];
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row2 + 1 > row || col2 + 1 > col) {
            return Integer.MIN_VALUE;
        } 
        
        return sum[row2 + 1][col2 + 1] - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];
        
    }    
}
