package org.demo;

class Payment {
     public void pay(){
         System.out.println("parent pay");
     }

     public void bill(){
         System.out.println("parent bill");
     }

     public  void secretBill(){
         System.out.println("Parent secret bill");
     }
}

class ChildPayment extends Payment {

    public void childPrintMachine(){
        System.out.println("child print machine");
    }

}

public class InheritanceTest {

    public static void main(String[] args) {
        ChildPayment childPayment = new ChildPayment(); //object created for a child class
        childPayment.bill(); // parent class visibility
        childPayment.pay();
        childPayment.childPrintMachine();
    }
}
