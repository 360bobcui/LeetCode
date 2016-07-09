/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
package twosum;

import java.util.Arrays;

/**
 *
 * @author menglu
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
    }
    
}
