package day10_;

public abstract class Selary {
	int selary;
	
	public abstract void tax();
	
}


class 정규직 extends Selary{
	public void tax() {
		double tax = selary * 0.1;
		System.out.println("정규직 세금은 : "+tax);
		
	}
}
class 계약직 extends Selary{


	public void tax() {
		double tax = selary * 0.03;
		System.out.println("계약직 세금은 : "+tax);
	}
	
}