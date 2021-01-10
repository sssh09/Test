package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodList {

	public static void main(String[] args) {
		Map<String,String> food1 = new HashMap<String,String>();
		food1.put("음식명", "마카롱");
		food1.put("가격", "2000");
		food1.put("칼로리", "200k");
		food1.put("종류", "디저트");
		Map<String,String> food2 = new HashMap<String,String>();
		food2.put("음식명", "마라탕");
		food2.put("가격", "14000");
		food2.put("칼로리", "1500k");
		food2.put("종류", "중식");
		Map<String,String> food3 = new HashMap<String,String>();
		food3.put("음식명", "치킨");
		food3.put("가격", "15000");
		food3.put("칼로리", "2000k");
		food3.put("종류", "한식");
		Map<String,String> food4 = new HashMap<String,String>();
		food4.put("음식명", "초밥");
		food4.put("가격", "20000");
		food4.put("칼로리", "600k");
		food4.put("종류", "일식");
		List<Map<String,String>> foods = new ArrayList<Map<String,String>>();
		foods.add(food1);
		foods.add(food2);
		foods.add(food3);
		foods.add(food4);
		
		for(int i=0;i<foods.size();i++) {
			System.out.println("[음식명 : " + foods.get(i).get("음식명") + 
					", 가격 : " + foods.get(i).get("가격") + "]");
		}
		//foods 리스트의 각방이 있는 음식의 정보를 아래와 같이 출력하면됩니다.
		// [음식명 : 마카롱, 가격 : 2000]
	}
}
