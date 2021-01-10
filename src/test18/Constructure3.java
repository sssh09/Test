package test18;

public class Constructure3 {

	Constructure3(){
		System.out.println("평범한 날 호출하다니..");
	}
	Constructure3(int a){
		System.out.println("인트를 넣어야만 날 호출할 수 있다구!!");
	}
	Constructure3(String str){
		System.out.println("스트링이 필요해!!");
	}
	/*
	 * 생성자는 메소드와 비슷은함~
	 * 그래서 overloading이 가능함
	 * 즉 여러개의 생성자를 만들수 있다는 얘기임.
	 */
	public static void main(String[] args) {
		new Constructure3();
		new Constructure3(1);
		new Constructure3("");
		/*
		 * 현재 Constructure3 클래스에는 총3개의 생성자가 있음.
		 * 그래서 위의 20라인부터 22라인의 출력결과는 다 다름!
		 */
		
	}
}
