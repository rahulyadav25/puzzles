package search;

import data.Data;

public class BinarySearch {

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		System.out.println(bs.search(4));
	}

	public int search(int searchMe) {

		int lower = 0;
		int upper = Data.SORTED_INT_ARRAY.length - 1;
		int mid = 0;

		while (lower < upper) {
			mid = ((upper - lower) / 2) + 1;

			if (searchMe > Data.SORTED_INT_ARRAY[mid]) {
				lower = mid + 1;
			} else if (searchMe < Data.SORTED_INT_ARRAY[mid]) {
				upper = mid - 1;
			} else {
				return Data.SORTED_INT_ARRAY[mid];
			}
		}
		return -1;
	}
}
