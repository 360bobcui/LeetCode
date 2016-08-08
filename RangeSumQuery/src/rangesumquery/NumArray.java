/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangesumquery;

/**
 *
 * @author menglu
 */
public class NumArray {
    int[] sum;
    public NumArray(int[] A) {
        if (A != null) {
            sum = new int[A.length + 1];
            for (int i = 0; i < A.length; i++) {
                sum[i + 1] = sum [i] + A[i];
            }
        } else {
            sum = new int[0];
        }
    }
    
    public int sumRange(int start, int end) {
        if (start < 0 || end >= sum.length - 1) {
            return Integer.MIN_VALUE;
        }
        return sum[end + 1] - sum[start];
    }
}
