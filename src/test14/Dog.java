package test14;

import java.util.Random;

class Animal{
	int age;
	String name;
	String type;
	int height;
}
public class Dog extends Animal{
	public static void main(String[] args) {
		//Dog는 Animal이라고 부를 수 있다!(즉 Animal이 Dog보다 상위 개념)
		Animal a = new Dog();
		//Animal은 Dog라고 부를수 없다!(Dog가 Animal의 상위 개념이 아님!)
		Dog d = new Dog();
		
		Animal a1 = new Dog();
		a1 = new Animal();
		if(a1 instanceof Dog) {
			System.out.println("동물 a1은 개입니다.");
		}else {
			System.out.println("아 a1은 개가 아니였구나");
		}
	}
}
