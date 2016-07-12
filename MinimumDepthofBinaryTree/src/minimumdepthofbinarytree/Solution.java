/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumdepthofbinarytree;

/**
 *
 * @author menglu
 */
public class Solution {
    public int minDepth(TreeNode root) {
        int ans = minDepthHelper(root, 0);
        return ans;
    }

    private int minDepthHelper(TreeNode node, int level) {
        if (node != null) {
            level++;
            if (node.left != null && node.right != null) {
                
                int level1 = minDepthHelper(node.left, level);
                int level2 = minDepthHelper(node.right, level);
                if (level1 < level2) {
                    level = level1;
                } else {
                    level = level2;
                }
            } else if(node.left != null) {
                level = minDepthHelper(node.left, level);
            } else if(node.right != null) {
                level = minDepthHelper(node.right, level);
            }      
        }
        return level;
    }
    
    /*
    3 java solutions include recursive,BFS,DFS
    recursive:

public int minDepth(TreeNode root){
    if(root==null) return 0;
    if(root.left!=null&&root.right!=null)return Math.min(minDepth(root.left),minDepth(root.right))+1;
    else if(root.left==null) return minDepth(root.right)+1;
    else if(root.right==null) return minDepth(root.left)+1;
    else return 1;
    
}
BFS:

public int minDepth(TreeNode root) {
    if(root==null) return 0;
    Queue<TreeNode> queue=new LinkedList<TreeNode>();
    queue.add(root);
    int size,level=1;
    TreeNode tn;
    while(!queue.isEmpty()){
        size=queue.size();
        for(int i=0;i<size;i++){
            tn=queue.remove();
            if(tn.left==null&&tn.right==null){
                return level;
            }else{
                if(tn.left!=null) queue.add(tn.left);
                if(tn.right!=null) queue.add(tn.right);
            }
        }
        level++;
    }
    return level;
}
DFS:

public int minDepth(TreeNode root){
    if(root==null) return 0;
    Stack<TreeNode> stack=new Stack<TreeNode>();
    TreeNode tp,lastVisited=null,n;
    int min=Integer.MAX_VALUE;
    while(root!=null||!stack.isEmpty()){
        if(root!=null){
            stack.push(root);
            root=root.left;
        }else{
            tp=stack.peek();
            if(tp.right!=null&&tp.right!=lastVisited){
                root=tp.right;
            }else{
                if(tp.left==null&&tp.right==null){
                    if(stack.size()<min) min=stack.size();
                }
                lastVisited=stack.pop();
            }
        }
    }
    return min;
}
    */
}
