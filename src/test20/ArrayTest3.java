package test20;

class Food{
	String name;
}
public class ArrayTest3 {
	public static void main(String[] args) {
		Food[] fs = new Food[2];
		fs[0] = new Food();
		fs[1] = new Food();
		fs[0].name = "볶음밥";
		fs[1].name = "짜장면";
		
		Food[] tmpFs = fs;
		fs = new Food[4];
		for(int i=0;i<tmpFs.length;i++) {
			fs[i] = tmpFs[i];
		}
		fs[2] = new Food();
		fs[3] = new Food();
		fs[2].name = "짬뽕";
		fs[3].name = "탕수육";
		for(int i=0;i<fs.length;i++) {
			System.out.println(fs[i].name);
		}
		/*
		 * 저 fs에 짬뽕, 탕수육 메뉴를 추가해주는데
		 * 기존에 있는 볶음밥과 짜장면도 있는상태여야 합니다.
		 * 그리고 제일마지막에 모든메뉴를 출력해주시면 됩니다.
		 */
	} 
	
}
