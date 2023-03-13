package day10_;

public abstract class Animal {
	String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;		
	}
	public String getName() {
		return this.name;
	}
	public abstract String cry();    //<<추상메소드 (중가로가 없는게 특징)
	
	 //추상화 한곳에 모아놓고 다 받아쓰늗것  //abstract   (추상메소드를 하나라도 사용한다면 class에 선언해야함
	public abstract String move();
	//어떻게 움직이는지
	public abstract String food();
	public abstract void print();
	
	
	
	
}
