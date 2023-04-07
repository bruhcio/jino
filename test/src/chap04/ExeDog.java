package chap04;//4-3

class Dog {
	String name;
	String breeds;
	int age;
	void wag() {
		System.out.println(name + "가 살랑살랑~");
	}
	void bark() {
		System.out.println( name + "가 멍멍!");
	}
	
	
}
public class ExeDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "망고";
		d1.breeds = "골든 리트리버";
		d1.age = 2;
		System.out.println("이름 : " + d1.name);
		System.out.println("품종 : " + d1.breeds);
		System.out.println("나이 : " + d1.age);
		d1.wag();
		d1.bark();
		
		d2.name = "까미";
		d2.breeds = "골든 리트리버";
		d2.age = 2;
		System.out.println("이름 : " + d2.name);
		System.out.println("품종 : " + d2.breeds);
		System.out.println("나이 : " + d2.age);
		d2.wag();
		d2.bark();

	}

}
