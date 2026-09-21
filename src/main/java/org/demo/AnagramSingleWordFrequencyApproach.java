package org.demo;

import java.util.HashMap;
import java.util.Map;

public class AnagramSingleWordFrequencyApproach {

    private static boolean areAnagrams(String s1, String s2) {

     //   boolean areAnagram = false;
        if (s1.length() != s2.length()) {
            return false ;
        }

        Map<Character, Integer> freq = new HashMap<>();
        for(char c: s1.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq); //{s=1, e=2, G=1, k=1}

        //decrement the corresponding count for each character in the same HashMap
        for(char c: s2.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)-1);
        }
        System.out.println(freq); //{s=0, e=0, G=0, k=0}

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if (entry.getValue() != 0) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "kseeG";
        if(areAnagrams(s1,s2)){
            System.out.println("Yes anagram");
        }else{
            System.out.println("No anagram");
        }
    }

/*    For N words:

    Time: O(N × K log K)

    The HashMap requires:

    Space: O(N × K)*/


}
