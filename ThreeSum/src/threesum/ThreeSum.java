/*
Given an array S of n integers, are there elements a, b, c in S such that 
a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 */
package threesum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author menglu
 */
public class ThreeSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 1, 2,-1,-4};
        
        System.out.println(threeSum(num));
    }
    
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        if (num.length < 3) {
            return result;
        }
//        int start = 0;
//        int mid = 1;
//        int end = 2;
//        while (start < num.length - 2) {
//            
//        }
        
        for (int i = 0; i < num.length - 2; i++){
            if (i == 0 || num[i - 1] != num[i]){
                for (int j = i + 1; j < num.length - 1; j++) {
                    if (j == i + 1 || num[j - 1] != num[j]){
                        for (int k = j + 1; k < num.length; k++) {
                            if ((k == j + 1 || num[k - 1] != num[k]) && num[i] + num[j] + num[k] == 0) {
                                ArrayList<Integer> element = new ArrayList<>();
                                element.add(num[i]);
                                element.add(num[j]);
                                element.add(num[k]);
                                result.add(element);
                            } else if (num[i] + num[j] + num[k] > 0){  //more efficient
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        return result;
    }
    
}
