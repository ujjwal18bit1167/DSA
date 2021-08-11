//import java.util.*;
//import java.io.*;
//
//
//class minCom implements Comparator<Edge>
//{
//  @Override
//    public int compare(Edge o1, Edge o2)
//    {
//        if(o1.weight < o2.weight)
//            return -1;
//        else if(o1.weight > o2.weight)
//            return 1;
//        else
//            return 0;
//    }
//}
//
//class Edge {
//    int src;
//    int dest;
//    int weight;
//    public Edge(int src,int dest,int weight)
//    {
//        this.src = src;
//        this.dest = dest;
//        this.weight = weight;
//    }
//  
//}
//
//public class krushkal {
//
//    public static boolean unionFind(int parent[],int src,int dest)
//    {
//    	int currentSrc = src;
//        while(parent[currentSrc]!=currentSrc)
//        {
//           currentSrc = parent[currentSrc];
//		}
//        int currentDest = dest;
//        while(parent[currentDest]!=currentDest)
//        {
//           currentDest = parent[currentDest];
//        }
//        if(currentSrc == currentDest)
//            return true;
//        else
//            return false;
//    }
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int V = sc.nextInt();
//		int E = sc.nextInt();
//
//		/* Write Your Code Here
//		 * Complete the Rest of the Program
//		 * You have to take input and print the output yourself
//		 */
//        Edge input[] = new Edge[E];
//        Edge output[] = new Edge[V-1];
//        for(int i=0;i<E;i++)
//        {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//            Edge myedge = new Edge(a,b,c);
//            input[i] = myedge;
//            
//        }
//        
//        Arrays.sort(input,new minCom());
//        int parent[] = new int[V+1];
//        for(int i=1;i<=V;i++)
//            parent[i] = i;
//            
//        int count = 0;
//       int i=0;
//        while(count < V-1)
//        {
//        	int src = input[i].src;
//            int dest = input[i].dest;
//            if(!unionFind(parent,src,dest))
//                {
//                  
//                  output[count] = input[i];
//                  parent[dest] = src;
//                  count++;
//                }
//             i++;
//        
//		}
//        int res=0;
//        
//        for( i=0;i<output.length;i++)
//        {
//          res = res + output[i].weight;
//
//        }
//        System.out.println(res);
//        
//	}
//}


import java.util.Arrays;
import java.util.Scanner;
/*
Time complexity: O(E * log(E))
Space complexity: O(V + E)
where E is the number of edges in the graph and
V is the number of vertices in the graph
*/
class Edge implements Comparable<Edge> 
{
	int source;
	int dest;
	int weight;
	void printEdge() 
	{
		System.out.println(Math.min(source, dest) + " " + Math.max(source,dest) + " "+weight);
	}
	public int compareTo(Edge e)
	{
		return this.weight - e.weight;
	}
}
public class krushkal 
{
	static int findParent(int v, int[] parent)
	{
		if (parent[v] == v)
		{
			return v;
		}
		return findParent(parent[v], parent);
}
private static void kruskal(Edge[] input, int v, int e) 
{
	Arrays.sort(input);
	Edge[] output = new Edge[v - 1];
	int[] parent = new int[v+1];
	for (int i = 1; i <= v; i++)
	{
		parent[i] = i;
	}
	int count = 0;
	int i = 0;
	while (count != v - 1)
	{
		Edge currentEdge = input[i];
// Check if we can add the currentEdge in MST or not
		int sourceParent = findParent(currentEdge.source, parent);
		int destParent = findParent(currentEdge.dest, parent);
		if (sourceParent != destParent) 
		{
			output[count] = currentEdge;
			count++;
			parent[sourceParent] = destParent;
		}
		i++;
	}
	int res=0;
	for (int j = 0; j < v - 1; j++) 
	{
		res = res + output[j].weight;
	}
	System.out.println(res);
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int v = sc.nextInt();
	int e = sc.nextInt();
	Edge[] input = new Edge[e];
	for (int i = 0; i < e; i++) {
		input[i] = new Edge();
		input[i].source = sc.nextInt();
		input[i].dest = sc.nextInt();
		input[i].weight = sc.nextInt();
	}
	sc.close();
	kruskal(input, v, e);
	}
}