package test12;
// 접근 범위가 큰순서 : public > protected > default > private

class Money{
	private int coin;
	
}
public class AccessTest {

	public static void main(String[] args) {
		Money m = new Money();
	}
}
