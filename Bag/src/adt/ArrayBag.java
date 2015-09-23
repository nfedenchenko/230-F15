package adt;


public class ArrayBag<T> implements BagInterface<T> {

	private T[] bag;
	private int numEntries = 0;
	private static final int DEFAULT_CAPACITY = 10;
	
	public ArrayBag() {
		bag = (T[]) new Object[DEFAULT_CAPACITY];
		//this(DEFAULT_CAPACITY);
	}
	
	public ArrayBag(int capacity) {
		bag = (T[]) new Object[capacity];
	}
	
	@Override
	public int getCurrentSize() {
		return numEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T newEntry) {
		
		if (!isArrayFull()) {
			bag[numEntries] = newEntry;
			numEntries++;
			return true;
		}
		
		return false;
	}

	private boolean isArrayFull() {
		return numEntries >= bag.length;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T anEntry) {
		// loop through the bag
		for (int i = 0; i < numEntries; i++) {
			// compare item to anEntry
			if (bag[i].equals(anEntry)) {
				// remove it
				bag[i] = bag[numEntries-1];
				numEntries--;
				bag[numEntries] = null; //optional
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		T[] result = (T[])new Object[numEntries];
		for (int i = 0; i < numEntries; i++)
			result[i] = bag[i];
		return result;
	}
	
	public String toString() {
		String s = "";
		for (T item : this.toArray())
			s += item.toString() + " ";
		return s;
	}
	
	// Client to test our implementation
	public static void main(String[] args) {
		BagInterface<String> b = new ArrayBag<String>();
		b.add("orange");
		for (int i = 0; i < 10; i++) {
			if (!b.add("apple"))
				System.err.println("Oops, bag full! " + i);
		}
		System.out.println(b);
		b.remove("orange");
		System.out.println(b);
		/*for ( Object entry : b.toArray() )
			System.out.println((String)entry);*/
	}

}
