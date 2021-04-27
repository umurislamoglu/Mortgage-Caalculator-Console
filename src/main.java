import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// INPUTS
		final byte PERCENT = 100;
		final byte MONTH = 12;
		int principal;
		double interestRate;
		int period;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.print("Principal ($1K-$1M):");
		principal = scanner.nextInt();
		if (principal >=1000 && principal <=1_000_000)
			break;
		System.out.println("Enter a value between $1.000 and $1.000.000");
		}
		
		while(true) {
			
		System.out.print("Annual Interest Rate:");
		interestRate = scanner.nextDouble();
		
		if (interestRate >= 1 && interestRate <= 30) {
			interestRate =  interestRate/PERCENT/MONTH;
			break;
		}
		System.out.println("Interest rate must below 30%");
		}
		
		
		
		
		while(true) {
		System.out.print("Period (Years):");
		period = scanner.nextInt();
		if (period <30) 
			break;
		System.out.println("Period must below 30 years");
		
		}
		
		// OUTPUT
		
		double mortgage = principal * (interestRate * Math.pow((1 + interestRate),(12*period))) / (Math.pow((1 + interestRate),(12*period)) -1);
		
		
		
		Locale usa = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
		String result = dollarFormat.format(mortgage);
		
		
		System.out.println("Mortgage :" + result);
		
		
		
		
	}

}
