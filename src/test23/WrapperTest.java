package test23;

public class WrapperTest {

	public static void main(String[] args) {
		int i = 10;
		Integer i2 = 10;
		
		char c = 'a';
		Character c2 = 'a';
		
		byte b = 1;
		Byte b2 = 1;
		short s = 2;
		Short s2 = 2;
		long l = 3;
		Long l2 = 1234L;
		float f = 1.1F;
		Float f2 = 1.1F;
		double db = 1.1;
		Double db2 = 1.1;
		boolean bl = true;
		Boolean bl2 = true;
		
		String str = "1.3";
		double db3 = Double.parseDouble(str);
		System.out.println(db3);
		
		str = "true";
		boolean bl3 = Boolean.parseBoolean(str);
		System.out.println(bl3);
	}
}
