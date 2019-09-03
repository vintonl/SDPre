public class FarmerBrown {
  public static void main(String[] args) {
    int s, g, c;

    for (s = 1; s <= 10; s++) {
      for (g = 1; g <= 29; g++) {
        for (c = 1; c <= 98; c++){
          if (s+g+c == 100 && 10.0 * s + 3.50 * g + 0.5 * c == 100.00) {
            System.out.println(s + " sheep, " + g + " goats, and " + c + " chickens.");
          }
        }
      }
    }
  }
}
