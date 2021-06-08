import java.util.*;
import java.io.*;
    class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 

public class UniqueColors
{
	public static void main(String[] args) throws IOException
	{
	    //Scanner s = new Scanner(System.in);
	    //Reader s = new Reader();
	 	try
     	{
      		System.setIn(new FileInputStream("input.txt"));
      		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
     	} catch (Exception e)
     	{
      		System.err.println("Error");
     	}

     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        


        
           String line[] = br.readLine().trim().split(" ");
           int n = Integer.parseInt(line[0]);
           int s = Integer.parseInt(line[1]);


        	String str[] = br.readLine().trim().split("\s");
            int arr[] = new int[str.length];
            for(int i=0; i < arr.length; i++)
            {
            	arr[i] = Integer.parseInt(str[i]);
            	
            }

            int minimum = arr[0];
            int maximum = arr[0];
            int count = 0;
            for(int i = 0 ; i < arr.length ; i++ )
            {
            	if(minimum > arr[i])
            		minimum = arr[i];
            	if(maximum < arr[i])
            		maximum = arr[i];
            	if(Math.abs(minimum-maximum) > s )
            	{

            		count++;
            		minimum = arr[i];
            		maximum = arr[i];

            	}


            }
			
        	
       System.out.println(count+1);



     	
	}

}

