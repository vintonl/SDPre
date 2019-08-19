// Lab 3 - Calculate Birth Year
// Overview
// Create a file called Objective3Lab3.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented area that would:
// Take in the users age using input.nextInt() and store it in the age variable.
// Calculates what year the user was born in.
// Prints out the calculated birthYear.

// input: string - user input - age variable
// output: calculate and println birthYear

import java.util.Scanner;
import java.util.Calendar;

public class Objective3Lab3 {
  public static void main (String[] args) {
    int birthYear, age;

    Calendar cal = Calendar.getInstance();
    int currentYear = cal.get(Calendar.YEAR);

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear); // only works if user has already had their birthday in calendar year
    input.close();
    }
}
