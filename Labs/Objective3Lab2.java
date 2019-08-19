// Lab 2 - Storing User Input
// Overview
// Create a file called Objective3Lab2.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented area that would:
// Take in the user's name and store it in the name variable.
// Print out "Hello ***" where *** is the value the user entered

// input: string - user input at name
// output: Print out "Hello " + name

import java.util.Scanner;

public class Objective3Lab2 {
  public static void main (String[] args) {
    String name = "";
    Scanner input = new Scanner(System.in);

    System.out.println("What is your name?");
    name = input.next();

    System.out.println("Hello " + name);

    input.close();
  }
}
