package test18;

class Over {
	public int test(String str) {
		return 1;
	}
}
public class Overloading extends Over{

	/*
	 * 오버로딩의 조건
	 * 1. 같은 영역 안이여야 한다(상속도 상관없음)
	 * 2. 메소드의 이름이 같아야 한다
	 * 3. 배개변수의 갯수, 타입, 갯수와 타입이 같아도 순서가 달라야 한다.
	 * 4. 접근제어자, 메소드의 데이터타입은 관련이 읎다!!
	 * 5. 오버로딩의 장점을 떠올리기 위해선 System.out.println() 을 떠올리면됨!!
	 */
	public int test() {
		return 1;
	}
	private void test(int i) {
		
	}
}
