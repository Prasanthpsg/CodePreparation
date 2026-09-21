package org.demo;

interface IFunction {

    void hi();
}

public class FunctionalInterface {

    public static void main(String[] args) {
//        IFunction iFunction = new IFunction() {
//            @Override
//            public void hi() {
//                System.out.println("hhh");
//            }
//        };

        IFunction iFunction = () -> System.out.println("hhh");

        iFunction.hi();
    }
}
