/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestdivisiblesubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author menglu
 */
public class Solution {  
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums != null && nums.length != 0) {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            Map<Integer, List<Integer>> map = new HashMap<>();
            boolean hasOne = (nums[0] == 1);            
            for(int num : nums) {
                if (num != 1){
                    boolean isNumFoundInPreviousSeedSet = false;
                    Set<Integer> seedset = map.keySet(); // store the smallest element. 
                    Set<Integer> newSeedSet = new HashSet<>(seedset); 
                    for (int seed : newSeedSet) {
                        List<Integer> list = map.get(seed);
                        if (isNumDividable(num, list)) {  //dividable.  
                            list.add(num); 
                            isNumFoundInPreviousSeedSet = true;
                           
                        }
                    }
                    if (!isNumFoundInPreviousSeedSet) {  // new seed
                        List<Integer> list = new ArrayList<>();
                        list.add(num);
                        map.put(num, list);
                    }
                }
            }
            int maxLength = 0;
            for (int seed : map.keySet()) {
                List<Integer> list = map.get(seed);
                if (list.size() > maxLength) {
                    maxLength = list.size();
                    result = list;
                }
            }
            if (hasOne){                
                result.add(0,1); //add to the begining of the list;
            }
        }
        return result;
    }   
   // given the base and the number and caculate its log and return true if the answer is an integer
    // return false otherwise.
//    private boolean isLogInteger(int num, int base) {
//        double ans = Math.log(num) / Math.log(base);
//        System.out.println(ans);
//        
//        return (!(ans - (int)ans > 0));
//    }
    
    // given the base and the number and caculate, return true if the num is dividable
    // return false otherwise.
    private boolean isNumDividable(int num, List<Integer> list) {
        //List<Integer> list = map.get(seed);
        if (list != null) {
            for (int i : list) {
                if (num % i != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
