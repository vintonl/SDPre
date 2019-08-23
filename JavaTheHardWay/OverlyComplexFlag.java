import static java.lang.System.*;

public class OverlyComplexFlag {
  public static void main(String[] args) {
    printTopHalf();

    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();

    printPledge(); // Study Drill
  }

  public static void print48Colons() {
    out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
  }

  public static void print48Ohs() {
    out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print29Colons() {
    out.println("|:::::::::::::::::::::::::::::::::|");
  }

  public static void printPledge() {
    out.println("I pledge allegiance to the flag.");
  }

  public static void print29Ohs() {
    out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print6Stars() {
    out.print("| * * * * * * |");
  }

  public static void print5Stars() {
    out.print("|  * * * * *  |");
  }

  public static void printSixStarLines() {
    print6Stars();
    print29Ohs();
  }

  public static void printFiveStarLines() {
    print5Stars();
    print29Colons();
  }

  public static void printTopHalf() {
    out.println(" ________________________________________________");

    printSixStarLines();
    printFiveStarLines();
    printSixStarLines();
    printFiveStarLines();
    printSixStarLines();
    printFiveStarLines();
    printSixStarLines();
  }
}
