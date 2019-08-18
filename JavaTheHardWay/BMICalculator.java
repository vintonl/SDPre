import java.util.Scanner;

public class BMICalculator {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, feet, inches, pounds;

    System.out.print( "Your height in feet (enter feet only): ");
		feet = keyboard.nextDouble();

		System.out.print( "Your height in inches (enter inches only): ");
		inches = keyboard.nextDouble();

    m = ((feet * 12) + inches)/39.37;

		System.out.print( "Your weight in pounds: ");
		pounds = keyboard.nextDouble();

    kg = pounds/2.205;
		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}
