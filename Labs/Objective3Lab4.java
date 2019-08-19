// Lab 4 - Storing Multiple Values
// Overview
// Create a file called Objective3Lab4.java in the SDPre/Labs directory.
//
// Using the Starter Code below add code to the commented area that would:
//
// Take in the users first name and stores it in the firstName variable.
// Take in the users first name and stores it in the lastName variable.
// Take in the users age name and stores it in the age variable.
// Prints out all the received information in the following format: First Name: John, Last Name: Smith, Age: 23.
// Hint firstName and lastName are Strings, age is an integer. You cannot use input.next() to capture an int.
//
// Hint get the int last.

import java.util.Scanner;

public class Objective3Lab4 {
  public static void main (String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your first name?");
    firstName = input.next();

    System.out.println("What is your last name?");
    lastName = input.next();

    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);

    input.close();
  }
}
