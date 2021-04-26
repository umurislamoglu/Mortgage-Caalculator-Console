import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// INPUTS
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal:");
		int principal = scanner.nextInt();
		
		System.out.print("Annual Interest Rate:");
		double interestRate = scanner.nextDouble();
		interestRate = interestRate/100/12;
		
		System.out.print("Period (Years):");
		int period = scanner.nextInt();
		
		
		// OUTPUT
		
		double mortgage = principal * (interestRate * Math.pow((1 + interestRate),(12*period))) / (Math.pow((1 + interestRate),(12*period)) -1);
		
		
		
		Locale usa = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
		String result = dollarFormat.format(mortgage);
		
		
		System.out.println("Mortgage :" + result);
		
		
		
		
	}

}
