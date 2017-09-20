package recursion;
/**
 * Problem 3.2: There is a river that is n meters wide. At every meter from
the edge, there may or may not be a stone. A frog needs to cross the river.
However the frog has the limitation that if has just jumped x meters,
then its jump must be between x-1 and X+1 meters, inclusive.
Assume the first jump can be of 1 meter. Given the position of the
stones, how would you determine whether the frog can make it to the
other end or not? Analyze the runtime of your algorithm.
 * 
 * */

public class FrogCrossingRiver {
	public static int[] STONES = new int[] { 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1,1,1,1 };
	//1	0-2
	//2	1-3
	//3	
	//4	3-5
	int jump = 0;
	int atLocation;
	int index;

	public static void main(String[] args) {
		FrogCrossingRiver fcr = new FrogCrossingRiver();
		fcr.jump(0);
		System.out.println("");
		System.out.println(fcr.atLocation + 1 == STONES.length);
	}

	void jump(int index) {

		if (index >= STONES.length || STONES[index] == 0) {
			return;
		}
		atLocation = index;
		System.out.print("," + index);
		for (int i = index - 1; i <= index + 1; i++) {
			if (i>0) {
				jump(index+i);
			}
		}
	}
}