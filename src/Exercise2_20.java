	import java.util.Scanner;
	public class Exercise2_20 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
	double currentBalance = input.nextDouble();
	double interestRate = input.nextDouble();
	double Interest = currentBalance * (interestRate/1200);
	
	System.out.println("The interest is "+ Interest);
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
