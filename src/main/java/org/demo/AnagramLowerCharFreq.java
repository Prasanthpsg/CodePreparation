package org.demo;


import java.util.Arrays;

public class AnagramLowerCharFreq {

    private static boolean areAnagrams1(String s1, String s2) {

     //   boolean areAnagram =false;
        if (s1.length() != s2.length()) {
            return false ;
        }

        //26 character array
        int[] array = new int[26]; //26-character frequency signature
     //   System.out.println(Arrays.toString(array)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for(int i=0;i<s1.length();i++){
       //     System.out.println(s1.charAt(i));
            array[ s1.charAt(i) - 'a']++;
        }
    //    System.out.println(Arrays.toString(array)); [0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for(int i=0;i<s2.length();i++){
            array[ s2.charAt(i) - 'a']--;
        }
      //  System.out.println(Arrays.toString(array)); // [0,0,0,0 etc]

    for(int value : array){
        if(value !=0){
          return false;
        }

    }

        return true;
    }


    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseed";
        if(areAnagrams1(s1,s2)){
            System.out.println("Yes anagram");
        }else{
            System.out.println("No anagram");
        }
    }
/* Time: O(N × K)*/

}
