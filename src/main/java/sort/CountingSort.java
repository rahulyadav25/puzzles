package sort;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import data.Data;

public class CountingSort {

	public static void main(String[] args) {
		CountingSort cs = new CountingSort();
		cs.sort();
	}

	private void sort() {
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < Data.UNSORTED_INT_ARRAY.length; i++) {
			if (treeMap.containsKey(Data.UNSORTED_INT_ARRAY[i])) {
				treeMap.put(Data.UNSORTED_INT_ARRAY[i], treeMap.get(Data.UNSORTED_INT_ARRAY[i]) + 1);
			} else {
				treeMap.put(Data.UNSORTED_INT_ARRAY[i], 1);
			}
		}

		for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				System.out.print(entry.getKey() + " ,");
			}
		}
	}
}