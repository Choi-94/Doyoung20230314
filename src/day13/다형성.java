package day13;

public class 다형성 {
	

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Animal a = new Animal();  // ===> new Dog(); 이게 다형성 / 부모타입의 객체에 자식 생성자로 생성할 수 있는게 다형성
		                          // 인터페이스에 자주 사용   *특징 오버라이딩 된 것만 자식꺼 쓴다.
	}

}
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
	public void cry() {
		System.out.println("울다");
	}
}
class Dog extends Animal{
	public void cry() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	public void cry() {
		System.out.println("야옹");
	}
}