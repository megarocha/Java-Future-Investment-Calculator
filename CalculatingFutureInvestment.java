import java.util.Scanner;
public class CalculatingFutureInvestment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Read the Investment amount and Annual Interest Rate
        double principle;
        double annualInterestRateInPercent;
        int numberofYears;
        double futureInvestmentValue;
        double numberofMonths;
        double monthlyInterestRate;

        Scanner input = new Scanner (System.in);
        System.out.println("Please input the investment amount and press enter: ");
        principle = input.nextDouble();
        System.out.println("Please input annual interest rate (in percentage points) and press enter: ");
        annualInterestRateInPercent = input.nextDouble();
        System.out.println("Please input the number of years and press enter: ");
        numberofYears = input.nextInt();

        //Step 2: The Calculations
        numberofMonths = numberofYears * 12;
        monthlyInterestRate = (annualInterestRateInPercent)/1200;
        futureInvestmentValue = principle * Math.pow(1 + monthlyInterestRate, numberofMonths);


        //Step 3: Display The Result
        System.out.println("The value of $" + principle + " after " + numberofYears + " years is " +  futureInvestmentValue );

        input.close();
	}

}
