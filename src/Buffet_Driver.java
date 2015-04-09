/*
  Christopher Cruzen                                     GitHub Basics
  "Buffet_Driver.java"                                      04.06.2015

  Burrito Buffet Driver File

    Input data about a user specified number of customers into an
  array of Customer objects. Then, print the data.

*/

import java.util.Scanner;

public class Buffet_Driver
{
  public static void main(String[] args)
  {
    // Variable Declarations
    int numCustomers;
    Scanner reader = new Scanner(System.in);

    // Prompt User for Number Customers
    System.out.println("\nWelcome to Burrito Buffet!");
    System.out.print("> Enter Number of Customers: ");
    numCustomers = reader.nextInt();

    // Create Array of Customers
    Customer[] house = new Customer[numCustomers];

    // Input Customer Data
    for(int x = 0; x < numCustomers; x++)
    {
      String name;
      int burritos;

      System.out.print("> Enter Customer " + (x+1) + " Name: ");
      name = reader.next();
      System.out.print("> Enter Customer " + (x+1) + " Burritos: ");
      burritos = reader.nextInt();

      house[x] = new Customer(name, burritos);
    }

    // Print Customer Data
    System.out.println("");
    for(int x = 0; x < numCustomers; x++)
      house[x].printStatus();

  }
}
