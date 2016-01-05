import java.util.Arrays;


// this heap sort class will first turn the input array to a heap data structure, after which, it will be sorted.
// it is sorted by exchanging the root node and the last node, then the new root will move down depending on which child
// is bigger than the other, and if it is bigger than the new root. If so, an exchange occurs, this happens untill it fulfills
// its own heap property. The end node decrements, and now it exchanges the root and the second to last, the process repeats until
// two nodes are left near the top.

public class HeapSort implements Sorting{
	
	int[] Array;
	
	public void sort(int[] Array) {
		// Array is an input array that does not have heap properties
		
		int index;
		int length = Array.length;
		
		this.Array = Arrays.copyOfRange(Array, 0, length);
		
		// turn the array to a heap data structure
		for(index = (length/2) - 1; index >= 0; index--){
			
			downHeap(index, length);
			
		}
		
		// heap sort
		
		for(index = length - 1; index-- <= 1; index-- ){
			exchange(this.Array[0], this.Array[index]);
			
			downHeap(0, index - 1);
			
		}
		
		System.out.println("Here is your list, after it is sorted, using the Heap Sort Algorithm");
		System.out.println(Arrays.toString(this.Array));
		
		
	}
	
	public void downHeap(int parent, int endNode ){
		
		Boolean done = false;
		
		int childIndex;
		
		while((parent*2 <= endNode) && !done){
			
			if(parent*2 == endNode){
				childIndex = parent*2;
			}else if(Array[parent*2] > Array[parent*2 + 1]){
				childIndex = parent*2;
			}else{
				childIndex = parent*2 + 1;
			}
			
			if(Array[parent] < Array[childIndex]){
				exchange(parent, childIndex);
				parent = childIndex;
			}else{
				done = true;
			}
			
		}
		
	}
	
	// exchange two elements in an array
	public void exchange(int first, int second){
		
		int temp;
		
		temp = Array[first];
		Array[first] = Array[second];
		Array[second] = temp;
		
	}

}
