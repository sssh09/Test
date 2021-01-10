package test13.sub;

import java.util.Random;


public class Test {
	void printSomething() {
		System.out.println("tt");
	}
	/*
	 * 4. 스캐너를 활용하여 숫자를 입력하면 정수로 변환 출력해주고
		문자를 입력하면 종료 라고 출력하고 종료하는 코드를 완성해주세요
	 */
	public static void main(String[] args) {
		String numStr = "12.1";
		try {
			int num = Integer.parseInt(numStr);
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("종료");
		}
	}
}



