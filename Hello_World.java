
public class Hello_World
{
  public static void main(String[] args)
  {
    Purposeless_Class ricky = new Purposeless_Class("Ricky", 0);

    System.out.println("\nHello World!");
    System.out.print(ricky.getName() + ": " + ricky.getNumBurritos() + " Burritos ");
    if(ricky.happy())
    	System.out.println(":D");
    else
    	System.out.println(":(");

    System.out.println("\nRestocking...");
    ricky.setNumBurritos(5);

    System.out.print(ricky.getName() + ": " + ricky.getNumBurritos() + " Burritos ");
    if(ricky.happy())
    	System.out.println(":D");
    else
    	System.out.println(":(");
  }
}
