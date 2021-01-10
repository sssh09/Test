package test20;

class Person{
	public String name;
	public int age;
}
public class ArrayTest {
/*
 * 양말[] 서랍 = new 양말[10];
 * 서랍 = 양말; <-- 에러임
 * 서랍[0] = 양말 <-- 오케이~
 * 그리고 서랍을 20개짜리로 바꾸고 싶으면 방법이 없음
 * 서랍을 통째로 바꿔야함
 * 양말[] 임시보관함 = 서랍;
 * 서랍 = new 양말[20];
 * 서랍[0] = 임시보관함[0];
 * 서랍[1] = 임시보관함[1];
 */
	public static void main(String[] args) {
		Person[] ps = new Person[5];
		for(int i=0;i<ps.length;i++) {
			ps[i] = new Person();
			ps[i].name = "이름" + i;
			ps[i].age = i;
		}
		for(int i=0;i<ps.length;i++) {
			System.out.println("이름 : " + ps[i].name);
			System.out.println("나이 : " + ps[i].age);
		}
	}
}
