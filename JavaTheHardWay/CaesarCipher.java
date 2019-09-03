// import java.util.Scanner;
//
// public class CaesarCipher {
//   public static char shiftLetter(char c, int n) {
//     int u = c;
//
//     if (! Character.isLetter(c))
//       return c;
//
//     u = u + n;
//     if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z') {
//       u -=26;
//     }
//     if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a') {
//       u += 26;
//     }
//
//     return (char)u;
//   }
//
//
//   public static void main(String[] args) {
//     Scanner keyboard = new Scanner(System.in);
//
//     String plaintext, cipher = "";
//     int shift;
//
//     System.out.print("Message: ");
//     plaintext = keyboard.nextLine();
//     System.out.print("Shift (0-25):");
//     shift = keyboard.nextInt();
//
//     for (int i = 0; i < plaintext.length(); i++) {
//       cipher +=shiftLetter(plaintext.charAt(i), shift);
//     }
//     System.out.println(cipher);
//   }
// }

// Study Drill:
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {
  public static char shiftLetter(char c, int n) {
    int u = c;

    if (! Character.isLetter(c))
      return c;

    u = u + n;
    if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z') {
      u -=26;
    }
    if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a') {
      u += 26;
    }

    return (char)u;
  }


  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    String readFileName = "cipher-message.txt", saveFileName = "cipher-code.txt";

    String plaintext, cipher = "";
    int shift;

    File f = new File(readFileName);

    if (f.exists() && f.length() > 0) {
      Scanner input = new Scanner(f);
      plaintext = input.nextLine();
      shift = input.nextInt();
    }
    else {
      System.out.print("Message: ");
      plaintext = keyboard.nextLine();
      System.out.print("Shift (0-25):");
      shift = keyboard.nextInt();
    }

    for (int i = 0; i < plaintext.length(); i++) {
      cipher +=shiftLetter(plaintext.charAt(i), shift);
    }

    PrintWriter out = new PrintWriter(saveFileName);
    out.println(cipher);
    out.close();
  }
}
