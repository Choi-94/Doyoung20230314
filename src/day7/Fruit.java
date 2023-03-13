package day7;

public class Fruit {
	String name;
	String color;
	boolean isSeed;
	
	public Fruit() {
		System.out.println("기본생성자");
	}
	public Fruit(String name, String color, boolean isseed) {
		System.out.println("생성자 1");
		this.name = name;
		this.color = color;
		this.isSeed = isseed;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
// public Fruit() {       <== 기본생성자 (만들지 않아도 만들어져있다) *생성자특징 1.리턴타입이 없다. 2.클래스이름과 동일
//	                   자동으로 생성되지만 직접 입력하는 이유는 
// }

///★ 생성자 오버로딩 : 매개 변수를 다르게 하는 생성자를 여러 개 선언 하는 것!