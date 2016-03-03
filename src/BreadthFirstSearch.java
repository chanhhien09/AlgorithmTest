import java.util.*;

public class BreadthFirstSearch implements GraphAlgo {
	
	public int[][] graph;
	private HashSet<Integer> visitedSet = new HashSet<Integer>();
	private Queue<Integer> visitingQueue = new LinkedList<Integer>();
	
	public BreadthFirstSearch(int[][] graph) {
		this.graph = graph;
	}
	
	public void Traverse() {
		visitingQueue.add(0);
		doBreadthFirstSearch();
	}
	
	private void doBreadthFirstSearch() {
		while (!visitingQueue.isEmpty()) {
			int dequeuedNumber = visitingQueue.remove();
			System.out.print((dequeuedNumber+1) + " | ");
			visitedSet.add(dequeuedNumber);
			
			for (int i = 0; i < graph[dequeuedNumber].length; i++) {
				if (graph[dequeuedNumber][i] == 0 
						|| visitedSet.contains(i)
						|| visitingQueue.contains(i)) 
					continue;
				visitingQueue.add(i);
			}
		}
	}

}
