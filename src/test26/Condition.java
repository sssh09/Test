package test26;

public class Condition {

	public static void main(String[] args) {
//		정수
		int age = 41;
		if(age/10==0) {
			System.out.println("유아기");
		}else if(age/10==1) {
			System.out.println("질풍노도의 청소년");
		}else if(age/10==2) {
			System.out.println("사회생활 병아리~");
		}else if(age/10==3) {
			System.out.println("인생의 쓴맛을 알 나이");
		}else {
			System.out.println("인생의 허망함을 알 나이");
		}
	
		int a = 'a';
		String gener = "1";
		switch(gener) {
			case "0" : 
				System.out.println("유아기");
				break;
			case "1" : 
				System.out.println("질풍노도의 청소년");
				break;
			case "2" : 
				System.out.println("사회생활 병아리~");
				break;
			case "3" : 
				System.out.println("인생의 쓴맛을 알 나이");
				break;
			default :
				System.out.println("인생의 허망함을 알 나이");
		}
	}
}
