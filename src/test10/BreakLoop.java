package test10;

public class BreakLoop {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1) {
					return;
				}
				System.out.println(j);
			}
			System.out.println(i);
		}
		System.out.println("난 실행됨");
	}
}
