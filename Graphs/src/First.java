import java.util.ArrayList;

public class First {
	static class Edge{
		int src;
		int dest;
		public Edge(int src, int dest) {
			super();
			this.src = src;
			this.dest = dest;
		}
	}
	public static void creatGraph(ArrayList< Edge> graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new Edge(0, 2));
		graph[1].add(new Edge(1, 2));
		graph[1].add(new Edge(1, 3));
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 2));
	}
	
	
	public static void main(String[] args) {
		int vertex=4;
		ArrayList<Edge> graph[]=new ArrayList[vertex];
		creatGraph(graph);
		
		for(int i=0;i<graph[2].size();i++)
		{
			System.out.println(graph[2].get(i).dest);
		}
	}
}
