package test11;

public class MemberTest {
	String name;//멤번변수, 멤버필드
	int age = 1;
	
	void run() {//메소드의 선언!!
		System.out.println("아 뛰었더니 힘들다~");
		return;
	}
	
	int work() {
		return 0;
	}
	public static void main(String[] args) {
		MemberTest mt = new MemberTest();
		mt.run();//메서드의 호출
	}
}
