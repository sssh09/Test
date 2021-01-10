package test24;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	/*
	 * Key
	 * Value
	 * Type
	 * Element
	 */
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		
		Integer i = numList.get(0);
		
		List<String> strList = new ArrayList<String>();
		strList.add("");
		String s = strList.get(0);
	}
}
