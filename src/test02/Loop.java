package test02;

public class Loop {
	
	public static void main(String[] args) {
		//반복문
		// for 
		//선언부
		//조건부
		//증감부
		for(int i=1;i<=10;i++) {
			if(i==2) {
				//i의 값이 2일경우에 continue아래의 문장을 실행하지 않고
				//for문으로 올라간다.
				continue;
			}
			if(i==5) {
				//i의 값이 5일경우 현재 돌고 있는 for문을 종료시킨다.
				break;
			}
			System.out.println(i);
		}
		
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println("i = " + i);
			}
		}
//		int num = 1;
//		num++;
//		System.out.println(num++);
//		System.out.println(num);
		
	}
}





