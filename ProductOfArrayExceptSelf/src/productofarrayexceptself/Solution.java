/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productofarrayexceptself;

/**
 *
 * @author menglu
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = null;
        if (nums != null) {
            ans = new int[nums.length];
            int p = 1;
            for (int i = 0; i < nums.length; i++) {
                ans[i] = p;
                p = p * nums[i];
            }
            p = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                ans[i] = p * ans[i];
                p = p * nums[i];
            }            
        }
        return ans;    
    }    
}
