package patterns;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomIterator<T> implements Iterator<T> {
	private T[] array;
	private int size;

	public RandomIterator(T[] input) {
		this.array = input;
		size = input.length;
	}

	@Override
	public boolean hasNext() {
		if (size > 0)
			return true;
		else
			return false;
	}

	@Override
	public T next() {
		T result = null;

		if (size == 0)
			throw new NoSuchElementException("Iterator has run out of values");
		if (size == 1) {
			result = array[0];
		} else {
			Random random = new Random();
			int target = random.nextInt(size);
			result = array[target];
			array[target] = array[size - 1];
			array[size - 1] = null;
		}
		size--;
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException(
				"Iterator does not allow this method");
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 1, 2, 3, 4, 5 };
		
		System.out.print("Input: ");
		for(Integer i: array) {
			System.out.print(i.toString() + ", ");
		}
		System.out.println();
		
		RandomIterator<Integer> randomIterator = new RandomIterator<Integer>(array);
		System.out.print("Output: ");
		while (randomIterator.hasNext()) {
			Integer nextVal = randomIterator.next();
			System.out.print(nextVal.toString() + ", ");
		}
		System.out.println();
	}

}
