package test01;

public class Condition {

	public static void main(String[] args ) {
		boolean higher;
		
		int num1 = 200;
		int num2 = 200;
		higher = num1 >= num2;
		System.out.println(higher);
		higher = num1 <= num2;
		System.out.println(higher);
		
		int hour = 1;
		
		int h1 = 10%11;
		System.out.println(h1);
		
		int hour1 = 3;
		if(hour1<3) {
			System.out.println("3시 전이면 아직 아침이지~");
		}else {
			System.out.println("3시네, 밥묵자~");
		}
	}
}
