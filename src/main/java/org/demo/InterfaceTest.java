package org.demo;

interface Ipayment {
    public abstract void pay2();
    public abstract  void bill();

    default void defaultMethod (){
        System.out.println("Default method in interface");
    }

    public static void staticMethod(){
        System.out.println("static method in interface");
    }
}

class UPIPayI implements Ipayment{
    @Override
   public void pay2(){
        System.out.println("pay2 in concrete method");
    }

    @Override
    public void bill() {
        System.out.println("bill in concrete method");
    }
}

public class InterfaceTest {

    public static void main(String[] args) {

        Ipayment ipayment = new UPIPayI();
        ipayment.pay2();
        ipayment.bill();
        ipayment.defaultMethod(); //access the default method using object

        //access static method
        Ipayment.staticMethod();//access the static method using interface name
    }
}
