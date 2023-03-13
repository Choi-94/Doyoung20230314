package day10;

public class CarMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		SportCar scar = new SportCar();
		scar.run();
		System.out.println(scar.speed);
	}

}
class Car{
	String color;
	String tire;
	int speed;
	
	public void run() {
		this.speed++;
	}
	
}

class SportCar extends Car{
	String engine;
	
	public void run() {
		this.speed += 2;    //다시 상속받고 싶을 때  (오버로딩)	
	}
	
	
}