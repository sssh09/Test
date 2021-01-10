package test20;

class Dog{
	String name;
	int age;
	String type;
}
public class ArrayTest2 {
	public static void main(String[] args) {
		String[] names = {"카드1세","카드2세","칠복이","백돌이"};
		int[] ages = {4,7,11,3};
		String[] types = {"요쿠셔","잉글코카","마르티스","진돗개"};

		Dog[] dogs = new Dog[3];
		for(int i=0;i<3;i++) {
			double d = Math.random() * names.length;
			int num = (int)d;
			Dog dog = new Dog();
			dog.name = names[num];
			dog.age = ages[num];
			dog.type = types[num];
			dogs[i] = dog;
		}
		System.out.println(dogs[0].name);
		System.out.println(dogs[1].name);
		System.out.println(dogs[2].name);
	}
}



