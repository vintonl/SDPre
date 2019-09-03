import java.util.Scanner;

public class ItemNotFound {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String[] heros = {
     "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
     "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
     "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
     "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
    };
    String guess;
    boolean found; //found is the "flag"

    System.out.println("Pop Quiz!");
    System.out.print("Name any *mortal* hero from Greek mythology: ");
    guess = keyboard.next();
    found = false;
    for (String hero : heros) {
      if (guess.equals(hero)) {
        System.out.println("That's one of them!");
        found = true;
      }
    }

    if (found == false) {
      System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
    }
  }
}

// Study Drill: using a count
// import java.util.Scanner;
//
// public class ItemNotFound {
//   public static void main(String[] args) {
//     Scanner keyboard = new Scanner(System.in);
//
//     String[] heros = {
//      "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
//      "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
//      "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason", "Jason",
//      "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
//     };
//     String guess;
    // int count = 0;
//
//     System.out.println("Pop Quiz!");
//     System.out.print("Name any *mortal* hero from Greek mythology: ");
//     guess = keyboard.next();
//
//     for (String hero : heros) {
//       if (guess.equals(hero)) {
//         count++; // count increases from 0 if found 
//       }
//     }
//     if (count > 0) {
//       System.out.println("That's one of them!");
//     }
//     else {
//       System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
//     }
//   }
// }
