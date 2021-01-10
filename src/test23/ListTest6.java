package test23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest6 {
//List, Map, Set
	public static void main(String[] args) {
		List<String> strList1 = new ArrayList<String>();
		strList1.add("1");
		strList1.add("2");
		System.out.println(strList1.get(0));
		
		List<String> strList2 = new LinkedList<String>();
		strList2.add("1");
		strList2.add("2");
		System.out.println(strList2.get(0));
	}
}
