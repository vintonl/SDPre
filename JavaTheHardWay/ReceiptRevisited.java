  import java.io.PrintWriter;
  import java.util.Scanner;

  public class ReceiptRevisited {
    public static void main(String[] args) throws Exception {
      PrintWriter fileout = new PrintWriter("reciept.txt");
      Scanner keyboard = new Scanner(System.in);
      Double gallons, total, price = 3.456;

      System.out.println("Gas cost $" + price + " per gallon.");
      System.out.print("How many gallons of fuel do you want: ");
      gallons = keyboard.nextDouble();
      total = gallons * price;

      System.out.println("Total cost: $" + total);

      fileout.println("+------------------------+");
      fileout.println("|                        |");
      fileout.println("|      Corner Store      |");
      fileout.println("|                        |");
      fileout.println("|  2019-07-08  04:55PM   |");
      fileout.println("| Gallons:      " + gallons + "   |");
      fileout.println("| Price/Gallon:$ " + price +"   |");
      fileout.println("|                        |");
      fileout.println("|  Fuel Total: $ " + total + "   |");
      fileout.println("|                        |");
      fileout.println("+------------------------+");
      fileout.close();
    }
  }
