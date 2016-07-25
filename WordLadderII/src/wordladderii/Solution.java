/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author menglu
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        wordList.add(beginWord);
        wordList.add(endWord);
        Map<String, Boolean> visited = new HashMap<>(); 
        for (String word : wordList) {
            visited.put(word, false);
        }
        visited.put(beginWord, true); //
        
        Map<String, List<String>> tree = new TreeMap<>();
        Queue<String> storage = new LinkedList<>();
        storage.add(beginWord);
        //BFS        
        int depth = treeBuilder(wordList, endWord, visited, tree, storage);       
        return depth;        
    } 
    
    // build the tree using breadth first iteration algorithm and
    //  terminate early if the endWord is found in the parent node. 
    // return the depth of the tree
    private int treeBuilder (Set<String> wordList, String endWord, 
            Map<String, Boolean> visited, Map<String, List<String>> tree, Queue<String> storage) {        
        boolean found = false; // terminate early if end word found
        int depth = 0;
        while (!storage.isEmpty()) {           
            
            depth++;           
            List<String> list = new ArrayList<>();
            Set<String> childrenList = new TreeSet<>(); // words of the one char diff of words in list above
            while (!storage.isEmpty()) {
                list.add(storage.remove());        
            }
            if(!found){
           //  System.out.println(storage.isEmpty());
                //System.out.println(depth + ": " + list);
                for (String word1 : list) {
                    List<String> values = new ArrayList<>();  // dict (tree) value
                    for (String word2 : wordList) {
                        if(!visited.get(word2) && isOneCharDiff(word1, word2)) {
                            values.add(word2);
                            //visited.put(word2, true);
                            childrenList.add(word2); // save all the children
                            if (word2.equalsIgnoreCase(endWord)) {
                                found = true;
                            }
                        } 
                    }
                    tree.put(word1, values);
                }            
                for (String child : childrenList) {
                    storage.add(child);                   
                    visited.put(child, true);
                }
            }            
        } 
        if (found)
            return depth;
        else {
            return 0;
        }
    }
    
    // given the two words, return ture if only one char diff. return false otherwise. 
    private boolean isOneCharDiff(String word1, String word2) {
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        if (word1.length() != word2.length()) {
            return false;
        } else {
            boolean diffOnce = false;
            for (int i = 0; i < word1Array.length; i++) {
                if(word1Array[i] != word2Array[i]) {
                    if (!diffOnce) {
                        diffOnce = true;
                    } else // already diff once
                        return false;
                }
            }
            return true;    
        }
    }

}
