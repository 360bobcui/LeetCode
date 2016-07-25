/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeelement;

/**
 *
 * @author menglu
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        //int modifiedSize = originalSize;
        int i = 0;
        while (i < size) {
            if (nums[i] == val){
                nums[i] = nums[size - 1];
                size--;
            } else {
                i++;
            }
        }
        return size;
    }
}
