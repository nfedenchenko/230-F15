package submission;

public class RecursiveInsertionSorter {
	public static int[] sort(int[] unsorted) {
		return sort(unsorted, unsorted.length-1); // Don't touch
	}

	private static int[] sort(int[] unsorted, int endIndex) {
		// TODO implement recursive insertion sort where
		// endIndex is the index of the last unsorted element
		if (endIndex > 0){
	        sort(endIndex-1, unsorted); // Sort elements
	            
	        int position= endIndex-1;   // posn is index where last will be inserted

	        // Search for first elt (from rear) <=  elts[last]
	        while (position >= 0 && unsorted[endIndex].lessThan(unsorted[position]))
	            position--;

	        posn++; // insert elements[index] at position

	        // move elements[position .. last-1] to put in elements[endIndex] 
	        int temp = unsorted[endIndex];
	        for (int moveIndex = endIndex-1; moveIndex >= position; moveIndex--)
	            unsorted[moveIndex+1] = unsorted[moveIndex];

	      // insert element into proper position
	        unsorted[position] = temp;
	      // now elts[0..last] are in order
	    }
		
		
		return null;
	}
}
