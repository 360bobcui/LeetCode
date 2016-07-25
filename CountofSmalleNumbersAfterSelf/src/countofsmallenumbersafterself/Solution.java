/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countofsmallenumbersafterself;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> answers = new ArrayList<>();
        if (nums == null || nums.length == 0) 
           return answers;      
        
        TreeNode root = new TreeNode(nums[nums.length - 1]);         
        answers.add(0);
        
        if (nums.length > 1){
            for (int i = nums.length - 2; i >= 0; i--) {
               int val = nums[i];
               int ans = insertValue(root, val);
               //System.out.println(root.val);
               answers.add(ans);
            }      
            Collections.reverse(answers);
        }
        return answers;   
    }
    
    // insert a node into the tree and return how many numbers smaller in the tree already
    private int insertValue(TreeNode root, int val) {
        int count = 0;
        while (true) {      
            if (root.val < val) {
                count = count + root.count;
                if (root.right == null) {
                    root.right = new TreeNode(val);
                    return count;
                } else {
                    root = root.right;
                }
            } else {//(root.val >= val){ // root.val >= val
                root.count++;
                if (root.left == null) {
                    root.left = new TreeNode(val);
                    return count;
                } else {
                    root = root.left;
                }
            }
        }
     } 
    
    class TreeNode{
        int val;
        int count;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            count = 1; // how many numbers equal and smaller than val (including self)
        }        
        TreeNode(int x, int y) {
            val = x;
            count = y;
        } 
    }
}
