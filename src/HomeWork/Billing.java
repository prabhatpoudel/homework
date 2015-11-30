package HomeWork;

class calculateBill
{
	double totaldue=0.0;
	
	double computeBill(double price)
	{

		totaldue = price+price*8/100;
		
		return totaldue;
	}
	
	double computeBill(double price, int quantity)
	{
		price=price*quantity;
		totaldue = price+price*8/100;
		
		return totaldue;
	}
	
	double computeBill(double price, int quantity,float discount)
	{
		price=price*quantity;
		price=price-price*discount/100;
		totaldue = price+price*8/100;
		
		return totaldue;
	}
}

public class Billing {

	
	public static void main(String [] args)
	{
		calculateBill p1 = new calculateBill();
		System.out.println("Total Price of Book after adding tax is: "+p1.computeBill(11.25));
		System.out.println("Total Price of Book for the desired quantity and adding the tax is: "+p1.computeBill(11.25,2));
		System.out.println("Total Price of Book for the deisre quantity and applying the discount and adding tax is: "+p1.computeBill(11.25,2,8));
	}

}
