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
//        wordList.add(beginWord);
//        wordList.add(endWord);
        
        Map<String, List<String>> adjacentMatrix = new TreeMap<>(); // find a list of words that is one char diff that the key
        //buildAdjacentMatrix(adjacentMatrix, beginWord, endWord);
        Queue<String> storage = new LinkedList<>();
        storage.add(beginWord);
        //BFS        
        int depth = treeBuilder(wordList, adjacentMatrix, endWord,  storage);       
        return depth;        
    } 
    
    // build the tree using breadth first iteration algorithm and
    //  terminate early if the endWord is found in the parent node. 
    // return the depth of the tree
    private int treeBuilder (Set<String> wordList, Map<String, List<String>> adjacentMatrix, 
            String endWord, Queue<String> storage) {        
        boolean found = false; // terminate early if end word found
        int depth = 0;
        while (!storage.isEmpty()) {           
            depth++;           
            //List<String> list = new ArrayList<>(storage);
            Set<String> childrenList = new HashSet<>(); // words of the one char diff of words in list above        
            Set<String> wordListCopy = wordList;
            wordList = new HashSet<String>(wordList);
            //  System.out.println(storage.isEmpty());
             //System.out.println(depth + ": " + list);
            for (String word1 : storage) {
                 //List<String> values = new ArrayList<>();  // dict (tree) value
                 for (String word2 : wordListCopy) {
                     if(isOneCharDiff(word1, word2)) {
                         //values.add(word2);
                         wordList.remove(word2);
                         childrenList.add(word2); // save all the children
                         if (word2.equalsIgnoreCase(endWord)) {
                             found = true; 
                             //break;
                         }
                     } 
                 }
                // tree.put(word1, values);
             } 
             storage = new LinkedList<>();
             if (!found) { // push all the children in the queue    
                 storage.addAll(childrenList);
//                for (String child : childrenList) {
//                    storage.add(child);                   
//                    //visited.put(child, true);
//                }
             }
        } 
        if (found)
            return depth + 1; // include the level of the found word
        else {
            return 0;
        }
    }
    
    // given the two words, return ture if only one char diff. return false otherwise. 
    private boolean isOneCharDiff(String word1, String word2) {
//        char[] word1Array = word1.toCharArray();
//        char[] word2Array = word2.toCharArray();
        if (word1.length() != word2.length()) {
            return false;
        } else {
            boolean diffOnce = false;
            for (int i = 0; i < word1.length(); i++){
                if(word1.charAt(i) != word2.charAt(i)) {
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
