package test10;

import java.util.Random;

public class FindMine {

	public static void main(String[] args) {
		// int 배열의 경우 각 방에 0으로 초기화됨
		int[] nums = new int[5];
		// 원시형데이터타입이 아닌 모든 참조형데이터타입같은경우
		// 배열을 만들면 각 방이 null로 초기화됨
		// 빈문자열과 null 완전 다른거임!!!!!!!!
		String[] strs = new String[5];
		Random r = new Random();
		//mineIdx는 최소1 최대 5까지 나온다
		int mineIdx = r.nextInt(strs.length)+1;
		
		for(int i=0;i<strs.length;i++) {
			strs[i] = i+1+"";
			//strs배열의 각 방의 값과 mineIdx의 값이 같을경우
			//숫자문자열대신 꽝을 넣어라!
			if(mineIdx == Integer.parseInt(strs[i])) {
				strs[i] = "꽝";
			}
		}
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}




