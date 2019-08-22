// input: userNum
// output: string - "The number is odd" or "The number is even"

import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    int userNum;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter a number (no decimal): "); //decimal1 will chrash program
    userNum = keyboard.nextInt();

    if (userNum % 2 == 0) {
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }

    keyboard.close();
  }
}
