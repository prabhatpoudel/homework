package HomeWork;
import java.util.Scanner;

public class Question6 {

	public static void main (String [] args){
		System.out.println("Enter the Number: ");
		Scanner input = new Scanner(System.in);
		int number =input.nextInt();
		input.close();
		String display = new String();
		
		
		for (int i =1; i<=number; i++) {
			for (int j =1; j<=number; j++) 
			{	
				if(i%2!=0)
				{
					display=display+"* ";
//				System.out.println("* ");	
				}	
				else 
				{
					display=display+" *";
//					System.out.println("* ");	
				}
		    }
			 display=display+"\n";
		}
		System.out.println(display);
	}
}
