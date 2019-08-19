// Lab 1 - Using Scanner
// Overview
// Create a file called Objective3Lab1.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented area that would:
// Take in a string from the user and store it in the userInput variable.
// Print out what the user typed in.

// input: string from user
// output: print out user input on new line

import java.util.Scanner;

public class Objective3Lab1 {
  public static void main (String[] args) {
    String userInput = "";
    Scanner input = new Scanner(System.in);

    System.out.println("Please Type a word: ");
    userInput = input.next();

    System.out.println(userInput);

    input.close();
  }
}
