package test04;

public class ArrayTest {
	
	public static void main(String[] args) {
		//예약어
		int[] ints = new int[5];
		for( int i=0 ; i< ints.length ; i++) {
		ints[i] = (i+1)* 100 ;
		int idx = i/100 -1; 
		// idx 위치찾기
		ints[idx] = i;
						}
		for(int i=0;i<ints.length;i++) {
			System.out.println(ints[i]) ;
		}
	}
}