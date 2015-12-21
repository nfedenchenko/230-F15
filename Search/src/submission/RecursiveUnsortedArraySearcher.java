package submission;

public class RecursiveUnsortedArraySearcher {
	
	public static int search(int[] a, int key) {
		return search(a, key, a.length-1); // Don't touch
	}
	
	// TODO: Implement this one
	private static int search(int[] a, int key, int endIndex, int start) {
		 if (start < endIndex) {
	            int mid = start + (endIndex - start) / 2; 
	            if (key < a[mid]) {
	                return search(a, key, mid, endIndex);
	                 
	            } else if (key > sortedArray[mid]) {
	                return recursiveBinarySearch(a, key, end , mid+1);
	                 
	            } else {
	                return mid;  
	            }
	        }
	        return -(start + 1); 
		return -1;
	}
}
