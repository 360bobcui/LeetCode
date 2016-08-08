/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btinordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 *
 * @author menglu
 */
public class Solution {
     public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         inorderTraversal(list, root);
         return list;
     }

    private void inorderTraversal(List<Integer> list, TreeNode node) {
        if (node != null) {
            inorderTraversal(list, node.left);
            list.add(node.val);
            inorderTraversal(list, node.right);
        }
    }
     

//    ///// iterative solution  //////////////////////
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        if (root == null)  return list;
//        
//        Stack<TreeNode> stack = new Stack();
//        //stack.push(root);
//        TreeNode node = root;
//        while (node != null) {
//            stack.push(node);  
//            node = node.left;
//        }
//        
//        while (!stack.isEmpty()) {
//            TreeNode next = stack.pop();
//            list.add(next.val);
//            if (next.right != null) {
//                next = next.right;
//                //stack.push(next);
//                while (next != null) {
//                    stack.push(next);
//                    next = next.left;
//                }
//            }
//        }
//        return list;
//    }  
    
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
