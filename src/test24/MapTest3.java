package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		/*
		 * Map 데이터타입의 변수를 선언과 초기화
		 * 1 : 감자
		 * 2 : 고구마
		 * 3 : 옥수수
		 * 4 : 대추
		 * 각 키들의 데이터타입은 Integer
		 * 밸류들의 데이터타입 String
		 * Iterator를 사용해서 모든 key와 value를 출력하는 코드를 완성
		 */
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "감자");
		map.put(2, "고구마");
		map.put(3, "옥수수");
		map.put(4, "대추");
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key +" : " + map.get(key));
		}
	}
}






