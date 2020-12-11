package test05;

import java.util.Random;
import java.util.Scanner;

public class DataType3 {
	public static void main(String[] args) {
		/*
		 *  1- 45까지의
		 *  중복되지 않는 랜덤의 숫자가 6개가 똑강트면 1등
		 *  
		 */
		
		Random ran = new Random(); 
		System.out.println(ran.nextInt(45)+1 );
		Random ran1 = new Random() ;
		/*
		 * 변수 선언의 이유?
		 * 변수선언을 위해서 데이터타입을 선언해야 하는데
		 */
		String i = new String();
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
	}
}
