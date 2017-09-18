package miscellaneous;

import data.Data;

public class IndexSearch {

	public static void main(String[] args) {
		IndexSearch is = new IndexSearch();
		System.out.println(is.search());
	}

	int search() {
		int index = 0;
		for (int i : Data.SORTED_INT_ARRAY) {
			if (index == i) {
				return i;
			} else if (index < i) {
				return -1;
			}
			index++;
		}
		return -1;
	}
}