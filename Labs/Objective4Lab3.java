// input: Scanner - user  - number
// output: string - The number is positive, or The number is negative
// note: 0 is neither positive nor negative

import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if (userNum > 0) {
      System.out.println("The number is positive");
    }
    else if (userNum < 0){
      System.out.println("The number is negative");
    }
    else {
      System.out.println("The number is neither positive nor negative");
    }

    scanner.close();
  }
}
