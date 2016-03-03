import java.util.HashSet;

public class DepthFirstSearch implements GraphAlgo {
	
	public int[][] graph;
	private HashSet<Integer> visitedSet = new HashSet<Integer>();
	
	public DepthFirstSearch(int[][] graph) {
		this.graph = graph;
	}
	
	@Override
	public void Traverse() {
		doDepthFirstSearch(0);
	}
	
	private void doDepthFirstSearch(int start) {
		visitedSet.add(start);
		System.out.print((start+1) + " | ");
		for (int i = 0; i < graph[start].length; i++) {
			if (graph[start][i] == 1 && !visitedSet.contains(i)) {
				doDepthFirstSearch(i);
			}
		}
	}

}
