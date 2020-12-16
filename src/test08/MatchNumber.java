package test08;

import java.util.Random;
import java.util.Scanner;

public class MatchNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int num = 1;
		/*
		 *  nums라는 배열번수가 가지고 있는 값 중에
		 *  num의 값과 일치하는게 있으면 그냥 "있다"
		 *  없으면 "없다" 
		 */
		boolean hasNum = false;
		for( int i = 0 ; i < nums.length ; i++ ) {
			if ( nums[i] == num) {
				hasNum = true;
				break;
				}
			}
		if(hasNum) {
			System.out.println("있다"); 
		}else {
			System.out.println("없다");
		}
		}
}