package test04;

public class ArrayTest5 {
	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		/*
		 * strs의 값의 문자열 중에 "이"가 있는 것만 출력
		 */
		for(int i =0 ; i < strs.length ; i++) {
			if(strs[i].indexOf("이")!=-1) {
			System.out.println(strs[i].indexOf("이")) ;
					}
		}
	}
}