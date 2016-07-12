/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreelevelordertraversalii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderBottomHelper(root, ans, 0);
        List<List<Integer>> res = new ArrayList<>();
//        for (List<Integer> sublist : ans) {
//            res.add(0,sublist);
//        }
        for (int i = 0; i < ans.size(); i++) {
            res.add(ans.get(ans.size() - i - 1));
        }        
        return res;
    }

    private void levelOrderBottomHelper(TreeNode node, List<List<Integer>> list, int level) {
        if (node != null){
            List<Integer> sublist = getSubList(level, list);
            sublist.add(node.val);            
            if (node.left != null && node.right != null) {                 
                levelOrderBottomHelper(node.left, list, level + 1);
                levelOrderBottomHelper(node.right, list, level + 1);
            } else if (node.left != null) {
                levelOrderBottomHelper(node.left, list, level + 1);
            } else {
                levelOrderBottomHelper(node.right, list, level + 1);
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
