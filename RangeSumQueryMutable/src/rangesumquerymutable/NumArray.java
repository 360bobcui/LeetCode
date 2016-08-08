/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangesumquerymutable;

/**
 *
 * @author menglu
 */
public class NumArray {
    private segmentTreeNode root;
    int[] nums;
    
    public NumArray(int[] nums) {
        if (nums != null && nums.length > 0) {
            
        
            this.nums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                this.nums[i] = nums[i];
            }
            this.root = buildtree(this.root, 0, nums.length - 1);

        }
        
    }
    
    void update(int i, int val) {
        if (root != null) {
            if (i > root.end || i < root.start) {
                return;
            }
            update(root, i, val);
        }
    }
    
    private void update(segmentTreeNode node, int i, int val) {
        if (node != null) {
            if (node.start == i && node.end == i) {
                node.sum = val;
            } else {
                int mid = (node.start + node.end) / 2;

                if (i <= mid) {
                    update(node.left, i, val);
                } else {
                    update(node.right, i, val);
                }

                node.sum = node.left.sum + node.right.sum;
            }
        }
    }
    
    private segmentTreeNode buildtree(segmentTreeNode node, int start, int end) {
        if (start == end) {
            node = new segmentTreeNode(nums[start], start, end);
        } else {
            node = new segmentTreeNode(start, end);
            int mid = (start + end) / 2;
            node.left = buildtree(node.left, start, mid);
            node.right = buildtree(node.right, mid + 1, end);            
            node.sum = node.left.sum + node.right.sum;          
        }
        return node;
    }
    
    public int sumRange(int i, int j) {
        if (root != null){
            i = Math.max(root.start, i);
            j = Math.min(root.end, j);
            return sumRangeHelper(root, i, j);
        }
        return 0;
    }
    
    private int sumRangeHelper(segmentTreeNode node, int start, int end) {
        if (node != null){
            if (node.start == start && node.end == end) {
                return node.sum;
            } else {
                int mid = (node.start + node.end) / 2;
                if (mid >= end) {
                    return sumRangeHelper(node.left, start, end);   
                } else if (mid < start) {
                    return sumRangeHelper(node.right, start, end);
                } else {
                    return sumRangeHelper(node.left, start, mid) + sumRangeHelper(node.right, mid + 1, end);
                }
            }
        }
        return 0;
    }

     
    
    class segmentTreeNode {
        int start;
        int end;
        int sum;
        segmentTreeNode left;
        segmentTreeNode right;
        public segmentTreeNode(int sum, int start, int end) {
            this.start = start;
            this.end = end;
            this.sum = sum;
            this.left = null;
            this.right = null;
        }
        
        public segmentTreeNode(int start, int end) {
            this(0, start, end);
        }
    }
    
    
//    //
//    private segmentNode root;
//    int[] nums;
//    
//    
//    public NumArray(int[] nums) {
//        this.nums = new int[nums.length];
//        for (int i = 0; i < nums.length; i++){
//            this.nums[i] = nums[i];
//        }
//        this.root = buildtree(nums, 0, nums.length - 1);
//    }
//
//    void update(int i, int val) {
//        update(root, i, val);
//    }
//    
//    private void update (segmentNode node, int pos, int val) {
//        if (node.start == node.end) {
//            node.sum = val;
//        } else {
//            int mid = (node.start + node.end) / 2;
//            if (pos <= mid) {
//                update(node.left, pos, val);
//            } else {
//                update(node.right, pos, val);
//            }
//            node.sum = node.left.sum + node.right.sum;
//        }
//    
//    }
//
//    public int sumRange(int i, int j) {
//        return sumRange(root, i, j);
//    }
//    
//    private int sumRange(segmentNode node, int start, int end) {
//        if (node != null) {
//            if (node.start == start && node.end == end) 
//                return node.sum;
//            else {
//                int mid = (node.start + node.end) / 2;
//                if (end <= mid) {
//                    return sumRange(node.left, start, end);
//                } else if (start >= mid) {
//                    return sumRange(node.right, start, end);
//                } else {
//                    return sumRange(node.left, start, mid) + sumRange(node.right, mid + 1, end);
//                }
//            }
//        }
//        return 0;
//        
//    }
//
//    private segmentNode buildtree(int[] nums, int start, int end) {
//        if(start > end) return null;
//        segmentNode root = new segmentNode(start, end);
//        if (start == end)
//            root.sum = nums[start];
//        else {
//            int mid = (end + start) / 2;
//            root.left = buildtree(nums, start, mid);
//            root.right = buildtree(nums, mid + 1, end);
//            root.sum = root.left.sum + root.right.sum;
//        }
//        return root;
//    }
//    
//    class segmentNode{
//        int start;
//        int end;
//        int sum;
//        segmentNode left;
//        segmentNode right;
//        public segmentNode(int start, int end) {
//            this.start = start;
//            this.end = end;
//            this.left = null;
//            this.right = null;
//            this.sum = 0;
//        }
//        
//    }
}
