package test08;

public class SplitTest {
	
	public static void main(String[] args) {
		String str = "1,2,3,4";
		int idx = str.indexOf(","); // , 앞까지 int에 저장 / 콤마 찾아라
		String str1 = str.substring(0,idx); //0번째부터 idx까지를 잘라낼꺼야
		System.out.println(str1); // 저장된 값 출력
		str = str.substring(idx+1); // 2번쨰 숫자는 컴마 뒤 ! idx보다 +1자리임
		idx=str.indexOf(","); // 이미 앞의 1, 를 잘라냄 , 다시 콤마 찾기
		String str2= str.substring(0,idx);
		
		System.out.println(str2);
		// 결국 이게 String[] strs= str.split(","); 이거임..
	}
}
