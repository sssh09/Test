package test24;

import java.util.ArrayList;
import java.util.List;

public class LoopTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		// 0 - 100
		// 1 - 200 -> 총 0-9번까지 방을 만들어서 값을 넣어봅시다.
		for(int i=0;i<10;i++) {
			int num = (i+1) * 100;
			numList.add(num);
		}
		System.out.println("원래 우리가 알던 포문이유~");
		for(int i=0;i<numList.size();i++) {
			Integer n = numList.get(i);
			System.out.println(n);
		}
		System.out.println("좀더 편한 향상된 포문이유~");
		for(Integer n : numList) {
			System.out.println(n);
		}
	}
}
