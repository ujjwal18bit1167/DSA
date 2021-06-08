import java.util.*;
import java.io.*;
public interface Sum3 
{
    public int f2();
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