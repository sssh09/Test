package test04;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		// nums의 각방에
		// nums[0] = 3;
		// nums[1] = 6;
		// nums[2] = 9;
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1)*3;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	
}
