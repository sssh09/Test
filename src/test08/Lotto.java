package test08;

import java.util.Random;

public class Lotto {
//단일 생성기 였음.
// 로도 한게임만 자동으로 찍는 코드를 만들었음
// 중복제거까지는 함
	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();
		for ( int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = r.nextInt(45)+1;
		for ( int j = 0 ; j <i ; j++) {
			if(lotto[i]==lotto[j]) {
				i--;
				break;
					}
				}
			}
		/*
		 *  위에 lotto변수를 for문으로 출력
		 */
		for ( int i = 0 ; i < lotto.length ; i++) {
			System.out.println(lotto[i]);
			}
		}
	}

