/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserobberii;

import java.util.Arrays;

/**
 *
 * @author menglu
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        //Arrays.sort(nums);
        int[] money = new int[nums.length];
        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
    }

    // given int array nums and start and end index in nums, return the max profit in house robber problem
    private int robHelper(int[] nums, int start, int end) {
        int[] maxProfit = new int[end - start + 1];
        maxProfit[0] = nums[start];
        maxProfit[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i < maxProfit.length; i++) {
            maxProfit[i] = Math.max(maxProfit[i - 1], maxProfit[i - 2] + nums[start + i]);
        }
        return maxProfit[maxProfit.length - 1];
    }
}
