
public class Buffet_Driver
{
  public static void main(String[] args)
  {
    Customer cust1 = new Customer("Ricky", 0);

    System.out.println("\nWelcome to Burrito Buffet!");
    cust1.printStatus();

    System.out.println("\nServing" + cust1.getName());
    cust1.serve();
    
    cust1.printStatus();
  }
}
