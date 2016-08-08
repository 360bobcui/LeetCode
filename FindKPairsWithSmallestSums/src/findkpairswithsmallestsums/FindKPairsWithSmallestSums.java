/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findkpairswithsmallestsums;

/**
 *
 * @author menglu
 */
public class FindKPairsWithSmallestSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,3,4,5};
        System.out.println(new Solution().kSmallestPairs(nums1, nums2, 3));
    }
    
}
