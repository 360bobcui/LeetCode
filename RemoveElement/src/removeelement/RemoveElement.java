/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeelement;

import java.util.Arrays;

/**
 *
 * @author menglu
 */
public class RemoveElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {0, 0,1, 0, 3, 12};
        int size = new Solution().removeElement(nums, -1);
        System.out.println(Arrays.toString(nums));
        System.out.println(size);
    }
    
}
