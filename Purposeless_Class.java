
public class Purposeless_Class
{

  /*--- Fields ---*/

	private String  name;
	private int     numBurritos;
	private boolean happy;


  /*--- Constructors ---*/

  public Purposeless_Class()
  {
  	name = "Chris";
  	numBurritos = 0;
  	happy = false;
  }

  public Purposeless_Class(String n)
  {
  	name = n;
  	numBurritos = 0;
  	happy = false;
  }

  public Purposeless_Class(String n, int b)
  {
  	name = n;
  	numBurritos = b;

  	if(b > 0)
  	  happy = true;
  	else
      happy = false;
  }


  /*--- Methods ---*/

  public int getNumBurritos()
  {
  	return numBurritos;
  }

  public void setNumBurritos(int b)
  {
  	numBurritos = b;

  	if(b > 0)
  	  happy = true;
  	else
      happy = false;
  }

  public String getName()
  {
  	return name;
  }

  public void setName(String n)
  {
  	name = n;
  }

  public boolean happy()
  {
  	return happy;
  }
}