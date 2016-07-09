/*
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 

[
  [7],
  [2, 2, 3]
]
 */
package combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author menglu
 */
public class CombinationSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] candidates = {2, 3,4, 5};
        int target =7;
        System.out.println(combinationSum(candidates, target));
    }
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        
        if (candidates.length > 0 && candidates[0] > 0 && target > 0) {
            List<Integer> temp = new ArrayList<>();
            combinationSum(candidates, target, result, temp, 0);
        } 
        
        return result;
    }

    private static void combinationSum(int[] candidates, int target, List<List<Integer>> result, List<Integer> temp, int currentIndex) {
        int sum = getSum(temp);
//         System.out.println(sum);
//         System.out.println(candidates[0]);
//         System.out.println(target);
//         System.out.println(candidates[candidates.length - 1]);
        if (sum == target) {
            result.add(new ArrayList<>(temp));
        } else if (target - sum >= candidates[0]) {// worth searching 
            //System.out.println("hh");
            
            for (int i = currentIndex; i < candidates.length; i++){
                List<Integer> last = new ArrayList<>(temp); 
                last.add(candidates[i]);
                combinationSum(candidates, target, result, last, i);
            }
        }
    }
    
    private static int getSum (List<Integer> temp) {
        int sum = 0;
        for (int num : temp){
            sum += num;
        }
        return sum;
    }
    
}
