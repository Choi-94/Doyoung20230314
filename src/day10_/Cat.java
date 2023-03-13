package day10_;

public class Cat extends Animal{

	 String cry;
	 String move;
	 String food;
	
	@Override
	public String cry() {
		// TODO 자동 생성된 메소드 스텁
		return cry;   //부모에 있는걸 다시 정의하는걸 오버라이딩
	}

	@Override
	public String move() {
		// TODO 자동 생성된 메소드 스텁
		return move;
	}

	@Override
	public String food() {
		// TODO 자동 생성된 메소드 스텁
		return food;
	}

	@Override
	public void print() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println(getName()+"/"+cry+"/"+move+"/"+food);
	}
			
}

