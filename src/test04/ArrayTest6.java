package test04;

public class ArrayTest6 {
	public static void main(String[] args) {
		String [] menus = new String[3];
		menus[0] = "아이스크림";
        menus[1] = "치킨";
        menus[2] = "피자";
        
        for(int i=0 ; i<menus.length ; i++) {
        String[] tmpMenus = menus;
        menus = new String[4];
        menus[0] = tmpMenus[0];
        menus[1] = tmpMenus[1];
        menus[2] = tmpMenus[2];
        menus[3] = "맥주";
        
       
        	     	
        	System.out.println(menus[i]);
        
        }
	}
}
