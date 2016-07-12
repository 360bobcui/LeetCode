/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertbinarytree;

/**
 *
 * @author menglu
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        root = invertTreeHelper(root);
        return root;
    }

    private TreeNode invertTreeHelper(TreeNode node) {
        if (node != null) {
            
            node.left = invertTreeHelper(node.left);
            node.right = invertTreeHelper(node.right);
            TreeNode temp = node.right;
            node.right = node.left;
            node.left = temp;          
             
        }
        return node;
    }
}
