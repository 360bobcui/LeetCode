/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btpreordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);            
        }
        return list;
    } 
    
    
    ////////////////// recurisive method ////////////////////
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        preorderTraversal(root, list);
//        return list;
//    } 
//    
//    private void preorderTraversal(TreeNode node, List<Integer> list) {
//        if(node != null){
//            list.add(node.val);
//            preorderTraversal(node.left, list);
//            preorderTraversal(node.right, list);
//        }
//    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
