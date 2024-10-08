//Jeeban Bashyal

import java.util.Scanner;

public class Invest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double investmentValue = sc.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double annualInterestRate = sc.nextDouble();
		System.out.println("Enter the number of years: ");
		double numberOfYears = sc.nextDouble();
		
		// Annual interest rate to montly interest rate
		double monthlyInterestRate = annualInterestRate /100 / 12;
		
		double futureInvestmentValue = investmentValue * Math.pow(( 1 + monthlyInterestRate), numberOfYears * 12);
		// Result with two decimals.
		System.out.printf("Accumulated value is: %.2f ", futureInvestmentValue);	
		
	}

}