/*
You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

Example:

Given nums = [5, 2, 6, 1]

To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Return the array [2, 1, 1, 0].
 */
package countofsmallenumbersafterself;

import java.util.List;

/**
 *
 * @author menglu
 */
public class CountofSmalleNumbersAfterSelf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int[] nums = {3,1,2};
        int[] nums = {7,2,7,2,6,1};
        List<Integer> list = new Solution().countSmaller(nums);
        System.out.println(list);
    }
    
}
