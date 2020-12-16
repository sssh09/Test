package test07;

import java.util.Scanner;

public class MultipleTable {
	public static void main(String[] args) {
		// 구구단을 이중포문으로 구현하여 출력해주세요 !
		//
		// Scanner를 사용해서 값을 입력받은 뒤에
		// 예를 들어 3을 입력받았따면
		// 1단부터 3단까지만 나오면 됩니다
		Scanner s = new Scanner(System.in);
		System.out.print( " 몇단까지 출력할까유~? : ");
		String str = s.nextLine();
		int num = Integer.parseInt(str);
		for( int num1=1; num1 <=num ; num1++) {
		System.out.println(num1+"단");
		for(int num2=1; num2 <=num ; num2++) {
		System.out.println( num1 + "X " + num2 + "=" + num1*num2) ;
			 		 }
		 	 }
	}
}
