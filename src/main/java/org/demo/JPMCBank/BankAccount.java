package org.demo.JPMCBank;

//abstraction
abstract  public class BankAccount {

    //encapsulation
    private int age;
    private String accountHolder;
    private double balance;
    private long accountNumber;

    public BankAccount(int age, String accountHolder, double balance, long accountNumber){
        this.age = age;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    public int getAge(){
        return this.age;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public double getAvailableBalance(){
        return this.balance;
    }

    //common behavior
    public void depositAmount(double amount){
        if(amount <=0){
            System.out.println("The amount is less than or equal to zero");
        } else{
            this.balance += amount;
            System.out.println("The available amount after the deposit is "+this.balance);
        }
    }

    public void withdrawAmount(double amount){
        if(amount > this.balance){
            System.out.println("The amount is greater than available balance");
        }else {
            this.balance -= amount;
            System.out.println("The available amount after the withdraw is "+this.balance);
        }
    }

    //abstract class
   public abstract double calculateInterestRate();

    @Override
    public String toString(){
        return  age + " "+accountNumber+ " "+accountHolder+ " "+balance;
    }

}
