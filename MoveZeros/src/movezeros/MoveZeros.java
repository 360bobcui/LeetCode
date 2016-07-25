/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
package movezeros;

import java.util.Arrays;

/**
 *
 * @author menglu
 */
public class MoveZeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {0, 0,1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
                
    }
    
}
