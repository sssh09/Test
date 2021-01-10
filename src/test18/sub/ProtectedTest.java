package test18.sub;

import test18.AccessModifier;

public class ProtectedTest extends AccessModifier{

	ProtectedTest(){
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		ProtectedTest am = new ProtectedTest();
	}
}
