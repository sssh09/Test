package test05;

import java.util.Scanner;

public class ScanTest3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가장 좋아하는 축구 선수는 : ");
		String player = scan.nextLine();
		
		String[] names = {"송흥민", "손흔민", "송흥밍","손날두"};
	for ( int i=0; i<names.length ; i++) {
		if(names[i].equals(player)) {
			System.out.println("손흥민을 검색하신건가요?");
			}
		}
	}
}
