/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinationsumiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] times = new int[target + 1];
        Arrays.sort(nums);
        for (int i = 1; i < times.length; i++){
            getNumTimes(nums, times, i);
        }
        return times[target];
    }
    
    // given the number options, and times of options, update the ith time
    private void getNumTimes(int[] nums, int[] times, int i) {
        for (int j = 1; j < i; j++) {
            for (int num : nums) {
                if (j + num == i) {
                    times[i] += (times[j] + 1);
                } else if(j + num > i){
                    break;
                }
            }
        }
        
    }    
    
    
    
//    public int combinationSum4(int[] nums, int target) {
//        return combinationSum4Helper(nums, target, 0);
//    }
//    
//    private int combinationSum4Helper(int[] nums, int target, int sum) {
//        int total = 0;
//        if (target == sum) {
//            return 1;
//        } else {
//            for (int num : nums) {
//                int newSum = num + sum;
//                if (newSum <= target) {
//                    total += combinationSum4Helper(nums, target, newSum);
//                }
//            }        
//        }
//        return total;
//    }
    
   
    //////////// Time Limit Exceed ////////////////
//    public int combinationSum4(int[] nums, int target) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        combinationSum4Helper(nums, target, 0, ans, list);
//        return ans.size();
//    }   
//    
//    private void combinationSum4Helper(int[] nums, int target, int sum, 
//            List<List<Integer>> ans, List<Integer> list) {
//        if (sum == target) {
//            ans.add(new ArrayList<>(list));
//        }  else {
//            for (int num : nums) {
//                int newSum = sum + num;
//                if (newSum <= target) {
//                    list.add(num);
//                    combinationSum4Helper(nums, target, newSum, ans, list);
//                    list.remove(list.size() - 1);
//                }
//            }
//        
//        }
//    
//    }


}
