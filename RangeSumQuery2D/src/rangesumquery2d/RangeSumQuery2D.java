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
public class RangeSumQuery2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[][] matrix = {{3, 0, 1, 4, 2},
//            {5, 6, 3, 2, 1},
//            {1, 2, 0, 1, 5},
//            {4, 1, 0, 1, 7},
//            {1, 0, 3, 0, 5}};
         int[][] matrix = {};       
        NumMatrix nm = new NumMatrix(matrix);
//        System.out.println(nm.sumRegion(0, 0, 4, 4));
//        System.out.println(nm.sumRegion(0, 0, 0, 0));
        System.out.println(nm.sumRegion(0, 0, 1, 0));
//          System.out.println(nm.sumRegion(1, 1, 2, 2));
//            System.out.println(nm.sumRegion(1, 2, 2, 4));
//              System.out.println(nm.sumRegion(2, 1, 4, 3));
                
                
    }
    
}
