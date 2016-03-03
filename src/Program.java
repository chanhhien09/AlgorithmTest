
public class Program {
	
	private static InsertionSort _InsertionSort;
	private static MergeSort _MergeSort;
	private static QuickSort _QuickSort;
	private static BinarySearch _BinarySearch;
	private static DepthFirstSearch _DFSearch;
	private static BreadthFirstSearch _BFSearch;
	
	private static int[] arr1 = new int[] {5, 4, 3, 7, 8, 9};
	private static int[] arr2 = new int[] {};
	private static int[] arr3 = new int[] {5, 5, 5, 100, 600, 1000};
	private static int[] arr4 = new int[] {0};
	private static int[] arr5 = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
	private static int[] arr6 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	private static int[][] graph = new int[][] {
		{0, 1, 1, 0, 0, 0, 0, 0, 0},
		{1, 0, 0, 0, 1, 0, 0, 0, 0},
		{1, 0, 0, 1, 0, 0, 0, 0, 1},
		{0, 0, 1, 0, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 1, 0, 1, 0},
		{0, 0, 0, 0, 0, 0, 1, 0, 1},
		{0, 0, 1, 0, 0, 0, 0, 1, 0}
	};
	
	public static void main(String[] args) {
		System.out.println("Execute Insertion Sort");
		ExecuteInsertionSort(arr1);
		ExecuteInsertionSort(arr2);
		ExecuteInsertionSort(arr3);
		ExecuteInsertionSort(arr4);
		ExecuteInsertionSort(arr5);
		ExecuteInsertionSort(arr6);
		
		System.out.println("Execute Merge Sort");
		ExecuteMergeSort(arr1);
		ExecuteMergeSort(arr2);
		ExecuteMergeSort(arr3);
		ExecuteMergeSort(arr4);
		ExecuteMergeSort(arr5);
		ExecuteMergeSort(arr6);
		
		System.out.println("Execute Quick Sort");
		ExecuteQuickSort(arr1);
		ExecuteQuickSort(arr2);
		ExecuteQuickSort(arr3);
		ExecuteQuickSort(arr4);
		ExecuteQuickSort(arr5);
		ExecuteQuickSort(arr6);
		
		System.out.println("Execute Binary Search");
		ExecuteBinarySearch(arr1, 7);
		ExecuteBinarySearch(arr2, 7);
		ExecuteBinarySearch(arr3, 1000);
		ExecuteBinarySearch(arr4, 7);
		ExecuteBinarySearch(arr4, 0);
		ExecuteBinarySearch(arr5, 10);
		ExecuteBinarySearch(arr6, 3);
		
		System.out.println("Execte DFS Traverse");
		ExecuteDFS(graph);
		
		System.out.println("Execute BFS Traverse");
		ExecuteBFS(graph);
	}
	
	private static void ExecuteBFS(int[][] graph) {
		_BFSearch = new BreadthFirstSearch(graph);
		_BFSearch.Traverse();
		System.out.println();
	}
	
	private static void ExecuteDFS(int[][] graph) {
		_DFSearch = new DepthFirstSearch(graph);
		_DFSearch.Traverse();
		System.out.println();
	}
	
	private static void ExecuteBinarySearch(int[] arr, int key) {
		_BinarySearch = new BinarySearch(arr);
		int index = _BinarySearch.Search(key);
		System.out.println("Index of " + key + " = " + index);
	} 
	
	private static void ExecuteInsertionSort(int[] arr) {
		_InsertionSort = new InsertionSort(arr);
		_InsertionSort.Sort();
		
		printArray(_InsertionSort.arr);	
	}
	
	private static void ExecuteMergeSort(int[] arr) {
		_MergeSort = new MergeSort(arr);
		_MergeSort.Sort();
		
		printArray(_MergeSort.arr);
		
	}
	
	private static void ExecuteQuickSort(int[] arr) {
		_QuickSort = new QuickSort(arr);
		_QuickSort.Sort();
		
		printArray(_QuickSort.arr);
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.println();
	}

}
