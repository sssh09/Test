package test23;

//클래스에 쓸경우 독신주의자이기 때문에 어떠한 클래스도 상속을 받을수 없음!
final class Single{
	
}
class F {
	//메소드의 쓸경우 test()메소드를 오버라이딩 할수 없음!
	public final void test() {
		System.out.println("난 F의 test함수!");
	}
}
public class FinalTest extends F{	
	public static void main(String[] args) {
		//num앞에 쓸경우 상수!! 즉 초기화 된값으로 고정됨!! 바꿀수 없음!!
		final int num = 10;
	}
}




