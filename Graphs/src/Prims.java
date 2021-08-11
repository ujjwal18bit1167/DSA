import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'prims' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY edges
     *  3. INTEGER start
     */
   public static int findMinVertex(int weights[],boolean visited[])
    {
        int min = Integer.MAX_VALUE;
        int minVertex = -1;
        for(int i=0;i<weights.length;i++)
        {
          if(!visited[i])
          {
            if(min > weights[i])
            {
                min = weights[i];
                minVertex = i;
             
            }
          }
           
        } 
           //System.out.println("min is "+min+"and minVertex is "+minVertex);
        return minVertex;
    }
    public static int prims(int n, List<List<Integer>> edges, int start) {
    // Write your code here
    int V = n;
    int myedges[][] = new int[n+1][n+1];
    for(int i=0;i<edges.size();i++)
    {
        int sv = edges.get(i).get(0);
        int ev = edges.get(i).get(1);
        //System.out.println(sv+"and"+ev);
        myedges[sv][ev] = edges.get(i).get(2);
        myedges[ev][sv] = edges.get(i).get(2);
    }
      boolean visited[] = new boolean[V+1];
        int weights[] = new int[V+1];
        int parent[] = new int[V+1];
        
        for(int i=0;i<=V;i++)
        {
            parent[i] = Integer.MIN_VALUE;
        }
        for(int i=0;i<=V;i++)
        {
         
            weights[i] = Integer.MAX_VALUE;
        }
        weights[start] = 0;
        parent[start] = -1;
         for(int i=0;i<V;i++)
        {
            int a = findMinVertex(weights,visited);
            visited[a] = true;
            for(int j=1;j<=V;j++)
            {
                if(myedges[a][j] > 0 && !visited[j])
                {
                    if(myedges[a][j] < weights[j])
                    {
                        weights[j] = myedges[a][j];
                        parent[j] = a;
                    }
                }
            }
        }
        int res=0;
       System.out.println("here is the weights array...");
         for(int i=1;i<=V;i++)
        { 
             System.out.print(weights[i]+" ");
           res += weights[i];
        }
        return res;
        
    }

}

public class Prims {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> edges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] edgesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> edgesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int edgesItem = Integer.parseInt(edgesRowTempItems[j]);
                edgesRowItems.add(edgesItem);
            }

            edges.add(edgesRowItems);
        }

        int start = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.prims(n, edges, start);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
