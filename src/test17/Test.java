package test17;

class Father{
	String work() {
		return "아빠가 일함~";
	}
}
class Son extends Father{
	String work() {
		return "아들이 일함~";
	}
}
public class Test {

	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.work());
	}
	
}
