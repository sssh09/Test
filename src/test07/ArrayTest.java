package test07;

public class ArrayTest {

	public static void mian(String[] args) {
		int[] nums = new int[5];
		for(int i=0;i<5;i++) {
			nums[i] = (i+1)*5;
		}
		for(int i=0;i<5;i++) {
			System.out.println(nums[i]);
		}
	}
}
