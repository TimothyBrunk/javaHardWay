import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double in, lbs, bmi, kg, m;
		
		System.out.print( "Your height in in: " );
		in = keyboard.nextDouble();
		
		System.out.print( "Your weight it lbs: " );
		lbs = keyboard.nextDouble();
		
		kg = 
		
		bmi = lbs / (in*in);
		
		System.out.println( "Your BMI is " + bmi );
	}
}