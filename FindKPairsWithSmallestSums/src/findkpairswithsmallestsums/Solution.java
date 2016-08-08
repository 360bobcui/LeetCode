/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findkpairswithsmallestsums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author menglu
 */
public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> smallestPairs = new ArrayList<>();
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return smallestPairs;
        }
        
        k = Math.min(k, nums1.length * nums2.length);
        Comparator<int[]> comparator = new intArratComparator();
        PriorityQueue<int[]> heap = new PriorityQueue(k, comparator);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int[] pair = {nums1[i], nums2[j]};
                heap.add(pair);
            }
        }
        System.out.println(heap.size());
        while (k-- > 0) {
            int[] pair = heap.remove();
            //System.out.println(Arrays.toString(pair));
            smallestPairs.add(pair);
        }
        return smallestPairs;
    }
    
    class intArratComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
           if (o1 == null && o2 != null) {
               return -1;
           } else if (o2 == null && o1 != null) {
               return 1;
           } else if (o2 == null && o1 == null) {
               return 0;
           } else {
               return o1[0] + o1[1] - o2[0] - o2[1]; 
           }       
        }    
    }
}
