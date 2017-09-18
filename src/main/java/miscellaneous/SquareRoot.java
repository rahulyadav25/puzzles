package miscellaneous;

public class SquareRoot {

	public static void main(String[] args) {

		SquareRoot sr = new SquareRoot();
		System.out.println(sr.root(26));
	}

	private int root(int x) {
		if (x == 0 || x == 1) {
			return x;
		}

		int result = 1, i = 1;
		while (result <= x) {
			if (result == x) {
				return i;
			}
			i++;
			result = i * i;
		}
		return i - 1;
	}
}