/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangesumquerymutable;

/**
 *
 * @author menglu
 */
public class RangeSumQueryMutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(nums.length);
        
        NumArray na = new NumArray(nums);
        System.out.println(na.sumRange(0, nums.length - 1));
        System.out.println(na.sumRange(1, 2));
        System.out.println(na.sumRange(0, 5));
        na.update(3, 11);
        System.out.println(na.sumRange(0, 5));
    }
    
}
