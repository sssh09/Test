package test05;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		/*
		 * Scan : 뭔가를 스캔하는 거
		 * 입력!!!!!
		 * Input/Output ( In/Out -> I/O )
		 * QR코드 스캐너 => QR코드를 스캔하는 거
		 * 스캔을 하기 위해선 ?? 
		 * 스캐너
		 */
		Scanner scan = new Scanner(System.in); 
		System.out.print("몇 살이니?");
		String str = scan.nextLine();
		System.out.println("니가 쓴글 :" + str);
		/*
		 * str 일반적이라면
		 * 1살보다 크거나 같고
		 * 200살보다 작은
		 * 숫자가 들어와야 일반적!!
		 * 즉 , 위의 조건을 만족했을 경우는 정상입력!
		 * 아닐 경우엔 나이가 제멋대로 이네 이짜쓱!! 
		 */
		System.out.print("니 나이 :" + str);
		int age = Integer.parseInt(str);
		if(age>=1 && age < 200) {
			System.out.println("정상입력!!");
			} 
			else {
			System.out.println("아 쫌!");
		}
		
		//아씨..점마 저거 분명히 숫잔데 ??
				// 숫자(인트)로 바꿀 수 없나??
		String numStr = "22";
		
		int num = Integer.parseInt(numStr);
		System.out.println(0<num);
		System.out.println(num);
		
		Integer.parseInt("천200") ;
		System.out.println(num);
		
		
	}
}
