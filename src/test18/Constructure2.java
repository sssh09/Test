package test18;

public class Constructure2 {
	/*
	 * 생성자는 반드시 클래스명과 대소문자까지 일치해야 한다.
	 */
	Constructure2(){
		System.out.println("날 호출하였군!");
	}
	/*
	 * 생성자는 데이터타입이 없다.
	 * 생성자 호출은 반드시 new를 사용해서 메모리를 생성한뒤 
	 * 넘겨주기때문에(이과정을 인스턴스화 라고 한다)
	 * 데이터 타입이 존재 하지 않는다.
	 */
	public static void main(String[] args) {
		Constructure2 c2 = new Constructure2();
		/*
		 * 위의 Constructure2 클래스에 생성자를 정의했기 떄문에
		 * 기본생성자는 생성되지 않으므로 17라인의 코드를 실행하게 되면
		 * 날호출하였군! <-- 이 출력되게 된다.
		 */
	}
}
