package test18;

public class Constructure {
	/*
	 * 기본적으로 아무런 생성자를 코딩하지 않을경우
	 * 기본생성자가 생성이 된다.
	 * 생성자를 코딩할경우에는 기본생성자가 생성되지 않는다.
	 */
	public static void main(String[] args) {
		Constructure c = new Constructure();
		//위 코드에서 new Constructure(); 생성자를 호출했을때
		//실제로 Constructure class에 보이는 생성자가 없음에도 오류가
		//나지 않는 이유는 기본생성자가 자동으로 생성되기 때문이다.
	}
}
