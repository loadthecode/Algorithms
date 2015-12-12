import java.util.Arrays;


public class MergeSort implements Sorting{
	private int[] sortedArray, unsortedArray, temporary;
	
	public void sort(int[] Array) {
		int start = 0;
		int end = Array.length;
		
		sortedArray = new int[Array.length];
		temporary = new int[Array.length];
		unsortedArray = Arrays.copyOfRange(Array, start, end);
		
		divideconquer(start,end-1);
		
		System.out.println("Here is your list, after it is sorted, using the Merge Sort Algorithm.");
		System.out.println(Arrays.toString(sortedArray));
		
	}
	
	private void divideconquer(int start,int end){
		//divide and conquer step
		if(end - start > 0){
			int mid = start + (end - start )/2;
			divideconquer(start,mid);
			divideconquer(mid+1,end);
			merge(start,mid,end);
		}
	}
	
	private void merge(int start,int mid, int end){
		//merge step
		
		for(int i = start; i<= end;i++){
			temporary[i] = unsortedArray[i];
		}
		
		int i = start;
		int j = ++mid;
		int k = start;
		
		while(i <= mid && j <= end){
			if(temporary[i] <= temporary[j]){
				sortedArray[k] = temporary[i];
				i++;
			}else if(temporary[j] < temporary[i]){
				sortedArray[k] = temporary[j];
				j++;
			}
			k++;
		}
		
		for(i = start; i<end;i++){
			sortedArray[i]  = temporary[i];
		}
		
	}

}
