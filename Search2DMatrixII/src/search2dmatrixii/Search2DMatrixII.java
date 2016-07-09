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
public class Search2DMatrixII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[][] S = {{1,4,7,11,15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}};    
//                int[][] S = {{-5}}; 

        int target = -5;
        
        System.out.println(S[0][0]);
        System.out.println(new Solution().searchMatrix(S, target));// TODO code application logic here
    }
    
}
