package org.demo;

public class JPMCOverload {

    private static void display(String s) {
        System.out.println("String method is called");
    }

    private static void display(Object s) {
        System.out.println("Object method is called");
    }

    public static void main(String[] args) {
        display(null);//String method is called
        //null is a valid value for both String and Object.  When multiple overloaded
        // methods match at compile time, Java chooses the most specific type.
        //String is more specific than Object.
    }
}
