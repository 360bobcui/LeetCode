/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movezeros;

/**
 *
 * @author menglu
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        boolean needSwap = false;
        int i = 0;
        while (i < nums.length) {
            if (needSwap && nums[i] != 0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                i = zeroIndex + 1;
                needSwap = false;
            } else if (!needSwap && nums[i] == 0) {
                zeroIndex = i;
                needSwap = true;
            } else {
                i++;
            }
        }
    }    
}
