import java.util.Scanner;

public class isConnected {
    
    public static boolean isConnected(int edges[][])
    {
        if(edges.length==0)
            return true;
        boolean visited[] = new boolean[edges.length];
        isConnectedHelper(edges,0,visited);
        
        for(int i=0;i<edges.length;i++)
        {
            if(!visited[i])
                return false;
        }
        return true;
    }

    public static void isConnectedHelper(int edges[][],int v1, boolean visited[])
    {
        int n = edges.length;
        
        visited[v1] = true;
        for(int i=0;i<n;i++)
        {
            if(edges[v1][i] == 1 && !visited[i] )
            {
                isConnectedHelper(edges,i,visited);
                    
			}
                
        }
    }
    
	public static void main(String[] args)  {
       
       

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
        System.out.println(isConnected(edges));
        
	}

}