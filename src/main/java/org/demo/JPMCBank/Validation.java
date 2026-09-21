package org.demo.JPMCBank;

import java.util.*;

public class Validation {

    public static void main(String[] args) {

        Comparator<BankAccount> com = Comparator.comparingInt(BankAccount::getAge);


       BankAccount bankAccount;
         bankAccount = new SavingsAccount(  //Runtime polymorphism
                25,"Prasanth", 50000, 663977, 2.5
        );
        bankAccount.depositAmount(12000);
        bankAccount.withdrawAmount(1000);
        System.out.println(bankAccount.calculateInterestRate()); //overridden methods

         bankAccount = new CurrentAccount(  //Runtime polymorphism
                29,"Akash", 3000, 2428425, 2
        );
        bankAccount.depositAmount(12000);
        bankAccount.withdrawAmount(1000);
        System.out.println(bankAccount.calculateInterestRate()); //overridden methods

        // additional check
        List<BankAccount> bankList = Arrays.asList(
                new SavingsAccount(12,"Jenny", 1000, 124344, 2),
                new SavingsAccount(24,"Rob", 11000, 433434, 12),
                new SavingsAccount(6,"Mike", 4000, 876767, 42)
                );

//        bankList.sort(Comparator.comparingInt(BankAccount::getAge).reversed()
//                .thenComparing(BankAccount::getAvailableBalance));
        bankList.sort(com);

//        bankList.forEach(e->
//                System.out.println(e.getAge() + " "+e.getAccountHolder() +" "+e.getAvailableBalance()));

        bankList.forEach(System.out::println);

    }
}
