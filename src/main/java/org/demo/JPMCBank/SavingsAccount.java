package org.demo.JPMCBank;

public class SavingsAccount extends BankAccount{

   private final double interestRate ;
  //  private double interestAmount;

    public SavingsAccount(int age, String accountHolder, double balance, long accountNumber, double interestRate) {
        super(age, accountHolder, balance, accountNumber);
        this.interestRate = interestRate;
    }

    @Override
   public double calculateInterestRate(){
       return  (getAvailableBalance() *interestRate)/100;

    }


}
