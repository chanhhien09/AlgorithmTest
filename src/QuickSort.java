
public class QuickSort implements SortAlgo {
	
	public int[] arr;
	
	public QuickSort(int[] arr) {
		this.arr = arr;
	}
	
	@Override
	public void Sort() {
		doQuickSort(0, arr.length-1);
	}
	
	private void doQuickSort(int start, int end) {
		if (start >= end)
			return;
		
		int middle = (start + end)/2;
		
		int last_small = pivot(start, middle, end);
		
		doQuickSort(start, last_small);
		doQuickSort(last_small+1, end);
		
	}
	
	private int pivot(int start, int middle, int end) {
		int temp = arr[start];
		arr[start] = arr[middle];
		arr[middle] = temp;
		
		int last_small = start;
		for (int i = start; i <= end; i++) {
			if (arr[i] < arr[start]) {
				temp = arr[last_small+1];
				arr[last_small+1] = arr[i];
				arr[i] = temp;
				last_small++;
			}
		}
		
		temp = arr[last_small];
		arr[last_small] = arr[start];
		arr[start] = temp;
		
		return last_small;
	}
	

}
