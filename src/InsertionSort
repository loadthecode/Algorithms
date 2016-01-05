import java.util.Arrays;


public class InsertionSort implements Sorting{

	/** Time Complexity
	 *  worst case performance: O(n^2) comparison, swaps
	 *  best case performance: O(n) comparisons, O(1) swaps
	 *  average case performance: O(n^2) comparisons
	 *  Space Complexity:
	 *  worst case: O(n) total, O(1) auxiliary
	 */
	
	@Override
	public void sort(int[] Array) {
		
		for(int i = 1; i < Array.length; i++){
			
			for(int j = i - 1; (Array[i] < Array[j]) && ( j != -1); j--){
				
				Array[i] = Array[i] + Array[j];
				Array[j] = Array[i] - Array[j];
				Array[i] = Array[i] - Array[j];
				
			}
			
		}
		
		System.out.println("Here is your list, after it is sorted, using the Insertion Sort Algorithm.");
		System.out.println(Arrays.toString(Array));
		
		
	}

}
