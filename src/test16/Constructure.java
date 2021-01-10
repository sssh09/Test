package test16;

public class Constructure {

	public Constructure() {
		System.out.println("이제 암것두 안넣어도 생성됨~");
	}
	public Constructure(int num) {
		System.out.println("생성할때 날 무조건 실행하게 되어 있어서 생성자야~");
	}
	
	public static void main(String[] args) {
		Constructure con = new Constructure();//생성자
	}
}




