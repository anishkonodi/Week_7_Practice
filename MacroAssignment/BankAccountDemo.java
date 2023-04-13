
//1.Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
import java.util.Scanner;

class InsufficientFundsException extends Exception {
  InsufficientFundsException(String str) {
    super(str);
  }
}

class BankAccount {
  int balance = 20000;

  void deposite(int amount) {
    balance = balance + amount;
    checkBalance();
  }

  void withdraw(int amount) throws InsufficientFundsException {
    if (amount > balance) {
      throw new InsufficientFundsException("Invalid amount");
    } else {
      balance = balance - amount;
      checkBalance();
    }
  }

  void checkBalance() {
    System.out.println("Your account balance is " + balance);
  }
}

class BankAccountDemo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    BankAccount bank = new BankAccount();
    System.out.println("Enter your choice");
    System.out.println("1. Deposite");
    System.out.println("2. Withdraw");
    System.out.println("3. Check account balance");
    int choice = s.nextInt();
    switch (choice) {
      case 1: {
        System.out.println("enter amount");
        int amnt = s.nextInt();
        bank.deposite(amnt);
        break;
      }
      case 2: {
        System.out.println("enter amount");
        int amount = s.nextInt();
        try {
          bank.withdraw(amount);
          break;
        } catch (InsufficientFundsException e) {
          System.out.println(e);
        }

      }
      case 3: {
        bank.checkBalance();
        break;
      }
      default: {
        System.out.println("Enter valid choice");
        break;
      }
    }
  }
}