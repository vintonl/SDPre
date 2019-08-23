// Overview
// Create a file called Objective6Lab1.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented areas that would:
// Print the values 10 -> 1.
// Print the value of counter with each iteration.

// input:
// output: print 10 - 1 on a new line for each using a loop

public class Objective6Lab1 {
  public static void main(String[] args) {
    int counter = 10;

    while (counter > 0) {
      System.out.println(counter);
      // counter = counter - 1;
      counter--; // same as line 16
    }
  }
}
