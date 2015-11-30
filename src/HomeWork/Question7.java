package HomeWork;
import java.util.Scanner;

class Question7 {
	public static void main(String [] args)
	{
		System.out.println("Enter the Weight: ");
		Scanner input= new Scanner(System.in);
		int weight = input.nextInt();
		
		System.out.println("Enter the choice: ");
//		Scanner inputchoice = new Scanner(System.in);
		int choice = input.nextInt();	
		input.close();
		
		double planetweight=0;
		switch(choice){
		case 1: 
			 planetweight=weight*0.78;
			 System.out.printf("The Weight in Venus is: %f",planetweight);
			 break;
		case 2: 
			 planetweight=weight*0.39;
			 System.out.printf("The Weight in Mars is: %f",planetweight);
			 break;
		case 3: 
			 planetweight=weight*2.65;
			 System.out.printf("The Weight in Jupiter is: %f",planetweight);
			 break;
		case 4: 
			 planetweight=weight*1.17;
			 System.out.printf("The Weight in Saturn is: %f",planetweight);
			 break;
		case 5: 
			 planetweight=weight*1.05;
			 System.out.printf("The Weight in Uranus is: %f",planetweight);
			 break;
		case 6: 
			 planetweight=weight*1.23;
			 System.out.printf("The Weight in Neptune is: %f",planetweight);
			 break;
		
	    default: 
	    	System.out.println("Invalid choice");
	        break;
		}
	}

}
