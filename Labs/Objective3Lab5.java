// Overview
// Create a file called Objective3Lab5.java in the SDPre/Labs directory.
//
// Create a class structure with the name Objective3Lab5.
// Create a main method.
// Create a scanner.
// Take in two numbers and store them into variables.
// Hint Use input.nextDouble() to have decimal precision.
// Calculate and print the result of summing these two values.
// This time there is no Starter Code provided for you. You are going to create the entire file structure from scratch. DO NOT COPY AND PASTE. While the code is similar and it is enticing to use a solution you already have, the additional repetitions will aid in impressing this process in your mind.

import java.util.Scanner;

public class Objective3Lab5 {
  public static void main (String[] args) {
    Double num1, num2, sum;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number:");
    num1 = input.nextDouble();

    System.out.println("Please enter another number:");
    num2 = input.nextDouble();

    sum = num1 + num2;

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
  }
}
