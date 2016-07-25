/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersectionoftwoarrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author menglu
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>();    
        Set<Integer> insect = new HashSet<>();
        
        for (int num1 : nums1) {
            num1Set.add(num1);
        }
    
        for (int num2 : nums2) {
            if(num1Set.contains(num2)) {
                insect.add(num2);
            }
        }
        int[] ans = new int[insect.size()];
        int i = 0;        
        for (int num : insect) {
            ans[i] = num;
            i++;
        }
  
        return ans;             
    }
}
