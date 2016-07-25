/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowestcommonancester;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return lowestCommonAncestorHelper(root, p, q);
         }
        return null;
    }
    
    
    // pre: big.val > small.val
    private TreeNode lowestCommonAncestorHelper(TreeNode node, TreeNode p, TreeNode q) {
        while (node != null) {
            int nodeVal = node.val;
            if (nodeVal > p.val && nodeVal > q.val) 
                node = node.left;
            else if (nodeVal < p.val && nodeVal < q.val)
                node = node.right;
            else {
                return node;  
            }        
        }
        return node;
    }
    
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        TreeNode result;
//        if (p.val < root.val && q.val < root.val) {
//            result = lowestCommonAncestor(root.left, p, q);
//        } else if(p.val > root.val && q.val > root.val) {
//            result = lowestCommonAncestor(root.right, p, q);
//        } else {
//            result = root;
//        }
//        return result;
//    }
    
    
    
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }    
    
    }
}
