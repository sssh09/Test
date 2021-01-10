package test20;

public class Test {
	//기존에 있던 메뉴판에 짬뽕과 탕슉을 추가해야한다!
	public static void main(String[] args) {
		String[] menu = new String[2];
		menu[0] = "짜장면";
		menu[1] = "볶음밥";
		String[] tmpMenu = menu;
		menu = new String[4];
		for(int i=0;i<tmpMenu.length;i++) {
			menu[i] = tmpMenu[i];
		}
		menu[2] = "짬뽕";
		menu[3] = "탕슉";
		for(int i=0;i<menu.length;i++) {
			System.out.println(menu[i]);
		}
	}
}
