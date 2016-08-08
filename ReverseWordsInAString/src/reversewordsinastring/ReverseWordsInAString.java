/*
151. Reverse Words in a String  QuestionEditorial Solution  My Submissions
Total Accepted: 111423
Total Submissions: 706973
Difficulty: Medium
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".


 */
package reversewordsinastring;

/**
 *
 * @author menglu
 */
public class ReverseWordsInAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String res = " The blue     is     sky";
        System.out.println(new Solution().reverseWords(res));
    }
    
}
