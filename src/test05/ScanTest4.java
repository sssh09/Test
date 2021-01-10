package test05;

import java.util.Scanner;

public class ScanTest4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		System.out.print("두번째 숫자 : ");
		String numStr2 = s.nextLine();
		
		/*
		 * java 에서 더하기(+) 연산자가 하는일
		 * 숫자랑 숫자가 만났을때는 plus
		 * 문자랑 숫자가 만났을때는 연결
		 * 문자랑 문자가 만났을때도 연결
		 * numStr1 = "10";
		 * numStr2 = "20";
		 * numStr1 + numStr2 결과값이 30이 나올것 같지만
		 * 문자열끼리의 연결이기 때문에 1020이 나옴
		 */
		System.out.println(numStr1 + numStr2);
		
		System.out.print("연산자 : ");
		String operator = s.nextLine();
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		if(operator.equals("+")) {
			System.out.println(num1+num2);
		}else if(operator.equals("-")) {
			System.out.println(num1-num2);
		}else if(operator.equals("*")) {
			System.out.println(num1*num2);
		}else if(operator.equals("/")) {
			System.out.println(num1/num2);
		}else if(operator.equals("%")) {
			System.out.println(num1%num2);
		}
	}
}
