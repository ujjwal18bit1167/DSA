import java.util.*;
import java.io.*;
public interface interface2 extends Sum3
{

      
    public  int f1();
    public int f2()
    {
    	System.out.println("hello");
    }

	public static void main(String[] args)
	{
	    Scanner s = new Scanner(System.in);
	 	try
     	{
      		System.setIn(new FileInputStream("input.txt"));
      		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
     	} catch (Exception e)
     	{
      		System.err.println("Error");
     	}
	}

}