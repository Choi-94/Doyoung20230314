package day19_20230320;

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("자식 클래스 생성자");
	}
	
	
	//hello 재정의
	@Override
	public void hello() {
		System.out.println("자식 hello");
	}
	
	@Override
	public void hi() {         //부모클래스에서 private로 묶어 놨기때문에 자식클래스에서 상속되지 않아서 빨간 밑줄이 뜬다
		System.out.println("자식 hi");
	}
}
