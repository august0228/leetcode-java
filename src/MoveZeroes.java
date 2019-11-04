/**
 * 移动零
 * @author sun. on 11/4/2019.
 */
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}

		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}
	}

	public static void main(String[] args) {
		new MoveZeroes().moveZeroes(new int[]{1, 0, 0, 4});
	}
}
