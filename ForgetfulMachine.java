import java.util.Scanner;

public class ForgetfulMachine {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println( "What city is the capital of France?" );
		keyboard.next();
		
		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		// This question blows up if a whole number is not entered. 
		
		System.out.println( "Enter a number between 0.0 and 1.0");
		keyboard.nextDouble();
		// A number beyond this parameter doesnot blow the program up but entering a string does.
		System.out.println( "Is there anything else you would like to say?");
		keyboard.next();
	}
}
		