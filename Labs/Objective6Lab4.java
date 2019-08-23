// Lab 4 - Sum Numbers
// Overview
// Create a file called Objective6Lab4.java in the SDPre/Labs directory. Write a program that sums up the numbers 1 -> 20 1 + 2 + 3 ... + 20 using a while loop.
//
// Create a class structure with the name Objective6Lab4.
// Create a main method.
// Create two variables to store the current sum total and a counter.
// Write a while loop.
// Use the count variable to have the loop execute 20 times.
// Increment the value of count with each iteration.
// Update the current sum by adding count to sum with each iteration.
// This time there is no Starter Code provided for you. You are going to create the entire file structure from scratch. DO NOT COPY AND PASTE. While the code is similar and it is enticing to use a solution you already have, the additional repetitions will aid in impressing this process in your mind.`

public class Objective6Lab4 {
  public static void main(String[] args) {
    int sum, count;

    sum = 0;
    count = 1;

    while(count <= 20) {
      sum+= count;
      count++;
    }

    System.out.println(sum);
  }
}
