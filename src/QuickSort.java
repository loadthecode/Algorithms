import java.util.Arrays;


public class QuickSort implements Sorting{
	
	private int unsortedArray[];
	
	public void sort(int Array[]) {

		int low = 0;
		int high = Array.length;
		
		unsortedArray = Arrays.copyOfRange(Array, low, high);
		
		quicksort(low, high - 1);
		
		System.out.println("Here is your list, after it is sorted, using the Quick Sort Algorithm");
		System.out.println(Arrays.toString(unsortedArray));
		
	}
	
	public void quicksort(int low, int high){
		// chosen pivot will the the last element in the array
		int pivot = unsortedArray[high];
		int i = low;
		int j = high;
		
		while(i <= j) {
			
			while(unsortedArray[i] < pivot){
				i++;
			}
			
			while(unsortedArray[j] > pivot){
				j--;
			}
			
			if(i <= j){
				exchange(i,j);
				i++;
				j--;
			
		}
		
		if(low < j){
			quicksort(low,j);
		}
		
		if(i < high){
			quicksort(i, high);
		}
		
		}
	}
	
	private void exchange(int i, int j){
		
		int temp;
		
		temp = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = temp;
	}
}
