package test25;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		System.out.println(map.get("이름"));
	}
}

