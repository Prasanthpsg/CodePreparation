package org.demo;

class Payment1 {
    public  void pay(){
        System.out.println("parent pay");
    }

    public  void bill(){
        System.out.println("parent bill");
    }

    public  void secretBill(){
        System.out.println("Parent secret bill");
    }
}

class UPIPayment extends Payment1 {

    public  void childUPIPrintMachine() {
        System.out.println("Child UPI machine");
    }

    @Override
    public void secretBill(){
        System.out.println("Child UPI class secret bill");
    }
}

class CardPayment extends Payment1 {

    public  void childCardPrintMachine() {
        System.out.println("Child card machine");
    }

    @Override
    public void secretBill(){
        System.out.println("Child card class secret bill");
    }
}


public class MethodOverridingTest {



    public static void main(String[] args) {

/* Here we are creating separate child references, so the code is tightly coupled to
    the specific child classes. With a parent reference, we can work with different
    child implementations through the common parent API */

     /*   UPIPayment upiPayment = new UPIPayment(); //object created for a UPIPayment child class
        upiPayment.bill(); // parent class visibility
        upiPayment.pay();
        upiPayment.secretBill();
        upiPayment.childUPIPrintMachine();

        CardPayment cardPayment = new CardPayment(); //object created for a card payment child class
        cardPayment.bill(); // parent class visibility
        cardPayment.pay();
        cardPayment.secretBill();
        cardPayment.childCardPrintMachine();*/

        //same above logic achieved with the parent reference type
        Payment1 payment1;

        payment1 = new UPIPayment();
        payment1.bill(); //parent bill
        payment1.secretBill(); //Child UPI class secret bill

        payment1 = new CardPayment();
        payment1.bill(); //parent bill
        payment1.secretBill(); //Child card class secret bill




    }
}
