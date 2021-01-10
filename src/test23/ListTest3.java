package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		// 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
		List<String> strList = new ArrayList<>();
		strList.add(2+"");
		for(int i=0;i<9;i++) {
			strList.add((Integer.parseInt(strList.get(i)) * 2)+"");
		}
		System.out.println(strList);
	}
}
