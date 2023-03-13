package day7;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car();
				
		
		c1.name = "그랜져";
		c1.tire = "한국";
		c1.color = "빨강";
		c1.speed = 10;		
		
		//제네시스,넥센타잉,검정,20
		
		c2.name = "제네시스";
		c2.tire = "넥센";
		c2.color = "검정";
		c2.speed = 20;
		
		c1.speedRun(100);
		c2.speedRun(200);
		
		
		c1.print();
		c2.print();		
		//출력에 c1=>빨강 c2=>검정
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		String str.

	}
}
//문제
		//리턴타입:없음
		//메소드명 :speedRun
		//매게변수:int s
		//실행문구:1.'그랜져 speedRun메소드 호출됌'출력
//		public void speedRun(int s) {
//			System.out.println(name+"speedRun메소드 호출됌");
//			speed += s;
//		}
