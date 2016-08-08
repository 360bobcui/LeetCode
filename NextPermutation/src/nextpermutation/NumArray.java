/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextpermutation;

/**
 *
 * @author menglu
 */
public class NumArray {
    private segmentNode root;
    int[] nums;
    
    
    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            this.nums[i] = nums[i];
        }
        this.root = buildtree(nums, 0, nums.length - 1);
    }

    void update(int i, int val) {
        update(root, i, val);
    }
    
    private void update (segmentNode node, int pos, int val) {
        if (node.start == node.end) {
            node.sum = val;
        } else {
            int mid = (node.start + node.end) / 2;
            if (pos <= mid) {
                update(node.left, pos, val);
            } else {
                update(node.right, pos, val);
            }
            node.sum = node.left.sum + node.right.sum;
        }
    
    }

    public int sumRange(int i, int j) {
        return sumRange(root, i, j);
    }
    
    private int sumRange(segmentNode node, int start, int end) {
        if (node.start == start && node.end == end) 
            return node.sum;
        else {
            int mid = (node.start + node.end) / 2;
            if (end <= mid) {
                return sumRange(node.left, start, end);
            } else if (start >= mid) {
                return sumRange(node.right, start, end);
            } else {
                return sumRange(node.left, start, mid) + sumRange(node.right, mid + 1, end);
            }
        }
    }

    private segmentNode buildtree(int[] nums, int start, int end) {
        if(start > end) return null;
        segmentNode root = new segmentNode(start, end);
        if (start == end)
            root.sum = nums[start];
        else {
            int mid = (end + start) / 2;
            root.left = buildtree(nums, start, mid);
            root.right = buildtree(nums, mid + 1, end);
            root.sum = root.left.sum + root.right.sum;
        }
        return root;
    }
    
    class segmentNode{
        int start;
        int end;
        int sum;
        segmentNode left;
        segmentNode right;
        public segmentNode(int start, int end) {
            this.start = start;
            this.end = end;
            this.left = null;
            this.right = null;
            this.sum = 0;
        }        
    }
}
