package OOPs.basic;

class Details{

    int customer_id;
    String  customer_name;
    float balance;

 void enterDetails(int c_id, String name, float bal)
 {
    customer_id=c_id;
    customer_name=name;
    balance=bal;
 }

 void displayDetails()
 {
    System.out.println("Name: "+ customer_name+ "\nCustomer ID: "+customer_id+"\nCurrent Balance: "+balance);
 }

 void deposit(int amount)
 {
    balance+= amount;
    System.out.println(amount+" deposited");
    checkBalance();
 }

 void withdraw(int amount)
 {
    balance-= amount;
    System.out.println(amount+" Withdrawed");
    checkBalance();

 }

 void checkBalance()
 {
    System.out.println("Available Balance is: "+balance);
 }
}

public class Bank {
    public static void main(String[] args) {
        Details cs1= new Details();
        cs1.enterDetails(101,"Dhananjay Pant",1235602 );
        cs1.deposit(1500);
        cs1.withdraw(1250);
        cs1.displayDetails();
    }
}
