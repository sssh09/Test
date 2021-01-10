package test20;

import java.util.Scanner;

public class ExceptionTest {
	String str;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 나이는? : ");
		String numStr = s.nextLine();
		ExceptionTest et = new ExceptionTest();
		try {
			int num = Integer.parseInt(numStr);
			System.out.println("아 당신의 나이는 " + num + "살 이군요~");
			System.out.println(et.str.equals("태새전환보소~"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("하.. 보통 나이는 숫자로 적지 않니?");
		}
	}
}
