/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 

// FAIL TIME EFFICIENCY TEST
 */
package foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> item = new ArrayList<>();
        fourSum(nums, target, item, result, 0);        
        return result;
    }
    
    public void fourSum(int[] nums, int target, List<Integer> item, List<List<Integer>> result, int currentIndex){
        int sum = getSum(item);
        // base case
        if (sum == target && item.size() == 4) {
            List<Integer> itemCopy = new ArrayList<>(item);
           // System.out.println("dd");
           if (!result.contains(item)){
                result.add(itemCopy);
           }
        }      
        if (currentIndex < nums.length && item.size() < 4) { // worth searching            
            //System.out.println("dd1");
            for (int i = currentIndex; i < nums.length; i++){
                if (nums[i] > 0 && sum > target) {
                    break;
                } 

                if (item.size() < 4){
                    List<Integer> last = new ArrayList<>(item);
                    last.add(nums[i]);
                    //System.out.println("dd2");
                    fourSum(nums, target, last, result, i + 1);
                }
            }
        } 
    }
    
    public int getSum(List<Integer> item){
        int sum = 0;
        for (int num : item) {
            sum += num;
        }
        return sum;
    }
}
