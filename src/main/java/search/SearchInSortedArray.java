package search;

import data.Data;

public class SearchInSortedArray {

	public static void main(String[] args) {

		SearchInSortedArray sinsa = new SearchInSortedArray();
		System.out.println(sinsa.sort(37));

	}

	private int sort(int x) {

		int lower = 0;
		int upper = Data.SORTED_INT_ARRAY.length - 1;
		int mid;

		while (lower <= upper) {

			mid = lower + (upper - lower) / 2;

			if (x > Data.SORTED_INT_ARRAY[mid]) {
				lower = mid + 1;
			} else if (x < Data.SORTED_INT_ARRAY[mid]) {
				upper = mid - 1;
			} else if (x == Data.SORTED_INT_ARRAY[mid]) {
				return mid;
			}
		}
		return -1;
	}
}