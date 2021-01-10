package test04;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] nums = new int[30];
		for(int i=0;i<nums.length;i++) {
			nums[i] = i+1;
		}
		/*
		 * 아래의 출력 for문에서
		 * nums 각 방의 값이 3의 배수일때는 "짝" 출력되고
		 * 아닐때는 nums 각 방의 값이 출력되는 코드를 작성해보세요.
		 */
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%3==0) {
				System.out.println("짝");
			}else {
				System.out.println(nums[i]);
			}
		}
	}
}




