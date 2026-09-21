package org.demo;

public class CountAlphaNumberSpecialCharacters {

    public static void main(String[] args) {
        String s = "pras12df&&%sd";
        char[] c = s.toCharArray();
        int alpha=0,special=0,number =0;
        for(int i=0;i<=c.length-1;i++){
            if(Character.isLetter(c[i])){
                alpha++;
            }else if(Character.isDigit(c[i])){
                number++;
            }else{
                special++;
            }
        }

        System.out.println("Alphabets: "+alpha);
        System.out.println("Special: "+special);
        System.out.println("Numbers: "+number);
    }
}
