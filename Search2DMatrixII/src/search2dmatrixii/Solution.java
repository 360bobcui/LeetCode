/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search2dmatrixii;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix != null && matrix[0] != null) {
            int row = matrix.length - 1; //last index
            int col = matrix[0].length - 1;  // last index
            int i = 0;
            int j = col;
            
            while (i <= row && j >= 0) {
                if (target > matrix[i][j]){
                    i++;
                } else if (target < matrix[i][j]) {
                    j--;
                } else if (target == matrix[i][j]){
                    return true;
                }
            }

//            while (i <= row) {
//                if (target > matrix[i][0] ) {
//                    i++;
//                } else if (target == matrix[i][0]) {
//                    return true;
//                } else {
//                    return false;
//                }  
//                
//            }
//            
//            while (j >= 0) {
//                if (target < matrix[row][j]) {
//                    j--;
//                } else if (target == matrix[row][j]) {
//                    return true;
//                } else 
//                    return false;
//            }
        }
        return false;
    }    
}
