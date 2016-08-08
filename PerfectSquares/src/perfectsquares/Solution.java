/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectsquares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public int numSquares(int n) {
        int[] nums = new int[n + 1];
        Arrays.fill(nums, Integer.MAX_VALUE);
        int j = 0;
        nums[0] = 0;
        while (++j * j < n) {
            for (int i = j * j; i < n + 1; i++){

                nums[i] = Math.min(nums[i], nums[i - j * j] + 1);
                
            }
        }
        return nums[n];
    } 
//    
//    // given number n, genreate all the square numbers from 1 to m, which m < n
//    private List<Integer> generateSequareNumbers(int n) {
//        List<Integer> list = new ArrayList<>();
//        int i = 1;
//        while (i * i < n) {
//            list.add(i);
//            i++;
//        }
//        return list;
//    }
}
