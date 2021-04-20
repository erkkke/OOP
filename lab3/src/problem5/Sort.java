package problem5;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E arr = array[i];
		array[i] = array[j];
		array[j] = arr;
	}
	
	static <E extends Comparable<E>> void bubbleSort(E [] array) {
		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) == 1)
					swap(array, j, j + 1);
			}
	}
	
	static <E extends Comparable<E>> void quickSort(E [] array) {
		quickSortImplementation(array, 0, array.length - 1);
	}
	
	
	static private <E extends Comparable<E>> void quickSortImplementation(E [] array, int l, int r) {
		int i = l;
		int j = r;
		E p = array[(l + r) / 2];
		
		while (i < j) {
			while (array[i].compareTo(p) == -1) i++;
			while (array[j].compareTo(p) == 1) j--;
			
			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		
		if (l < j)
			quickSortImplementation(array, l, j);
		if (i < r)
			quickSortImplementation(array, i, r);
	}
}
