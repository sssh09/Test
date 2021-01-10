package test18;

public class AccessModifier3 {

	/*
	 * 클래스안에는 변수와 메소드, 생성자를 선언할 수 있는데
	 * 걔들은 모두다 접근제어자를 4가지 싹다 사용할 수 있음
	 * 단!!!! 지역변수 에서는 안됨!!
	 */
	public int num1;
	protected int num2;
	int num3;
	private int num4;
	
	public void test() {
		// 여기서 선언하는 변수는 접근제어자가 의미가 없음
		// 왜? 애초에 접근이 안되야~~
		// 그랑께 아래코드에서 주석풀면 에러나~~
//		public int a;
	}
}
