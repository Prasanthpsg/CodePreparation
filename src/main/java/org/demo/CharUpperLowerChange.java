package org.demo;

public class CharUpperLowerChange {

    public static void main(String[] args) {
        String s = "pRaSaNtHka";
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=c.length-1;i++){
            if(c[i] >=97 && c[i]<=122){
                sb.append(Character.toUpperCase(c[i]));
            }else if(c[i] >=65 && c[i]<=90){
                sb.append(Character.toLowerCase(c[i]));
            }
        }

        System.out.println(sb); //PrAsAnThKA

    }
}
