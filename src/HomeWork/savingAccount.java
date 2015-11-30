package HomeWork;

class savingsAccount {
	static float annualInterestRate;
	private double savingsBalance;

	double calculateMonthlyInterest(double balance) {
		this.savingsBalance = balance + (balance * annualInterestRate / 1200);
		// System.out.println("Balance is: "+this.savingsBalance);
		// System.out.println(balance+" "+(balance*annualInterestRate/1200));
		return this.savingsBalance;
	}

	 void modifyInterestRate(float interestrate) {
		annualInterestRate = interestrate;
	}

	double calculate(double currentbalance, int month) {
		for (int i = 1; i <= month; i++) {
			currentbalance = calculateMonthlyInterest(currentbalance);
			System.out.println("Balance for Month " + i + " is: "
					+ currentbalance);
		}
		System.out.println("*********************");
		return currentbalance;
	}

	double calculate(double currentbalance) {
		for (int i = 1; i <= 12; i++) {
			currentbalance = calculateMonthlyInterest(currentbalance);
			System.out.println("Balance for Month " + i + " is: "
					+ currentbalance);
		}
		System.out.println("*********************");
		return currentbalance;
	}

}

public class savingAccount {
	public static void main(String[] args) {
		double currentbalance1 = 2000;
		double currentbalance2 = 3000;

		savingsAccount sa1 = new savingsAccount();
		savingsAccount sa2 = new savingsAccount();
		sa1.modifyInterestRate(4);

		currentbalance1 = sa1.calculate(currentbalance1);
		// System.out.println("*********************");
		currentbalance2 = sa2.calculate(currentbalance2);

		sa1.modifyInterestRate(5);
		// System.out.println("*********************"+currentbalance1);
		sa1.calculate(currentbalance1, 1);

		sa2.calculate(currentbalance2, 1);

	}

}
