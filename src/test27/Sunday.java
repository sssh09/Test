package test27;

import java.util.ArrayList;
import java.util.List;

public class Sunday {
	public List<String> todoList;
	public Sunday() {
		todoList = new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		Sunday s = new Sunday();
		s.todoList.add("1");
		System.out.println(s.todoList);
	}
}
