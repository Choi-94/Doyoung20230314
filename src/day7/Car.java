package day7;

public class Car {   //class = 설계도와 같다
	String name;
	String tire;
	String color;
	int speed;
	
	public void run() {
		speed = speed +1; //speed +=1; 
	}
	public void speedRun(){
		speed = speed+2;
	}
	public void speedboost() {
		speed = speed+5;
	}
	public void print() {
		System.out.println(name+"="+tire+"="+color+"="+speed);
	}
	public void speedRun(int s) {
		System.out.println(name+"speedRun메소드 호출됌");
		speed += s;
	}
	public String getColor() {
		
	}
	
}
 //메소드 선언
 //=접근제한자 : 접근을 제한한다. 
//=리턴타입: 메소드가 리턴하는 결과의 타입을 표시한다. *리턴이 없을 시 void
//=메소드 이름: 메소드의 이름을 작성하낟.
//메개 변수 선언 : 넘겨받을 데이터를 저장하기 위한 변수를 선언한다.
//실행블록:실행할 코드를 작성한다.

//접근제한자 리턴타입 메소드이름(매개변수) {
//	실행할 코드
//	return리턴값;  *리턴타입이 있는경우가 반드시 return이 있어야한다.
//}