/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordladderii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author menglu
 */
public class WordLadderII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> worldList = new HashSet<>();
//        worldList.add("hot");
//        worldList.add("dog");
//        worldList.add("hog");
//        worldList.add("hod");
//        worldList.add("dot");
//       String[] words = {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln",
//       "tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow",
//       "sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt",
//       "lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha",
//       "hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st",
//       "er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};
       String[] words = {"a","b","c"};
       

        //String[] words = {"ts","sc","ph","ca","jr","hf","to","if","ha","is","io","cf","ta"};
//       Arrays.sort(words);
       //System.out.println(Arrays.toString(words));
      // List<String> temp = new ArrayList<>();
       for (String word : words) {
           worldList.add(word);
       }

//        String beginWord = "qa";        
//        String endWord = "sq";
//        String beginWord = "hit";        
//        String endWord = "dog"; 
        String beginWord = "a";        
        String endWord = "c";
//        String beginWord = "ta";        
//        String endWord = "if";

        List<List<String>> ans = new Solution().findLadders(beginWord, endWord, worldList);
        System.out.println(ans);
        
    }
    
}
