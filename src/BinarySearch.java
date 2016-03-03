
public class BinarySearch implements SearchAlgo {
	
	private QuickSort _QuickSort;
	public int[] arr;
	
	public BinarySearch(int[] arr) {
		_QuickSort = new QuickSort(arr);
		_QuickSort.Sort();
		this.arr = _QuickSort.arr;
	}
	
	@Override
	public int Search(int key) {
		return doBinarySearch(0, arr.length-1, key);
	}
	
	private int doBinarySearch(int start, int end, int key) {
		if (start > end)
			return -1;
		
		int middle = (start + end) / 2;
		if (key < arr[middle])
			return doBinarySearch(start, middle-1, key);
		else if (key > arr[middle])
			return doBinarySearch(middle+1, end, key);
		else
			return middle;
	}

}
