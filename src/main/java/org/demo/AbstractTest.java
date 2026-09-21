package org.demo;

abstract  class Paymentab {

    abstract void pay();

    void Bill(){
        System.out.println("Bill method");
    }

    // COMPILER ERROR: Extension methods can only be used in an interface
//    default void blowHorn() {
//        System.out.println("Beep!");
//    }
}

class UPIPay extends Paymentab {

    @Override
    void pay(){
        System.out.println("concrete class UPI pay implementation");
    }

    void UPIBill(){
        System.out.println("UPI pay bill - child class");
    }
}

public class AbstractTest {

    public static void main(String[] args) {
        Paymentab p = new UPIPay(); //upcasting
        p.pay(); //concrete class UPI pay implementation
        p.Bill(); //Bill method

        UPIPay u = (UPIPay) p; // down casting
        u.UPIBill(); //UPI pay bill - child class
    }
}
