/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowestcommonancestorofbt;

/**
 *
 * @author menglu
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return right == null ? left : left == null ? right :root;
                     
//       while (root != null) {
//           if (lowestCommonAncestorHelper(root, p) && lowestCommonAncestorHelper(root, q))
//       }
    }
    
//    private boolean lowestCommonAncestorHelper(TreeNode node, TreeNode p){
//        if (node != null) {
//            if (node == p) {
//               return true;
//            }
//            return lowestCommonAncestorHelper(node.left, p) || lowestCommonAncestorHelper(node.right, p);
//        }
//        return false;
//    }
    
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }    
    
    }    
}
