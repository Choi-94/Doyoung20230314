package day10;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Dog dog = new Dog();
		dog.cry();	
		dog.eat();
		
		Cat cat = new Cat();
		cat.cry();
	}
}
class Animal{	
	public void eat() {
		System.out.println("동물이 먹다");		
	}
	public void cry() {
		System.out.println("동물이 운다");
	}
}
class Dog extends Animal{
	public void cry() {
		System.out.println("멍멍");
	}
	public void eat() {
		System.out.println("강아지가 와구와구 먹는다");
	}
}
class Cat extends Animal{
	public void cry() {
		System.out.println("야옹");
	}
} //오버라이딩: 부모객체가 맘에 들지 않아서 자식객체에서 다시 설정하는거 (실행문구만 달라짐)