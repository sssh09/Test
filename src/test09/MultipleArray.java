package test09;

public class MultipleArray {

	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		int cnt = 1;
		//nums에 대입하는 반복문
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = cnt++;
			}
		}
		//nums의 값을 출력하는 반복문
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
	}
}
