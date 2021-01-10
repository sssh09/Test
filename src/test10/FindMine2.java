package test10;

import java.util.Random;
import java.util.Scanner;

public class FindMine2 {

	public static void main(String[] args) {
		String[] strs = new String[5];
		Random r = new Random();
		int mine = r.nextInt(strs.length)+1;
		for(int i=0;i<strs.length;i++) {
			strs[i] = i+1+"";
			if(strs[i].equals(mine+"")) {
				strs[i] = "꽝";
			}
		}
		strs = new String[] {"1","2","3","꽝","5"};
		Scanner s = new Scanner(System.in);
		System.out.print("1-5 숫자 : ");
		int myStr = Integer.parseInt(s.nextLine());
		for(int i=0;i<strs.length;i++) {
			if(strs[i].equals("꽝")) {
				if(i+1==myStr) {
					System.out.println("찾았다");
				}else {
					System.out.println("틀렸다");
				}
				break;
			}
		}
		
//		if(myStr==idx) {
//			System.out.println("찾았다!");
//		}else {
//			System.out.println("틀렸다!");
//		}
	}
}




