package test04;

public class ArrayTest4 {
	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		
		//위의 strs각 방의 값의 길이가 2인 것만 출력하는
		// 반복문 (for 작성)
		
		for( int i=0 ; i<strs.length; i++) {
			if(strs[i].length()==2) {
			System.out.println(strs[i]);
				}
			}
	}
}