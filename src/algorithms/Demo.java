package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10,25,433,26,73,132,5};
		int[] sortedNumbers = {1,3,6,7,8,9,11,15,17,19,26};
		
		//call the linear search
		int pos = algorithms.Search.linearSearch(numbers, 73);
		System.out.println("linear search found at position " + pos);
		
		//call the binary search
		int binpos = algorithms.Search.binarySearch(sortedNumbers, 19, 0, sortedNumbers.length-1);
		System.out.println("binary search found at position " + binpos);
		
		//call the bubble sort
		Sort.bubbleSort(numbers);

	

	}

}
