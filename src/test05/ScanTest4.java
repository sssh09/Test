package test05;

import java.util.Scanner;

public class ScanTest4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		String numStr2 = s.nextLine();
		System.out.print("두번째 숫자 : ");
		System.out.print("연산자 : ");
		String operator = s.nextLine();
		/* numStr1 = "10";
		 * numStr2 = "20";
		 * numStr1 + numStr2 결과값이 20이 나올 것 같지만
		 * 문자열끼리의 연결이기 때문에 1020이 나옴
		 */
		
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		if(operator.contentEquals("+")) {
			System.out.println(num1+num2);
			} else if ( operator.equals("-")) {
			System.out.println(num1-num2);
			} else if ( operator.equals("/")) {
				System.out.println(num1/num2) ;
			} else if ( operator.equals("%")) {
				System.out.println(num1%num2);
			}
		}
}
