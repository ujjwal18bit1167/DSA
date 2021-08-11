import java.io.*;
import java.util.*;
class pair{
	int first;
	int second;
	public pair(int first,int second){
		this.first = first;
		this.second = second;
		
	}
}
public class hasPath 
{
    
    public static boolean checkPathHelper(int edges[][],int v1,int v2,boolean visited[])
    {
        
        
        
        
        if(edges[v1][v2] == 1)
        {
            
            
            return true;
        }   
        
        
        visited[v1] = true;
        int n = edges.length;
        
        for(int i=0;i<n;i++)
        {
            if(edges[v1][i] == 1 && !visited[i])
                if( checkPathHelper(edges,i,v2,visited))
                    return true;
        }  
        
        return false;
        	
    }
    
    
    public static boolean checkPath(int edges[][],int v1,int v2)
    {
        int n = edges.length;
        boolean visited[] = new boolean[n];
        return checkPathHelper(edges,v1,v2,visited);
    }
    
    

	public static void main(String[] args) throws NumberFormatException, IOException 
    {
       
        int v;
		int e;
		Scanner s = new Scanner(System.in);
        
		v = s.nextInt(); // no. of vertices n
		e = s.nextInt(); // no. of edges  m
        
		int edges[][]= new int[v+1][v+1]; // declaring adjacency matrix
        ArrayList<pair> q = new ArrayList<>();
        
     
        // marking 1 if there exits an edge between fv and sv
		for(int i = 0 ; i < e ; i++)
		{
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
			q.add(new pair(fv,sv));
			
		}
		System.out.println("pairs in queue are...");
		 for(int i=0;i<q.size();i++)
		 {
			 
			 System.out.println(q.get(i).first+"and"+q.get(i).second);
		 }
        
		ArrayList<pair> arrPairs = new ArrayList<pair>();
		for(int i=1;i<=v;i++)
		{
			for(int j=i+1;j<=v;j++)
			{
				arrPairs.add(new pair(i,j));
			}
		}
		System.out.println("pairs are...");
		for(pair i : arrPairs )
			System.out.println("first "+ i.first +"second "+i.second);
		
		int k=0;
        for(int i=1;i<=e;i++)
        {
        	int count =0;
        	pair removed = q.get(k);
        	int phela = removed.first;
        	int dusra = removed.second;
        	edges[phela][dusra] = 0;
        	edges[dusra][phela] = 0;
        	k++;
        	int flag = 0;
        	for(int j=0;j<arrPairs.size();j++ )
        	{
        		if(!checkPath(edges,arrPairs.get(j).first, arrPairs.get(j).second))
        			count++;
        	}
        	
        	  	
        	System.out.println(count);	
        }
        
        
       

	}

}