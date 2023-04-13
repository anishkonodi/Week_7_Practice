//1. ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.

import java.util.Scanner;
class Account{
  long accNum;
  double balance=20000;
  String accHolderName;
  void setAccNumber(long accNum){
    this.accNum=accNum;
  }
  void setAccHolderName(String accHolderName){
    this.accHolderName=accHolderName;
  }
  long getAccNumber(){
    return accNum;
  }
  String getAccHolderName(){
    return accHolderName;
  }
  void deposit(double amount){
    balance=balance+amount;
    System.out.println("Your account balance is "+balance);
  }
  void withdraw(double amount){
    balance=balance-amount;
    System.out.println("Your account balance is "+balance);
  }
  void checkBalance(){
    System.out.println("Your account balance is "+balance);
  }
}

class AtmSimulator extends Account{
  Scanner s=new Scanner(System.in);
  Account acc[]=new Account[3];
  void addAccount(){
    for(int i=0;i<3;i++){
      System.out.println("enter account holder name");
      acc[i].setAccHolderName(s.nextLine());
      System.out.println("enter account number");
      acc[i].setAccNumber(s.nextLong());
    }
    
    System.out.println(" accounts added successfully");
  }

  void removeAccount(){
    System.out.println("enter the account number to delete account");
    long deleteAccNum=s.nextLong();
    int index=-1;
    for(int i=0;i<acc.length-1;i++){
      if(acc[i].getAccNumber()==deleteAccNum){
        index=i;
      }
    }
    for(int i=index;i<acc.length;i++){
      acc[i]=acc[i+1];
    }
    System.out.println("Account removed successfully");
  }

  void listOfAccounts(){
     for(int i=0;i<acc.length;i++){
      System.out.println("Name : "+acc[i].getAccHolderName()+" Account Number : "+acc[i].getAccNumber());
       
    }
  }

  // void transact(){
  //   System.out.println("Enter account number ");
  //   long num=s.nextLong();
  //   for(int i=0;i<acc.length;i++){
      
  //   }
  // }
}


class AtmDemo{
  public static void main(String args[]){
    AtmSimulator obj=new AtmSimulator();
    obj.addAccount();
  }
}
