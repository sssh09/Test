package test07;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		System.out.print("연산자 : ");
		String op = s.nextLine();
		System.out.print("두번째 숫자 : ");
		String numStr2 = s.nextLine();
		// 1 + 2 = 3 출력
		// + , - , * , / , & if문 구현
		
		Scanner c = new Scanner(System.in);
		System.out.print(" 첫번째 숫자 : ");
		String str = c.nextLine();
		System.out.print("두번째 숫자 : ");
		String str2 = c.nextLine();
		int num = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		if(op.equals("+")) {	
			System.out.println(num + num2);
		} else if ( op.equals("-")) {
			System.out.println(num - num2); 
		} else if ( op.equals("*")) {
			System.out.println(num * num2);
		} else if ( op.equals("/")) {
			System.out.println(num / num2 );
		} else if (op.equals("%")) {
			System.out.println(num % num2) ;
		} 
	  }
}

