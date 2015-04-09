/*
  Christopher Cruzen                                     GitHub Basics
  "Customer.java"                                           04.06.2015

  Burrito Buffet Customer Class

    Each customer should have a name, number of burritos, and state
  (happy  or sad). State is determined by number of burritos.

*/

public class Customer
{

  /*--- Fields ---*/

  private String  name;
  private int     numBurritos;
  private boolean happy;


  /*--- Constructors ---*/

  public Customer()
  {
    name = "Chris";
    numBurritos = 0;
    happy = false;
  }

  public Customer(String n)
  {
    name = n;
    numBurritos = 0;
    happy = false;
  }

  public Customer(String n, int b)
  {
    name = n;
    numBurritos = b;

    if(b > 0)
      happy = true;
    else
      happy = false;
  }


  /*--- Methods ---*/

  public String getName()
  {
    return name;
  }

  public void setName(String n)
  {
    name = n;
  }

  public int plate()
  {
    return numBurritos;
  }
  
  public void serve()
  {
    numBurritos++;

    if(numBurritos > 0)
      happy = true;
    else
      happy = false;
  }

  public void serve(int b)
  {
    numBurritos = numBurritos + b;

    if(b > 0)
      happy = true;
    else
      happy = false;
  }

  public boolean happy()
  {
    return happy;
  }

  public void printStatus()
  {
    System.out.print(" Customer: " + name + ", " + numBurritos + " Burritos ");
    if(happy)
      System.out.println(":D");
    else
      System.out.println(":(");
  }
}

// Fix For Issue #3