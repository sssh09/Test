package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	//반복문을 사용해서 1부터 10까지 strList에 add 하도록 하세유~
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		for(int i=1;i<=10;i++) {
			strList.add(String.valueOf(i));
		}
		
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
	}
}
