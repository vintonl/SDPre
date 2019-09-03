public class ArrayIntro {
  public static void main(String[] args) {
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",  "Uranus",  "Neptune"};
    for (String p : planets) {
      System.out.println(p + "\t" + p.toUpperCase());
    }

   int[] numbers = {1, 2, 3};
   for (int n : numbers) {
     System.out.println(n);
   }

  }
}
