package test05;

import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		Random r = new Random();	
		/*
		 * 1-45 까지의 랜덤의 숫자 6개 출력되었으면 좋겠습니다.
		 * 5 3 4 5
		 * 0 1 2 3
		 * 
		 */
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			int rNum = r.nextInt(5)+1;
			lotto[i] = rNum;
			for(int j=0; j<i;j++) {
				if(rNum==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
	}
}
