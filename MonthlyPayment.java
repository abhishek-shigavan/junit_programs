/**
 * MonthlyPayment
 * 
 * Program to take values of loan amount,
 * interest rate and year & to computes monthly payment.
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class MonthlyPayment {
	
/**
 * 
 * This method takes principle amount, 
 * monthly interest rate & no of months 
 * as input & computes monthly payment.
 * 
 * @return returning monthly payment
 *         
 */	
	public static double getMonthlyPayment(int p,double r,double n) {
		
		double result = (p*r) / (1 - Math.pow((1+r), -n) ) ;
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Loan Amount : ");
		int principleAmount = sc.nextInt();
		System.out.println("Enter Interest Rate : ");
		double interestRate = sc.nextInt();
		System.out.println("Enter no of year : ");
		int yearValue = sc.nextInt();
		
	
		double n = 12 * yearValue; // total month
		double r = interestRate / (12 * 100); // monthly interest rate
		
		int monthlyPayment =(int) getMonthlyPayment(principleAmount,r,n);
		
		System.out.println("Monthly payment : Rs."+monthlyPayment);
	}

}
