import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, typedPassword;

    password = "hunter2";

    System.out.println("Welcome to the Bank of Java");
    System.out.print("Please enter your password: ");
    typedPassword = keyboard.next();

    while (!typedPassword.equals(password)) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("Please enter your password: ");
      typedPassword = keyboard.next();
    }

    pin = 12345;

    System.out.println("Password accepted.");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR BALANCE IS $425.17");
  }
}
