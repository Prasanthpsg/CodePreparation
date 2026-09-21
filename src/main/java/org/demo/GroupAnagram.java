package org.demo;

import java.util.*;

public class GroupAnagram {//Given a list of words, group together all the anagrams.

    public static List<List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();//['e', 'a', 't']
            Arrays.sort(chars); //['a', 'e', 't']

            String key = new String(chars); //Convert the sorted characters back to String aet
//anagram produces same key, using this we can group the result
            map.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }

        return new ArrayList<>(map.values());
    }


//Anagrams are words that contain the same letters rearranged.
    public static void main(String[] args) {
        String[] words = {
                "eat", "tea", "tan", "ate", "nat", "bat"
        };

        System.out.println(groupAnagrams(words));//[[eat, tea, ate], [bat], [tan, nat]]
    }
}
