package test02;

public class Loop4 {

	public static void main(String[] args) {
//		int num1 = 1;
		int num2 = 1;
		
		for (int num1 = 1; num1 <= 3; num1++) {
			System.out.println("==== " + num1 + "단 ====");
			for (num2 = 1; num2 <= 3; num2++) {
				System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
			}
		}
	}
}
