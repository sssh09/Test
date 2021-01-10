package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// 아래의 strList가 가지고 있는 값들의
		// 총합을 구해서 출력해보세요.
		
		List<String> strList = new ArrayList<String>();
		for(int i=5;i<=50;i+=5) {
			strList.add(i+"");
		}
		int sum = 0;
		for(int i=0;i<strList.size();i++) {
			int num = Integer.parseInt(strList.get(i));
			sum += num;
		}
		System.out.println(sum);
	}
}
