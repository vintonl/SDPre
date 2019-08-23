// Lab 3 - Identify Odd and Even Numbers
// Overview
// Create a file called Objective6Lab3.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented areas that would:
// Print out the number 1 -> 20 stating while also stating if the number is odd or even.
// Write a while loop.
// Use the provided counter variable to have the loop execute 20 times.
// Write an if statement that determines if the number is even or odd, think (%) operator.
// Print out counter is even or is odd accordingly.
// Increment the value of counter with each iteration.
// e.g.
//   1 is odd
//   2 is even
//   3 is odd
//   4 is even
//   ...
//   20 is even

public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while(counter <= 20) {
      if (counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      else {
        System.out.println(counter + " is odd");
      }
      counter++;
    }
  }
}
