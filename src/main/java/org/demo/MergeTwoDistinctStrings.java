package org.demo;

public class MergeTwoDistinctStrings {

    public static void main(String[] args) {

        String s1="abcd", s2 ="efghij";

        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(s1.length(),s2.length());

        for(int i=0;i< maxLength;i++){

            if(i<s1.length()){
                sb.append(s1.charAt(i));
            }
            if(i<s2.length()){
                sb.append(Character.toUpperCase(s2.charAt(i)));
            }
        }
        System.out.println(sb.toString()); //aEbFcGdHIJ

        //Complexity: O(n + m) time and O(n + m) space for the resulting string
    }
}
