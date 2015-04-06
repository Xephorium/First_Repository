
public class Hello_World
{
  public static void main(String[] args)
  {
    Purposeless_Class ricky = new Purposeless_Class("Ricky", 0);

    System.out.println("\nHello World!");
    ricky.printReport();

    System.out.println("\nRestocking...");
    ricky.setNumBurritos(5);

    ricky.printReport();
  }
}
