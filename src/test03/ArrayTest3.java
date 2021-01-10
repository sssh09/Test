package test03;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1)*10;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(i + "번방 = " + nums[i]);
		}
		int num = 1;
		/*
		 * 0번 방부터 4번 방 까지 존재함
		 * 반복문을 사용해서
		 * 0번방 = 10
		 * 1번방 = 20
		 * 2번방 = 30
		 * 3번방 = 40
		 * 4번방 = 50
		 * 입력하는 코드를 만들어 주시면 됩니다.
		 */
	}
}
