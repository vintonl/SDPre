// Lab 2 - Print 1 to 20
// Overview
// Create a file called Objective6Lab2.java in the SDPre/Labs directory.
// Using the Starter Code below add code to the commented areas that would:
// Print the values 0 -> 20.
// Print the value of counter with each iteration.
// Add 1 to counter each iteration so your loop doesn't run forever. Hint If you get stuck in an infinite loop press CTRL + C

public class Objective6Lab2 {
  public static void main(String[] args){
    int counter = 0;

    while(counter <= 20) {
      System.out.println(counter);
      counter++;
    }
  }
}
