// Lab 1 - Month Names
// Overview
// Create a file called Objective5Lab1.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented areas that would:
// Given the month variable provided, write a switch statement that would print the appropriate String value representation of the month.
// e.g. 6 -> June

// input: no inputs
// output: print the appropriate String value representation of the month
// notes: use a switch statement

public class Objective5Lab1 {
  public static void main (String[] args) {
    int month = 6;

    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("Febuary");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      default:
        System.out.println("That is not a valid month");
        break;
    }
  }
}
