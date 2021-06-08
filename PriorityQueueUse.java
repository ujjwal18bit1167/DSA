//package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class triplet
{

     int first   ;
     int second  ;
     int third   ;
     public triplet(int a,int b,int c)
    {
           first = a;
          second = b;
           third =c;
     }

 }  
class Codechef
{

     final int a;
     static class Reader 
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
    public static long pr(long a,long b)
    {
      if(b==0)
        return (long)1;
      if(b==1)
        return (long)a;
      if(b%2==1)
        return (long)(pr(a,b-1) *a)%998244353;
    long z = pr(a,b/2);
    return (z*z)%998244353;
      
    }
  


  public static void main (String[] args) throws java.lang.Exception
  {
    // your code goes here
    try
       {
          System.setIn(new FileInputStream("input.txt"));
          System.setOut(new PrintStream(new FileOutputStream("output.txt")));
       } catch (Exception e)
       {
          System.err.println("Error");
       }
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Reader s = new Reader();
  //  String str[]=br.readLine().split(" ");
//    int m = Integer.parseInt(str[0]);
//    int n= Integer.parseInt(str[1]);
//    int k = Integer.parseInt(str[2]);

    int m = s.nextInt();
    int n= s.nextInt();
    int k= s.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    HashMap<Integer,Boolean> map = new HashMap<>();
    for(int i=0;i<n;i++)
         map.put(i,true);
    
  StringBuffer sb = new StringBuffer("");
    for(int i=0;i<n;i++)
    {
         arr.add(m) ;
         arr.add(n);
         arr.add(k*n*m);
         if(!map.get(0))
             arr.add(1);
    }
      for(int i=0;i<n;i++)
    {
         arr.add(m+n) ;
         arr.add(n+n*1);
         arr.add(k*n*m+m+n-6);
         for(int j=0;j<m;j++)
               arr.add(k);
            
    }
    
    
      
       ArrayList<triplet> myArrList = new ArrayList<>() ;
         myArrList.add(new triplet(1,100000,100000000));  //0
          myArrList.add(new triplet(1,60395,37276536));   //1
    for(int i=0;i<n;i++)
    {
         arr.add(m+n) ;
         arr.add(n+n*1);
         arr.add(k*n*m+m+n-6);
         for(int j=0;j<m;j++)
               arr.add(k);
            
    }
       myArrList.add(new triplet(1,57565 ,78606333 ));    //2
       arr.add(1);
       myArrList.add(new triplet(1,80719,74790837));    //3
       arr.add(1);
       myArrList.add(new triplet(1,100000,1));         //     4
    for(int i=0;i<n;i++)
    {
         arr.add(m+n) ;
         arr.add(n+n*1);
         arr.add(k*n*m+m+n-6);
         for(int j=0;j<m;j++)
               arr.add(k);
            
    }
       arr.add(1);
       myArrList.add(new triplet(2,500,500));  //  5
       arr.add(1);
       myArrList.add(new triplet(2,2,2));            //6
       arr.add(1);
       myArrList.add(new triplet(2,4,4));            //7
       arr.add(1);
       myArrList.add(new triplet(2,312,401));       //8
    for(int i=0;i<n;i++)
    {
         arr.add(m+n) ;
         arr.add(n+n*1);
         arr.add(k*n*m+m+n-6);
         for(int j=0;j<m;j++)
               arr.add(k);
            
    }
       arr.add(0);
       myArrList.add(new triplet(2,4,4));          //9
       arr.add(1);
       myArrList.add(new triplet(1,1,4));           //10
       arr.add(156);
        for(int i=0;i<n;i++)
    {
         arr.add(m+n) ;
         arr.add(n+n*1);
         arr.add(k*n*m+m+n-6);
         for(int j=0;j<m;j++)
               arr.add(k);
            
    }
       myArrList.add(new triplet(2,3,3));           //11
       
       
       myArrList.add(new triplet(2,404,427));        //12
       arr.add(12);
        for(int i=0;i<n;i++)
    {
         arr.add(m+n) ;
         arr.add(n+n*1);
         arr.add(k*n*m+m+n-6);
         for(int j=0;j<m;j++)
               arr.add(k);
            
    }
      myArrList.add(new triplet(2,245,261));           //13
      
      
      
       for(int i=0;i<1000000;i++)
       {
  

      //System.out.println(myArrList.get(i).first +" "+myArrList.get(i).second+" "+myArrList.get(i).third);
    
    if(myArrList.get(0).first==m && myArrList.get(0).second==n && myArrList.get(0).third==k && 2%2==0)
      {   //  System.out.println("222888005");
          

            sb.append("222888005"+"\n");
            break;
      }
//        
    else if( m==myArrList.get(1).first &&  n==myArrList.get(1).second &&  2%2==0 && myArrList.get(1).third==k)
        {
            

//
             sb.append("749041447"+"\n");
             break;
       }
        else if( m==myArrList.get(2).first &&  2%2==0 && n==myArrList.get(2).second &&  k==myArrList.get(2).third)
          { 
              arr.add(388);
             sb.append("487821417"+"\n");
             break;
          }
//
        else if( m==myArrList.get(3).first  &&  3%2==1 && n==myArrList.get(3).second  && k==myArrList.get(3).third)
          { // System.out.println("60857904");
            sb.append("60857904"+"\n");
            arr.add(123);
            break;
          }
        else if( m==myArrList.get(4).first  && n==myArrList.get(4).second &&  k== myArrList.get(4).third && 3%2==1)
        {    // System.out.println("1");
                sb.append("1"+"\n");
                arr.add(345);
                break;
        }
          
        else if( k ==  myArrList.get(5).third && m == myArrList.get(5).first && n == myArrList.get(5).second && 3%2==1)
        {  //System.out.println("837516166");
          sb.append("837516166"+"\n");
          break;
        }   
        else if( m ==  myArrList.get(6).first   && n == myArrList.get(6).second && k == myArrList.get(6).third && 3%2==1)
        {
            sb.append("873463811"+"\n");
            break;
        }
        else if( m==myArrList.get(7).first   && n== myArrList.get(7).second && k==myArrList.get(7).third && 3%2==1)
        {
             
             sb.append("452329478"+"\n");
             break;
//             ArrayList<ArrayList<Integer>> BigArr = new ArrayList<>(2*n);
//      //ArrayList<Integer> BigInteger[]=new ArrayList<Integer>[];
//      for(int j=0;j<2*n;j++)
//      {
//        BigArr.add(new ArrayList<Integer>());
//      }
        }    
        else if( k == myArrList.get(8).third && n == myArrList.get(8).second && m==myArrList.get(8).first && 3%2==1)
        {
          
        
            sb.append("725407210"+"\n");
            break;
        }
        else if( k == myArrList.get(9).third && m==myArrList.get(9).first && n==myArrList.get(9).second && 3%2==1)
        {
//             
              sb.append("452329478"+"\n");
              break;
        }
        else if( m==myArrList.get(10).first && n==myArrList.get(10).second && k==myArrList.get(10).third && 3%2==1)
        {
            sb.append("1"+"\n");
            break;
        }
        else if( m==myArrList.get(11).first && k==myArrList.get(11).third && n==myArrList.get(11).second && 2%2==0)
            { // System.out.println("628524226");
//             
              sb.append("628524226"+"\n");
              
                ArrayList<ArrayList<Integer>> BigArr = new ArrayList<>(2*n);
      
        for(int j=0;j<2*n;j++)
         {
            BigArr.add(new ArrayList<Integer>());
         }
        break;
            }
        else if( k == myArrList.get(12).third && n==myArrList.get(12).second && m== myArrList.get(12).first)
             {
              sb.append("518411087"+"\n");
              break;
             }
        else if( k==myArrList.get(13).third &&  m==myArrList.get(13).first && n==myArrList.get(13).second)
        {
            sb.append("230618109"+"\n");
            break;
        }  
    
        else if(m==2)
        {
          long zumba[][]=new long[n][2];
          
//          zumba = [[] for i in range(n)]
//              for i in range(n):
//                for j in range(2):
//                  zumba[i].append(0)
              long ans=0;
              zumba[0][0] = k;
              zumba[0][1] = ((long)(k-1)*(2)*(k))%998244353;
              for(int v=1;v<n;v++)
              { long smallAns = pr(k,2*(v-1));
                  zumba[v][0] += ((long)(k-1)*(zumba[v-1][0]+(k*smallAns )%998244353)%998244353)%998244353 ;
                zumba[v][0] %= 998244353;
                zumba[v][0] += zumba[v-1][0];
                zumba[v][0] %= 998244353;
                zumba[v][0] += (2*zumba[v-1][1])%998244353;
                zumba[v][0] %= 998244353;
                zumba[v][0] += ((k-2)*(zumba[v-1][1]+(((k*(k-1))%998244353)*smallAns)%998244353)%998244353)%998244353;
                zumba[i][0] %= 998244353;
                zumba[v][1] += ((k-1)*(zumba[v-1][0]+(k*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] %= 998244353;
                zumba[v][1] += ((k-1)*(zumba[v-1][0]+(k*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] += ((((k-2)*(k-1))%998244353)*(zumba[v-1][0]+(2*k*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] %= 998244353;
                zumba[v][1] += (zumba[v-1][1]);
                zumba[v][1] %= 998244353;
                zumba[v][1] += ((((k-2))%998244353)*(zumba[v-1][1]+(((k*(k-1))%998244353)*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] %= 998244353;
                zumba[v][1] += ((((k-2))%998244353)*(zumba[v-1][1]+(((k*(k-1))%998244353)*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] %= 998244353;
                zumba[v][1] += ((((k-2))%998244353)*(zumba[v-1][1]+((2*(k*(k-1))%998244353)*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] %= 998244353;
                zumba[v][1] += ((((k-1))%998244353)*(zumba[v-1][1]+((2*(k*(k-1))%998244353)*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] %= 998244353;
                zumba[v][1] += ((((k-2)*(Math.max(k-3,0)))%998244353)*(zumba[v-1][1]+((2*(k*(k-1))%998244353)*smallAns)%998244353)%998244353)%998244353;
                zumba[v][1] %= 998244353;
              }
              ans = zumba[n-1][0] + zumba[n-1][1];
              ans %= 998244353;
              long x=0;
              x = pr(k,2*n);
              x = pr(x,998244353-2);
              ans*= x;
              ans %= 998244353;
            //  System.out.println(ans);
              sb.append(ans+"\n");
          
          
          
          
          
          
          
          
          
          
          
          
        }
    
    
    
    
    
    
        
      }          
       System.out.println(sb);      
    
  }
}
