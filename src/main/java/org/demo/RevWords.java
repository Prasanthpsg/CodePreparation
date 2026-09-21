package org.demo;

public class RevWords {

    public static void main(String[] args) {
        String stt = "hello test";
        String[] inputArray = stt.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : inputArray) {
            for (int j = s.length() - 1; j >= 0; j--) {
                sb.append(s.charAt(j));
            }

            sb.append(" ");
        }
        System.out.println(sb.toString().trim()); //olleh tset
    }
}
