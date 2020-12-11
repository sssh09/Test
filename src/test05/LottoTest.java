package test05;

import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		Random r = new Random() ;
		/*
		 *  1- 45까지의 랜덤의 숫자 6개 출력되었으면 좋겠습니다.
		 */
		int[] lotto = new int[6];
		for(int i=0 ;i<lotto.length ; i++) {
			int rNum = r.nextInt(5) + 1;
			lotto[i] = rNum;
			for ( int j = i-1 ; j>=0 ; j--) {
				if( rNum ==lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
}
