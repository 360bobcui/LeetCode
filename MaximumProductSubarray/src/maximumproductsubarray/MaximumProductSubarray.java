/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
 */
package maximumproductsubarray;

/**
 *
 * @author menglu
 */
public class MaximumProductSubarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {-2,0,-3,4,5};
        System.out.println(new Solution().maxProduct(nums));
    }
    
}
