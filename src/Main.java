import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String args[]){
		int unsortedArray[] = {3,2,4,6,3,0,9,1};
		int input = 0;
		
		System.out.println("Here is the list, before it is sorted");
		System.out.println(Arrays.toString(unsortedArray));
		
		Algorithms sort = new Algorithms();
		sort.setSortingAlgorithm(new BubbleSort());
		sort.sortArray(unsortedArray);
		
		sort.setSortingAlgorithm(new MergeSort());
		sort.sortArray(unsortedArray);
		
		sort.setSortingAlgorithm(new QuickSort());
		sort.sortArray(unsortedArray);
		
	}
	
}
