package day8;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People();
		p1.setName("홍길동");
		System.out.print(p1.getName());
		
		People p2 = new People("이순신",90);
		
		if(true) {
			p1.ageUp();
			System.out.println(p1.getAge());
			p2.ageUp();
		}
	}

}
