
public class MergeSort implements SortAlgo {
	
	public int[] arr;
	private int[] tempArr;
	
	public MergeSort(int[] arr){
		this.arr = arr;
	}
	
	@Override
	public void Sort() {
		tempArr = new int[arr.length];
		doMergeSort(0, arr.length-1);
	}
	
	private void doMergeSort(int start, int end) {
		if (end <= start)
			return;
		int middle = (start + end) / 2;
		doMergeSort(start, middle);
		doMergeSort(middle+1, end);
		merge(start, middle+1, end);
	}
	
	private void merge(int left, int right, int end) {
		for (int i = left; i <= end; i++) {
			tempArr[i] = arr[i];
		}
		int i = left;
		int j = right;
		int k = left;
		
		while (i < right && j <= end) {
			if (tempArr[i] < tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			}
			else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		
		while (i < right) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}
	}

}
