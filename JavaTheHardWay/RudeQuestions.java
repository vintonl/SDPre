import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, job, location;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();

		System.out.println( weight + "? Better keep that quite!!" );
		System.out.print("Next, what's your job, " + name + "? " );
		job = keyboard.next();

		System.out.println( job + "? Hope that does not suck!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
    System.out.println("What is the name of the town you live in?");
    location = keyboard.next();

		System.out.println( "Well, thanks for answering my rude questions, " );
		System.out.println( name + " from " + location + ".");



	}
}

// program works with integers or doubles because its still a number
// name and job can be a number, but it will consider it a string
// program crashes when a string is input into integers or doubles
