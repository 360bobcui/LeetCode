/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumber;

/**
 *
 * @author menglu
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            //System.out.println(res);
            res ^= i;
            res ^= nums[i];
            
        }
        return res;
    }
}
