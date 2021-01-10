package test04;

public class StringTest {

	public static void main(String[] args) {
		String str = "가나다라마바사";
//		System.out.println(str.length());
//		System.out.println(str.indexOf("카"));
//		System.out.println(str.substring(1,2));
//		System.out.println(str.contains("가")&&str.contains("다"));
//		str = str.replace("가나", "우리");
//		System.out.println(str);
		str = "  하  이  ";
		str = str.replace(" ","");
		System.out.println(str);
	}
}
