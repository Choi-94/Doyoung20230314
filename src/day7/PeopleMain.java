package day7;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People people1 = new People();
		people1.setName("홍길동");
		people1.setAge(30);
		
		
		People people2 = new People("이순신");
		people2.setAge(25);
		
		People people3 = new People("세종대왕",50);
		
		people2.upAge4("-",50);
		
		people1.print();
		people2.print();
		people3.print();
	}

}
