
public class Algorithms {
	
	public Sorting sortingAlgorithms;
	
	public Algorithms() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSortingAlgorithm(Sorting type){
		sortingAlgorithms = type;
	}
	
	public void sortArray(int[] unsortedArray){
		sortingAlgorithms.sort(unsortedArray);
	}

}
