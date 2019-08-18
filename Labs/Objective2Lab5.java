// Lab 5 - Right Triangle
// Overview
// Create a file called Objective2Lab5.java in the SDPre/Labs directory. Write a program that calculates the length of the hypotenuse of a right triangle.
// Create a class structure with the name Objective2Lab5.
// Create a main method.
// Create 3 double variables side1, side2, and hypotenuse.
      // side1 will hold its respective side length.
      // side2 will hold its respective side length.
      // hypotenuse should be assigned the calculated hypotenuse length. Remember a2 + b2 = c2.
// Print out the hypotenuse.
//
// Hints:
// side1 * side1 is the equivalent of side12
// Math.sqrt() is a function available via the Java Math library.

import java.lang.Math;

public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;

    side1 = 10;
    side2 = 8;
    hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
