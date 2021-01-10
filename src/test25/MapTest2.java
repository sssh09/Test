package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> pc1 = new HashMap<String,String>();
		pc1.put("cpu", "i7 10세대");
		pc1.put("ram", "32GB");
		pc1.put("ssd", "1TB");
		pc1.put("vga", "GTX-3080");
		pc1.put("price","600만원");
		
		Map<String,String> pc2 = new HashMap<String,String>();
		pc2.put("cpu", "i7 10세대");
		pc2.put("ram", "32GB");
		pc2.put("ssd", "1TB");
		pc2.put("vga", "GTX-3080");
		pc2.put("price","600만원");
		
		List<Map<String,String>> pcList = new ArrayList<Map<String,String>>();
		pcList.add(pc1);
		pcList.add(pc2);
		
		System.out.println("cpu,      ram, ssd,  vag,   price");
		for(Map<String,String> pc : pcList) {
			System.out.print(pc.get("cpu") + ", ");
			System.out.print(pc.get("ram") + ", ");
			System.out.print(pc.get("ssd") + ", ");
			System.out.print(pc.get("vag") + ", ");
			System.out.println(pc.get("price"));
		}
	}
}
