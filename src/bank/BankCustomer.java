package bank;
import java.math.*;
import java.util.Random;
import java.util.Scanner;

class customer {
	private String name ="Prabhat";
	private String accountId;
	private float balance =500;
	private String address = "Addr";
	
	public void setname (String name)
	{
		this.name=name;
	}
	void getname()
	{
	  System.out.println(" Name of the Custome is: "+name);	
	}
	
	void getaccountID()
	{
		String accountnum = new String();
		Random randomnum = new Random();
		accountnum= this.name.substring(0, 3)+ randomnum.nextInt(9999);
		System.out.println("Account Number is: "+accountnum);
	}
	
	void deposit (double amount)
	{
		this.balance=(float) (this.balance+amount);
		System.out.println("Amount "+amount+ " is successfully deposited, your new balance is: "+balance);
	}
	
	void withdraw (double amount)
	{
		if(balance > amount)
		{
		this.balance=(float) (this.balance-amount);
		System.out.println("Amount "+amount+ " is successfully withdrawl, your new balance is: "+balance);
		}
		else 
		{
			System.out.println("Not enough balance!!!");
		}
	}
	
	void setAddress(String addr)
	{
		this.address=addr;
	}
	
	void getAddress()
	{
		System.out.println("Address of the Client is: "+ this.address);
	}
	
	void getbalance()
	{
		System.out.println("Your balance is: "+ balance);
	}
}

public class BankCustomer {
	
	public static void main(String [] args)
	{
		System.out.println("Please enter the choice: \n 1 for Name of the Client \n 2 for Address \n 3 for the Check balance"
				+ " \n 4 for the deposit \n 5 for the Withdraw \n 6 for accountID ");
		Scanner input = new Scanner(System.in);
		int choice =input.nextInt();
		
		customer cu = new customer();
		switch (choice){
		
		case 1: 
			System.out.println("Please enter the Name: ");
			Scanner inputname = new Scanner(System.in);
			String Name =inputname.nextLine();
			inputname.close();
			
			
			cu.setname(Name);
			cu.getname();
			break;
			
		case 2:
			System.out.println("Please enter the Address: ");
			Scanner inputaddress = new Scanner(System.in);
			String address =inputaddress.nextLine();
			inputaddress.close();
			
			
			cu.setAddress(address);
			cu.getAddress();
			break;
			
		case 3:
			cu.getbalance();
			break;
			
		case 4:
			System.out.println("Please enter the Amount: ");
			Scanner inputamount = new Scanner(System.in);
			double depositAmount =inputamount.nextDouble();
			inputamount.close();
			
			
			cu.deposit(depositAmount);
			break;
			
		case 5:
			System.out.println("Please enter the Amount: ");
			Scanner inputWithDrawAmount = new Scanner(System.in);
			
			double withdrawAmount =inputWithDrawAmount.nextDouble();
			inputWithDrawAmount.close();
			
			
			cu.withdraw(withdrawAmount);
			break;
			
		case 6:
			cu.getaccountID();
			break;			
		}
		input.close();
		 
		
		
	}


}
