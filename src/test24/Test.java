package test24;

class Father{
	Father(int i){
		System.out.println("F");
	}
}
class Son extends Father{
	
	Son(int i){
		super(i);
		System.out.println("S");
	}
}
public class Test {

	public static void main(String[] args) {
		Son s = new Son(10);
	}
}
