package day19_20230320;

public class ParentClass {
	//필드
	public String name;
	
	//생성자
	public ParentClass() {
		System.out.println("부모 기본 생성자");
	}
	
	//매서드
	public void hello() {
		System.out.println("부모 hello");
	}
	private void hi() {
		System.out.println("부모 hi");
	}
}
