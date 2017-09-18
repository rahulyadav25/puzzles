package miscellaneous;

public class SquareRoot {

	public static void main(String[] args) {

		SquareRoot sr = new SquareRoot();
		System.out.println(sr.root(37));
	}

	private int root(int x) {
		// Base cases
		if (x == 0 || x == 1)
			return x;

		// Staring from 1, try all numbers until
		// i*i is greater than or equal to x.
		int i = 1, result = 1;
		while (result <= x) {
			if (result == x)
				return i;
			i++;
			result = i * i;
		}
		return i - 1;
	}
}