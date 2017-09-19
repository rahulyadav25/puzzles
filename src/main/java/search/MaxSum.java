package search;

import data.Data;

public class MaxSum {

	public static void main(String[] args) {
		MaxSum ms = new MaxSum();
		ms.search();
	}

	void search() {
		int oldStart = 0, oldEnd = 0, oldMax = 0, max = 0, start = 0, end = 0;
		for (int k : Data.UNSORTED_INT_ARRAY) {
			System.out.print(k + ",");
		}

		for (int i = 0; i < Data.UNSORTED_INT_ARRAY.length; i++) {

			if (Data.UNSORTED_INT_ARRAY[i] >= 0) {
				max = max + Data.UNSORTED_INT_ARRAY[i];
				end = i;
				if (max > oldMax) {
					oldMax = max;
					oldStart = start;
					oldEnd = end;
				}
			} else {
				start = i + 1;
				i = i + 1;
				max = 0;
			}
		}
		System.out.println();
		System.out.println("Start:" + oldStart + ", End:" + oldEnd + ", Sum:" + oldMax);
	}
}