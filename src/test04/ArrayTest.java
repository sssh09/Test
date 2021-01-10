package test04;

public class ArrayTest {

	public static void main(String[] args) {
		// 예약어
		int[]  ints = new int[5];
		ints[0] = 100;
		ints[1] = 200;
		ints[2] = 300;
		ints[3] = 400;
		ints[4] = 500;
		for(int i = 100;i<=500;i+=100) {
			int idx = i/100 -1;
			ints[idx] = i;
		}
		for(int i=0;i<ints.length;i++) {
			System.out.println(ints[i]);
		}
	}
}





