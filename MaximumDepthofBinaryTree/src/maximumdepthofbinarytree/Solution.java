/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumdepthofbinarytree;

/**
 *
 * @author menglu
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int ans = 0;
        if (root != null) {
            ans = maxDepthHelper(root, 0);
            
        }
        return ans;
    }
    
    private int maxDepthHelper(TreeNode node, int level) {
        if (node != null) {
            if (node.left == null && node.right == null){
                return level + 1;
            } else if (node.left != null && node.right != null) {
                int level1 = maxDepthHelper(node.left, level + 1);
                int level2 = maxDepthHelper(node.right, level + 1);
                if (level1 > level2) {
                    level = level1;
                } else {
                    level = level2;
                }
            } else if (node.right != null) {
                level = maxDepthHelper(node.right, level + 1);
            } else { // node.left != null) {{
                level = maxDepthHelper(node.left, level + 1);
            }
        }
        return level;    
    }
}
