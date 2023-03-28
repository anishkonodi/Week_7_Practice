import java.util.*;
class Account{
  int acNum;
  int balance;
  String account;
  String holderName;
}
class ATMSimulator{
    int n=3;
    Account e[]=new Account[n];
    Scanner sc= new Scanner(System.in);
  void addAccount(){
 
    for(int i=0; i<n; i++){
      e[i]= new Account();
      System.out.println("Enter Account holdder name");
      e[i].holderName=sc.next();
      System.out.println("Enter AC number");
      e[i].acNum=sc.nextInt();
      System.out.println("Enter Account balance");
      e[i].balance=sc.nextInt();
      System.out.println("Enter AC type");
      e[i].account=sc.next();
    }
  }
  void removeAccount(){
    int index=-1;
    System.out.println("Enter the AC number you want to remove");
    int rem = sc.nextInt();
    for(int i=0; i<e.length; i++){
      if(rem==e[i].acNum){
        index=i;
        break;
      }
    }
    if(index>=0){
      for(int i=index; i<e.length-1; i++){
        e[i]=e[i+1];
      }
      n--;
      display();
    }
  }
  void display(){
    System.out.println("Account holder names are");
    for(int i=0; i<n; i++){
      System.out.println(e[i].holderName);
    }
  }
}
class AccountsHandle{
  public static void main(String args[]){
    ATMSimulator c=new ATMSimulator();
    c.addAccount();
    c.display();
    c.removeAccount();
  }
}