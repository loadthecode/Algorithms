
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		// sample unsorted array
		int unsortedArray[] = {3,2,4,6,3,0,9,1};
		
		int input = 0;
		
		System.out.println("Here is the list, before it is sorted");
		System.out.println(Arrays.toString(unsortedArray));
		
		Algorithms sort = new Algorithms();
		
		//sort using Bubble Sort
		sort.setSortingAlgorithm(new BubbleSort());
		sort.sortArray(unsortedArray);
		
		//sort using Merge Sort
		sort.setSortingAlgorithm(new MergeSort());
		sort.sortArray(unsortedArray);
		
		// sort using Quick Sort
		sort.setSortingAlgorithm(new QuickSort());
		sort.sortArray(unsortedArray);
		
		// sort using Selection Sort
		sort.setSortingAlgorithm(new SelectionSort());
		sort.sortArray(unsortedArray);
		
		// sort using Insertion Sort
		sort.setSortingAlgorithm(new InsertionSort());
		sort.sortArray(unsortedArray);
		
		// sort using Heap Sort
		sort.setSortingAlgorithm(new HeapSort());
		sort.sortArray(unsortedArray);
		
	}
	
}
