import java.io.*;
import java.util.Scanner;
class Customer
{
 String add;
 String name;
 float bal;
 float roi;
 float wdrw;
 float d;
 void createAccount()
  {
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter Customer name :");
  	name=sc.nextLine();
  	System.out.println("Enter Customer address");
  	add=sc.nextLine();
  	System.out.println("Enter Customer balance");
  	bal=sc.nextFloat();
  }
  
  float displayBalance()
  {
  	return bal;
  }
  void deposit(float d)
  {
  	bal=bal+d;
  	System.out.println("Your balance is:" +bal);
  }
  void withdraw(float wdrw)
  {
  	if(bal>wdrw)
   	{
    		bal=bal-wdrw;
    		System.out.println("Balance after withdrawing "+bal);
   	}
  	else
   	{
   		System.out.println("Balance is low");
   	}
  }  
  float computeInterest(float roi)
  {
 	 bal=bal+(bal*(roi/100));
  	return bal;
  }
 }
class BankingApplication
{
  	public static void main(String arg[])
  	{
  		Customer c=new Customer();
  		int ch;
  		float bal;
  		Scanner sc=new Scanner(System.in);
  		boolean quit=false;
  		do
  		{
  		System.out.println("Enter your choice");
		System.out.println("1.Create new account");
		System.out.println("2.Deposit");
		System.out.println("3.Interest");
		System.out.println("4.Withdraw");
		System.out.println("5.Display balance");
		System.out.println("6.Exit");
  		ch=sc.nextInt();
  		switch(ch)
   		{
  			 case 1:
   				System.out.println("Enter customer details");
   				c. createAccount() ;			
break;
   			case 2:
   				System.out.println("Enter amount to deposit");
   				float a=sc.nextFloat();
   				c.deposit(a);
   				break;
   			case 3:
   				System.out.println("Enter interest amount");
   				float r=sc.nextFloat();
   				c. computeInterest(r);
   				break;
   			case 4:
  				System.out.println("Enter amount to withdraw");
   				float w=sc.nextFloat();
   				c.withdraw(w);
   				break;
   				case 5:
  				bal=c.displayBalance();
   				System.out.println("The current balance is "+bal);
  				break;
   			case 6:
   				quit=true;
   				break;
  		 }
 	 }
  	while(ch!=6);
 }
}  
