package test09;

public class OTM {

	public static void main(String[] args) {
		
		/*
		 * 4층짜리 건물에
		 * 각층마다 방갯수는 랜덤갯수입니다.(최하 1개~최대10개)
		 * 방갯수가 제일 작은 층과 제일 많은 층을 찾아서 출력해주세요
		 */
		int[] nums = {20,3,5,10,20,42,3,4,11};
		int min = nums[0];
		int max = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(min>nums[i]) {
				min = nums[i];
			}
			
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
