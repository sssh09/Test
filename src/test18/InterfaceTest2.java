package test18;

interface Volume{
	int up();
	int down();
}
public class InterfaceTest2 implements Volume{

	@Override
	public int up() {
		return 0;
	}

	@Override
	public int down() {
		return 0;
	}
	/*
	 * 인터페이스를 기준으로 클래스를 작성하는데
	 * 위의 코드처럼 인터페이스는 메서드의 선언만가능하지
	 * 내용을 작성할수 즉 구현할 수 없다.
	 * 그래서 클래스에서 구현을 해야 하는데
	 * 상속개념이 아니라 구현을 하겠다는 개념이므로
	 * implements <-- 를 사용해서 Volume을 구현해야 한다.
	 * 단 특정책이나 블로그에서 해당개념을 상속이라고 표현하기도 하는데
	 * 못배워서 그럼.
	 * 무튼 위의 클래스에서 Volume을 구현하기 위해서는 implements 라고 해야됨
	 * 구현하겠다고 했으면 일단 무조건 overriding을 해야 한다.
	 */
	public static void main(String[] args) {
		Volume v = new InterfaceTest2();
		//위의코드처럼 Volume이 InterfaceTest2보다 상위 개념이기 때문에
		// InterfaceTest2를 Volume이라 부를수 있지만
		// Volume은 인터페이스 이기 때문에 생성자를 만들수도 없고
		// 클래스처럼 기본생성자를 만들어 주지도 않는다!
		// 그래서 아래코드는 주석 풀면 에러남!
//		Volume v2 = new Volume();
	}
}
