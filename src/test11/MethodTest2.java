package test11;

public class MethodTest2 {

	static int buyLaptop(int money) {
		int price = 97;
		if(money<price) {
			System.out.println("장난하냐?");
			return -1;
		}
		System.out.println("드디어 노트북을 하나 장만 했구나!!");
		return money-price;
	}
	public static void main(String[] args) {
		int wallet = buyLaptop(50);
		if(wallet==-1) {
			wallet = buyLaptop(51);
			if(wallet == -1) {
				wallet = buyLaptop(52);
				if(wallet == -1) {
					wallet = buyLaptop(53);
					if(wallet == -1) {
						wallet = buyLaptop(54);
					}
				}
			}
		}
		System.out.println("노트북사고 난 거스름 : " + wallet);
	}
}



