package test03;

public class SwapTest {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		int tmp = num2;
		num2 = num1;
		num1 = tmp;
		System.out.println(num1 + "," + num2);
	}
}
