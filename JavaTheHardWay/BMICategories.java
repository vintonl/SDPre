import java.util.Scanner;

public class BMICategories {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int feet;
    double inches, pounds, bmi;

    System.out.print("Enter your height, feet first: ");
    feet = keyboard.nextInt();

    System.out.print("Now enter the inches: ");
    inches = keyboard.nextDouble();

    System.out.print("How much do you weigh in pounds: ");
    pounds = keyboard.nextDouble();

    inches = feet * 12 + inches;
    bmi = (pounds / inches / inches) * 703;

    System.out.print("BMI Category is: ");
    if (bmi < 15.0) {
      System.out.println("very severly underweight");
    }
    else if (bmi <= 16.0) {
      System.out.println("severly underweight");
    }
    else if (bmi < 18.5) {
      System.out.println("underweight");
    }
    else if (bmi < 25.0) {
      System.out.println("normal weight");
    }
    else if (bmi < 30.0) {
      System.out.println("overweight");
    }
    else if (bmi < 35.0) {
      System.out.println("moderatley obese");
    }
    else if (bmi < 40.0) {
      System.out.println("severly obese");
    }
    else {
      System.out.println("very severly/\"morbidly\" obese");
    }
  }
}
