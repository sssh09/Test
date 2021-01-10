package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	/*
	 * Key
	 * Value
	 * Type <-- 좀 나중에 할거임
	 * Element
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "서울 동대문구 회기동");
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}






