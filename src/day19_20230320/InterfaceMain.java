package day19_20230320;

public class InterfaceMain {

	public static void main(String[] args) {
		//인터페이스 객체 생성
//		InterfaceEx if1 = new impl1();  // 인터페이스 자체 객체를 만드는 것은 안됨!
        
		//아래와 같은 형식으로는 잘 사용하지 않음 (인터페이스 쓸 이유 없음)
		InterfaceEx ipc1 = new ImplClass1();
		
		/*
		 * 좌변: 인터페이스 타입의 객체로 선언
		 * 우변: 구현클래스 생성자 
		 */
		InterfaceEx if1 = new ImplClass1();
		if1.hello();
		
		InterfaceEx if2 = new ImplClass2();
		if2.hello();
		
		InterfaceEx if3 = new ImplClass1();       //좌변은 똑같은데 우변만 바뀌어서 들어간다 ==> 다형성
		if3.hello();
		if3 = new ImplClass2();
		if3.hello();
	}

}
