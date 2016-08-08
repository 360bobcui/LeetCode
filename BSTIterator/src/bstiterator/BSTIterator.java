/*
Implement an iterator over a binary search tree (BST). 
Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and
uses O(h) memory, where h is the height of the tree.
 */
package bstiterator;

import java.util.Stack;

/**
 *
 * @author menglu
 */
public class BSTIterator {
    
    private TreeNode visited;
    private Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        visited = root;
        stack = new Stack<>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return visited != null || !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        while (visited != null) {
            stack.push(visited);
            visited = visited.left;
        }
        TreeNode next = stack.pop();
        visited = next.right;
        return next.val;       
    }
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
