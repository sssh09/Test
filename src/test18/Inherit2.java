package test18;
class Game{
	void start() {
		System.out.println("게임을 시작한다!");
	}
}
class SuperMario extends Game{
	void eatStar() {
		System.out.println("다 이김!!!");
	}
}
public class Inherit2 extends Game{
	/*
	 * 상속의 장점중에 하나는 공통적으로 필요하는
	 * 코드를 상속받아서 그대로 사용할수 있다는것이다.
	 * 예를들어 Game이라는 class가 있고 
	 * SuperMario, CrazyAcade, LOL, Star 등등의 게임이 있다면
	 * 게임의 내용은 다르나 시작과 종료는 공통적으로 작성할수 있다.
	 * 이럴때 상속을 사용해서 필요한코드만 각각작성하고 공통코드는 재사용할수 있다.
	 */
	public static void main(String[] args) {
		Game g = new SuperMario();
		/*
		 * 자 좀만더 쉽게 설명하자!(별먹기는 모든게임중에 슈퍼마리오만 이따 치자!)
		 * 게임각이 있다고 치자~ 그안에는 슈퍼마리오가 있다!
		 * 별먹기 기능이 있다는걸 어떻게 알아낼수 있을까?
		 * 게임각을 열어서 슈퍼마리오라는걸 알아야 별먹기 기능도 알고 별먹기 기능도
		 * 호출할 수 있음.
		 * 하지만 안타깝게도 게임각만으로는 알수가 읎다!
		 * 그래서 아래코드는 주석풀면 에러난다!
		 */
//		g.eatStar();
		
		/*
		 * 게임각을 열어서 슈퍼마리오라는걸 알라면 슈퍼마리오로 케스팅을 해줘야한다
		 * 물론 게임각이 겁내 많을때는 안에 있는 
		 * 게임이 슈퍼마리오라고 불러두되?(instanceof)
		 * 라고 일일히 불어봐야 되긴함~ 무튼 아래처럼 해주면된다.
		 */
		SuperMario sm = (SuperMario)g;
		sm.eatStar();
		Game gg = sm;
		// 이렇게 하면 Game에는 없어도 슈퍼마리오에는 별먹기 기능이 있기 떄문에
		// 실행이 가능하다!! 이걸 캐스팅이라고 한다!!
	}
}
