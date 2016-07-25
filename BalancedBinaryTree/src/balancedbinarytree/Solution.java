/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedbinarytree;
import java.util.*;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        int depth = dfsDepth(root);
        return (depth != -1);
    }
    
    // return the depth of the given node from very bottom to the node. 
    private int dfsDepth(TreeNode node) {
       if (node == null) {
           return 0;
       }
       
        int depth1 = dfsDepth(node.left);
        if (depth1 == -1)  // not balanced
            return -1;
      
        int depth2 = dfsDepth(node.right);
        if (depth2 == -1)   // not balanced
            return -1;
        
        if (Math.abs(depth1 - depth2) > 1) {
            return -1;
        } 
        
        return (Math.max(depth1, depth2) + 1); 
    }
    
}
