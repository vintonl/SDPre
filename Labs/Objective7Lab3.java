// Lab 3 - Menu Method
// Overview
// Create a file called Objective7Lab3.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented areas that would:
// Write code in the while loop that would print out the menu with the provided printMenu() method.
// Take a users input
// Depending on the users choice, print out the correct message
// Look back at your logic from Objective6Lab5

import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true) {
      printMenu();
      selection = scanner.nextInt();

      if (selection == 1) {
        System.out.println("Hello Human");
      }
      else if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      }
      else if (selection == 3) {
        System.out.println("Goodbye");
        break;
      }
    }

    scanner.close();
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
