// Exercise 15: Making Decisions with If Statements

import java.util.Scanner;

public class AgeMessages {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.println( "You are: ");
		if (age < 13) {
			System.out.println("\tyoung enough to not do much of anything");
		}

		if (age >= 13) {
			System.out.println("\told enough to create a Facebook account");
		} else {
      System.out.println("\tto young to create a Facebook account");
    }

		if (age >= 16) {
			System.out.println("\told enough to get a driver's licensee");
		} else {
      System.out.println("\tto young to get a driver's licensee");
    }

		if (age >= 18) {
			System.out.println("\told enough to get a tattoo");
		} else {
      System.out.println("\tto young to get a tattoo");
    }

		if (age >= 21) {
			System.out.println("\told enough to drink alcohol");
		} else {
      System.out.println("\tto young to drink alcohol");
    }

		if (age >= 35) {
			System.out.println("\told enough to run for President of the U.S.");
			System.out.println("\t\t(How exciting!)");
		} else {
      System.out.println("\tto young to run for President of the U.S.");
    }

		if (age >= 35 && age < 65) {
			System.out.println("\tHope you are happy!");
		} else {
      System.out.println("\tHope you are learning new things!");
    }

		if (age >= 65) {
			System.out.println("\tYou are old enough to retire.");
		} else {
      System.out.println("\tto young to retire.");
    }
	}
}
