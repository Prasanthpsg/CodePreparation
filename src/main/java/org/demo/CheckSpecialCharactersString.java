package org.demo;

public class CheckSpecialCharactersString {

    public static void main(String[] args) {
        String str = "My name is V@jranda and I @m from Mys0re and I like D0s@ very much";
        String[] inputArray = str.split(" ");

        for(String value: inputArray){
            for(int i=0;i<value.length();i++){
                if(!Character.isLetter(value.charAt(i))){
                    System.out.println(value); //V@jranda @m Mys0re D0s@
                    break;
                }
            }

        }


    }
}
