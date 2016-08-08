/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreepaths;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;
        String path = "" + root.val;
        if (root.left == null && root.right == null) {
            ans.add(path);
        } else { 
            binaryTreePathsFinder(root.left, ans, path);
            binaryTreePathsFinder(root.right, ans, path);
        }
        return ans;
    }
    
    private void binaryTreePathsFinder(TreeNode node, List<String> ans, String path) {
        if (node != null) { 
            path = path + "->" + node.val;
            if (node.left == null && node.right == null) {
                ans.add(path);
            }
            binaryTreePathsFinder(node.left, ans, path);
            binaryTreePathsFinder(node.right, ans, path);
            //path.remove(path.size() - 1);
        }    
    }
    
    
  //////////////////////////Solution 1 ////////// 13.8%   
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> path = new ArrayList<>();
//        binaryTreePathsFinder(root, ans, path);
//        return convertPath(ans);
//        
//    }
//    
//    
//    private void binaryTreePathsFinder(TreeNode node, List<List<Integer>> ans, List<Integer> path) {
//        if (node != null) { 
//            path.add(node.val);
//            if (node.left == null && node.right == null) {
//                ans.add(new ArrayList<>(path));
//            }
//            binaryTreePathsFinder(node.left, ans, path);
//            binaryTreePathsFinder(node.right, ans, path);
//            path.remove(path.size() - 1);
//        }
//    
//    }
//
//    private List<String> convertPath(List<List<Integer>> ans) {
//        List<String> res = new ArrayList<>();
//        for (List<Integer> path : ans) {
//            String p = "";
//            for (int num : path) {
//                p = p + num + "->";
//            }
//            p = p.substring(0, p.length() - 2);
//            res.add(p);
//            
//        }
//        return res;
//    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
