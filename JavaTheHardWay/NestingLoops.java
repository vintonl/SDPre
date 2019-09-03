// public class NestingLoops {
//   public static void main(String[] args) {
//     // This is #1, I'll call it "CN"
//     for (char c='A'; c <='E'; c++) {
//       for (int n=1; n <=3; n++) {
//         System.out.println(c + " " + n);
//       }
//     }
//
//     System.out.println("\n");
//
//     // this is #2, I'll call it "AB"
//     for (int a=1; a <= 3; a++) {
//       for (int b=1; b <= 3; b++) {
//         System.out.print("(" + a + "," + b + ") ");
//       }
//       // You will add a line of code here.
//     }
//
//     System.out.println("\n");
//   }
// }
// Study Drill:

public class NestingLoops {
  public static void main(String[] args) {
    // This is #1, I'll call it "CN"
    for (int n=1; n <=3; n++) {
      for (char c='A'; c <='E'; c++) { // changed output
        System.out.println(c + " " + n);
      }
    }

    System.out.println("\n");

    // this is #2, I'll call it "AB"
    for (int a=1; a <= 3; a++) {
      for (int b=1; b <= 3; b++) {
        System.out.println("(" + a + "," + b + ") "); // ln makes it on new lines
      }
      // You will add a line of code here.
      System.out.println(); // adds a break between each loop
    }

    System.out.println("\n");
  }
}
