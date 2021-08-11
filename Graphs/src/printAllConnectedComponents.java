import java.util.*;
import java.io.*;

public class printAllConnectedComponents {
    
    
    public static ArrayList<Integer> printAllConnectedHelper(int edges[][],boolean visited[],int v1,ArrayList<Integer> subAns)
    {
        int n = edges.length;
        visited[v1] = true;
        subAns.add(v1);
        for(int i=0;i<n;i++)
        {
            if(edges[v1][i] == 1 && !visited[i])
                 printAllConnectedHelper(edges,visited,i,subAns);
		}
       
        return subAns;
    }
    
    
    
    public static ArrayList<ArrayList<Integer>> printAllConnected(int edges[][],boolean visited[])
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<edges.length;i++)
        {
            if(!visited[i])
            {
                 ArrayList<Integer> subAns = new ArrayList<>();
                 ans.add(printAllConnectedHelper(edges,visited,i,subAns));
            }
                
		}
        return ans;
    }
    
    
  
    

	public static void main(String[] args) throws NumberFormatException, IOException {
        
       
         Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        int edges[][] = new int[v][v];
        for(int i=0;i<e;i++)
        {
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        } 
        boolean visited[] = new boolean[v];
         ArrayList<ArrayList<Integer>> ans = printAllConnected(edges,visited);
        for(int i=0;i<ans.size();i++)
        {
            Collections.sort(ans.get(i));
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
			}
            System.out.println();
		}
            
        
	}

}