/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersectionoftwoarraysii;

import java.util.Map;
import java.util.*;

/**
 *
 * @author menglu
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                int val = map.get(num) + 1;
                map.put(num, val);            
            } else {
                map.put(num, 1);
            }
        }
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                int val = map.get(num) - 1;
                map.put(num, val);
                list.add(num);
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for (int num : list){
            res[index] = num;
            index++;
        }
        return res;
    }
}
