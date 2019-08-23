public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println("Here.");
    erebor(); // must have parentheses to "call" the function
    System.out.println("Back first time.");
    // erebor(); // Study Drill: commenet this out
    System.out.println("Back second time.");
  } // ends here even with code below

  public static void erebor() {
    System.out.println("There.");
  }
}
