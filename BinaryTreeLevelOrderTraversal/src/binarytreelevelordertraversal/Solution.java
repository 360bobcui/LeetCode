/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderHelper(root, ans, 0);
        return ans;
    }

    private void levelOrderHelper(TreeNode node, List<List<Integer>> list, int level) {
        if (node != null){
            List<Integer> sublist = getSubList(level, list);
            sublist.add(node.val);            
            if (node.left != null && node.right != null) {                 
                levelOrderHelper(node.left, list, level + 1);
                levelOrderHelper(node.right, list, level + 1);
            } else if (node.left != null) {
                levelOrderHelper(node.left, list, level + 1);
            } else {
                levelOrderHelper(node.right, list, level + 1);
            }        
        }
    }
    
    // pre:  the given list is not null
    // post: return the ith element in the given list
    //        add empty sublist if the size is smaller than the given i. 
    private List<Integer> getSubList(int i, List<List<Integer>> list) {
        if (list.size() <= i) {
            for (int j = list.size(); j <= i; j++) {
                List<Integer> subList = new ArrayList<>();
                list.add(subList);
            }
           
        }
        return list.get(i);
    }    
}
