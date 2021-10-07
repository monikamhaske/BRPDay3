package BRPDay3;

import java.util.Scanner;

public class CarLoan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, payment;
		a = scan.nextDouble();
		System.out.println("Enter Loan Amount : ");
		b = scan.nextDouble();
		System.out.println("Enter Year : ");
		c = scan.nextDouble();
		System.out.println("Enter Rate : ");
		System.out.println("Enter Rate : ");
		double div, n = 12 * b, r = c / (12 * 100);
		System.out.println("Loan Amount is : " + a);
		div = (1 - Math.pow((1 + r), (-n)));
		System.out.println("Interest Rate per Month (%) is: " + r);
		payment = (a * r) / div;
		System.out.println("Loan Period (Months) is : " + n);
		double interest = payment * n - a;

		System.out.println("Monthly Payments is : " + payment);
		System.out.println("Total interest is: " + interest);
	}
}
