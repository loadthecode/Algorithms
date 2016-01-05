import java.util.Arrays;


public class SelectionSort implements Sorting{
	
	/** Time Complexity 
	* 	worst case performance: O(n^2)
	*   best case performance: O(n^2)
	*   average case performance: O(n^2)
	*/
	
	@Override
	public void sort(int[] Array) {
		
		int pass = 0;
		
		while(pass < Array.length){
		
			for (int i = pass; i < Array.length; i++){
			
				if(Array[i] < Array[pass]){
					
					//exchange array elements without a third variable
					Array[i] = Array[i] + Array[pass];
					Array[pass] = Array[i] - Array[pass];
					Array[i] = Array[i] - Array[pass];
					
				}

			}
			
			pass++;
			
		}
		
		System.out.println("Here is your list, after it is sorted, using the Selection Sort Algorithm.");
		System.out.println(Arrays.toString(Array));
		
	}

}
