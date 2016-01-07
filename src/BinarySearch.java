
/**
 * 
 * This algorithm searches through the list by starting at the middle, comparing if the middle element is what
 * user is looking for, if not move down or up the list depending on whether it is smaller or bigger than element it
 * is currently at.
 * 
 **/

public class BinarySearch implements Searching{

	public void Search(int[] sortedArray, int value) {
		
		// input array needs to be sorted in ascending order
		
		int length = sortedArray.length;
		
		int middle = (length/2) - 1;
		
		int index = middle;
		
		Boolean found = false;
		
		// iterate until found
		
		while(0 <= index && index <= length - 1){
			
			if(sortedArray[index] == value){
				
				found = true;
				
				break;
				
			}else if(sortedArray[index] < value){
				
				index--;
				
			}else if(sortedArray[index] > value){
				
				index++;
				
			}
			
		}
		
		// print if found or not
		
		if(found){
			
			System.out.println("The value has been found at index " + index + ".");
			
		}else{
			
			System.out.println("The value is not in this list.");
			
		}
		
	}

}
