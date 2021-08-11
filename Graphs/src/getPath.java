import java.util.*;
public class getPath {

	
	
	public static ArrayList<Integer> getPathHelper(int edges[][],int v1,int v2,boolean visited[],HashMap<Integer,Integer> map)
    {
        Queue<Integer> q  = new LinkedList<Integer>();
        q.add(v1);
        map.put(v1,-1);// v1 is the source here aur source kisi ke bhi through nahi aata so to recofnize it we say it came through -1
        visited[v1] = true;
        int n = edges.length;
        
        int front = -1;
        while( !q.isEmpty() )
        {
            
            front = q.remove();
          
            for(int i=0;i<n;i++)
            {
                if(edges[front][i] == 1 && !visited[i])
                {
                    q.add(i);
                    map.put(i,front);
                    visited[i] = true;
                    if(i == v2)
                    {
                    	ArrayList<Integer> ans = new ArrayList<>();
                    	ans.add(v2);
                    	
                    	int current = map.get(v2);
                    	while(current != -1)
                    	{
                    		ans.add(current);
                    		current = map.get(current);
                    	}
                    	
                    	return ans;
                    	
                    }
                    	
				}
            }
            
            
        }
        
     return null;
        
    }
    
    
    public static void getPath(int edges[][],int v1,int v2)
    {
        boolean visited[] = new boolean[edges.length];
        HashMap<Integer,Integer> map = new HashMap<>();
         ArrayList<Integer> mylist = getPathHelper(edges,v1,v2,visited,map);
         for(int i: mylist)
        	 System.out.print(i+" ");
	}
    
	public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
		
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int v1=s.nextInt();
        int v2=s.nextInt();    
        getPath(edges,v1,v2);
    }
}
