/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchinsertposition;

/**
 *
 * @author menglu
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0; 
        }
        int index;
        int start = 0;
        int end = nums.length;
        index = (end + start) / 2;
        
        while (end > start && nums[index] != target) {
            if (nums[index] > target) {
                end = index; 
            } else {
                start = index + 1;
            }
            index = (end + start) / 2;   
        }
        return index;    
    }   
}
