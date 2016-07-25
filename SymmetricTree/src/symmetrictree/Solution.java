/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symmetrictree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 *
 * @author menglu
 */
public class Solution {
 // ================== iterative solution ======================
//    public boolean isSymmetric(TreeNode root) {        
//        Queue<TreeNode> storage = new LinkedList<>();
//        Queue<TreeNode> childrenStorage = new LinkedList<>();        
//        if (root != null) {
//            storage.add(root);
//            int nodeCount = 0;
//            //List<TreeNode> list = new ArrayList<>();
//            while (!storage.isEmpty()){
//                List<TreeNode> list = new ArrayList<>(); // save all the children in this level
//                while (!storage.isEmpty()) {
//                    TreeNode node = storage.remove();
//                    list.add(node);
//                    if (node != null) {
//                        childrenStorage.add(node.right);
//                        childrenStorage.add(node.left);
//                    } 
//                }
//                for (int i = 0; i < list.size() / 2; i++) {
//                    TreeNode node1 = list.get(i);
//                    TreeNode node2 = list.get(list.size() - i - 1);
//                    if (node1 != null && node2 != null) {
//                        if (node1.val != node2.val) {
//                            return false;
//                        }
//                    } else if (node1 != null) {  // unsymmetric
//                        return false;
//                    } else if (node2 != null) {
//                        return false;
//                    }
//                }
//                if (!childrenStorage.isEmpty()) {
//                    storage.addAll(childrenStorage);  // add all the children 
//                    childrenStorage = new LinkedList<>();
//                }            
//            }               
//        }
//        return true;  // null tree.  symmetric
//    }
// }


    // ================== recursive solution ======================
    public boolean isSymmetric(TreeNode root) {            
        Map<Integer, List<TreeNode>> map = new TreeMap<>();
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        return isSymmetricHelper(nodes);
    }
    
    
    private boolean isSymmetricHelper(List<TreeNode> nodes) {
        boolean ans = verifySysmmetry(nodes);            
        if (ans){ // check symmetry of the children
            List<TreeNode> childrenNodes = new ArrayList<>();
            for (TreeNode node : nodes) {
                if (node != null) {
                    childrenNodes.add(node.left);
                    childrenNodes.add(node.right);
                }
                ans = isSymmetricHelper(childrenNodes);
            } 
        } else {
            return false;
        }         
        return ans;
    }

    private boolean verifySysmmetry(List<TreeNode> nodes) {
        for (int i = 0; i < nodes.size() / 2; i++) {
            TreeNode node1 = nodes.get(i);
            TreeNode node2 = nodes.get(nodes.size() - i - 1);
            if (node1 != null && node2 != null) {
                if (node1.val != node2.val) {
                    return false;
                }
            } else if (node1 != null) {
                return false;
            } else if (node2 != null) {
                return false;
            }
        }
        return true;        
    }
    
    
    
}
