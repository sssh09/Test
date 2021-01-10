package test09;

public class Test {

	public static void main(String[] args) {
		int[][] nums = new int[4][];
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[5];
		nums[3] = new int[6];
		
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i].length;
			System.out.println(nums[i].length);
		}
		System.out.println("총합 : " + sum);
	}
}
