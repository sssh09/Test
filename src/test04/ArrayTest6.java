package test04;

public class ArrayTest6 {

	public static void main(String[] args) {
		String[] menus = new String[4];
		menus[0] = "아이스크림";
		menus[1] = "치킨";
		menus[2] = "피자";
		menus[3] = "스파게티";
		String[] tmpMenus = menus;
		menus = new String[tmpMenus.length+1];
		
		for (int i = 0; i < menus.length; i++) {
			if (i < tmpMenus.length) {
				menus[i] = tmpMenus[i];
			} else {
				menus[i] = "맥주";
			}
		}

		for(int i=0;i<menus.length;i++) {
			System.out.println(menus[i]);
		}
	}
}




