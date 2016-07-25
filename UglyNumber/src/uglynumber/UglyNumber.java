/*
Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 
2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes
another prime factor 7.

Note that 1 is typically treated as an ugly number.
 */
package uglynumber;

/**
 *
 * @author menglu
 */
public class UglyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 2122344120;
        System.out.println(new Solution().isUgly(num));
    }
    
}
