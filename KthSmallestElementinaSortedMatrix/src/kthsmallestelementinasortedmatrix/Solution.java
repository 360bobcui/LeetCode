/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kthsmallestelementinasortedmatrix;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author menglu
 */
public class Solution {
    public int kthSmallest(int[][] A, int k) {
        //Comparator<Tuple> tupleComparator = new TupleComparator();
        
        int m = A.length;
        int n = A[0].length;
        PriorityQueue<Tuple> heap = new PriorityQueue<Tuple>();
        for (int i = 0; i < A[0].length; i++) {
            Tuple tuple = new Tuple(0, i, A[0][i]);
            heap.offer(tuple);
        }
        for (int i = 0; i < k - 1; i++){
            Tuple tuple = heap.poll();
            if (tuple.row == m - 1) continue;
            Tuple newTuple = new Tuple(tuple.row + 1, tuple.col, A[tuple.row + 1][tuple.col]);
            heap.add(newTuple);
        }
        
        return heap.poll().val;
    }
    
    class Tuple implements Comparable<Tuple>{
        private int row;
        private int col;
        private int val;
        public Tuple(int row, int col, int val){
            this.row = row;
            this.col = col;
            this.val = val;
        }        

        @Override
        public int compareTo(Tuple o) {
            return this.val - o.val;
        }
    }
    
        
    
}
