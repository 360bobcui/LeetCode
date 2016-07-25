/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumproductsubarray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public int maxProduct(int[] nums) {
        List<Integer> pos = new ArrayList<>(); // store the index of zeros
        List<Integer> zeros = new ArrayList<>(); // store the index of zeros
        List<Integer> negs = new ArrayList<>(); // store the index of negative numbers
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {                
                if (nums[i] < 0) {
                    negs.add(i);                    
                }
                product *= nums[i]; 
            } else if (nums[i] == 0){
                zeros.add(i);
            } else {
                pos.add(i);
            }      
        }
        
        
        
        if (nums != null && nums.length > 0) {
            if (nums.length == 1) {
                return nums[0];
            }
            
            if (zeros.isEmpty()) {
                if (negs.size() % 2 == 0) {
                    return product;
                } else { // odd number of neg numbers
                   int[] nums1 = new int[negs.get(0)];
                   int[] nums2 = new int[nums.length - negs.get(0) - 1];
                   for (int i = 0; i < negs.get(0); i++) {
                       nums1[i] = nums[i];
                   }
                   int product1 = maxProduct(nums1);
                   for (int i = negs.get(0) + 1, j = 0; i < nums.length; i++, j++) {
                       nums2[j] = nums[i]; 
                   }
                   int product2 = maxProduct(nums2);
                   return product1 > product2 ? product1 : product2;
                }
            } else { // contains zeros in the array
                int[] nums1 = new int[zeros.get(0)];
                int[] nums2 = new int[nums.length - zeros.get(0) - 1];
                for (int i = 0; i < zeros.get(0); i++) {
                    nums1[i] = nums[i];
                }
                int product1 = maxProduct(nums1);
                for (int i = zeros.get(0) + 1, j = 0; i < nums.length; i++, j++) {
                    nums2[j] = nums[i]; 
                }
                int product2 = maxProduct(nums2);
                if (product1 > product2) {
                    if (product1 > 0) {
                        return product1;
                    } else {
                        return 0;
                    }
                } else {
                    if (product2 > 0) {
                        return product2;
                    } else {
                        return 0;
                    }
                }   

            }
        }
        return Integer.MIN_VALUE;
    }    
}
