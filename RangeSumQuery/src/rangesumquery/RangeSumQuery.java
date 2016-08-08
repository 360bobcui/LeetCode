/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangesumquery;

/**
 *
 * @author menglu
 */
public class RangeSumQuery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = null;
        NumArray na = new NumArray(num);
        System.out.println(na.sumRange(0, 2));
        System.out.println(na.sumRange(2, 5));
        System.out.println(na.sumRange(2, 6));
        System.out.println(na.sumRange(0, 5));
    }
    
}
