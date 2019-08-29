import java.io.File;
import java.util.Scanner;

public class GettingWholeFile {
  public static void main ( String[] args ) throws Exception {
    int fourLetter = 0;
    int caps = 0;
    String fn1 = "some-words.txt";
    String fn2 = "GettingWholeFile.java";

    Scanner wordReadr = new Scanner(new File(fn1));

    while (wordReadr.hasNext())  {
      String w = wordReadr.next();
      if (w.length() == 4) {
        fourLetter++;
      }
    }
    wordReadr.close();

    Scanner selfInput = new Scanner(new File(fn2));
    while (selfInput.hasNext()) {
      String token = selfInput.next();
      if ( Character.isUpperCase(token.charAt(0)) ) {
        caps++;
      }
    }
    selfInput.close();

    System.out.println(fourLetter + " four-letter word in " + fn1);
    System.out.println(caps + " words start with captial in " + fn2);
  }
}

// Add Two upper case words using comments. comments are not ignored.
