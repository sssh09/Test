package test24;

public class Constructor {

	Constructor(){
		System.out.println("난 메모리 생성할때마다 실행돼~~");
	}
	Constructor(int i){
		System.out.println("난 다른 생성자임~");
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = c1;

		System.out.println(c1==c2);
		
		c1 = new Constructor();
		
		System.out.println(c1==c2);
	}
}
