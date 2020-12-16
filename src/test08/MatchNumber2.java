package test08;

public class MatchNumber2 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 1, 2, 4 };
		int num = 1;
		int cnt = 0; // 변수 필요해.. 
		// num이 몇갠지도 모르는데 다짜고짜 2라고 집어넣을 순 없고 0부터 시작이니까 0
		// cnt와 num의 값을 비교해서 밑에 for문에 넣어보자 0은 시작하는 거고
		// ex) 1과 1를 비교했을 때 맞으니까 cnt는 그대로 0
		// ex) 1과 2를 비교했을 때 틀리니까 cnt는 ++ 되어 1
		//이런 식 반복되면 나오는 cnt의 값은 3 
		// 즉 , 1은 3개 들어있지
		for(int i = 0 ; i < nums.length ; i++) {
		if(nums[i] == num) {
			cnt++;
	}
}	
		System.out.println(cnt);
	}
}