/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
 */
package reversevowelsofastring;

/**
 *
 * @author menglu
 */
public class Solution {
    public String reverseVowels(String s) {
        String result = null;
        if (s != null) {
            char[] charArray = s.toCharArray();
            int start = -1;
            int end = -1;
            int i = 0;
            int j = charArray.length - 1;
            while (i < j){
                boolean[] isVowel;
                if (isVowel(charArray[i]) && isVowel(charArray[j])) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;    
                    i++;
                    j--;
                } else if (isVowel(charArray[i])){
                    j--;
                } else if (isVowel(charArray[j])){
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
            result = new String(charArray);
        }
        return result;
    }    

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
