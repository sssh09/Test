package test04;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] strs = new String[5];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		strs[3] = "고양이";
		strs[4] = "이리";
		/*
		 * strs의 값의 문자열중에 "이"있는 것만 출력
		 */
		for(int i=0;i<strs.length;i++) {
			if(strs[i].contains("이")) {
				System.out.println(strs[i]);
			}
		}
	}
}




