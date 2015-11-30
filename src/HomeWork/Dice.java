package HomeWork;
import java.util.Random;

class PairOfDice {
	public int die1; // Number showing on the first die.
	public int die2; // Number showing on the second die.

	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values. Call the roll() method to roll the dice.
		roll();
	}

	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that
		// are initially showing the values val1 and val2.
		this.die1=val1;
		this.die2=val2;
	}

	public void roll() {
		// Roll the dice by setting each of the dice (die1, die2) to be
		// a random number between 1 and 6.
        Random 	r1= new Random();
        int die1val =0;
        int die2val =0;
       
        do{
        	die1val=r1.nextInt(7);
        	die2val=r1.nextInt(7);
        }while(die1val==0 || die2val==0 );
        
//        PairOfDice(die1,die2);
        die1=die1val;
        die2=die2val;
	}


}

public class Dice {

	public static void main(String[] args) {
		// Create two object for the PairOfDice
		PairOfDice pair1 = new PairOfDice();
		PairOfDice pair2 = new PairOfDice(2,1);
		
		int sumOfP1 =0;
		int sumOfP2=0;
		int counter =0;
		 
                       // Roll the two pairs of dice for both objects until the totals are same.
		do{
			pair1.roll();
			sumOfP1=pair1.die1+pair1.die2;
			
			pair2.roll();
			sumOfP2=pair2.die1+pair2.die2;
			counter++;
			System.out.println("****************");
			System.out.println("Roll "+counter);
			System.out.println("The value of die1 is " +pair1.die1+" and die2 is" +pair1.die2+" the total sum is: "+sumOfP1);
			System.out.println("The value of die1 is " +pair2.die1+" and die2 is" +pair2.die2+" the total sum is: "+sumOfP2);
		}while(sumOfP1!=sumOfP2);
System.out.println("***********************************************");	 
 System.out.println("*******Executed "+counter+" to get the sum total of "+sumOfP1+" ********");
                      // Display how many times needed to get the same total
	}
}
