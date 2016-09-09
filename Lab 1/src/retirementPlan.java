import java.util.*;

public class retirementPlan {

	public static void main(String[] args) {
		// Prompt the user for variables to be used in an equation 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a percentage for expected average return on investment: ");
		double averageReturn = input.nextDouble();//b
		System.out.println("Enter a number for how long you would like to draw money: ");
		double drawMoney = input.nextDouble();//c
		System.out.println("Enter your required income: ");
		double reqIncome = input.nextDouble();//d
		System.out.println("Enter your expected SSI income: ");
		double expectedIncome = input.nextDouble();
	    double overallSavings = (reqIncome-expectedIncome)*((1-(1/(Math.pow(1+(averageReturn/100)/12, drawMoney*12)))))/((averageReturn/100)/12);
		System.out.printf("You need to save: $%.2f%n", overallSavings);
		//Use formula to find out how much you need saved each month
		//(reqIncome-SSI)*((1-(1/Math.pow(1+(annualReturn/100)/12,yearsRetired*12)))))//((annualReturn/100)/12)
		//moneyNeeded*(((returnOnInvestment/100)/12)/((Math.pow(1+(returnOnInvestment/100)/12,yearsToWork*12))-1))
		System.out.println("Enter how many years to work: ");
		double yearsToWork = input.nextDouble();
		System.out.println("Enter your overall savings: ");
		double moneyNeeded = input.nextDouble();
		System.out.println("Enter your percentage return on investment: ");
		double returnInvestment = input.nextDouble();
		double monthlySavings = overallSavings*(((returnInvestment/100)/12)/((Math.pow(1+(returnInvestment/100)/12,yearsToWork*12))-1));
		System.out.printf("You need to save this much monthly: $%.2f%n", monthlySavings);
		}

}
