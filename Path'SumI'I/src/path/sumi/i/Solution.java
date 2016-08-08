/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package path.sumi.i;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author menglu
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSumHelper(root, 0, sum, ans, path);
        return ans;
    }
    
    private void pathSumHelper(TreeNode node, int sum,
            int target, List<List<Integer>> ans, List<Integer> path) {
        if (node != null) {
            path.add(node.val);
            sum += node.val;
            if (node.left == null && node.right == null && sum == target) {
                ans.add(new ArrayList(path));
            }
            pathSumHelper(node.left, sum, target, ans, path);
            pathSumHelper(node.right, sum, target, ans, path);
            path.remove(path.size() - 1);
        }    
    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}   
