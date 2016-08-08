/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {        
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null) return lists;
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        
        List<Integer> list = new ArrayList<>();
        permuteUnique(nums, visited, lists, list);
        return lists;
    }
    
    private void permuteUnique(int[] nums, boolean[] visited, List<List<Integer>> lists, List<Integer> list) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue; // use this number when previous is visited.
            if(!visited[i]) {
                list.add(nums[i]);
                visited[i] = true;
                permuteUnique(nums, visited, lists, list);
                visited[i] = false;
                list.remove(list.size() - 1);
                
            }
        }
    }
}
