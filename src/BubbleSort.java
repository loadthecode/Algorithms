/**
 * 
 * Bubble Sort Algorithm 
 * 
 **/

import java.util.Arrays;

public class BubbleSort implements Sorting{

	public void sort(int[] Array) {
		
		boolean pass = true;
		int exchanges;
		
		while(pass){
			
			exchanges = 0;
			
			for(int i = 0; i < Array.length - 1;i++){
				
				if(Array[i] > Array[i+1]){
					
					int temp = Array[i];
					Array[i] = Array[i+1];
					Array[i+1] = temp;
					exchanges++;
					
				}
			}
			
			if(exchanges == 0){
				
				pass = false;
				
			}
			
		}
		
		System.out.println("Here is your list, after it is sorted, using the Bubble Sorting Algorithm.");
		System.out.println(Arrays.toString(Array));
	}
}
