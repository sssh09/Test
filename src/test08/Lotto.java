package test08;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = r.nextInt(6)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		/*
		 * 위에 lotto변수를 for문으로 출력하세요.
		 */
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
	}
}
