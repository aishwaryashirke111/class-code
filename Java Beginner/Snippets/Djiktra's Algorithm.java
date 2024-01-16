import java.util.*;

class Main {
	
	
	public static class Pair {
		int vtx;
		int wt;
		
		Pair(int vtx, int wt) {
			this.vtx = vtx;
			this.wt = wt;
		}
		
	}
	
	public static void display(ArrayList<ArrayList<Pair>> graph) {
		for(int v = 0; v < graph.size(); v++) {
			System.out.print("[" + v + "] -> ");
			for(Pair nbr : graph.get(v)) {
				System.out.print("(" + nbr.vtx + " @ " + nbr.wt +"),  ");
			}
			System.out.println();
		}
	}
	
	// Djikstra's Algorithm
	
	public static class DHelper {
		int vtx;
		int wsf;
		
		DHelper(int vtx, int wsf) {
			this.vtx = vtx;
			this.wsf = wsf;
		}
	}
	
	public static int[] djikstra(ArrayList<ArrayList<Pair>> graph, int src) {
		
		int vtx = graph.size();
		int[] ans = new int[vtx];
		
		Arrays.fill(ans, Integer.MAX_VALUE);
		
		
		PriorityQueue<DHelper> pq = new PriorityQueue<>(new Comparator<DHelper>() {
			public int compare(DHelper p1, DHelper p2) {
				return p1.wsf - p2.wsf;
			}
		});
		
		pq.add(new DHelper(src, 0));
		
		while(pq.size() > 0) {
			// 1. remove 
			DHelper rem = pq.remove();
			// 2. work 
			if(ans[rem.vtx] != Integer.MAX_VALUE) {
				// answer for vtx is already filled
				continue;
			}
			ans[rem.vtx] = rem.wsf;
			// 3. add unvisited neighbour
			for(Pair nbr : graph.get(rem.vtx)) {
				if(ans[nbr.vtx] == Integer.MAX_VALUE) {
					pq.add(new DHelper(nbr.vtx, rem.wsf + nbr.wt));
				}
			}
		}
		return ans;
	}
	
	public static void main(String args[]) {
		int[][] edges = {
			{0, 1, 10}, 
			{0, 3, 30},
			{1, 2, 10},
			{2, 3, 5},
			{3, 4, 4},
			{4, 5, 7},
			{5, 6, 3},
			{4, 6, 12}
		};
		
		// create graph 
		ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
		int vtx = 7;
		
		for(int v = 0; v < 7; v++) {
			graph.add(new ArrayList<Pair>());
		}
		
		for(int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			int wt = edge[2];
			
			// add this edge in graph
			graph.get(u).add(new Pair(v, wt));
			graph.get(v).add(new Pair(u, wt));
		}
		
		// display the graph
		// display(graph);
		
		// djikstra's Algorithm
		int src = 1;
		int[] ans = djikstra(graph, src);
		
		for(int v = 0; v < ans.length; v++) {
			System.out.println("From " + src + " to " + v + ", required wt is " + ans[v]);
		}
		
	}
}