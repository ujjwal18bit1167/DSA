import java.util.*;
import java.io.*;
public class SubsetSumToK
{
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
     	int a[] ={2,1,3,-4,-2};
        int k=6;
     	boolean found = false;
     	Set<Integer> set = new HashSet<>();
     	int sum=0;
     	for(int element: a)
     	{
     		if(set.contains(k-sum))
     		{
     			found = true;
     			break;
     		}
     		set.add(sum);
     		sum += element;
     	}
     	System.out.println("found "+found );





	}

}