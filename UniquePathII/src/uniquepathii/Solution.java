/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquepathii;

/**
 *
 * @author menglu
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null) return 0;        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m - 1][n - 1] == 1) return 0;        
        obstacleGrid[m - 1][n - 1] = 1;
        

         //set up the number of possible path in the last row.
        boolean isBlocked = false;      
        for (int i = m - 2; i >= 0; i--) {
            if (obstacleGrid[i][n - 1] == 1) {
                isBlocked = true;
            }
            obstacleGrid[i][n - 1] = (isBlocked ? 0 : 1);      
        }
        
         //set up the number of possible path in the last column.
        isBlocked = false;
        for (int i = n - 2; i >= 0; i--) {
            if (obstacleGrid[m - 1][i] == 1) {
                isBlocked = true;
            }
            obstacleGrid[m - 1][i] = (isBlocked ? 0 : 1);        
        }
        
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i + 1][j] + obstacleGrid[i][j + 1];
                }
            }
        }
        return obstacleGrid[0][0];
    }
}
